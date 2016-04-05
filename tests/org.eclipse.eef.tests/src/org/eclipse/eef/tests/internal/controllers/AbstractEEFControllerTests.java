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
import org.eclipse.eef.core.api.ModelChangeDetector;
import org.eclipse.eef.core.api.ModelChangeExecutor;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.tests.internal.AQLInterpreter;
import org.eclipse.eef.tests.internal.EEFDataTests;
import org.eclipse.emf.common.notify.AdapterFactory;
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
	 * The change executor.
	 */
	protected ModelChangeExecutor mce;

	/**
	 * The change detector.
	 */
	protected ModelChangeDetector mcd;

	/**
	 * The editing domain.
	 */
	private TransactionalEditingDomainImpl editingDomain;

	/**
	 * Default implementation of ModelChangeDetector when workgin with a TED.
	 *
	 * @author pcdavid
	 */
	private static class TEDModelChangeDetector implements ModelChangeDetector {
		/**
		 * Describes the changes we want to react to.
		 */
		private static final NotificationFilter FILTER = NotificationFilter.NOT_TOUCH.and(NotificationFilter.createNotifierTypeFilter(EObject.class));

		/**
		 * The TED to watch.
		 */
		private final TransactionalEditingDomain ted;

		/**
		 * The registered triggers.
		 */
		private final List<Runnable> triggers = new ArrayList<>();

		/**
		 * The actual ResourceSetListener.
		 */
		private ResourceSetListener preCommitListener = new Listener();

		/**
		 * Create a new detector.
		 *
		 * @param session
		 *            the session to watch.
		 */
		public TEDModelChangeDetector(TransactionalEditingDomain ted) {
			this.ted = ted;
		}

		@Override
		public synchronized void addExternalModelChangeListener(Runnable trigger) {
			if (triggers.isEmpty()) {
				ted.addResourceSetListener(preCommitListener);
			}
			triggers.add(trigger);
		}

		@Override
		public synchronized void removeExternalModelChangeListener(Runnable trigger) {
			triggers.remove(trigger);
			if (triggers.isEmpty()) {
				ted.removeResourceSetListener(preCommitListener);
			}
		}

		/**
		 * The actual ResourceSetListener.
		 */
		private class Listener extends ResourceSetListenerImpl {
			public Listener() {
				super(TEDModelChangeDetector.FILTER);
			}

			@Override
			public boolean isPostcommitOnly() {
				return true;
			}

			@Override
			public void resourceSetChanged(final ResourceSetChangeEvent event) {
				for (Runnable r : triggers) {
					r.run();
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
		this.mce = new ModelChangeExecutor() {

			@Override
			public void execute(final Runnable effect) {
				editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {
					@Override
					protected void doExecute() {
						effect.run();
					}
				});
			}
		};
		this.mcd = new TEDModelChangeDetector(editingDomain);

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
