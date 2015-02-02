/*******************************************************************************
 * Copyright (c) 2008, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package com.github.rustdt.ide.ui.preferences;


import melnorme.lang.ide.ui.LangUIPlugin;
import melnorme.lang.ide.ui.preferences.AbstractPreferencesComponentPrefPage;
import melnorme.lang.ide.ui.preferences.IPreferencesBlock;

public class SourceColoringPreferencePage extends AbstractPreferencesComponentPrefPage {
	
	public final static String PAGE_ID = SourceColoringPreferencePage.class.getName();
	
	public SourceColoringPreferencePage() {
		super(LangUIPlugin.getInstance().getPreferenceStore());
	}
	
	@Override
	protected void setDescription() {
		setDescription(null);
	}
	
	@Override
	protected String getHelpId() {
		return null;
	}
	
	@Override
	protected IPreferencesBlock createPreferencesComponent() {
		return new SourceColoringConfigurationBlock(getPreferenceStore());
	}
	
}