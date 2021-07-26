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

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.swt.custom.StyleRange;

import com.vladsch.flexmark.ast.BlockQuote;
import com.vladsch.flexmark.ast.BulletList;
import com.vladsch.flexmark.ast.BulletListItem;
import com.vladsch.flexmark.ast.Code;
import com.vladsch.flexmark.ast.Emphasis;
import com.vladsch.flexmark.ast.FencedCodeBlock;
import com.vladsch.flexmark.ast.Heading;
import com.vladsch.flexmark.ast.Image;
import com.vladsch.flexmark.ast.Link;
import com.vladsch.flexmark.ast.ListBlock;
import com.vladsch.flexmark.ast.ListItem;
import com.vladsch.flexmark.ast.OrderedList;
import com.vladsch.flexmark.ast.OrderedListItem;
import com.vladsch.flexmark.ast.Paragraph;
import com.vladsch.flexmark.ast.StrongEmphasis;
import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.ext.definition.DefinitionList;
import com.vladsch.flexmark.ext.definition.DefinitionTerm;
import com.vladsch.flexmark.ext.gfm.tasklist.TaskListItem;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.VisitHandler;

public class StyleBuilder {

	private static final StyleComparator STYLE_CMP = new StyleComparator();

	public static boolean overlap(StyleRange r1, StyleRange r2) {
		int r1s = r1.start;
		int r2s = r2.start;
		int r1e = r1.start + r1.length;
		int r2e = r2.start + r2.length;

		return r2s < r1e && r1s < r2e;

	}

	private NodeVisitor visitor;

	private MarkodwnStyleFactory styleProvider;

	private List<StyleNode> styles;

	private StyleNode currentNode;

	public StyleBuilder(MarkodwnStyleFactory styleProvider) {
		this.styleProvider = styleProvider;
		visitor = new NodeVisitor(new VisitHandler<>(Heading.class, this::visit), //
				new VisitHandler<>(StrongEmphasis.class, this::visit), //
				new VisitHandler<>(Emphasis.class, this::visit), //
				new VisitHandler<>(FencedCodeBlock.class, this::visit), //
				new VisitHandler<>(BlockQuote.class, this::visit), //
				new VisitHandler<>(BulletList.class, this::visit), //
				new VisitHandler<>(DefinitionList.class, this::visit), //
				new VisitHandler<>(OrderedList.class, this::visit), //
				new VisitHandler<>(BulletListItem.class, this::visit), //
				new VisitHandler<>(OrderedListItem.class, this::visit), //
				new VisitHandler<>(DefinitionTerm.class, this::visit), //
				new VisitHandler<>(Paragraph.class, this::visit), //
				new VisitHandler<>(TaskListItem.class, this::visit), //
				new VisitHandler<>(Text.class, this::visit), //
				new VisitHandler<>(Image.class, this::visit), //
				new VisitHandler<>(Link.class, this::visit), //
				new VisitHandler<>(Code.class, this::visit));
	}

	private void addStyle(Node inputNode, StyleRange newStyle, LineBackground backGroundColor) {
		StyleNode styleNode = new StyleNode(newStyle, backGroundColor, inputNode);
		if (currentNode != null) {
			currentNode.children.add(styleNode);
		} else {
			styles.add(styleNode);
		}
		StyleNode oldParent = currentNode;
		currentNode = styleNode;
		visitor.visitChildren(inputNode);
		currentNode = oldParent;
	}

	private void visit(ListBlock listBlock) {
		addStyle(listBlock, null, null);
	}

	private void visit(ListItem listItem) {
		addStyle(listItem,
				styleProvider.buildListItemMarkerStyle(listItem.getStartOffset(), listItem.getOpeningMarker().length()),
				null);
	}

	private void visit(Image image) {
		addStyle(image, null, null);
	}

	private void visit(Heading heading) {
		addStyle(heading,
				styleProvider.buildHeaderStyle(heading.getStartOffset(), heading.getTextLength(), heading.getLevel()),
				null);
	}

	private void visit(Text text) {
		if (currentNode != null && (currentNode.inputNode instanceof Link || currentNode.inputNode instanceof Image)) {
			addStyle(text, styleProvider.buildLinkLabelStyle(text.getStartOffset(), text.getTextLength()), null);
		} else {
			addStyle(text, null, null);
		}
	}

	private void visit(StrongEmphasis sEmphasis) {
		addStyle(sEmphasis, styleProvider.buildBoldStyle(sEmphasis.getStartOffset(), sEmphasis.getTextLength()), null);
	}

	private void visit(Emphasis sEmphasis) {
		addStyle(sEmphasis, styleProvider.buildItalicStyle(sEmphasis.getStartOffset(), sEmphasis.getTextLength()),
				null);
	}

	private void visit(Link link) {
		addStyle(link, styleProvider.buildLinkStyle(link.getStartOffset(), link.getTextLength()), null);
	}

	private void visit(Code code) {
		addStyle(code, styleProvider.buildCodeStyle(code.getStartOffset(), code.getTextLength()), null);
	}

	private void visit(FencedCodeBlock code) {
		addStyle(code, null,
				new LineBackground(code.getStartLineNumber(), code.getEndLineNumber(), styleProvider.getCodeColor()));
	}

	private void visit(Paragraph paragraph) {
		addStyle(paragraph, null, null);
	}

	private void visit(BlockQuote quote) {
		addStyle(quote, null, new LineBackground(quote.getStartLineNumber(), quote.getEndLineNumber(),
				styleProvider.getQuoteColor()));
	}

