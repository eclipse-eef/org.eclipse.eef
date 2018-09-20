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
package org.eclipse.eef.documentation.export.internal;

import static org.junit.Assert.fail;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.io.CharStreams;
import com.google.common.io.Closeables;
import com.google.common.io.Files;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.junit.Test;
import org.osgi.framework.Bundle;

/**
 * The documentation exporter.
 *
 * @author sbegaudeau
 */
public class Exporter {
	/**
	 * The path of the documentation pages in the bundle org.eclipse.eef.documentation.
	 */
	public static final String DOCUMENTATION_PAGES_ROOT_PATH = "/pages"; //$NON-NLS-1$

	/**
	 * The start of the root element containing the whole body.
	 */
	public static final String ROOT_ELEMENT_START = "<md-content layout=\"column\" layout-align=\"center stretch\" class=\"content\">"; //$NON-NLS-1$

	/**
	 * The end of the root element containing the whole body.
	 */
	public static final String ROOT_ELEMENT_END = "</md-content>"; //$NON-NLS-1$

	/**
	 * The extension of HTML files.
	 */
	public static final String HTML_EXTENSION = ".html"; //$NON-NLS-1$

	/**
	 * The start of an "img" element.
	 */
	public static final String IMG_ELEMENT_START = "<img"; //$NON-NLS-1$

	/**
	 * The start of the "src" attribute of the "img" element.
	 */
	public static final String IMG_SRC_ATTRIBUTE_START = "src=\""; //$NON-NLS-1$

	/**
	 * The end of the "src" attribute of the "img" element.
	 */
	public static final String IMG_SRC_ATTRIBUTE_END = "\""; //$NON-NLS-1$

	/**
	 * The start of an "a" element.
	 */
	public static final String A_ELEMENT_START = "<a href=\""; //$NON-NLS-1$

	/**
	 * The end of the href attribute of an "a" element.
	 */
	public static final String A_HREF_ATTRIBUTE_END = "\""; //$NON-NLS-1$

	/**
	 * The extension of the textile files.
	 */
	public static final String TEXTILE_EXTENSION = ".textile"; //$NON-NLS-1$

	/**
	 * The extension of the CSS files.
	 */
	public static final String CSS_EXTENSION = ".css"; //$NON-NLS-1$

	/**
	 * The name of the file containing the Eclipse Help table of content.
	 */
	public static final String TOC_XML_FILENAME = "toc.xml"; //$NON-NLS-1$

	/**
	 * The URL of the root of the documentation on the website.
	 */
	public static final String ROOT_DOCUMENTATION_URL = "#/documentation"; //$NON-NLS-1$

	/**
	 * The URL of the root of the documentation for static assets.
	 */
	public static final String ROOT_DOCUMENTATION_ASSET_URL = "sections/documentation/"; //$NON-NLS-1$

	/**
	 * The path of the toc.xml file.
	 */
	public static final String TOC_XML_PATH = "/pages/toc.xml"; //$NON-NLS-1$

	/**
	 * Exports the documentation for the website.
	 */
	@Test
	public void exportDocumentation() {
		Bundle bundle = Platform.getBundle("org.eclipse.eef.documentation"); //$NON-NLS-1$
		if (bundle != null) {
			String version = this.getVersion(bundle);
			List<Topic> topics = this.getTopics(bundle);

			// Find all the documentation pages recursively in the documentation bundle
			Enumeration<URL> entries = bundle.findEntries(DOCUMENTATION_PAGES_ROOT_PATH, "*.*", true); //$NON-NLS-1$
			while (entries.hasMoreElements()) {
				URL entry = entries.nextElement();
				String path = entry.getPath().substring((DOCUMENTATION_PAGES_ROOT_PATH + "/").length()); //$NON-NLS-1$

				List<Topic> breadcrumbTopics = this.getBreadcrumbTopics(topics, path);

				if (entry.getFile().endsWith(HTML_EXTENSION)) {
					// Read, process and write the processed HTML files
					List<String> lines = this.readLines(entry);
					List<String> linesToKeep = this.getBody(lines, path, version, breadcrumbTopics);
					this.writeLines(linesToKeep, path, version);
				} else if (this.shouldCopy(path)) {
					// Let's copy other resources directly at its new location (images, video, etc)
					this.copyResource(entry, path, version);
				}
			}
		}
	}

	public List<Topic> getBreadcrumbTopics(List<Topic> topics, String path) {
		List<Topic> breadcrumbTopics = new ArrayList<>();

		// Find the topic matching the path
		Topic topic = this.find(topics, path);

		// Compute its parent topics
		if (topic != null) {
			breadcrumbTopics.addAll(this.getParents(topic));
		}

		return Lists.reverse(breadcrumbTopics);
	}

