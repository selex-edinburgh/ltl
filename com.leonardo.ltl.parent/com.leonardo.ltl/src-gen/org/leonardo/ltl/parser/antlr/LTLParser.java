/*
 * generated by Xtext 2.31.0
 */
package org.leonardo.ltl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.leonardo.ltl.parser.antlr.internal.InternalLTLParser;
import org.leonardo.ltl.services.LTLGrammarAccess;

public class LTLParser extends AbstractAntlrParser {

	@Inject
	private LTLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalLTLParser createParser(XtextTokenStream stream) {
		return new InternalLTLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public LTLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LTLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}