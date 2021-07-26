/**
 * Copyright (c) Israel Aerospace Industries, Eclipse contributors and others 2021.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *
 */

package org.eclipse.eef.ide.ui.ext.widgets.markup.internal.markdown;

import static java.util.stream.Collectors.joining;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.vladsch.flexmark.parser.Parser;

import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.widgets.Display;
import org.junit.Before;
import org.junit.Test;

public class MarkodwnStyleFactoryTest {

	private Parser parser;
	private MarkdownStyleBuilder styleBuilder;
	private MarkodwnStyleFactory styleProvider;

	@Before
	public void before() {
		parser = FlexmarkUtil.builFlexParser();

		styleProvider = new MarkodwnStyleFactory(Display.getDefault());
		styleBuilder = new MarkdownStyleBuilder(styleProvider);

	}

	@Test
	public void testOrdererList() {
		String input = "1. XX\n" + //
				"2. YY\n" + //
				"3. ZZ\n";

		StyleDescription style = buildStyles(input);

		assertStyle(List.of(//
				styleProvider.buildListItemMarkerStyle(0, 2), // Bullet style 1.
				styleProvider.buildListItemMarkerStyle(6, 2), // Bullet style 2.
				styleProvider.buildListItemMarkerStyle(12, 2)// Bullet style 3.

		), style.getStyles());
	}

	@Test
	public void checkUnOrderedList() {
		String input = "+ XX\n" + //
				"+ YY\n" + //
				"+ ZZ\n";

		StyleDescription style = buildStyles(input);

		assertStyle(List.of(//
				styleProvider.buildListItemMarkerStyle(0, 1), // Bullet style 1.
				styleProvider.buildListItemMarkerStyle(5, 1), // Bullet style 2.
				styleProvider.buildListItemMarkerStyle(10, 1)// Bullet style 3.

		), style.getStyles());
	}

	@Test
	public void checkBulletList() {
		String input = "* XX\n" + //
				"* YY\n" + //
				"* ZZ\n";

		StyleDescription style = buildStyles(input);

		assertStyle(List.of(//
				styleProvider.buildListItemMarkerStyle(0, 1), // Bullet style 1.
				styleProvider.buildListItemMarkerStyle(5, 1), // Bullet style 2.
				styleProvider.buildListItemMarkerStyle(10, 1)// Bullet style 3.

		), style.getStyles());
	}

	/**
	 * Check that child style that are not overlapping with their parent style a kept (parent style == BulletItemStyle
	 * and children style=Code)
	 */
	@Test
	public void checkNonOverlappingChildStyle() {
		String input = "+ Create a list by starting a line with `+`, `-`, or `*`";

		StyleDescription style = buildStyles(input);

		assertStyle(List.of(//
				styleProvider.buildListItemMarkerStyle(0, 1), // Bullet style
				styleProvider.buildCodeStyle(40, 3), // Code style +
				styleProvider.buildCodeStyle(45, 3), // Code style -
				styleProvider.buildCodeStyle(53, 3)// Code style *

		), style.getStyles());
	}

	@Test
	public void checkSimpleHeading() {
		String input = "# Header 1" + "\n\r" //
				+ "## Header 2" + "\n\r";

		StyleDescription style = buildStyles(input);

		assertStyle(List.of(styleProvider.buildHeaderStyle(0, 10, 1), styleProvider.buildHeaderStyle(12, 11, 2)), style.getStyles());
	}

	/**
	 * Check that overlapping inside style are merged (parent style = heading children = bold and italic). In this case
	 * the styles are contained (and not at a limit of the parent style range)
	 */
	@Test
	public void checkHeading_OverlappingInside() {
		String input = "# Header **bold** and _italic_ 1";

		StyleDescription style = buildStyles(input);

		assertStyle(List.of(styleProvider.buildHeaderStyle(0, 9, 1), //
				new StyleRange(9, 8, styleProvider.getHeadingColor(), null, SWT.BOLD), //
				styleProvider.buildHeaderStyle(17, 5, 1), //
				new StyleRange(22, 8, styleProvider.getHeadingColor(), null, SWT.ITALIC), //
				styleProvider.buildHeaderStyle(30, 2, 1)//
		), style.getStyles());
	}