	private List<Topic> getParents(Topic topic) {
		List<Topic> parents = new ArrayList<>();

		if (topic.getParent() != null) {
			parents.add(topic.getParent());
			parents.addAll(this.getParents(topic.getParent()));
		}

		return parents;
	}

	private Topic find(List<Topic> topics, String path) {
		Topic topic = null;

		Iterator<Topic> iterator = topics.iterator();
		while (topic == null && iterator.hasNext()) {
			Topic next = iterator.next();
			if (("pages/" + path).equals(next.getHref())) { //$NON-NLS-1$
				topic = next;
			} else {
				topic = this.find(next.getTopics(), path);
			}
		}
		return topic;
	}

	public List<Topic> getTopics(Bundle bundle) {
		List<Topic> topics = new ArrayList<>();
		// Find the toc.xml file
		URL tocXmlEntry = bundle.getEntry(TOC_XML_PATH);
		if (tocXmlEntry != null) {
			InputStream inputStream = null;
			try {
				inputStream = tocXmlEntry.openStream();
				topics.addAll(new TocReader().getTopics(inputStream));
			} catch (IOException e) {
				fail(e.getMessage());
			} finally {
				try {
					Closeables.close(inputStream, false);
				} catch (IOException e) {
					fail(e.getMessage());
				}
			}
		}
		return topics;
	}

	/**
	 * Indicates if we should copy the resource with the given path.
	 *
	 * @param path
	 *            The path of the resource
	 * @return <code>true</code> if we should copy it, <code>false</code> otherwise
	 */
	public boolean shouldCopy(String path) {
		boolean shouldCopy = true;

		// We will not copy css files, textile files nor the file toc.xml.

		shouldCopy = shouldCopy && !path.endsWith(TEXTILE_EXTENSION);
		shouldCopy = shouldCopy && !path.endsWith(CSS_EXTENSION);
		shouldCopy = shouldCopy && !path.endsWith(TOC_XML_FILENAME);
		return shouldCopy;
	}

