package org.eclipse.eef.documentation.validator.api;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Validator {
	public static void main(String[] args) {
		String eefEcorePath = args[0];
		String metamodelMdPath = args[1];
		
		// Load the eef.ecore model
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		URI uri = URI.createFileURI(new File(eefEcorePath).getAbsolutePath());
		Resource resource = resourceSet.getResource(uri , true);
		
		// Read the documentation
		try {
			Stream<String> lines = Files.lines(Paths.get(new File(metamodelMdPath).toURI())).filter(line -> line.startsWith("* "));
			new DocumentationValidator().validateLines(lines, resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
