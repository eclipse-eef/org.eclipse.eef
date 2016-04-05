/*******************************************************************************
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.tests.internal.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFPageDescription;
import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditionContextAdapter;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.tests.internal.AQLInterpreter;
import org.eclipse.eef.tests.internal.EEFDataTests;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.sirius.common.interpreter.api.VariableManagerFactory;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNull;
import org.junit.Assert;
import org.junit.Before;

/**
 * Common superclass for all the tests of the controllers.
 *
 * @author sbegaudeau
 */
@SuppressWarnings({ "checkstyle:javadocmethod" })
public abstract class AbstractEEFControllerTests {
	/**
	 * The path of the dart.ecore file.
	 */
	public static final String DART_ECORE = "/data/dart.ecore"; //$NON-NLS-1$

	/**
	 * The resource set.
	 */
	protected ResourceSetImpl resourceSet;

	/**
	 * The interpreter.
	 */
	protected IInterpreter interpreter;

	/**
	 * The editing context adapter.
	 */
	protected EditionContextAdapter eca;

	/**
	 * The editing domain.
	 */
	private TransactionalEditingDomainImpl editingDomain;

	/**
	 * Default implementation of ModelChangeDetector when workgin with a TED.
	 *
	 * @author pcdavid
	 */
	private static class TEDModelChangeDetector implements EditionContextAdapter {
		/**
		 * Describes the model changes we want to react to.
		 */
		private static final NotificationFilter FILTER = NotificationFilter.NOT_TOUCH.and(NotificationFilter.createNotifierTypeFilter(EObject.class));

		/**
		 * The editing domain to integrate with.
		 */
		private final TransactionalEditingDomain ted;

		/**
		 * The pre-commit listener used to detect model changes and call back EEF.
		 */
		private final ResourceSetListener preCommitListener = new Listener();

		/**
		 * The callback to invoke to notify the EEF side when the model has changed.
		 */
		private IConsumer<List<Notification>> callback;

		/**
		 * Create a new detector.
		 *
		 * @param ted
		 *            the editing domain to integrate with.
		 */
		public TEDModelChangeDetector(TransactionalEditingDomain ted) {
			this.ted = ted;
		}

		@Override
		public void performModelChange(final Runnable effect) {
			RecordingCommand cmd = new RecordingCommand(ted) {
				@Override
				protected void doExecute() {
					effect.run();
				}
			};
			ted.getCommandStack().execute(cmd);
		}

		@Override
		public synchronized void onModelChange(IConsumer<List<Notification>> trigger) {
			if (this.callback == null) {
				ted.addResourceSetListener(preCommitListener);
			}
			this.callback = trigger;
		}

		@Override
		public void removeModelChangeConsumer() {
			this.callback = null;
			ted.removeResourceSetListener(preCommitListener);
		}

		/**
		 * The actual implementation of the pre-commit listener.
		 *
		 * @author pcdavid
		 *
		 */
		private class Listener extends ResourceSetListenerImpl {
			public Listener() {
				super(FILTER);
			}

			@Override
			public boolean isPostcommitOnly() {
				return true;
			}

			@Override
			public void resourceSetChanged(final ResourceSetChangeEvent event) {
				IConsumer<List<Notification>> t = callback;
				if (t != null) {
					t.apply(new ArrayList<>(event.getNotifications()));
				}
			}
		}
	}

	@Before
	public void setUp() {
		this.resourceSet = new ResourceSetImpl();
		this.resourceSet.getPackageRegistry().put(EefPackage.eNS_URI, EefPackage.eINSTANCE);
		this.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl()); //$NON-NLS-1$
		this.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl()); //$NON-NLS-1$

		AdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		this.editingDomain = new TransactionalEditingDomainImpl(adapterFactory, this.resourceSet);
		this.eca = new TEDModelChangeDetector(editingDomain);
		this.interpreter = new AQLInterpreter();
	}

	protected EEFViewDescription view(String modelPath) {
		Resource resource = EEFDataTests.loadResource(this.resourceSet, URI.createFileURI(EEFDataTests.CURRENTDIR + modelPath));
		MatcherAssert.assertThat(resource, IsNull.notNullValue());
		EObject eObject = resource.getContents().get(0);
		if (eObject instanceof EEFViewDescription) {
			EEFViewDescription eefViewDescription = (EEFViewDescription) eObject;
			return eefViewDescription;
		}
		throw new IllegalStateException("The root of the model is not a view description"); //$NON-NLS-1$
	}

	protected EEFPageDescription page(String modelPath, int pageIndex) {
		return this.view(modelPath).getPages().get(pageIndex);
	}

	protected EEFGroupDescription group(EEFPageDescription eefPageDescription, int groupIndex) {
		return eefPageDescription.getGroups().get(groupIndex);
	}

	protected <T extends EEFWidgetDescription> T widget(EEFGroupDescription eefGroupDescription, Class<T> clazz, int widgetIndex) {
		List<T> list = eefGroupDescription.getContainer().getWidgets().stream().filter(w -> clazz.isAssignableFrom(w.getClass()))
				.map(w -> clazz.cast(w)).collect(Collectors.toList());
		return list.get(widgetIndex);
	}

	protected EPackage ePackage(String modelPath, int ePackageIndex) {
		Resource resource = EEFDataTests.loadResource(this.resourceSet, URI.createFileURI(EEFDataTests.CURRENTDIR + modelPath));
		MatcherAssert.assertThat(resource, IsNull.notNullValue());
		EObject eObject = resource.getContents().get(0);
		if (eObject instanceof EPackage) {
			return (EPackage) eObject;
		}
		throw new IllegalStateException("The root of the model is not an EPackage"); //$NON-NLS-1$
	}

	protected IVariableManager newVariableManager(EObject eObject) {
		IVariableManager variableManager = new VariableManagerFactory().createVariableManager();
		variableManager.put(EEFExpressionUtils.SELF, eObject);
		return variableManager;
	}

	protected void testLabel(IEEFWidgetController controller, String expectedLabel) {
		AtomicBoolean atomicBoolean = new AtomicBoolean(false);
		controller.onNewLabel(label -> {
			MatcherAssert.assertThat(label, Is.is(expectedLabel));
			atomicBoolean.set(true);
		});
		controller.refresh();
		Assert.assertTrue(atomicBoolean.get());
	}

	protected void testHelp(IEEFWidgetController controller, String expectedHelp) {
		AtomicBoolean atomicBoolean = new AtomicBoolean(false);
		controller.onNewHelp(help -> {
			MatcherAssert.assertThat(help, Is.is(expectedHelp));
			atomicBoolean.set(true);
		});
		controller.refresh();
		Assert.assertTrue(atomicBoolean.get());
	}
}
