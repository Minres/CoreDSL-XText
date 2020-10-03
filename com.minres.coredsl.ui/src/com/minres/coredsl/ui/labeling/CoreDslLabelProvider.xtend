/*
 * generated by Xtext 2.10.0
 */
package com.minres.coredsl.ui.labeling

import com.google.inject.Inject
import com.minres.coredsl.coreDsl.BitField
import com.minres.coredsl.coreDsl.Encoding
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import org.eclipse.emf.ecore.EObject

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class CoreDslLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	
    def text(BitField ele) {
        ele.name + if(ele.bitRange!==null) ("[" + ele.bitRange.left + ":" + ele.bitRange.right + "]") else ""
    }

    def text(EObject ele){
        ele.eClass.name
    }
}
