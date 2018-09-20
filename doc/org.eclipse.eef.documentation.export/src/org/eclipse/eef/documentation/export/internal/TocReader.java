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

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Utility class used to parse the toc.xml to create the breadcrumb.
 *
 * @author sbegaudeau
 */
public class TocReader {
	/**
	 * The name of the topic element.
	 */
	public static final String TOPIC = "topic"; //$NON-NLS-1$
	/**
	 * The URL of the topic.
	 */
	public static final String HREF = "href"; //$NON-NLS-1$

	/**
	 * The label of the topic.
	 */
	public static final String LABEL = "label"; //$NON-NLS-1$

	/**
	 * Parse the given XML content and return the list of topics found.
	 *
	 * @param inputStream
	 *            The XML content of the toc.xml file
	 * @return The list of topics found in the toc.xml file
	 */
	public List<Topic> getTopics(InputStream inputStream) {
		List<Topic> topics = new ArrayList<>();

		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse(inputStream);
			document.getDocumentElement().normalize();

			Element element = document.getDocumentElement();
			NodeList nodeList = element.getChildNodes();

			topics.addAll(this.visitChildNodes(nodeList));
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}

		return topics;
	}

	/**
	 * @param nodeList
	 * @return
	 */
	private Collection<Topic> visitChildNodes(NodeList nodeList) {
		List<Topic> topics = new ArrayList<>();

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Topic topic = new Topic();

				if (node.hasAttributes()) {
					NamedNodeMap attributes = node.getAttributes();
					for (int j = 0; j < attributes.getLength(); j++) {
						Node attribute = attributes.item(j);
						if (HREF.equals(attribute.getNodeName())) {
							topic.setHref(attribute.getNodeValue());
						} else if (LABEL.equals(attribute.getNodeName())) {
							topic.setLabel(attribute.getNodeValue());
						}
					}
				}

				if (node.hasChildNodes()) {
					Collection<Topic> childTopics = this.visitChildNodes(node.getChildNodes());
					topic.getTopics().addAll(childTopics);
					childTopics.forEach(child -> child.setParent(topic));
				}

				topics.add(topic);
			}
		}

		return topics;
	}
}
