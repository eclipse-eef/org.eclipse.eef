package org.eclipse.emf.eef.runtime.ui.internal.util;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.views.ViewElement;
import org.eclipse.emf.eef.views.ViewsRepository;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class NamingHelper {

	
	/**
	 * @param element
	 * @return
	 */
	public static String nameDiscriminator(ViewElement element) {
		String baseName = element.getName();
		StringBuffer buffer = new StringBuffer();
		EObject container = element.eContainer();
		while (container instanceof ViewElement) {
			if (equalsIngnoreWhiteSpacesAndCase(((ViewElement)container).getName(),baseName)) {
				buffer.append('_');
			}
			container = container.eContainer();
		}
		ViewsRepository repository = repository(container);
		if (repository != null) {
			if (equalsIngnoreWhiteSpacesAndCase(repository.getName(),baseName)) {
				buffer.append('_');
			}
		}
		return buffer.toString();
	}

	private static boolean equalsIngnoreWhiteSpacesAndCase(String name1, String name2) {
		return removeWhiteSpaces(name1).equalsIgnoreCase(removeWhiteSpaces(name2));
	}
	
	private static String removeWhiteSpaces(String name) {
		return name.replaceAll("\\s", "").trim();
	}
	
	private static ViewsRepository repository(EObject obj) {
		EObject container  = obj.eContainer();
		while (container != null) {
			if (container instanceof ViewsRepository) {
				return (ViewsRepository) container;
			}
			container = container.eContainer();
		}
		return null;
	}
}
