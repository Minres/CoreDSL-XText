/*
 * generated by Xtext 2.22.0
 */
package com.minres.coredsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class CoreDslStandaloneSetup extends CoreDslStandaloneSetupGenerated {

	public static void doSetup() {
		new CoreDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
