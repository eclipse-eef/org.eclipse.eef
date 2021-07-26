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

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import org.eclipse.eef.ide.ui.ext.widgets.markup.markdown.MarkdownService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Document;

public class MarkdownWidget {

	private String markdown;
	private MarkodwnStyleFactory styleFactory;
	private ScheduledExecutorService executorService;
	private Parser parser;
	private Display display;
	private StyledText styledText;
	private StyleDescription lastUpdatedStyle;
	private Consumer<String> valueConsumer;
	private final boolean multiLine;
	private ModifyListener modifyListener;
	private DisposeListener disposeListener;
	private final boolean updateOnFocusLost;
	private FocusAdapter focusListener;

	public MarkdownWidget(Display display, String markdown, boolean multiLine, boolean updateOnFocusLost,
			Consumer<String> valueConsumer) {
		this.display = display;
		this.markdown = markdown;
		this.multiLine = multiLine;
		this.updateOnFocusLost = updateOnFocusLost;
		this.valueConsumer = valueConsumer;
		this.styleFactory = new MarkodwnStyleFactory(display);
		this.executorService = Executors.newSingleThreadScheduledExecutor();
	}

	public void aboutToBeShown() {

		if (styledText != null && !styledText.isDisposed()) {
			this.modifyListener = new ModifyListener() {

				@Override
				public void modifyText(ModifyEvent e) {
					markdown = styledText.getText();
					if (!updateOnFocusLost) {
						valueConsumer.accept(markdown);
					}
				}

			};
			styledText.addModifyListener(modifyListener);

			this.disposeListener = new DisposeListener() {

				@Override
				public void widgetDisposed(DisposeEvent e) {
					executorService.shutdown();
				}
			};
			styledText.addDisposeListener(disposeListener);

			if (updateOnFocusLost) {

				this.focusListener = new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent event) {
						valueConsumer.accept(markdown);
					}
				};
				styledText.addFocusListener(focusListener);
			}
		}

		updateStyles();

		executorService.scheduleAtFixedRate(this::updateStyles, 500, 1000, TimeUnit.MILLISECONDS);

	}

	public void aboutToBeHidden() {

		if (styledText != null && !styledText.isDisposed()) {
			if (modifyListener != null) {
				styledText.removeModifyListener(modifyListener);
				modifyListener = null;
			}

			if (disposeListener != null) {
				styledText.removeDisposeListener(disposeListener);
				disposeListener = null;
			}

			if (updateOnFocusLost) {
				if (focusListener != null) {
					styledText.removeFocusListener(focusListener);
					focusListener = null;
				}

			}
		}

		if (executorService != null) {
			executorService.shutdown();
		}

	}

	public StyledText buildWidget(Composite parent) {

		final int swtStyle;
		if (multiLine) {
			swtStyle = SWT.FULL_SELECTION | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL;
		} else {
			swtStyle = SWT.FULL_SELECTION | SWT.SINGLE | SWT.WRAP;
		}
		styledText = new StyledText(parent, swtStyle);

		styledText.setText(markdown);

		parser = MarkdownService.builFlexdParser();

		return styledText;
	}

	public void setText(String value) {
		if (styledText != null && styledText.isDisposed()) {
			return;
		}
		if (value != null && value.equals(styledText.getText())) {
			return;
		}
		styledText.setText(value);

	}

	private void updateStyles() {
		try {
			final String currentMarkDown = markdown;
			Document document = parser.parse(currentMarkDown);

			StyleDescription styleDescription = new StyleBuilder(styleFactory).buildStyles(document);

			if (styledText != null && !styledText.isDisposed() && needUpdateStyles(styleDescription)) {
				display.syncExec(() -> {
					if (styledText != null && !styledText.isDisposed() && needUpdateStyles(styleDescription)) {

						StyleDescription filteredStyle = styleDescription.filterWithText(styledText.getText());
						styledText.setStyleRanges(filteredStyle.getStyles().toArray(StyleRange[]::new));
						for (LineBackground lb : filteredStyle.getLineBackgrounds()) {
							styledText.setLineBackground(lb.getStartLine(), lb.getEndLine() - lb.getStartLine() + 1,
									lb.getColor());
						}
						lastUpdatedStyle = filteredStyle;
					}
				});
			}
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

	public StyledText getControl() {
		return styledText;
	}

	private boolean needUpdateStyles(StyleDescription newStyle) {
		return lastUpdatedStyle == null || !lastUpdatedStyle.equals(newStyle);
	}

	public String getMarkdown() {
		return markdown;
	}

	public void setEnable(boolean isEnabled) {
		if (styledText != null && styledText.isDisposed()) {
			return;
		}
		styledText.setEditable(isEnabled);

	}
}
