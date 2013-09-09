/**
 * <copyright>
 *
 * Copyright (c) 2002-2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: EcoreActionBarContributor.java,v 1.19 2008/12/22 14:25:27 emerks Exp $
 */
package org.eclipse.emf.eef.editor.internal.actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

public class ExtendedLoadResourceAction extends LoadResourceAction {

	@Override
	public void run() {
		Shell shell = new Shell();
		ExtendedLoadResourceDialog loadResourceDialog = new ExtendedLoadResourceDialog(shell, domain);

		if (loadResourceDialog.open() == Window.OK && !loadResourceDialog.getRegisteredPackages().isEmpty()) {
			String source = "org.eclipse.emf.eef.editor";
			BasicDiagnostic diagnosic = new BasicDiagnostic(Diagnostic.INFO, source, 0, "Runtime packages are registered in the package registry and are not loaded as resources so while the package contents will be available for setting properties, they will not be displayed directly. Click details to see the list of successfully loaded runtime packages", null);
			for (EPackage ePackage : loadResourceDialog.getRegisteredPackages()) {
				diagnosic.add(new BasicDiagnostic(Diagnostic.INFO, source, 0, ePackage.getNsURI(), null));
			}
			new DiagnosticDialog(shell, "Information", "Runtime packages are not displayed in the editor", diagnosic, Diagnostic.INFO).open();
		}
	}

	public static class ExtendedLoadResourceDialog extends LoadResourceDialog {

		protected Set<EPackage> registeredPackages = new LinkedHashSet<EPackage>();

		public ExtendedLoadResourceDialog(Shell parent, EditingDomain domain) {
			super(parent, domain);
		}

		@Override
		protected boolean processResource(Resource resource) {
			// Put all static package in the package registry.
			//
			ResourceSet resourceSet = domain.getResourceSet();
			if (!resourceSet.getResources().contains(resource)) {
				Registry packageRegistry = resourceSet.getPackageRegistry();
				for (EPackage ePackage : getAllPackages(resource)) {
					packageRegistry.put(ePackage.getNsURI(), ePackage);
					registeredPackages.add(ePackage);
				}
			}
			return true;
		}

		public Set<EPackage> getRegisteredPackages() {
			return registeredPackages;
		}

		protected Collection<EPackage> getAllPackages(Resource resource) {
			List<EPackage> result = new ArrayList<EPackage>();
			for (TreeIterator<?> j = new EcoreUtil.ContentTreeIterator<Object>(resource.getContents()) {
				private static final long serialVersionUID = 1L;

				@Override
				protected Iterator<? extends EObject> getEObjectChildren(EObject eObject) {
					return eObject instanceof EPackage ? ((EPackage) eObject).getESubpackages().iterator() : Collections.<EObject> emptyList()
							.iterator();
				}
			}; j.hasNext();) {
				Object content = j.next();
				if (content instanceof EPackage) {
					result.add((EPackage) content);
				}
			}
			return result;
		}

		@Override
		protected Control createDialogArea(Composite parent) {
			Composite composite = (Composite) super.createDialogArea(parent);
			Composite buttonComposite = (Composite) composite.getChildren()[0];
			Button browseRegisteredPackagesButton = new Button(buttonComposite, SWT.PUSH);
			browseRegisteredPackagesButton.setText("Browse &Registered Packages...");
			prepareBrowseRegisteredPackagesButton(browseRegisteredPackagesButton);
			{
				FormData data = new FormData();
				Control[] children = buttonComposite.getChildren();
				data.left = new FormAttachment(0, 0);
				data.right = new FormAttachment(children[0], -CONTROL_OFFSET);
				browseRegisteredPackagesButton.setLayoutData(data);
			}
			return composite;
		}

		protected void prepareBrowseRegisteredPackagesButton(Button browseRegisteredPackagesButton) {
			browseRegisteredPackagesButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent event) {
					RegisteredPackageDialog registeredPackageDialog = new RegisteredPackageDialog(getShell());
					registeredPackageDialog.open();
					Object[] result = registeredPackageDialog.getResult();
					if (result != null) {
						List<?> nsURIs = Arrays.asList(result);
						if (registeredPackageDialog.isDevelopmentTimeVersion()) {
							ResourceSet resourceSet = new ResourceSetImpl();
							resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap());
							StringBuffer uris = new StringBuffer();
							Map<String, URI> ePackageNsURItoGenModelLocationMap = EcorePlugin.getEPackageNsURIToGenModelLocationMap();
							for (int i = 0, length = result.length; i < length; i++) {
								URI location = ePackageNsURItoGenModelLocationMap.get(result[i]);
								Resource resource = resourceSet.getResource(location, true);
								EcoreUtil.resolveAll(resource);
							}
							for (Resource resource : resourceSet.getResources()) {
								for (EPackage ePackage : getAllPackages(resource)) {
									if (nsURIs.contains(ePackage.getNsURI())) {
										uris.append(resource.getURI());
										uris.append("  ");
										break;
									}
								}
							}
							uriField.setText((uriField.getText() + "  " + uris.toString()).trim());
						} else {
							StringBuffer uris = new StringBuffer();
							for (int i = 0, length = result.length; i < length; i++) {
								uris.append(result[i]);
								uris.append("  ");
							}
							uriField.setText((uriField.getText() + "  " + uris.toString()).trim());
						}
					}
				}
			});
		}

		public static class RegisteredPackageDialog extends ElementListSelectionDialog {
			protected boolean isDevelopmentTimeVersion = true;

			public RegisteredPackageDialog(Shell parent) {
				super(parent, new LabelProvider() {
					@Override
					public Image getImage(Object element) {
						return ExtendedImageRegistry.getInstance().getImage(EcoreEditPlugin.INSTANCE.getImage("full/obj16/EPackage"));
					}
				});

				setMultipleSelection(true);
				setMessage("&Select a registered package URI:");
				setFilter("*");
				setTitle("Package Selection");
			}

			public boolean isDevelopmentTimeVersion() {
				return isDevelopmentTimeVersion;
			}

			protected void updateElements() {
				if (isDevelopmentTimeVersion) {
					Map<String, URI> ePackageNsURItoGenModelLocationMap = EcorePlugin.getEPackageNsURIToGenModelLocationMap();
					Object[] result = ePackageNsURItoGenModelLocationMap.keySet().toArray(new Object[ePackageNsURItoGenModelLocationMap.size()]);
					Arrays.sort(result);
					setListElements(result);
				} else {
					Object[] result = EPackage.Registry.INSTANCE.keySet().toArray(new Object[EPackage.Registry.INSTANCE.size()]);
					Arrays.sort(result);
					setListElements(result);
				}
			}

			@Override
			protected Control createDialogArea(Composite parent) {
				Composite result = (Composite) super.createDialogArea(parent);
				Composite buttonGroup = new Composite(result, SWT.NONE);
				GridLayout layout = new GridLayout();
				layout.numColumns = 2;
				buttonGroup.setLayout(layout);
				final Button developmentTimeVersionButton = new Button(buttonGroup, SWT.RADIO);
				developmentTimeVersionButton.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent event) {
						isDevelopmentTimeVersion = developmentTimeVersionButton.getSelection();
						updateElements();
					}
				});
				developmentTimeVersionButton.setText("&Development Time Version");
				Button runtimeTimeVersionButton = new Button(buttonGroup, SWT.RADIO);
				runtimeTimeVersionButton.setText("&Runtime Version");
				developmentTimeVersionButton.setSelection(true);

				updateElements();

				return result;
			}
		}
	}
}
