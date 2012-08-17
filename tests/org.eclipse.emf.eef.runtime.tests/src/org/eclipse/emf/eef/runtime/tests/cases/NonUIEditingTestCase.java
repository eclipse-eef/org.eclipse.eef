/**
 * 
 */
package org.eclipse.emf.eef.runtime.tests.cases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.eef.runtime.binding.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditingContext;
import org.eclipse.emf.eef.runtime.editingModel.EditingModelBuilder;
import org.eclipse.emf.eef.runtime.editingModel.PropertiesEditingModel;
import org.eclipse.emf.eef.runtime.editingModel.AbstractPropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.tests.util.EEFTestStuffsBuilder;
import org.eclipse.emf.eef.runtime.tests.views.EClassMockView;
import org.eclipse.emf.eef.runtime.view.handler.ViewHandler;
import org.eclipse.emf.eef.runtime.view.handler.ViewHandlerProvider;
import org.junit.After;
import org.junit.Before;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class NonUIEditingTestCase {

	protected PropertiesEditingContext editingContext;
	protected List<Object> views;
	protected EObject editedObject;
	private Collection<ViewHandler<?>> viewHandlers;
	protected ComposedAdapterFactory adapterFactory;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		editedObject = createEditedObject();
		final PropertiesEditingModel editingModel = buildEditingModel();
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new AbstractPropertiesEditingProvider() {

			/**
			 * {@inheritDoc}
			 * @see org.eclipse.emf.eef.runtime.editingModel.AbstractPropertiesEditingProvider#initSpecificEditingModel()
			 */
			protected Collection<? extends PropertiesEditingModel> initSpecificEditingModel() {
				List<PropertiesEditingModel> result = new ArrayList<PropertiesEditingModel>();
				result.add(editingModel);
				return result;
			}

			/**
			 * {@inheritDoc}
			 * @see org.eclipse.emf.eef.runtime.editingModel.AbstractPropertiesEditingProvider#initViewHandlerProvider()
			 */
			protected ViewHandlerProvider initViewHandlerProvider() {
				return new EEFTestStuffsBuilder().buildViewHandlerProvider();
			}
			
		});
		editingContext =  createEditingContext();
		viewHandlers = editingContext.getEditingComponent().createViewHandlers();
		views = new ArrayList<Object>();
		for (ViewHandler<?> viewHandler : viewHandlers) {
			PropertiesEditingComponent editingComponent = editingContext.getEditingComponent();
			Object view = viewHandler.createView(editingComponent);
			viewHandler.initView(editingComponent);
			views.add(view);
		}
	}

	protected EObject createEditedObject() {
		EPackage ecoreModel = new EEFTestStuffsBuilder().buildEcoreSampleModel();
		return ecoreModel.getEClassifiers().get(0);
	}

	protected EObjectPropertiesEditingContext createEditingContext() {
		return new EObjectPropertiesEditingContext(adapterFactory, editedObject);
	}

	/**
	 * @return
	 */
	protected PropertiesEditingModel buildEditingModel() {
		return new EditingModelBuilder()
							.bindClass(EcorePackage.Literals.ECLASS)
								.withView(EClassMockView.class)
							.build();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		for (ViewHandler<?> handler : viewHandlers) {
			handler.dispose();
		}
		editingContext.dispose();
	}


}
