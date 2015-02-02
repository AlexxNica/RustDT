/*******************************************************************************
 * Copyright (c) 2014, 2014 Bruno Medeiros and other Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package com.github.rustdt.ide.ui.preferences;

import static melnorme.utilbox.core.CoreUtil.array;

import java.io.InputStream;

import melnorme.lang.ide.ui.text.coloring.AbstractSourceColoringConfigurationBlock;
import melnorme.util.swt.jface.LabeledTreeElement;

import org.eclipse.jface.preference.IPreferenceStore;

import com.github.rustdt.ide.ui.text.LANGUAGE_ColorPreferences;

public class SourceColoringConfigurationBlock extends AbstractSourceColoringConfigurationBlock {
	
	protected static final LabeledTreeElement[] treeElements = array(
		new SourceColoringCategory("Source", array(
			new SourceColoringElement("Default", LANGUAGE_ColorPreferences.DEFAULT.key),
			new SourceColoringElement("Keywords", LANGUAGE_ColorPreferences.KEYWORDS.key),
			new SourceColoringElement("Keywords - Literals", LANGUAGE_ColorPreferences.KEYWORDS_VALUES.key),
			new SourceColoringElement("Strings", LANGUAGE_ColorPreferences.STRINGS.key)
		)),
		new SourceColoringCategory("Comments", array(
			new SourceColoringElement("Comment", LANGUAGE_ColorPreferences.COMMENTS.key)
		))
	);
	
	public SourceColoringConfigurationBlock(IPreferenceStore store) {
		super(store);
	}
	
	@Override
	protected LabeledTreeElement[] getTreeElements() {
		return treeElements;
	}
	
	private static final String PREVIEW_FILE_NAME = "SourceColoringPreviewFile.lang";
	
	@Override
	protected InputStream getPreviewContentAsStream() {
		return getClass().getResourceAsStream(PREVIEW_FILE_NAME);
	}
	
}