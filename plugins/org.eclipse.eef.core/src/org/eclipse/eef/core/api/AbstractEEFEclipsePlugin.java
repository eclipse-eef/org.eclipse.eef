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
package org.eclipse.eef.core.api;

import java.text.MessageFormat;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.eef.core.api.utils.Util;
import org.eclipse.eef.core.internal.Messages;
import org.eclipse.emf.common.EMFPlugin.EclipsePlugin;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EAttribute;

/**
 * Common superclass of all the bundle activator of EEF.
 *
 * @author sbegaudeau
 */
public abstract class AbstractEEFEclipsePlugin extends EclipsePlugin {
	/**
	 * The bundle symbolic name.
	 */
	private String bundleSymbolicName;

	/**
	 * The constructor.
	 *
	 * @param bundleSymbolicName
	 *            The bundle symbolic name
	 */
	public AbstractEEFEclipsePlugin(String bundleSymbolicName) {
		this.bundleSymbolicName = bundleSymbolicName;
	}

	/**
	 * Logs the status.
	 *
	 * @param severity
	 *            The severity of the status
	 * @param message
	 *            The message to log or <code>null</code>. If the message is <code>null</code>, the message of the
	 *            exception will be used instead
	 * @param exception
	 *            The exception to log
	 */
	private void doLog(int severity, String message, Exception exception) {
		String messageToLog = message;
		if (messageToLog == null && exception != null) {
			messageToLog = exception.getMessage();
		}
		IStatus status = new Status(severity, this.bundleSymbolicName, messageToLog, exception);
		this.getLog().log(status);
	}

	/**
	 * Logs that the expression is blank.
	 *
	 * @param expression
	 *            The structural feature representing the expression
	 */
	public void blank(EAttribute expression) {
		String message = MessageFormat.format(Messages.AbstractEEFEclipsePlugin_BlankExpression, expression.getName(), expression
				.getEContainingClass().getName());
		this.error(message);
	}

	/**
	 * Logs the given diagnostic.
	 *
	 * @param expression
	 *            The expression
	 * @param diagnostic
	 *            the diagnostic
	 */
	public void diagnostic(String expression, Diagnostic diagnostic) {
		final String ls = System.getProperty("line.separator"); //$NON-NLS-1$

		StringBuilder messageToLog = new StringBuilder();

		if (!Util.isBlank(diagnostic.getMessage())) {
			messageToLog.append(diagnostic.getMessage());
			messageToLog.append(ls);
		}
		List<Diagnostic> children = diagnostic.getChildren();
		for (Diagnostic childDiagnostic : children) {
			if (!Util.isBlank(childDiagnostic.getMessage())) {
				messageToLog.append(childDiagnostic.getMessage());
				messageToLog.append(ls);
			}
		}

		String message = MessageFormat.format(Messages.AbstractEEFEclipsePlugin_InvalidEvaluation, expression, messageToLog);
		IStatus status = new Status(diagnostic.getSeverity(), this.bundleSymbolicName, message);
		this.getLog().log(status);
	}

	/**
	 * Logs an error with the given message.
	 *
	 * @param message
	 *            The message
	 */
	public void error(String message) {
		this.error(message, null);
	}

	/**
	 * Logs an error with the exception and the given message.
	 *
	 * @param message
	 *            The message
	 * @param exception
	 *            The exception
	 */
	public void error(String message, Exception exception) {
		if (exception instanceof CoreException) {
			this.getLog().log(((CoreException) exception).getStatus());
		} else {
			this.doLog(IStatus.ERROR, message, exception);
		}
	}

	/**
	 * Logs a warning with the given message.
	 *
	 * @param message
	 *            The message
	 */
	public void warning(String message) {
		this.warning(message, null);
	}

	/**
	 * Logs a warning with the exception and the given message.
	 *
	 * @param message
	 *            The message
	 * @param exception
	 *            The exception
	 */
	public void warning(String message, Exception exception) {
		if (exception instanceof CoreException) {
			this.getLog().log(((CoreException) exception).getStatus());
		} else {
			this.doLog(IStatus.WARNING, message, exception);
		}
	}

	/**
	 * Logs an info with the given message.
	 *
	 * @param message
	 *            The message
	 */
	public void info(String message) {
		this.info(message, null);
	}

	/**
	 * Logs an info with the exception and the given message.
	 *
	 * @param message
	 *            The message
	 * @param exception
	 *            The exception
	 */
	public void info(String message, Exception exception) {
		if (exception instanceof CoreException) {
			this.getLog().log(((CoreException) exception).getStatus());
		} else {
			this.doLog(IStatus.INFO, message, exception);
		}
	}
}
