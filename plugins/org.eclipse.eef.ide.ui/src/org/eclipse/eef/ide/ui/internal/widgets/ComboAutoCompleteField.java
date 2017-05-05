/*******************************************************************************
 * Copyright (c) 2009, 2010, 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Obeo - copied from org.eclipse.equinox.internal.p2.ui.dialogs.ComboAutoCompleteField
 *     		  and remove the StringMatcher
 ******************************************************************************/
package org.eclipse.eef.ide.ui.internal.widgets;

import java.util.ArrayList;

import org.eclipse.jface.fieldassist.ComboContentAdapter;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.eclipse.swt.widgets.Combo;

/**
 * ComboAutoCompleteField is an auto complete field appropriate for pattern matching the text in a combo to the contents
 * of the combo. If the proposals should include items outside of the combo, then clients can set their own proposal
 * strings.
 */
public class ComboAutoCompleteField {
	/**
	 * The content proposal adapter.
	 */
	ContentProposalAdapter adapter;

	/**
	 * The combo.
	 */
	Combo combo;

	/**
	 * The proposals.
	 */
	String[] proposalStrings;

	/**
	 * The constructor.
	 *
	 * @param c
	 *            The combo
	 */
	public ComboAutoCompleteField(Combo c) {
		this.combo = c;
		adapter = new ContentProposalAdapter(combo, new ComboContentAdapter(), getProposalProvider(), null, null);
		adapter.setPropagateKeys(true);
		adapter.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);
	}

	public void setProposalStrings(String[] proposals) {
		proposalStrings = proposals;
	}

	/**
	 * Get the items as string table.
	 *
	 * @return The items
	 */
	String[] getStringItems() {
		if (proposalStrings == null) {
			return combo.getItems();
		}
		return proposalStrings;
	}

	IContentProposalProvider getProposalProvider() {
		return new ComboAutoCompleteContentProposalProvider();
	}

	/**
	 * The content proposal adapter.
	 *
	 * @author mbats
	 */
	private final class ComboAutoCompleteContentProposalProvider implements IContentProposalProvider {
		@Override
		public IContentProposal[] getProposals(String contents, int position) {
			String[] items = getStringItems();
			IContentProposal[] proposals = new IContentProposal[0];
			if (contents.length() != 0 && items.length != 0) {
				String searchString = ".*" + contents + ".*"; //$NON-NLS-1$ //$NON-NLS-2$
				ArrayList<String> matches = new ArrayList<String>();
				for (int i = 0; i < items.length; i++) {
					if (items[i].matches(searchString)) {
						matches.add(items[i]);
					}
				}

				// We don't want to autoactivate if the only proposal exactly matches
				// what is in the combo. This prevents the popup from
				// opening when the user is merely scrolling through the combo values or
				// has accepted a combo value.
				if (matches.size() == 1 && matches.get(0).equals(combo.getText()) || matches.isEmpty()) {
					return new IContentProposal[0];
				}

				// Make the proposals
				proposals = new IContentProposal[matches.size()];
				for (int i = 0; i < matches.size(); i++) {
					final String proposal = matches.get(i);
					proposals[i] = new ComboAutoCompleteContentProposal(proposal);
				}
			}
			return proposals;
		}
	}

	/**
	 * The content proposal.
	 *
	 * @author mbats
	 */
	private final class ComboAutoCompleteContentProposal implements IContentProposal {
		/**
		 * The proposal.
		 */
		private String proposal;

		/**
		 * The constructor.
		 *
		 * @param proposal
		 *            The proposal
		 */
		ComboAutoCompleteContentProposal(String proposal) {
			this.proposal = proposal;
		}

		@Override
		public String getContent() {
			return proposal;
		}

		@Override
		public int getCursorPosition() {
			return proposal.length();
		}

		@Override
		public String getDescription() {
			return null;
		}

		@Override
		public String getLabel() {
			return null;
		}
	}
}