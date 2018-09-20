/*******************************************************************************
 * Copyright (c) 2017, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.internal;

import java.net.MalformedURLException;
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
	 * Retrieve an image from a string path as '/resource/folder/image.png'.
	 *
	 * @param imgPath
	 *            The image path
	 * @return The image
	 */
	public static Optional<Image> getImage(String imgPath) {
		return FileProvider.getDefault().getFile(new Path(imgPath)).flatMap(imageFile -> {
			Optional<Image> optionalImage = Optional.empty();

			if (imageFile.exists() && imageFile.canRead()) {
				try {
					ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL(imageFile.toURI().toURL());
					optionalImage = Optional.ofNullable(ExtendedImageRegistry.INSTANCE.getImage(imageDescriptor));
				} catch (MalformedURLException e) {
					EEFIdeUiPlugin.INSTANCE.log(e);
				}
			} else {
				String message = MessageFormat.format(Messages.EEFIdeUiPlugin_fileNotFound, imgPath);
				EEFIdeUiPlugin.getPlugin().error(message);
			}

			return optionalImage;
		});
	}

	/**
	 * Retrieve an image descriptor from a string path as '/resource/folder/image.png'.
	 *
	 * @param imgPath
	 *            The image path
	 * @return The image descriptor
	 */
	public static Optional<ImageDescriptor> getImageDescriptor(String imgPath) {
		return FileProvider.getDefault().getFile(new Path(imgPath)).flatMap(imageFile -> {
			Optional<ImageDescriptor> optionalImageDescriptor = Optional.empty();

			if (imageFile.exists() && imageFile.canRead()) {
				try {
					optionalImageDescriptor = Optional.of(ImageDescriptor.createFromURL(imageFile.toURI().toURL()));
				} catch (MalformedURLException e) {
					EEFIdeUiPlugin.INSTANCE.log(e);
				}
			} else {
				String message = MessageFormat.format(Messages.EEFIdeUiPlugin_fileNotFound, imgPath);
				EEFIdeUiPlugin.getPlugin().error(message);
			}

			return optionalImageDescriptor;
		});
	}
}
