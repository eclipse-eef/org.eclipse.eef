/*******************************************************************************
 * Copyright (c) 2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.internal;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.Optional;

import org.eclipse.core.runtime.Path;
import org.eclipse.eef.ide.ui.internal.resource.FileProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * Utility class to manage images.
 *
 * @author mbats
 */
public final class EEFImageUtils {
	/**
	 * The constructor.
	 */
	private EEFImageUtils() {
		// prevent instantiation
	}

	/**
	 * Retrieve an image from a string path as '/resource/folder/image.png' or an URL.
	 *
	 * @param imgPath
	 *            The image path
	 * @return The image
	 */
	public static Optional<Image> getImage(Object imgPath) {
		Optional<ImageDescriptor> imageDescriptor = Optional.empty();
		if (imgPath instanceof String) {
			final File imageFile = FileProvider.getDefault().getFile(new Path((String) imgPath));
			if (imageFile != null && imageFile.exists() && imageFile.canRead()) {
				try {
					imageDescriptor = Optional.ofNullable(ImageDescriptor.createFromURL(imageFile.toURI().toURL()));
				} catch (MalformedURLException e) {
					EEFIdeUiPlugin.INSTANCE.log(e);
				}
			} else {
				String message = MessageFormat.format(Messages.EEFIdeUiPlugin_fileNotFound, imgPath);
				EEFIdeUiPlugin.getPlugin().error(message);
			}
		} else if (imgPath instanceof URL) {
			imageDescriptor = Optional.ofNullable(ImageDescriptor.createFromURL((URL) imgPath));
		} else {
			String message = MessageFormat.format(Messages.EEFIdeUiPlugin_fileNotFound, imgPath);
			EEFIdeUiPlugin.getPlugin().error(message);
		}

		return imageDescriptor.map(desc -> ExtendedImageRegistry.INSTANCE.getImage(desc));
	}

}
