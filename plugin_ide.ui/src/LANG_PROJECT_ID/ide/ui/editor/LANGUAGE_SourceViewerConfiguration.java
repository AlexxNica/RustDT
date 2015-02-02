/*******************************************************************************
 * Copyright (c) 2014, 2014 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package com.github.rustdt.ide.ui.editor;

import static melnorme.utilbox.core.CoreUtil.array;
import melnorme.lang.ide.ui.LangUIPlugin_Actual;
import melnorme.lang.ide.ui.TextSettings_Actual.LangPartitionTypes;
import melnorme.lang.ide.ui.text.AbstractLangSourceViewerConfiguration;

import org.eclipse.cdt.ui.text.IColorManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.ISourceViewer;

import com.github.rustdt.ide.ui.text.LANGUAGE_CodeScanner;
import com.github.rustdt.ide.ui.text.LANGUAGE_ColorPreferences;

public class LANGUAGE_SourceViewerConfiguration extends AbstractLangSourceViewerConfiguration {
	
	public LANGUAGE_SourceViewerConfiguration(IPreferenceStore preferenceStore, IColorManager colorManager,
			LANGUAGE_Editor editor) {
		super(preferenceStore, colorManager, editor);
	}
	
	@Override
	protected void createScanners() {
		addScanner(new LANGUAGE_CodeScanner(getTokenStoreFactory()), IDocument.DEFAULT_CONTENT_TYPE);
		
		addScanner(createSingleTokenScanner(LANGUAGE_ColorPreferences.COMMENTS.key), 
			LangPartitionTypes.COMMENT);
		
		addScanner(createSingleTokenScanner(LANGUAGE_ColorPreferences.STRINGS.key), 
			LangPartitionTypes.STRING);
	}
	
	// TODO:
//	@Override
//	public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType, int stateMask) {
//		if(contentType.equals(IDocument.DEFAULT_CONTENT_TYPE)) {
//			return new BestMatchHover(editor, stateMask);
//		}
//		return null;
//	}
	
	@Override
	public IAutoEditStrategy[] getAutoEditStrategies(ISourceViewer sourceViewer, String contentType) {
		if(IDocument.DEFAULT_CONTENT_TYPE.equals(contentType)) {
			return array(LangUIPlugin_Actual.createAutoEditStrategy(sourceViewer, contentType));
		} else {
			return super.getAutoEditStrategies(sourceViewer, contentType);
		}
	}
	
}