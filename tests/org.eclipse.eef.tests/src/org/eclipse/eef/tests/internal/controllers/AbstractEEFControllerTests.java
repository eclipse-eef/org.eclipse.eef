/*******************************************************************************
 * Copyright (c) 2016, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.tests.internal.controllers;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFPageDescription;
import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.tests.internal.AQLInterpreter;
import org.eclipse.eef.tests.internal.EEFDataTests;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.sirius.common.interpreter.api.VariableManagerFactory;
import org.junit.Before;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

import static org.junit.Assert.assertTrue;


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
	protected EditingContextAdapter contextAdapter;

	@Before
	public void setUp() {
		this.resourceSet = new ResourceSetImpl();
		this.resourceSet.getPackageRegistry().put(EefPackage.eNS_URI, EefPackage.eINSTANCE);
		this.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl()); //$NON-NLS-1$
		this.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl()); //$NON-NLS-1$
		this.interpreter = new AQLInterpreter();
	}

	protected EEFViewDescription view(String modelPath) {
		Resource resource = EEFDataTests.loadResource(this.resourceSet, URI.createFileURI(EEFDataTests.CURRENTDIR + modelPath));
		assertThat(resource, notNullValue());
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
		List<T> list = eefGroupDescription.getControls().stream().filter(w -> clazz.isAssignableFrom(w.getClass())).map(w -> clazz.cast(w))
				.collect(Collectors.toList());
		return list.get(widgetIndex);
	}

	protected EPackage ePackage(String modelPath, int ePackageIndex) {
		Resource resource = EEFDataTests.loadResource(this.resourceSet, URI.createFileURI(EEFDataTests.CURRENTDIR + modelPath));
		assertThat(resource, notNullValue());
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
			assertThat(label, is(expectedLabel));
			atomicBoolean.set(true);
		});
		controller.refresh();
		assertTrue(atomicBoolean.get());
	}

	protected void testHelp(IEEFWidgetController controller, String expectedHelp) {
		AtomicBoolean atomicBoolean = new AtomicBoolean(false);
		controller.onNewHelp(help -> {
			assertThat(help, is(expectedHelp));
			atomicBoolean.set(true);
		});
		controller.computeHelp();
		controller.refresh();
		assertTrue(atomicBoolean.get());
	}
}
