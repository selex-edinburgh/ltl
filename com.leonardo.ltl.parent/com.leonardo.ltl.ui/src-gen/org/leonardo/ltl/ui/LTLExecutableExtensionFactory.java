/*
 * generated by Xtext 2.31.0
 */
package org.leonardo.ltl.ui;

import com.google.inject.Injector;
import com.leonardo.ltl.ui.internal.LtlActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class LTLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(LtlActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		LtlActivator activator = LtlActivator.getInstance();
		return activator != null ? activator.getInjector(LtlActivator.ORG_LEONARDO_LTL_LTL) : null;
	}

}