	/**
	 * Check that overlapping inside style are merged (parent style = heading children = bold and italic). In this case
	 * the one of the children style (italic) is at the end of the parent style range
	 */
	@Test
	public void checkHeading_OverlappingEnd() {
		String input = "# Header **bold** and _italic_";

		StyleDescription style = buildStyles(input);

		assertStyle(List.of(styleProvider.buildHeaderStyle(0, 9, 1), //
				new StyleRange(9, 8, styleProvider.getHeadingColor(), null, SWT.BOLD), //
				styleProvider.buildHeaderStyle(17, 5, 1), //
				new StyleRange(22, 8, styleProvider.getHeadingColor(), null, SWT.ITALIC)), style.getStyles());
	}

	/**
	 * Check overlapping style are merged in this case the children style stars and ends at the same range of parent
	 * style
	 */
	@Test
	public void checkOverlappingStyle() {
		String input = "**_Bold Italic_**";

		StyleDescription style = buildStyles(input);

		assertStyle(List.of(styleProvider.buildBoldStyle(0, 2), //
				new StyleRange(2, 13, null, null, SWT.BOLD | SWT.ITALIC), //
				styleProvider.buildBoldStyle(15, 2)), //
				style.getStyles());
	}

	private void assertStyle(List<StyleRange> expected, List<StyleRange> real) {

		assertEquals("Expecting :\n" + toString(expected) + "\n but was \n" + toString(real), expected, real);
	}

	private String toString(List<StyleRange> expected) {
		return expected.stream().map(s -> toString(s)).collect(joining("\n", "[", "]"));
	}

	public String toString(StyleRange s) {
		String string = s.toString();
		return string.substring(12, string.length() - 1);
	}

