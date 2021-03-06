/*
 * generated by Xtext 2.10.0
 */
package com.minres.coredsl.ui.labeling

import com.google.inject.Inject
import com.minres.coredsl.coreDsl.BitField
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import org.eclipse.emf.ecore.EObject
import com.minres.coredsl.coreDsl.Encoding
import com.minres.coredsl.coreDsl.BitValue
import com.minres.coredsl.coreDsl.Instruction
import com.minres.coredsl.coreDsl.Statement
import com.minres.coredsl.coreDsl.CoreDef
import com.minres.coredsl.coreDsl.InstructionSet
import com.minres.coredsl.coreDsl.Declaration
import com.minres.coredsl.coreDsl.FunctionDefinition
import org.eclipse.emf.common.util.EList

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
	
	def text(CoreDef core) {
		'Core ' + core.name
    }

	def text(InstructionSet isa) {
		'ISA ' + isa.name
    }

	def text(Declaration decl) {
		decl.init.map[it.declarator!==null? it.declarator.name:it.declarator.name].join(', ')
    }

	def text(Instruction ele) {
		ele.name
    }

	def text(FunctionDefinition ele) {
		ele.name
    }

	def text(Encoding ele) {
		'encoding: ' + ele.fields.map[it.toText].join('::')
    }

    def text(EObject ele){
        ele.eClass.name
    }
		
	private def dispatch String getToText(BitField field){
		field.name + "[" + field.left.value.intValue + ":" + field.right.value.intValue + "]"
	}
	
	private def dispatch String getToText(BitValue value){
		value.name
	}
	
	def image(CoreDef e){
		'application.png'
	}

	def image(InstructionSet e){
		'package.png'
	}
	
	def image(Instruction e){
		'brick.png'
	}
	
	def image(Statement e){
		'script.png'
	}
	
	def image(Encoding e){
		'pill.png'
	}

	def image(EObject e){
		'brick.png'
	}

	def image(EList<?> e){
		'folder_brick.png'
	}
}
