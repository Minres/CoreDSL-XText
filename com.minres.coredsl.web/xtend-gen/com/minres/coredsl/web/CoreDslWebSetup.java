/**
 * generated by Xtext 2.22.0
 */
package com.minres.coredsl.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.minres.coredsl.CoreDslRuntimeModule;
import com.minres.coredsl.CoreDslStandaloneSetup;
import com.minres.coredsl.ide.CoreDslIdeModule;
import com.minres.coredsl.web.CoreDslWebModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@SuppressWarnings("all")
public class CoreDslWebSetup extends CoreDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    CoreDslRuntimeModule _coreDslRuntimeModule = new CoreDslRuntimeModule();
    CoreDslIdeModule _coreDslIdeModule = new CoreDslIdeModule();
    CoreDslWebModule _coreDslWebModule = new CoreDslWebModule();
    return Guice.createInjector(Modules2.mixin(_coreDslRuntimeModule, _coreDslIdeModule, _coreDslWebModule));
  }
}