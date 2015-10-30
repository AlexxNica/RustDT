/*******************************************************************************
 * Copyright (c) 2007, 2014 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package com.github.rustdt.ide.ui.preferences;

import org.eclipse.jface.preference.IPreferenceStore;

import melnorme.lang.ide.ui.preferences.EditorConfigurationBlock;

public class RustEditorConfigurationBlock extends EditorConfigurationBlock {
	
	public RustEditorConfigurationBlock(IPreferenceStore store) {
		super(store);
	}
	
}