	/**
	 * Copy the resource from the given entry at a new location computed from its path and the version of the
	 * documentation.
	 *
	 * @param entry
	 *            The entry
	 * @param path
	 *            The path
	 * @param documentationVersion
	 *            The version of the documentation
	 */
	private void copyResource(URL entry, String path, String documentationVersion) {
		InputStream inputStream = null;
		try {
			inputStream = entry.openStream();
			Path outputPath = this.getOutputPath(documentationVersion, path);
			outputPath.toFile().getParentFile().mkdirs();
			outputPath.toFile().createNewFile();

			java.nio.file.Files.copy(inputStream, outputPath.toFile().toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		} finally {
			try {
				Closeables.close(inputStream, false);
			} catch (IOException e) {
				fail(e.getMessage());
			}
		}
	}

	/**
	 * Returns the version of the given bundle as a string with the major, minor and micro numbers only.
	 *
	 * @param bundle
	 *            The bundle
	 * @return The version of the given bundle
	 */
	private String getVersion(Bundle bundle) {
		return "" + bundle.getVersion().getMajor() + '.' + bundle.getVersion().getMinor() + '.' + bundle.getVersion().getMicro(); //$NON-NLS-1$
	}

	/**
	 * Returns the content of the body of the HTML file processed.
	 *
	 * @param lines
	 *            The lines of the HTML file
	 * @param path
	 *            The path of the file
	 * @param documentationVersion
	 *            The version of the documentation
	 * @param breadcrumbTopics
	 *            The breadcrumb topics
	 * @return The content of the file to save
	 */
	public List<String> getBody(List<String> lines, String path, String documentationVersion, List<Topic> breadcrumbTopics) {
		List<String> linesToKeep = new ArrayList<>();
		linesToKeep.add(ROOT_ELEMENT_START);

		if (!"index.html".equalsIgnoreCase(path)) { //$NON-NLS-1$
			List<String> breadcrumb = this.createBreadcrumb(breadcrumbTopics, documentationVersion);
			linesToKeep.addAll(breadcrumb);
		}
		boolean hasFoundStartBody = false;
		boolean hasFoundStopBody = false;
		for (String line : lines) {
			hasFoundStopBody = hasFoundStopBody || line.contains("</body>"); //$NON-NLS-1$
			if (hasFoundStartBody && !hasFoundStopBody) {
				linesToKeep.add(this.fixLine(line, path, documentationVersion));
			}
			hasFoundStartBody = hasFoundStartBody || line.contains("<body>"); //$NON-NLS-1$
		}

		linesToKeep.add(ROOT_ELEMENT_END);
		return linesToKeep;
	}

	/**
	 * @param breadcrumbTopics
	 * @return
	 */
	private List<String> createBreadcrumb(List<Topic> breadcrumbTopics, String documentationVersion) {
		List<String> lines = new ArrayList<>();

		lines.add("  <ul class=\"breadcrumb\">"); //$NON-NLS-1$
		if (breadcrumbTopics.size() > 0) {
			lines.add("    <li><a href=\"" + ROOT_DOCUMENTATION_URL + '/' + documentationVersion + "\">" + documentationVersion //$NON-NLS-1$ //$NON-NLS-2$
					+ "</a> <span class=\"divider\">/</span></li>"); //$NON-NLS-1$
		} else {
			lines.add("    <li><a href=\"" + ROOT_DOCUMENTATION_URL + '/' + documentationVersion + "\">" + documentationVersion + "</a></li>"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
		int i = 0;
		for (Topic topic : breadcrumbTopics) {
			String href = topic.getHref();

			if (href.startsWith(DOCUMENTATION_PAGES_ROOT_PATH.substring(1))) {
				href = href.substring(DOCUMENTATION_PAGES_ROOT_PATH.substring(1).length());
			}
			if (href.endsWith(HTML_EXTENSION)) {
				href = href.substring(0, href.length() - HTML_EXTENSION.length());
			}

			href = ROOT_DOCUMENTATION_URL + '/' + documentationVersion + href;

			if (i + 1 < breadcrumbTopics.size()) {
				lines.add("    <li><a href=\"" + href + "\">" + topic.getLabel() + "</a> <span class=\"divider\">/</span></li>"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			} else {
				lines.add("    <li><a href=\"" + href + "\">" + topic.getLabel() + "</a></li>"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}

			i = i + 1;
		}
		lines.add("  </ul>"); //$NON-NLS-1$

		return lines;
	}

	/**
	 * Fixes the links that can be found in the line.
	 *
	 * @param line
	 *            A line of the body of the HTML file
	 * @param path
	 *            The path of the file
	 * @param documentationVersion
	 *            The version of the documentation
	 * @return The line with its links fixed
	 */
	public String fixLine(String line, String path, String documentationVersion) {
		StringBuilder builder = new StringBuilder();

		int startIndex = 0;
		int endIndex = 0;

		while (startIndex != -1 && endIndex != -1) {
			int nextLinkStartIndex = this.getNextLinkStart(line, endIndex);
			int nextImageSrcStartIndex = this.getNextImageSrcStart(line, endIndex);

			if (nextLinkStartIndex == -1 && nextImageSrcStartIndex == -1) {
				// No image or link remaining
				builder.append(line.substring(endIndex));
				endIndex = -1;
			} else if (nextLinkStartIndex == -1 && nextImageSrcStartIndex != -1) {
				// At least one image but no link remaining
				startIndex = nextImageSrcStartIndex;
				endIndex = this.handleImageSrc(builder, line, nextImageSrcStartIndex, endIndex, path, documentationVersion);
			} else if (nextLinkStartIndex != -1 && nextImageSrcStartIndex == -1) {
				// At least one link but no image remaining
				startIndex = nextLinkStartIndex;
				endIndex = this.handleLink(builder, line, nextLinkStartIndex, endIndex, path, documentationVersion);
			} else if (nextLinkStartIndex != -1 && nextImageSrcStartIndex != -1) {
				// At least one image and one link remaining
				boolean linkBeforeImage = nextLinkStartIndex < nextImageSrcStartIndex;
				if (linkBeforeImage) {
					startIndex = nextLinkStartIndex;
					endIndex = this.handleLink(builder, line, nextLinkStartIndex, endIndex, path, documentationVersion);
				} else {
					startIndex = nextImageSrcStartIndex;
					endIndex = this.handleImageSrc(builder, line, nextImageSrcStartIndex, endIndex, path, documentationVersion);
				}
			}
		}

		return builder.toString();
	}

	/**
	 * Handles the image.
	 *
	 * @param builder
	 *            The builder
	 * @param line
	 *            The line
	 * @param startIndex
	 *            The start index
	 * @param endIndex
	 *            The end index
	 * @param path
	 *            The path of the HTML file
	 * @param documentationVersion
	 *            The version of the documentation
	 * @return The end index of the image
	 */
	private int handleImageSrc(StringBuilder builder, String line, int startIndex, int endIndex, String path, String documentationVersion) {
		int newEndIndex = endIndex;
		// Append the content before this image
		builder.append(line.substring(newEndIndex, startIndex));

		newEndIndex = this.getNextImageSrcEnd(line, startIndex + IMG_SRC_ATTRIBUTE_START.length());
		if (newEndIndex != -1) {
			// We have found at least one image in the line
			String imageSrc = line.substring(startIndex + IMG_SRC_ATTRIBUTE_START.length(), newEndIndex);

			// Let's convert it
			String convertedImageSrc = this.convertImageSrc(imageSrc, path, documentationVersion);

			// Now append it to the builder
			builder.append(IMG_SRC_ATTRIBUTE_START);
			builder.append(convertedImageSrc);
		} else {
			// Should not occur, the link is invalid
		}
		return newEndIndex;
	}

	/**
	 * Handles the link.
	 *
	 * @param builder
	 *            The builder
	 * @param line
	 *            The line
	 * @param startIndex
	 *            The start index of the link
	 * @param endIndex
	 *            The end index of the link
	 * @param path
	 *            The path of the HTML file
	 * @param documentationVersion
	 *            The version of the documentation
	 * @return The end index of the link
	 */
	private int handleLink(StringBuilder builder, String line, int startIndex, int endIndex, String path, String documentationVersion) {
		int newEndIndex = endIndex;
		// Append the content before this link
		builder.append(line.substring(newEndIndex, startIndex));

		newEndIndex = this.getNextLinkEnd(line, startIndex + A_ELEMENT_START.length());
		if (newEndIndex != -1) {
			// We have found at least one link in the line
			String link = line.substring(startIndex + A_ELEMENT_START.length(), newEndIndex);

			// Let's convert it
			String convertedLink = this.convertLink(link, path, documentationVersion);

			// Now append it to the builder
			builder.append(A_ELEMENT_START);
			builder.append(convertedLink);
		} else {
			// Should not occur, the link is invalid
		}
		return newEndIndex;
	}

	/**
	 * Returns the index of the start of the src attribute of the next image.
	 *
	 * @param line
	 *            The line
	 * @param fromIndex
	 *            The index from which the search should start.
	 * @return The index of the start of the src attribute or -1 if none could be found
	 */
	private int getNextImageSrcStart(String line, int fromIndex) {
		int imgStartIndex = line.indexOf(IMG_ELEMENT_START, fromIndex);
		if (imgStartIndex != -1) {
			return line.indexOf(IMG_SRC_ATTRIBUTE_START, imgStartIndex);
		}
		return -1;
	}

	/**
	 * Returns the index of the end of the "src" attribute of an "img" element.
	 *
	 * @param line
	 *            The line
	 * @param fromIndex
	 *            The index from which the search should start
	 * @return The index of the end of the "src" attribute or -1 if none could be found
	 */
	private int getNextImageSrcEnd(String line, int fromIndex) {
		return line.indexOf(IMG_SRC_ATTRIBUTE_END, fromIndex);
	}

	/**
	 * Returns the index of the start of the next link.
	 *
	 * @param line
	 *            The line
	 * @param fromIndex
	 *            The index from which the search should start
	 * @return The index of the start of the next link or -1 if none could be found
	 */
	private int getNextLinkStart(String line, int fromIndex) {
		return line.indexOf(A_ELEMENT_START, fromIndex);
	}

	/**
	 * Returns the index of the end of the next link.
	 *
	 * @param line
	 *            The line
	 * @param fromIndex
	 *            The index from which the search should start
	 * @return The index of the end of the next link or -1 if none could be found
	 */
	private int getNextLinkEnd(String line, int fromIndex) {
		return line.indexOf(A_HREF_ATTRIBUTE_END, fromIndex);
	}

	/**
	 * Trims the HTML extension of the path.
	 *
	 * @param path
	 *            The path
	 * @return The trimmed extension
	 */
	public String trimExtension(String path) {
		if (path.endsWith(HTML_EXTENSION)) {
			return path.substring(0, path.length() - HTML_EXTENSION.length());
		}
		return path;
	}

	/**
	 * Converts the image "src" attribute.
	 *
	 * @param imageSrc
	 *            The "src" attribute of the image
	 * @param path
	 *            The path of the HTML file containing the image
	 * @param documentationVersion
	 *            The version of the documentation
	 * @return The converted src
	 */
	public String convertImageSrc(String imageSrc, String path, String documentationVersion) {
		try {
			String prefix = "http://host.tld/"; //$NON-NLS-1$
			URL prefixedURL = new URL(new URL("http", "host.tld", "/" + path), imageSrc); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			String prefixedResolvedLink = prefixedURL.toString();
			String resolvedPath = prefixedResolvedLink.substring(prefix.length());

			String rootDocumentationPrefix = ROOT_DOCUMENTATION_ASSET_URL + documentationVersion + "/"; //$NON-NLS-1$
			return rootDocumentationPrefix + resolvedPath;
		} catch (MalformedURLException e) {
			fail(e.getMessage());
		}
		return imageSrc;
	}

	/**
	 * Converts the link.
	 *
	 * @param link
	 *            The link
	 * @param path
	 *            The path of the HTML file containing the link
	 * @param documentationVersion
	 *            The version of the documentation
	 * @return The converted link
	 */
	public String convertLink(String link, String path, String documentationVersion) {
		String convertedLink = link;

		if (this.isRelative(link)) {
			// We have to resolve the link regarding to the current path, for that we will build an URL with the path
			// and resolve the link against it
			try {
				// Let's consider that path=/folder/subfolder/resource.html

				String prefix = "http://host.tld/"; //$NON-NLS-1$
				URL prefixedURL = new URL(new URL("http", "host.tld", "/" + this.trimExtension(path)), this.trimExtension(link)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				String prefixedResolvedLink = prefixedURL.toString();

				// Now prefix=http://host.tld, prefixedResolvedLink=http://host.tld/folder/subfolder/resource
				String resolvedPath = prefixedResolvedLink.substring(prefix.length());
				convertedLink = ROOT_DOCUMENTATION_URL + '/' + documentationVersion + '/' + resolvedPath;
			} catch (MalformedURLException e) {
				fail(e.getMessage());
			}
		} else if (this.isAnchor(link)) {
			// The link must now be absolute
			convertedLink = ROOT_DOCUMENTATION_URL + '/' + documentationVersion + '/' + this.trimExtension(path) + link;
		}

		return convertedLink;
	}

	/**
	 * Indicates if a link is relative.
	 *
	 * @param link
	 *            The link
	 * @return <code>true</code> if the link is relative, <code>false</code> otherwise
	 */
	public boolean isRelative(String link) {
		return !link.contains(":/"); //$NON-NLS-1$
	}

	/**
	 * Indicates if a link is an anchor.
	 *
	 * @param link
	 *            The link
	 * @return <code>true</code> if the link is an anchor, <code>false</code> otherwise
	 */
	public boolean isAnchor(String link) {
		return link.startsWith("#"); //$NON-NLS-1$
	}

	/**
	 * Reads the lines of the file at the given URL.
	 *
	 * @param entry
	 *            The URL of the file
	 * @return The lines of the file
	 */
	private List<String> readLines(URL entry) {
		List<String> lines = new ArrayList<>();

		InputStreamReader inputStreamReader = null;
		try {
			InputStream openStream = entry.openStream();
			inputStreamReader = new InputStreamReader(openStream, Charsets.UTF_8);
			lines.addAll(CharStreams.readLines(inputStreamReader));
		} catch (IOException e) {
			fail(e.getMessage());
		} finally {
			try {
				Closeables.close(inputStreamReader, false);
			} catch (IOException e) {
				fail(e.getMessage());
			}
		}
		return lines;
	}

	/**
	 * Writes the lines of the file at the given path.
	 *
	 * @param lines
	 *            The lines to write
	 * @param path
	 *            The path of the file
	 * @param documentationVersion
	 *            The version of the documentation (used to compute the full path where the file will be written)
	 */
	private void writeLines(List<String> lines, String path, String documentationVersion) {
		Path file = this.getOutputPath(documentationVersion, path);
		StringBuilder builder = new StringBuilder();
		lines.forEach(line -> builder.append(line + System.lineSeparator()));
		try {
			file.toFile().getParentFile().mkdirs();
			Files.write(builder.toString(), file.toFile(), Charset.forName("UTF-8")); //$NON-NLS-1$
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}

	/**
	 * Computes the output path for the given input path. The path of the ouput will be located in the folder "target"
	 * of this plugin under a folder named at the given documentation version. If the path of the input is
	 * "/folder/subfolder/file.html" then the path of the ouput will be
	 * "LOCATION_OF_THIS_PLUGIN/target/DOCUMENTATION_VERSION/folder/subfolder/file.html".
	 *
	 * @param documentationVersion
	 *            The version of the documentation
	 * @param inputPath
	 *            The path of the input
	 * @return The path of the output
	 */
	private Path getOutputPath(String documentationVersion, String inputPath) {
		String userDir = System.getProperty("user.dir"); //$NON-NLS-1$
		Path userDirPath = Paths.get(userDir);
		return userDirPath.resolve("target").resolve(documentationVersion).resolve(inputPath); //$NON-NLS-1$
	}
}
