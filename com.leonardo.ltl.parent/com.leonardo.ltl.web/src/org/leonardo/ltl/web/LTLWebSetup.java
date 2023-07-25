/*
 * generated by Xtext 2.31.0
 */
package org.leonardo.ltl.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.leonardo.ltl.LTLRuntimeModule;
import org.leonardo.ltl.LTLStandaloneSetup;
import org.leonardo.ltl.ide.LTLIdeModule;

/**
 * Initialization support for running Xtext languages in web applications.
 */
public class LTLWebSetup extends LTLStandaloneSetup {
	
	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new LTLRuntimeModule(), new LTLIdeModule(), new LTLWebModule()));
	}
	
}