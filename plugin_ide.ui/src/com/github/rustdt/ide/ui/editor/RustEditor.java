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

import melnorme.lang.ide.ui.LangUIPlugin;
import melnorme.lang.ide.ui.editor.structure.AbstractLangStructureEditor;
import melnorme.lang.ide.ui.editor.text.LangPairMatcher;
import melnorme.lang.ide.ui.text.AbstractLangSourceViewerConfiguration;
import melnorme.util.swt.jface.text.ColorManager2;

public class RustEditor extends AbstractLangStructureEditor {
	
	@Override
	protected LangPairMatcher init_createBracketMatcher() {
		return new LangPairMatcher("{}[]()".toCharArray());
	}
	
	@Override
	protected AbstractLangSourceViewerConfiguration createSourceViewerConfiguration() {
		ColorManager2 colorManager = LangUIPlugin.getInstance().getColorManager();
		return new RustSourceViewerConfiguration(getPreferenceStore(), colorManager, this);
	}
	
}