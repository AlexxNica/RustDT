package com.github.rustdt.ide.ui.text;

import melnorme.lang.ide.ui.TextSettings_Actual.LangPartitionTypes;
import melnorme.lang.ide.ui.text.PatternRule_Fixed;
import melnorme.utilbox.collections.ArrayList2;

import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

public class LANGUAGE_PartitionScanner extends RuleBasedPartitionScanner {
	
	private static final char NO_ESCAPE_CHAR = (char) -1;
	
	public LANGUAGE_PartitionScanner() {
		IToken tkString = new Token(LangPartitionTypes.STRING);
		IToken tkComment = new Token(LangPartitionTypes.COMMENT);
		
		ArrayList2<IPredicateRule> rules = new ArrayList2<>();
		
		rules.add(new PatternRule_Fixed("\"", "\"", tkString, '\\', false, true));
		rules.add(new PatternRule_Fixed("/*", "*/", tkComment, NO_ESCAPE_CHAR, false, true));
		
		setPredicateRules(rules.toArray(IPredicateRule.class));
	}
	
}