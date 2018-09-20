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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A POJO used to parse the toc.xml to create the breadcrumb of the website.
 *
 * @author sbegaudeau
 */
public class Topic {

	/**
	 * The URL of the topic.
	 */
	private String href;

	/**
	 * The label of the topic.
	 */
	private String label;

	/**
	 * The parent topic.
	 */
	private Topic parent;

	/**
	 * The child topics.
	 */
	private List<Topic> topics = new ArrayList<>();

	/**
	 * Return the href.
	 *
	 * @return the href
	 */
	public String getHref() {
		return this.href;
	}

	/**
	 * Sets the href.
	 *
	 * @param href
	 *            the href to set
	 */
	public void setHref(String href) {
		this.href = href;
	}

	/**
	 * Return the label.
	 *
	 * @return the label
	 */
	public String getLabel() {
		return this.label;
	}

	/**
	 * Sets the label.
	 *
	 * @param label
	 *            the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * Return the topics.
	 *
	 * @return the topics
	 */
	public List<Topic> getTopics() {
		return this.topics;
	}

	/**
	 * Sets the parent.
	 *
	 * @param parent
	 *            the parent to set
	 */
	public void setParent(Topic parent) {
		this.parent = parent;
	}

	/**
	 * Return the parent.
	 *
	 * @return the parent
	 */
	public Topic getParent() {
		return this.parent;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Topic [href=" + this.href + ", label=" + this.label + ", children=" //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$
				+ this.topics.stream().map(Object::toString).collect(Collectors.toList()) + "]"; //$NON-NLS-1$
	}
}
