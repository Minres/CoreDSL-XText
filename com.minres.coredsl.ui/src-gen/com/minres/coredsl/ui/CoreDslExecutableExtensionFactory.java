/*
 * generated by Xtext 2.22.0
 */
package com.minres.coredsl.ui;

import com.google.inject.Injector;
import com.minres.coredsl.ui.internal.CoredslActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CoreDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(CoredslActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		CoredslActivator activator = CoredslActivator.getInstance();
		return activator != null ? activator.getInjector(CoredslActivator.COM_MINRES_COREDSL_COREDSL) : null;
	}

}