	public StyleDescription buildStyles(Document doc) {
		styles = new ArrayList<>();

		visitor.visit(doc);

		List<StyleRange> styleRanges = styles.stream().flatMap(s -> s.getStyles().stream()).collect(toList());
		List<LineBackground> lineBackGround = styles.stream().flatMap(s -> s.getBackgroundLine().stream())
				.collect(toList());
		Collections.sort(styleRanges, STYLE_CMP);
		return new StyleDescription(styleRanges, lineBackGround);
	}

	private static class StyleNode {

		private final StyleRange style;

		private final LineBackground lineBackgroundColor;

		private final List<StyleNode> children = new ArrayList<>();

		private Node inputNode;

		private StyleNode(StyleRange style, LineBackground lineBackgroundColor, Node inputNode) {
			super();
			this.style = style;
			this.lineBackgroundColor = lineBackgroundColor;
			this.inputNode = inputNode;
		}

		private StyleRange copy(StyleRange r1, int start, int end) {
			StyleRange newStyle = new StyleRange();
			newStyle.start = start;
			newStyle.length = end - start;
			newStyle.background = r1.background;
			newStyle.borderColor = r1.borderColor;
			newStyle.borderStyle = r1.borderStyle;
			newStyle.data = r1.data;
			newStyle.font = r1.font;
			newStyle.fontStyle = r1.fontStyle;
			newStyle.foreground = r1.foreground;
			newStyle.metrics = r1.metrics;
			newStyle.rise = r1.rise;
			newStyle.strikeout = r1.strikeout;
			newStyle.strikeoutColor = r1.strikeoutColor;
			newStyle.underline = r1.underline;
			newStyle.underlineColor = r1.underlineColor;
			newStyle.underlineStyle = r1.underlineStyle;
			return newStyle;
		}

		private StyleRange merge(StyleRange parent, StyleRange child, int start, int end) {
			StyleRange newStyle = new StyleRange();
			newStyle.start = start;
			newStyle.length = end - start;
			newStyle.background = child.background != null ? child.background : parent.background;
			newStyle.borderColor = child.borderColor != null ? child.borderColor : parent.borderColor;

			newStyle.borderStyle = parent.borderStyle | child.borderStyle;

			newStyle.data = child.data != null ? child.data : parent.data;
			newStyle.font = child.font != null ? child.font : parent.font;
			newStyle.fontStyle = parent.fontStyle | child.fontStyle;
			newStyle.foreground = child.foreground != null ? child.foreground : parent.foreground;
			newStyle.metrics = child.metrics != null ? child.metrics : parent.metrics;

			newStyle.rise = child.rise != 0 ? child.rise : parent.rise;
			newStyle.strikeout = parent.strikeout || parent.strikeout;
			newStyle.strikeoutColor = child.strikeoutColor != null ? child.strikeoutColor : parent.strikeoutColor;
			newStyle.underline = parent.underline || child.underline;
			newStyle.underlineColor = child.underlineColor != null ? child.underlineColor : parent.underlineColor;
			newStyle.underlineStyle = parent.underlineStyle | child.underlineStyle;
			return newStyle;
		}

		public List<LineBackground> getBackgroundLine() {
			if (lineBackgroundColor != null) {
				return Collections.singletonList(lineBackgroundColor);
			} else {
				return children.stream().flatMap(c -> c.getBackgroundLine().stream()).collect(toList());
			}
		}

		public List<StyleRange> getStyles() {
			if (children.isEmpty()) {
				if (style != null) {
					return Collections.singletonList(style);
				} else {
					return Collections.emptyList();
				}
			}
			if (style == null) {
				return children.stream().flatMap(c -> c.getStyles().stream()).collect(toList());
			} else {
				List<StyleRange> styles = new ArrayList<StyleRange>();
				StyleRange currentStyle = style;
				// Merge all children style withThisStyle
				for (StyleNode child : children) {
					for (StyleRange childStyle : child.getStyles()) {

						if (currentStyle == null) {
							styles.add(childStyle);
						} else {
							if (overlap(style, childStyle)) {

								int parentStyleStart = currentStyle.start;
								int parentStyleEnd = parentStyleStart + currentStyle.length;

								int childStart = childStyle.start;
								int childEnd = childStart + childStyle.length;

								if (childStart > parentStyleStart) {
									StyleRange fistStyle = copy(currentStyle, parentStyleStart, childStart);
									styles.add(fistStyle);
								}

								int mergeEnd = Math.min(parentStyleEnd, childEnd);
								StyleRange secondStyle = merge(currentStyle, childStyle, childStart, mergeEnd);
								styles.add(secondStyle);

								if (mergeEnd < parentStyleEnd) {
									StyleRange thirdStyle = copy(currentStyle, mergeEnd, parentStyleEnd);
									currentStyle = thirdStyle;
								} else {
									currentStyle = null;
								}

							} else {
								styles.add(childStyle);
							}
						}

					}
				}

				if (currentStyle != null) {
					styles.add(currentStyle);
				}

				return styles;
			}
		}

	}

	private static class StyleComparator implements Comparator<StyleRange> {

		@Override
		public int compare(StyleRange o1, StyleRange o2) {
			if (o1.start < o2.start) {
				return -1;
			} else if (o1.start > o2.start) {
				return 1;
			} else if (o1.length < o2.length) {// Same start put shorter first
				return -1;
			} else if (o1.length > o2.length) {
				return 1;
			} else {
				return 0;
			}
		}

	}

}
