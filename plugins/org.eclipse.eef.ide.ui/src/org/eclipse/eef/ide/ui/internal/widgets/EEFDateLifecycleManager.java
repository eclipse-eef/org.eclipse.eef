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

import java.util.Calendar;
import java.util.Date;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFDateDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEF_DATE_DISPLAY;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFDateController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;

/**
 * This class will be used in order to manager the lifecycle of a date.
 *
 * @author arichard
 */
public class EEFDateLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * The description.
	 */
	private EEFDateDescription description;

	/**
	 * The date.
	 */
	private DateTime date;

	/**
	 * The controller.
	 */
	private IEEFDateController controller;

	/**
	 * The listener on the date.
	 */
	private SelectionListener selectionListener;

	/**
	 * Milliseconds are not taking into account by the date widget. We have to keep the milliseconds from the semantic
	 * value.
	 */
	private int ms = 0;

	/**
	 * Zone offset is not taking into account by the date widget. We have to keep the zone offset from the semantic
	 * value.
	 */
	private int zone_offset = 0;

	/**
	 * DST offset is not taking into account by the date widget. We have to keep the DST offset from the semantic value.
	 */
	private int dst_offset = 0;

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
	public EEFDateLifecycleManager(EEFDateDescription description, IVariableManager variableManager, IInterpreter interpreter,
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
		EEFWidgetFactory widgetFactory = formContainer.getWidgetFactory();

		this.date = widgetFactory.createDate(parent, getDateTimeStyle() | SWT.BORDER);

		GridData gridData = new GridData();
		gridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
		this.date.setLayoutData(gridData);

		widgetFactory.paintBordersFor(parent);

		this.controller = new EEFControllersFactory().createDateController(this.description, this.variableManager, this.interpreter,
				this.contextAdapter);
	}

	private int getDateTimeStyle() {
		EEF_DATE_DISPLAY display = this.description.getDisplay();
		switch (display.getValue()) {
		case EEF_DATE_DISPLAY.CALENDAR_VALUE:
			return SWT.CALENDAR;
		case EEF_DATE_DISPLAY.DATE_VALUE:
			return SWT.DATE;
		case EEF_DATE_DISPLAY.TIME_VALUE:
			return SWT.TIME;
		default:
			return SWT.CALENDAR;
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getLabelVerticalAlignment()
	 */
	@Override
	protected int getLabelVerticalAlignment() {
		return GridData.VERTICAL_ALIGN_CENTER;
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

		this.selectionListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (!EEFDateLifecycleManager.this.container.isRenderingInProgress()) {
					IStatus result = controller.updateValue(getDate());
					if (result != null && result.getSeverity() == IStatus.ERROR) {
						EEFIdeUiPlugin.INSTANCE.log(result);
					} else {
						refresh();
					}
				}
			}
		};
		this.date.addSelectionListener(this.selectionListener);

		this.controller.onNewValue(new IConsumer<Date>() {
			@Override
			public void apply(Date value) {
				if (!date.isDisposed()) {
					setDate(value);
				}
			}
		});
	}

	private Date getDate() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MILLISECOND, this.ms);
		calendar.set(Calendar.ZONE_OFFSET, this.zone_offset);
		calendar.set(Calendar.ZONE_OFFSET, this.dst_offset);
		calendar.set(this.date.getYear(), this.date.getMonth(), this.date.getDay(), this.date.getHours(), this.date.getMinutes(),
				this.date.getSeconds());
		return calendar.getTime();
	}

	private void setDate(Date newDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(newDate);
		this.ms = calendar.get(Calendar.MILLISECOND);
		this.zone_offset = calendar.get(Calendar.ZONE_OFFSET);
		this.dst_offset = calendar.get(Calendar.DST_OFFSET);
		this.date.setDate(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
		this.date.setTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND));
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getValidationControl()
	 */
	@Override
	protected Control getValidationControl() {
		return this.date;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();

		if (!this.date.isDisposed()) {
			this.date.removeSelectionListener(this.selectionListener);
		}
		this.controller.removeNewValueConsumer();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();
		this.date.setEnabled(isEnabled());
	}
}
