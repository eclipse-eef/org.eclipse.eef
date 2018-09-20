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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * This class is used to test the behavior of the exporter.
 *
 * @author sbegaudeau
 */
public class ExporterTests {
	/**
	 * Test the behavior of the operation should copy.
	 */
	@Test
	public void testShouldCopy() {
		Exporter exporter = new Exporter();
		assertFalse(exporter.shouldCopy("/path/to/some/file.css")); //$NON-NLS-1$
		assertFalse(exporter.shouldCopy("file.css")); //$NON-NLS-1$
		assertFalse(exporter.shouldCopy("/path/to/some/file.textile")); //$NON-NLS-1$
		assertFalse(exporter.shouldCopy("file.textile")); //$NON-NLS-1$
		assertFalse(exporter.shouldCopy("/path/to/some/toc.xml")); //$NON-NLS-1$
		assertFalse(exporter.shouldCopy("toc.xml")); //$NON-NLS-1$

		assertTrue(exporter.shouldCopy("/path/to/some/file.html")); //$NON-NLS-1$
		assertTrue(exporter.shouldCopy("file.html")); //$NON-NLS-1$
	}

	/**
	 * Test the line to keep in the content of a page.
	 */
	@Test
	public void testLinesToKeep() {
		//@formatter:off
		List<String> lines = Lists.newArrayList(
				"<html>", //$NON-NLS-1$
				"  <head>", //$NON-NLS-1$
				"    <title>Title</title>", //$NON-NLS-1$
				"  </head>", //$NON-NLS-1$
				"  <body>", //$NON-NLS-1$
				"    <div>a div</div>", //$NON-NLS-1$
				"    <span>a span</span>", //$NON-NLS-1$
				"    <h1>a title</h1>", //$NON-NLS-1$
				"    <p>some text</p>", //$NON-NLS-1$
				"  </body>", //$NON-NLS-1$
				"</html>"); //$NON-NLS-1$
		//@formatter:on

		// Version and path can be null since we do not have any links
		List<String> actual = new Exporter().getBody(lines, "/pages/language/page.html", "1.6.0", new ArrayList<>()); //$NON-NLS-1$ //$NON-NLS-2$

		// The result must have a specific first and last line with only the body inside
		List<String> expected = lines.subList(5, 9);
		expected.add(0, Exporter.ROOT_ELEMENT_START);
		expected.add(1, "  <ul class=\"breadcrumb\">"); //$NON-NLS-1$
		expected.add(2, "    <li><a href=\"#/documentation/1.6.0\">1.6.0</a></li>"); //$NON-NLS-1$
		expected.add(3, "  </ul>"); //$NON-NLS-1$
		expected.add(Exporter.ROOT_ELEMENT_END);

		assertThat(actual, contains(expected.toArray(new String[expected.size()])));
	}

	/**
	 * Test that a line without any link is not affected by the exporter.
	 */
	@Test
	public void testFixLineWithoutLinks() {
		String line = "This is a line without any links"; //$NON-NLS-1$

		String expected = line;

		assertThat(new Exporter().fixLine(line, null, null), is(expected));
	}

	/**
	 * Test that a line with a relative link is properly converted.
	 */
	@Test
	public void testFixLineWithRelativeLink() {
		String path = "main/folder/subfolder/page.html"; //$NON-NLS-1$
		String version = "1.6.0"; //$NON-NLS-1$
		String line = "This is a line with <a href=\"../../doc/releasenotes.html\">a relative link</a> somewhere"; //$NON-NLS-1$

		String expected = "This is a line with <a href=\"#/documentation/1.6.0/main/doc/releasenotes\">a relative link</a> somewhere"; //$NON-NLS-1$

		assertThat(new Exporter().fixLine(line, path, version), is(expected));
	}

	/**
	 * Test that a line with an external link is not affected.
	 */
	@Test
	public void testFixLineWithExternalLink() {
		String line = "This is <a href=\"http://www.google.com\">an external link</a> to somewhere"; //$NON-NLS-1$

		String expected = line;

		assertThat(new Exporter().fixLine(line, null, null), is(expected));
	}

	/**
	 * Test that a line with an anchor link is properly converted.
	 */
	@Test
	public void testFixLineWithAnchorLink() {
		String path = "main/folder/subfolder/page.html"; //$NON-NLS-1$
		String version = "1.6.0"; //$NON-NLS-1$
		String line = "This is <a href=\"#top\">an anchor link</a> to somewhere"; //$NON-NLS-1$

		String expected = "This is <a href=\"#/documentation/1.6.0/main/folder/subfolder/page#top\">an anchor link</a> to somewhere"; //$NON-NLS-1$ ;

		assertThat(new Exporter().fixLine(line, path, version), is(expected));
	}

	/**
	 * Test that a line with multiple links is properly converted.
	 */
	@Test
	public void testFixLineWithMultipleLinks() {
		String path = "main/folder/subfolder/page.html"; //$NON-NLS-1$
		String version = "1.6.0"; //$NON-NLS-1$
		String line = "This is a line with <a href=\"http://google.com\">multiple</a> <a href=\"../otherpage.html\">links</a>, <a href=\"../../../topic.html\">relative</a> or <a href=\"https://eclipse.org\">absolute</a>"; //$NON-NLS-1$

		String expected = "This is a line with <a href=\"http://google.com\">multiple</a> <a href=\"#/documentation/1.6.0/main/folder/otherpage\">links</a>, <a href=\"#/documentation/1.6.0/topic\">relative</a> or <a href=\"https://eclipse.org\">absolute</a>"; //$NON-NLS-1$

		assertThat(new Exporter().fixLine(line, path, version), is(expected));
	}

	/**
	 * Test that a line with an image is properly converted.
	 */
	@Test
	public void testFixLineWithImage() {
		String path = "main/folder/subfolder/page.html"; //$NON-NLS-1$
		String version = "1.6.0"; //$NON-NLS-1$
		String line = "This is a line with an image <img class=\"image\" src=\"image.png\"> and with some other content"; //$NON-NLS-1$

		String expected = "This is a line with an image <img class=\"image\" src=\"sections/documentation/1.6.0/main/folder/subfolder/image.png\"> and with some other content"; //$NON-NLS-1$

		assertThat(new Exporter().fixLine(line, path, version), is(expected));
	}
}