	@Test
	public void checkComplexDoc() {
		// @formatter:off
		//from https://markdown-it.github.io/
		String input = "---\r\n"
				+ "__Advertisement :)__\r\n"
				+ "\r\n"
				+ "- __[pica](https://nodeca.github.io/pica/demo/)__ - high quality and fast image\r\n"
				+ "  resize in browser.\r\n"
				+ "- __[babelfish](https://github.com/nodeca/babelfish/)__ - developer friendly\r\n"
				+ "  i18n with plurals support and easy syntax.\r\n"
				+ "\r\n"
				+ "You will like those projects!\r\n"
				+ "\r\n"
				+ "---\r\n"
				+ "\r\n"
				+ "# h1 Heading 8-)\r\n"
				+ "## h2 Heading\r\n"
				+ "### h3 Heading\r\n"
				+ "#### h4 Heading\r\n"
				+ "##### h5 Heading\r\n"
				+ "###### h6 Heading\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "## Horizontal Rules\r\n"
				+ "\r\n"
				+ "___\r\n"
				+ "\r\n"
				+ "---\r\n"
				+ "\r\n"
				+ "***\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "## Typographic replacements\r\n"
				+ "\r\n"
				+ "Enable typographer option to see result.\r\n"
				+ "\r\n"
				+ "(c) (C) (r) (R) (tm) (TM) (p) (P) +-\r\n"
				+ "\r\n"
				+ "test.. test... test..... test?..... test!....\r\n"
				+ "\r\n"
				+ "!!!!!! ???? ,,  -- ---\r\n"
				+ "\r\n"
				+ "\"Smartypants, double quotes\" and 'single quotes'\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "## Emphasis\r\n"
				+ "\r\n"
				+ "**This is bold text**\r\n"
				+ "\r\n"
				+ "__This is bold text__\r\n"
				+ "\r\n"
				+ "*This is italic text*\r\n"
				+ "\r\n"
				+ "_This is italic text_\r\n"
				+ "\r\n"
				+ "~~Strikethrough~~\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "## Blockquotes\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "> Blockquotes can also be nested...\r\n"
				+ ">> ...by using additional greater-than signs right next to each other...\r\n"
				+ "> > > ...or with spaces between arrows.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "## Lists\r\n"
				+ "\r\n"
				+ "Unordered\r\n"
				+ "\r\n"
				+ "+ Create a list by starting a line with `+`, `-`, or `*`\r\n"
				+ "+ Sub-lists are made by indenting 2 spaces:\r\n"
				+ "  - Marker character change forces new list start:\r\n"
				+ "    * Ac tristique libero volutpat at\r\n"
				+ "    + Facilisis in pretium nisl aliquet\r\n"
				+ "    - Nulla volutpat aliquam velit\r\n"
				+ "+ Very easy!\r\n"
				+ "\r\n"
				+ "Ordered\r\n"
				+ "\r\n"
				+ "1. Lorem ipsum dolor sit amet\r\n"
				+ "2. Consectetur adipiscing elit\r\n"
				+ "3. Integer molestie lorem at massa\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "1. You can use sequential numbers...\r\n"
				+ "1. ...or keep all the numbers as `1.`\r\n"
				+ "\r\n"
				+ "Start numbering with offset:\r\n"
				+ "\r\n"
				+ "57. foo\r\n"
				+ "1. bar\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "## Code\r\n"
				+ "\r\n"
				+ "Inline `code`\r\n"
				+ "\r\n"
				+ "Indented code\r\n"
				+ "\r\n"
				+ "    // Some comments\r\n"
				+ "    line 1 of code\r\n"
				+ "    line 2 of code\r\n"
				+ "    line 3 of code\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Block code \"fences\"\r\n"
				+ "\r\n"
				+ "```\r\n"
				+ "Sample text here...\r\n"
				+ "```\r\n"
				+ "\r\n"
				+ "Syntax highlighting\r\n"
				+ "\r\n"
				+ "``` js\r\n"
				+ "var foo = function (bar) {\r\n"
				+ "  return bar++;\r\n"
				+ "};\r\n"
				+ "\r\n"
				+ "console.log(foo(5));\r\n"
				+ "```\r\n"
				+ "\r\n"
				+ "## Tables\r\n"
				+ "\r\n"
				+ "| Option | Description |\r\n"
				+ "| ------ | ----------- |\r\n"
				+ "| data   | path to data files to supply the data that will be passed into templates. |\r\n"
				+ "| engine | engine to be used for processing templates. Handlebars is the default. |\r\n"
				+ "| ext    | extension to be used for dest files. |\r\n"
				+ "\r\n"
				+ "Right aligned columns\r\n"
				+ "\r\n"
				+ "| Option | Description |\r\n"
				+ "| ------:| -----------:|\r\n"
				+ "| data   | path to data files to supply the data that will be passed into templates. |\r\n"
				+ "| engine | engine to be used for processing templates. Handlebars is the default. |\r\n"
				+ "| ext    | extension to be used for dest files. |\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "## Links\r\n"
				+ "\r\n"
				+ "[link text](http://dev.nodeca.com)\r\n"
				+ "\r\n"
				+ "[link with title](http://nodeca.github.io/pica/demo/ \"title text!\")\r\n"
				+ "\r\n"
				+ "Autoconverted link https://github.com/nodeca/pica (enable linkify to see)\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "## Images\r\n"
				+ "\r\n"
				+ "![Minion](https://octodex.github.com/images/minion.png)\r\n"
				+ "![Stormtroopocat](https://octodex.github.com/images/stormtroopocat.jpg \"The Stormtroopocat\")\r\n"
				+ "\r\n"
				+ "Like links, Images also have a footnote style syntax\r\n"
				+ "\r\n"
				+ "![Alt text][id]\r\n"
				+ "\r\n"
				+ "With a reference later in the document defining the URL location:\r\n"
				+ "\r\n"
				+ "[id]: https://octodex.github.com/images/dojocat.jpg  \"The Dojocat\"\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "## Plugins\r\n"
				+ "\r\n"
				+ "The killer feature of `markdown-it` is very effective support of\r\n"
				+ "[syntax plugins](https://www.npmjs.org/browse/keyword/markdown-it-plugin).\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "### [Emojies](https://github.com/markdown-it/markdown-it-emoji)\r\n"
				+ "\r\n"
				+ "> Classic markup: :wink: :crush: :cry: :tear: :laughing: :yum:\r\n"
				+ ">\r\n"
				+ "> Shortcuts (emoticons): :-) :-( 8-) ;)\r\n"
				+ "\r\n"
				+ "see [how to change output](https://github.com/markdown-it/markdown-it-emoji#change-output) with twemoji.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "### [Subscript](https://github.com/markdown-it/markdown-it-sub) / [Superscript](https://github.com/markdown-it/markdown-it-sup)\r\n"
				+ "\r\n"
				+ "- 19^th^\r\n"
				+ "- H~2~O\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "### [\\<ins>](https://github.com/markdown-it/markdown-it-ins)\r\n"
				+ "\r\n"
				+ "++Inserted text++\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "### [\\<mark>](https://github.com/markdown-it/markdown-it-mark)\r\n"
				+ "\r\n"
				+ "==Marked text==\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "### [Footnotes](https://github.com/markdown-it/markdown-it-footnote)\r\n"
				+ "\r\n"
				+ "Footnote 1 link[^first].\r\n"
				+ "\r\n"
				+ "Footnote 2 link[^second].\r\n"
				+ "\r\n"
				+ "Inline footnote^[Text of inline footnote] definition.\r\n"
				+ "\r\n"
				+ "Duplicated footnote reference[^second].\r\n"
				+ "\r\n"
				+ "[^first]: Footnote **can have markup**\r\n"
				+ "\r\n"
				+ "    and multiple paragraphs.\r\n"
				+ "\r\n"
				+ "[^second]: Footnote text.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "### [Definition lists](https://github.com/markdown-it/markdown-it-deflist)\r\n"
				+ "\r\n"
				+ "Term 1\r\n"
				+ "\r\n"
				+ ":   Definition 1\r\n"
				+ "with lazy continuation.\r\n"
				+ "\r\n"
				+ "Term 2 with *inline markup*\r\n"
				+ "\r\n"
				+ ":   Definition 2\r\n"
				+ "\r\n"
				+ "        { some code, part of Definition 2 }\r\n"
				+ "\r\n"
				+ "    Third paragraph of definition 2.\r\n"
				+ "\r\n"
				+ "_Compact style:_\r\n"
				+ "\r\n"
				+ "Term 1\r\n"
				+ "  ~ Definition 1\r\n"
				+ "\r\n"
				+ "Term 2\r\n"
				+ "  ~ Definition 2a\r\n"
				+ "  ~ Definition 2b\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "### [Abbreviations](https://github.com/markdown-it/markdown-it-abbr)\r\n"
				+ "\r\n"
				+ "This is HTML abbreviation example.\r\n"
				+ "\r\n"
				+ "It converts \"HTML\", but keep intact partial entries like \"xxxHTMLyyy\" and so on.\r\n"
				+ "\r\n"
				+ "*[HTML]: Hyper Text Markup Language\r\n"
				+ "\r\n"
				+ "### [Custom containers](https://github.com/markdown-it/markdown-it-container)\r\n"
				+ "\r\n"
				+ "::: warning\r\n"
				+ "*here be dragons*\r\n"
				+ ":::\r\n";
		// @formatter:on

		StyleDescription styleDescription = buildStyles(input);

		List<StyleRange> styles = styleDescription.getStyles();
		// Check there is not style overlapping

		for (int i = 0; i < styles.size(); i++) {
			StyleRange style = styles.get(i);

			assertTrue("Style " + i + " " + style + " is out of range", style.start + style.length < input.length());
			for (StyleRange other : styles) {
				if (other != style) {
					assertFalse(style + " overlaps with " + other, MarkdownStyleBuilder.overlap(style, other));
				}
			}
		}

	}

	private StyleDescription buildStyles(String input) {
		return styleBuilder.buildStyles(parser.parse(input));
	}

}
