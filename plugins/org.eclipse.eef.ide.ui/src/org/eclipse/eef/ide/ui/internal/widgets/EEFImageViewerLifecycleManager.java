/*******************************************************************************
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.internal.widgets;

import java.io.File;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.eef.EEFImageViewerDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IEEFImageViewerController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Icons;
import org.eclipse.eef.ide.ui.internal.Messages;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.ScrollBar;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * This class will be used in order to manager the lifecycle of an image viewer.
 *
 * @author arichard
 */
public class EEFImageViewerLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * Default width of the image viewer.
	 */
	private static final int IMAGE_VIEWER_WIDTH_HINT = 500;

	/**
	 * Default height of the image viewer.
	 */
	private static final int IMAGE_VIEWER_HEIGHT_HINT = 250;

	/**
	 * The description.
	 */
	private EEFImageViewerDescription description;

	/**
	 * The controller.
	 */
	private IEEFImageViewerController controller;

	/**
	 * The image canvas.
	 */
	private Canvas imageCanvas;

	/**
	 * The horizontal ScrollBar.
	 */
	private ScrollBar hBar;

	/**
	 * The vertical ScrollBar.
	 */
	private ScrollBar vBar;

	/**
	 * The image.
	 */
	private Image image;

	/**
	 * The image data.
	 */
	private ImageData imageData;

	/**
	 * The image path of the image viewer, as last rendered from the state of the actual model.
	 */
	private String imagePath = ""; //$NON-NLS-1$

	/**
	 * The paint listener.
	 */
	private PaintListener paintListener;

	/**
	 * The resize listener.
	 */
	private Listener resizeListener;

	/**
	 * The horizontal ScrollBar selection listener.
	 */
	private SelectionListener horizontalBarSelectionListener;

	/**
	 * The vertical ScrollBar selection listener.
	 */
	private SelectionListener verticalBarSelectionListener;

	/**
	 * The mouse listener.
	 */
	private MouseListener mouseListener;

	/**
	 * The origin Point.
	 */
	private Point origin;

	/**
	 * The widget factory.
	 */
	private EEFWidgetFactory widgetFactory;

	/**
	 * The text field associated to the image picker.
	 */
	private StyledText text;

	/**
	 * The button to launch the image picker.
	 */
	private Button pickButton;

	/**
	 * The listener on the text field.
	 */
	private FocusListener focusListener;

	/**
	 * The listener used to indicate that the text field is dirty.
	 */
	private ModifyListener modifyListener;

	/**
	 * Used to make the SelectionListener reentrant, to avoid infinite loops when we need to revert the UI state on
	 * error (as reverting the UI re-triggers the SelectionListener).
	 */
	private AtomicBoolean updateInProgress = new AtomicBoolean(false);

	/**
	 * Indicates that the text field is dirty.
	 */
	private boolean isDirty;

	/**
	 * The listener used to indicate that the pick button has been selected.
	 */
	private SelectionAdapter pickButtonSelectionListener;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param contextAdapter
	 *            The editing context adapter
	 */
	public EEFImageViewerLifecycleManager(EEFImageViewerDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter, contextAdapter);
		this.description = description;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#createMainControl(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.eef.common.ui.api.IEEFFormContainer)
	 */
	@Override
	protected void createMainControl(Composite parent, IEEFFormContainer formContainer) {
		Composite compositeContainer = parent;
		this.widgetFactory = formContainer.getWidgetFactory();
		boolean withPicker = this.description.isWithPicker();

		if (withPicker) {
			Composite widgetComposite = this.widgetFactory.createFlatFormComposite(parent);
			GridLayout widgetGridLayout = new GridLayout(2, false);
			widgetComposite.setLayout(widgetGridLayout);
			compositeContainer = widgetComposite;

			GridData filePickerCompositeGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
			filePickerCompositeGridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
			widgetComposite.setLayoutData(filePickerCompositeGridData);

			this.text = this.widgetFactory.createStyledText(widgetComposite, SWT.SINGLE);
			GridData textGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
			this.text.setLayoutData(textGridData);
			this.text.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);

			this.pickButton = this.widgetFactory.createButton(widgetComposite, "", SWT.PUSH); //$NON-NLS-1$
			this.pickButton.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.SEARCH));
			GridData pickButtonGridData = new GridData(SWT.FILL, SWT.CENTER, false, false);
			this.pickButton.setLayoutData(pickButtonGridData);
		}

		this.imageCanvas = new Canvas(compositeContainer, SWT.NO_REDRAW_RESIZE | SWT.H_SCROLL | SWT.V_SCROLL);
		String pathExpressionEvaluation = EvalFactory.of(this.interpreter, this.variableManager.getVariables()).logIfInvalidType(String.class)
				.evaluate(this.description.getPathExpression());
		int height = 0;
		int width = 0;
		this.imagePath = toAbsolutePath(pathExpressionEvaluation);
		if (this.imagePath != null) {
			try {
				this.imageData = new ImageData(this.imagePath);
				this.image = new Image(parent.getDisplay(), this.imageData);
				height = Math.min(IMAGE_VIEWER_HEIGHT_HINT, this.imageData.height);
				width = Math.min(IMAGE_VIEWER_WIDTH_HINT, this.imageData.width);
			} catch (SWTException e) {
				EEFIdeUiPlugin.INSTANCE.log(e);
			}
		} else {
			height = IMAGE_VIEWER_HEIGHT_HINT;
			width = IMAGE_VIEWER_WIDTH_HINT;
			String message = MessageFormat.format(Messages.EEFImageViewerLifecycleManager_notValidPath, pathExpressionEvaluation);
			EEFIdeUiPlugin.INSTANCE.log(new Status(IStatus.ERROR, EEFIdeUiPlugin.PLUGIN_ID, message));
		}

		GridData gridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
		gridData.heightHint = height;
		gridData.widthHint = width;
		gridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
		this.imageCanvas.setLayoutData(gridData);

		this.controller = new EEFControllersFactory().createImageViewerController(this.description, this.variableManager, this.interpreter,
				this.contextAdapter);
	}

	/**
	 * Converts the path if needed. If the path is not valid (no file associated), then the method returns
	 * <code>null</code>.
	 *
	 * @param path
	 *            the path of the image.
	 * @return the converted path, or <code>null</code> if the path is invalid.
	 */
	private String toAbsolutePath(String path) {
		String absolutePath = null;
		File file = new File(path);
		if (!file.exists()) {
			// may be the path is workspace relative
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IResource member = root.findMember(path);
			if (member instanceof IFile && member.exists()) {
				absolutePath = member.getLocation().makeAbsolute().toString();
			}
		} else {
			absolutePath = path;
		}
		return absolutePath;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getLabelVerticalAlignment()
	 */
	@Override
	protected int getLabelVerticalAlignment() {
		return GridData.VERTICAL_ALIGN_BEGINNING;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getController()
	 */
	@Override
	protected IEEFWidgetController getController() {
		return this.controller;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.AbstractEEFWidgetLifecycleManager#getWidgetDescription()
	 */
	@Override
	protected EEFWidgetDescription getWidgetDescription() {
		return this.description;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		if (this.description.isWithPicker()) {

			this.modifyListener = (e) -> {
				if (!this.container.isRenderingInProgress() && !updateInProgress.get()) {
					this.isDirty = true;

					List<EObject> elements = new ArrayList<EObject>();
					Object object = this.variableManager.getVariables().get(EEFExpressionUtils.SELF);
					if (object instanceof EObject) {
						elements.add((EObject) object);
					}
					this.contextAdapter.lock(elements);
				}
			};
			this.text.addModifyListener(this.modifyListener);

			this.focusListener = new FocusListener() {
				@Override
				public void focusLost(FocusEvent e) {
					if (!EEFImageViewerLifecycleManager.this.container.isRenderingInProgress() && EEFImageViewerLifecycleManager.this.isDirty) {
						EEFImageViewerLifecycleManager.this.updatePath(false);
					}
				}

				@Override
				public void focusGained(FocusEvent e) {
					// do nothing
				}
			};
			this.text.addFocusListener(this.focusListener);

			this.pickButtonSelectionListener = new SelectionAdapter() {
				/**
				 * {@inheritDoc}
				 *
				 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
				 */
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (!EEFImageViewerLifecycleManager.this.container.isRenderingInProgress()) {
						FileDialog filePicker = new FileDialog(new Shell(Display.getCurrent()));
						filePicker.setFilterPath(EEFImageViewerLifecycleManager.this.imagePath);
						try {
							String newPath = filePicker.open();
							if (newPath != null) {
								EEFImageViewerLifecycleManager.this.isDirty = true;
								EEFImageViewerLifecycleManager.this.imagePath = newPath;
								EEFImageViewerLifecycleManager.this.text.setText(newPath);
								EEFImageViewerLifecycleManager.this.updatePath(false);
							}
						} catch (SWTException ex) {
							EEFIdeUiPlugin.INSTANCE.log(ex);
						}
					}
				}
			};
			this.pickButton.addSelectionListener(this.pickButtonSelectionListener);
		}

		this.origin = new Point(0, 0);

		this.hBar = this.imageCanvas.getHorizontalBar();
		horizontalBarSelectionListener = new HorizontalBarSelectionListener();
		this.hBar.addSelectionListener(this.horizontalBarSelectionListener);

		this.vBar = this.imageCanvas.getVerticalBar();
		this.verticalBarSelectionListener = new VerticalBarSelectionListener();
		this.vBar.addSelectionListener(this.verticalBarSelectionListener);

		this.mouseListener = new CanvasDoubleClickMouseListener();
		this.imageCanvas.addMouseListener(this.mouseListener);

		this.resizeListener = new CanvasResizeListener();
		this.imageCanvas.addListener(SWT.Resize, this.resizeListener);

		this.paintListener = new CanvasPaintListener();
		this.imageCanvas.addPaintListener(this.paintListener);

		this.controller.onNewPath(newPath -> {
			if (!this.imageCanvas.isDisposed()) {
				String path = ""; //$NON-NLS-1$
				if (newPath != null) {
					path = Util.firstNonNull(newPath, path);
				}
				this.imagePath = toAbsolutePath(path);
				if (this.imagePath != null) {
					try {
						if (this.description.isWithPicker() && !this.text.isDisposed()
								&& !(this.text.getText() != null && this.text.getText().equals(path))) {
							this.text.setText(this.imagePath);
						}

						this.imageData = new ImageData(this.imagePath);
						this.image = new Image(this.imageCanvas.getDisplay(), this.imageData);
						this.imageCanvas.redraw();

						if (!this.imageCanvas.isEnabled()) {
							this.imageCanvas.setEnabled(true);
						}
					} catch (SWTException e) {
						EEFIdeUiPlugin.INSTANCE.log(e);
					}
				}
			}
		});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getValidationControl()
	 */
	@Override
	protected Control getValidationControl() {
		return this.imageCanvas;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		this.controller.removeNewPathConsumer();
		if (!this.vBar.isDisposed()) {
			this.vBar.removeSelectionListener(this.verticalBarSelectionListener);
			this.vBar.dispose();
		}
		if (!this.hBar.isDisposed()) {
			this.hBar.removeSelectionListener(this.horizontalBarSelectionListener);
			this.hBar.dispose();
		}
		if (!this.imageCanvas.isDisposed()) {
			this.imageCanvas.removeMouseListener(this.mouseListener);
			this.imageCanvas.removeListener(SWT.Resize, this.resizeListener);
			this.imageCanvas.removePaintListener(this.paintListener);
			this.imageCanvas.dispose();
		}
		this.image.dispose();

		if (this.description.isWithPicker()) {
			if (this.isDirty) {
				this.updatePath(true);
			}
			if (!this.pickButton.isDisposed()) {
				this.pickButton.removeSelectionListener(this.pickButtonSelectionListener);
			}
			if (!this.text.isDisposed()) {
				this.text.removeModifyListener(this.modifyListener);
			}
			if (!text.isDisposed()) {
				this.text.removeFocusListener(this.focusListener);
			}
		}
		super.aboutToBeHidden();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#setEnabled(boolean)
	 */
	@Override
	protected void setEnabled(boolean isEnabled) {
		this.imageCanvas.setEnabled(isEnabled);
	}

	/**
	 * Updates the path.
	 *
	 * @param force
	 *            if <code>true</code>, update even if we are in the render phase.
	 */
	private void updatePath(boolean force) {
		boolean shouldUpdateWhileRendering = !EEFImageViewerLifecycleManager.this.container.isRenderingInProgress() || force;
		if (!this.text.isDisposed() && this.isDirty && shouldUpdateWhileRendering && this.updateInProgress.compareAndSet(false, true)) {
			try {
				IStatus result = this.controller.updatePath(this.text.getText());
				if (result != null && result.getSeverity() == IStatus.ERROR) {
					EEFIdeUiPlugin.INSTANCE.log(result);
					this.text.setText(this.imagePath);
				} else {
					this.imagePath = this.text.getText();
					refresh();
				}
				this.isDirty = false;
			} finally {
				this.updateInProgress.set(false);

				List<EObject> elements = new ArrayList<EObject>();
				Object object = this.variableManager.getVariables().get(EEFExpressionUtils.SELF);
				if (object instanceof EObject) {
					elements.add((EObject) object);
				}
				this.contextAdapter.unlock(elements);
			}
		}
	}

	/**
	 * CanvasPaintListener.
	 *
	 * @author arichard
	 *
	 */
	private final class CanvasPaintListener implements PaintListener {
		/**
		 * {@inheritDoc}
		 *
		 * @see org.eclipse.swt.events.PaintListener#paintControl(org.eclipse.swt.events.PaintEvent)
		 */
		@Override
		public void paintControl(PaintEvent e) {
			if (EEFImageViewerLifecycleManager.this.image != null && !EEFImageViewerLifecycleManager.this.imageCanvas.isDisposed()) {
				GC gc = e.gc;
				gc.drawImage(EEFImageViewerLifecycleManager.this.image, EEFImageViewerLifecycleManager.this.origin.x,
						EEFImageViewerLifecycleManager.this.origin.y);
				Rectangle rect = EEFImageViewerLifecycleManager.this.image.getBounds();
				Rectangle client = EEFImageViewerLifecycleManager.this.imageCanvas.getClientArea();
				int marginWidth = client.width - rect.width;
				if (marginWidth > 0) {
					gc.fillRectangle(rect.width, 0, marginWidth, client.height);
				}
				int marginHeight = client.height - rect.height;
				if (marginHeight > 0) {
					gc.fillRectangle(0, rect.height, client.width, marginHeight);
				}
			}
		}
	}

	/**
	 * CanvasResizeListener.
	 *
	 * @author arichard
	 *
	 */
	private final class CanvasResizeListener implements Listener {
		/**
		 * {@inheritDoc}
		 *
		 * @see org.eclipse.swt.widgets.Listener#handleEvent(org.eclipse.swt.widgets.Event)
		 */
		@Override
		public void handleEvent(Event e) {
			if (EEFImageViewerLifecycleManager.this.image != null && !EEFImageViewerLifecycleManager.this.imageCanvas.isDisposed()) {
				Rectangle rect = EEFImageViewerLifecycleManager.this.image.getBounds();
				Rectangle client = EEFImageViewerLifecycleManager.this.imageCanvas.getClientArea();
				EEFImageViewerLifecycleManager.this.hBar.setMaximum(rect.width);
				EEFImageViewerLifecycleManager.this.vBar.setMaximum(rect.height);
				EEFImageViewerLifecycleManager.this.hBar.setThumb(Math.min(rect.width, client.width));
				EEFImageViewerLifecycleManager.this.vBar.setThumb(Math.min(rect.height, client.height));
				int hPage = rect.width - client.width;
				int vPage = rect.height - client.height;
				int hSelection = EEFImageViewerLifecycleManager.this.hBar.getSelection();
				int vSelection = EEFImageViewerLifecycleManager.this.vBar.getSelection();
				if (hSelection >= hPage) {
					if (hPage <= 0) {
						hSelection = 0;
					}
					EEFImageViewerLifecycleManager.this.origin.x = -hSelection;
				}
				if (vSelection >= vPage) {
					if (vPage <= 0) {
						vSelection = 0;
					}
					EEFImageViewerLifecycleManager.this.origin.y = -vSelection;
				}
				EEFImageViewerLifecycleManager.this.imageCanvas.redraw();
			}
		}
	}

	/**
	 * VerticalBarSelectionListener.
	 *
	 * @author arichard
	 *
	 */
	private final class VerticalBarSelectionListener implements SelectionListener {
		@Override
		public void widgetSelected(SelectionEvent e) {
			if (EEFImageViewerLifecycleManager.this.image != null && !EEFImageViewerLifecycleManager.this.imageCanvas.isDisposed()) {
				int vSelection = EEFImageViewerLifecycleManager.this.vBar.getSelection();
				int destY = -vSelection - EEFImageViewerLifecycleManager.this.origin.y;
				Rectangle rect = EEFImageViewerLifecycleManager.this.image.getBounds();
				EEFImageViewerLifecycleManager.this.imageCanvas.scroll(0, destY, 0, 0, rect.width, rect.height, false);
				EEFImageViewerLifecycleManager.this.origin.y = -vSelection;
			}
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
			// nothing to do
		}
	}

	/**
	 * HorizontalBarSelectionListener.
	 *
	 * @author arichard
	 *
	 */
	private final class HorizontalBarSelectionListener implements SelectionListener {
		@Override
		public void widgetSelected(SelectionEvent e) {
			if (EEFImageViewerLifecycleManager.this.image != null && !EEFImageViewerLifecycleManager.this.imageCanvas.isDisposed()) {
				int hSelection = EEFImageViewerLifecycleManager.this.hBar.getSelection();
				int destX = -hSelection - EEFImageViewerLifecycleManager.this.origin.x;
				Rectangle rect = EEFImageViewerLifecycleManager.this.image.getBounds();
				EEFImageViewerLifecycleManager.this.imageCanvas.scroll(destX, 0, 0, 0, rect.width, rect.height, false);
				EEFImageViewerLifecycleManager.this.origin.x = -hSelection;
			}
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
			// nothing to do
		}
	}

	/**
	 * CanvasDoubleClickMouseListener.
	 *
	 * @author arichard
	 *
	 */
	private final class CanvasDoubleClickMouseListener implements MouseListener {
		@Override
		public void mouseUp(MouseEvent e) {
			// nothing to do
		}

		@Override
		public void mouseDown(MouseEvent e) {
			// nothing to do
		}

		@Override
		public void mouseDoubleClick(MouseEvent e) {
			final Display display = Display.getDefault();
			final Shell shell = new Shell(display, SWT.CLOSE | SWT.APPLICATION_MODAL);
			shell.setLayout(new FillLayout());
			final Canvas canvas = new Canvas(shell, SWT.NONE);
			final Image img = new Image(canvas.getDisplay(), EEFImageViewerLifecycleManager.this.imageData);
			canvas.addPaintListener(pe -> pe.gc.drawImage(img, 0, 0));
			shell.setSize(EEFImageViewerLifecycleManager.this.imageData.width, EEFImageViewerLifecycleManager.this.imageData.height);
			shell.open();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		}
	}
}
