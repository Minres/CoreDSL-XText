/*
 * generated by Xtext 2.22.0
 */
package com.minres.coredsl.serializer;

import com.google.inject.Inject;
import com.minres.coredsl.coreDsl.AdditionExpr;
import com.minres.coredsl.coreDsl.AddressSpace;
import com.minres.coredsl.coreDsl.BitExpr;
import com.minres.coredsl.coreDsl.BitField;
import com.minres.coredsl.coreDsl.BitSizeSpec;
import com.minres.coredsl.coreDsl.BitValue;
import com.minres.coredsl.coreDsl.BooleanExpr;
import com.minres.coredsl.coreDsl.ComparisonExpr;
import com.minres.coredsl.coreDsl.ConditionalStmt;
import com.minres.coredsl.coreDsl.Constant;
import com.minres.coredsl.coreDsl.ConstantDef;
import com.minres.coredsl.coreDsl.ConstantDefault;
import com.minres.coredsl.coreDsl.CoreDef;
import com.minres.coredsl.coreDsl.CoreDslPackage;
import com.minres.coredsl.coreDsl.DescriptionContent;
import com.minres.coredsl.coreDsl.DirectCode;
import com.minres.coredsl.coreDsl.Encoding;
import com.minres.coredsl.coreDsl.Function;
import com.minres.coredsl.coreDsl.Import;
import com.minres.coredsl.coreDsl.IndexedAssignment;
import com.minres.coredsl.coreDsl.Instruction;
import com.minres.coredsl.coreDsl.InstructionSet;
import com.minres.coredsl.coreDsl.MultiplicationExpr;
import com.minres.coredsl.coreDsl.NumberLiteral;
import com.minres.coredsl.coreDsl.Operation;
import com.minres.coredsl.coreDsl.Procedure;
import com.minres.coredsl.coreDsl.RangeSpec;
import com.minres.coredsl.coreDsl.Register;
import com.minres.coredsl.coreDsl.RegisterAlias;
import com.minres.coredsl.coreDsl.RegisterAssignment;
import com.minres.coredsl.coreDsl.RegisterFile;
import com.minres.coredsl.coreDsl.Scalar;
import com.minres.coredsl.coreDsl.ScalarAssignment;
import com.minres.coredsl.coreDsl.ShiftExpr;
import com.minres.coredsl.coreDsl.TypeConv;
import com.minres.coredsl.coreDsl.UnitaryExpr;
import com.minres.coredsl.coreDsl.ValueRef;
import com.minres.coredsl.services.CoreDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CoreDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CoreDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CoreDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CoreDslPackage.ADDITION_EXPR:
				sequence_AdditionExpr(context, (AdditionExpr) semanticObject); 
				return; 
			case CoreDslPackage.ADDRESS_SPACE:
				sequence_AddressSpace(context, (AddressSpace) semanticObject); 
				return; 
			case CoreDslPackage.BIT_EXPR:
				sequence_BitAndExpr_BitOrExpr_BitXOrExpr(context, (BitExpr) semanticObject); 
				return; 
			case CoreDslPackage.BIT_FIELD:
				sequence_BitField(context, (BitField) semanticObject); 
				return; 
			case CoreDslPackage.BIT_SIZE_SPEC:
				sequence_BitSizeSpec(context, (BitSizeSpec) semanticObject); 
				return; 
			case CoreDslPackage.BIT_VALUE:
				sequence_BitValue(context, (BitValue) semanticObject); 
				return; 
			case CoreDslPackage.BOOLEAN_EXPR:
				sequence_BooleanAndExpr_BooleanOrExpr(context, (BooleanExpr) semanticObject); 
				return; 
			case CoreDslPackage.COMPARISON_EXPR:
				sequence_ComparisonExpr_EqualityExpr(context, (ComparisonExpr) semanticObject); 
				return; 
			case CoreDslPackage.CONDITIONAL_STMT:
				sequence_ConditionalStmt(context, (ConditionalStmt) semanticObject); 
				return; 
			case CoreDslPackage.CONSTANT:
				sequence_ConstantDecl(context, (Constant) semanticObject); 
				return; 
			case CoreDslPackage.CONSTANT_DEF:
				sequence_ConstantDef(context, (ConstantDef) semanticObject); 
				return; 
			case CoreDslPackage.CONSTANT_DEFAULT:
				sequence_ConstantDefault(context, (ConstantDefault) semanticObject); 
				return; 
			case CoreDslPackage.CORE_DEF:
				sequence_CoreDef(context, (CoreDef) semanticObject); 
				return; 
			case CoreDslPackage.DESCRIPTION_CONTENT:
				sequence_DescriptionContent(context, (DescriptionContent) semanticObject); 
				return; 
			case CoreDslPackage.DIRECT_CODE:
				sequence_DirectCode(context, (DirectCode) semanticObject); 
				return; 
			case CoreDslPackage.ENCODING:
				sequence_Encoding(context, (Encoding) semanticObject); 
				return; 
			case CoreDslPackage.FUNCTION:
				sequence_Primary(context, (Function) semanticObject); 
				return; 
			case CoreDslPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case CoreDslPackage.INDEXED_ASSIGNMENT:
				sequence_Assignment(context, (IndexedAssignment) semanticObject); 
				return; 
			case CoreDslPackage.INSTRUCTION:
				sequence_Instruction(context, (Instruction) semanticObject); 
				return; 
			case CoreDslPackage.INSTRUCTION_SET:
				sequence_InstructionSet(context, (InstructionSet) semanticObject); 
				return; 
			case CoreDslPackage.MULTIPLICATION_EXPR:
				sequence_MultiplicationExpr(context, (MultiplicationExpr) semanticObject); 
				return; 
			case CoreDslPackage.NUMBER_LITERAL:
				sequence_NumberLiteral(context, (NumberLiteral) semanticObject); 
				return; 
			case CoreDslPackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case CoreDslPackage.PROCEDURE:
				sequence_Procedure(context, (Procedure) semanticObject); 
				return; 
			case CoreDslPackage.RANGE_SPEC:
				sequence_RangeSpec(context, (RangeSpec) semanticObject); 
				return; 
			case CoreDslPackage.REGISTER:
				sequence_Register(context, (Register) semanticObject); 
				return; 
			case CoreDslPackage.REGISTER_ALIAS:
				sequence_RegisterAlias(context, (RegisterAlias) semanticObject); 
				return; 
			case CoreDslPackage.REGISTER_ASSIGNMENT:
				sequence_Assignment(context, (RegisterAssignment) semanticObject); 
				return; 
			case CoreDslPackage.REGISTER_FILE:
				sequence_RegisterFile(context, (RegisterFile) semanticObject); 
				return; 
			case CoreDslPackage.SCALAR:
				if (rule == grammarAccess.getScalarBaseRule()) {
					sequence_ScalarBase(context, (Scalar) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getVariableRule()
						|| rule == grammarAccess.getScalarVariableRule()
						|| rule == grammarAccess.getScalarRule()) {
					sequence_Scalar(context, (Scalar) semanticObject); 
					return; 
				}
				else break;
			case CoreDslPackage.SCALAR_ASSIGNMENT:
				sequence_Assignment(context, (ScalarAssignment) semanticObject); 
				return; 
			case CoreDslPackage.SHIFT_EXPR:
				sequence_ShiftExpr(context, (ShiftExpr) semanticObject); 
				return; 
			case CoreDslPackage.TYPE_CONV:
				sequence_TypeConv(context, (TypeConv) semanticObject); 
				return; 
			case CoreDslPackage.UNITARY_EXPR:
				sequence_UnitaryExpr(context, (UnitaryExpr) semanticObject); 
				return; 
			case CoreDslPackage.VALUE_REF:
				sequence_ValueRef(context, (ValueRef) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Expression returns AdditionExpr
	 *     BooleanOrExpr returns AdditionExpr
	 *     BooleanOrExpr.BooleanExpr_1_0 returns AdditionExpr
	 *     BooleanAndExpr returns AdditionExpr
	 *     BooleanAndExpr.BooleanExpr_1_0 returns AdditionExpr
	 *     BitOrExpr returns AdditionExpr
	 *     BitOrExpr.BitExpr_1_0 returns AdditionExpr
	 *     BitXOrExpr returns AdditionExpr
	 *     BitXOrExpr.BitExpr_1_0 returns AdditionExpr
	 *     BitAndExpr returns AdditionExpr
	 *     BitAndExpr.BitExpr_1_0 returns AdditionExpr
	 *     EqualityExpr returns AdditionExpr
	 *     EqualityExpr.ComparisonExpr_1_0 returns AdditionExpr
	 *     ComparisonExpr returns AdditionExpr
	 *     ComparisonExpr.ComparisonExpr_1_0 returns AdditionExpr
	 *     ShiftExpr returns AdditionExpr
	 *     ShiftExpr.ShiftExpr_1_0 returns AdditionExpr
	 *     AdditionExpr returns AdditionExpr
	 *     AdditionExpr.AdditionExpr_1_0 returns AdditionExpr
	 *     MultiplicationExpr returns AdditionExpr
	 *     MultiplicationExpr.MultiplicationExpr_1_0 returns AdditionExpr
	 *     UnitaryExpr returns AdditionExpr
	 *     TypeConv returns AdditionExpr
	 *     TypeConv.TypeConv_1_0 returns AdditionExpr
	 *     Primary returns AdditionExpr
	 *
	 * Constraint:
	 *     (left=AdditionExpr_AdditionExpr_1_0 (op='+' | op='-') right=MultiplicationExpr)
	 */
	protected void sequence_AdditionExpr(ISerializationContext context, AdditionExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns AddressSpace
	 *     IndexedVariable returns AddressSpace
	 *     AddressSpace returns AddressSpace
	 *
	 * Constraint:
	 *     (name=ID (bitSize=NATURAL | bitSizeConst=[Constant|ID]))
	 */
	protected void sequence_AddressSpace(ISerializationContext context, AddressSpace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns IndexedAssignment
	 *     Assignment returns IndexedAssignment
	 *
	 * Constraint:
	 *     (to=[IndexedVariable|ID] index=Expression bitWidth=BitSizeSpec? expression=Expression)
	 */
	protected void sequence_Assignment(ISerializationContext context, IndexedAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns RegisterAssignment
	 *     Assignment returns RegisterAssignment
	 *
	 * Constraint:
	 *     (to=[RegisterVariable|ID] bitWidth=BitSizeSpec? expression=Expression)
	 */
	protected void sequence_Assignment(ISerializationContext context, RegisterAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns ScalarAssignment
	 *     Assignment returns ScalarAssignment
	 *
	 * Constraint:
	 *     (to=Scalar bitWidth=BitSizeSpec? expression=Expression)
	 */
	protected void sequence_Assignment(ISerializationContext context, ScalarAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns BitExpr
	 *     BooleanOrExpr returns BitExpr
	 *     BooleanOrExpr.BooleanExpr_1_0 returns BitExpr
	 *     BooleanAndExpr returns BitExpr
	 *     BooleanAndExpr.BooleanExpr_1_0 returns BitExpr
	 *     BitOrExpr returns BitExpr
	 *     BitOrExpr.BitExpr_1_0 returns BitExpr
	 *     BitXOrExpr returns BitExpr
	 *     BitXOrExpr.BitExpr_1_0 returns BitExpr
	 *     BitAndExpr returns BitExpr
	 *     BitAndExpr.BitExpr_1_0 returns BitExpr
	 *     EqualityExpr returns BitExpr
	 *     EqualityExpr.ComparisonExpr_1_0 returns BitExpr
	 *     ComparisonExpr returns BitExpr
	 *     ComparisonExpr.ComparisonExpr_1_0 returns BitExpr
	 *     ShiftExpr returns BitExpr
	 *     ShiftExpr.ShiftExpr_1_0 returns BitExpr
	 *     AdditionExpr returns BitExpr
	 *     AdditionExpr.AdditionExpr_1_0 returns BitExpr
	 *     MultiplicationExpr returns BitExpr
	 *     MultiplicationExpr.MultiplicationExpr_1_0 returns BitExpr
	 *     UnitaryExpr returns BitExpr
	 *     TypeConv returns BitExpr
	 *     TypeConv.TypeConv_1_0 returns BitExpr
	 *     Primary returns BitExpr
	 *
	 * Constraint:
	 *     (
	 *         (left=BitOrExpr_BitExpr_1_0 op='|' right=BitXOrExpr) | 
	 *         (left=BitXOrExpr_BitExpr_1_0 op='^' right=BitAndExpr) | 
	 *         (left=BitAndExpr_BitExpr_1_0 op='&' right=EqualityExpr)
	 *     )
	 */
	protected void sequence_BitAndExpr_BitOrExpr_BitXOrExpr(ISerializationContext context, BitExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Field returns BitField
	 *     BitField returns BitField
	 *     RValue returns BitField
	 *
	 * Constraint:
	 *     (name=ID bitRange=RangeSpec type=DataType?)
	 */
	protected void sequence_BitField(ISerializationContext context, BitField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BitSizeSpec returns BitSizeSpec
	 *
	 * Constraint:
	 *     (value=NATURAL | constant=[Constant|ID])
	 */
	protected void sequence_BitSizeSpec(ISerializationContext context, BitSizeSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Field returns BitValue
	 *     BitValue returns BitValue
	 *     RValue returns BitValue
	 *
	 * Constraint:
	 *     name=BVAL
	 */
	protected void sequence_BitValue(ISerializationContext context, BitValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CoreDslPackage.Literals.RVALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoreDslPackage.Literals.RVALUE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBitValueAccess().getNameBVALTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns BooleanExpr
	 *     BooleanOrExpr returns BooleanExpr
	 *     BooleanOrExpr.BooleanExpr_1_0 returns BooleanExpr
	 *     BooleanAndExpr returns BooleanExpr
	 *     BooleanAndExpr.BooleanExpr_1_0 returns BooleanExpr
	 *     BitOrExpr returns BooleanExpr
	 *     BitOrExpr.BitExpr_1_0 returns BooleanExpr
	 *     BitXOrExpr returns BooleanExpr
	 *     BitXOrExpr.BitExpr_1_0 returns BooleanExpr
	 *     BitAndExpr returns BooleanExpr
	 *     BitAndExpr.BitExpr_1_0 returns BooleanExpr
	 *     EqualityExpr returns BooleanExpr
	 *     EqualityExpr.ComparisonExpr_1_0 returns BooleanExpr
	 *     ComparisonExpr returns BooleanExpr
	 *     ComparisonExpr.ComparisonExpr_1_0 returns BooleanExpr
	 *     ShiftExpr returns BooleanExpr
	 *     ShiftExpr.ShiftExpr_1_0 returns BooleanExpr
	 *     AdditionExpr returns BooleanExpr
	 *     AdditionExpr.AdditionExpr_1_0 returns BooleanExpr
	 *     MultiplicationExpr returns BooleanExpr
	 *     MultiplicationExpr.MultiplicationExpr_1_0 returns BooleanExpr
	 *     UnitaryExpr returns BooleanExpr
	 *     TypeConv returns BooleanExpr
	 *     TypeConv.TypeConv_1_0 returns BooleanExpr
	 *     Primary returns BooleanExpr
	 *
	 * Constraint:
	 *     ((left=BooleanOrExpr_BooleanExpr_1_0 op='||' right=BooleanAndExpr) | (left=BooleanAndExpr_BooleanExpr_1_0 op='&&' right=BitOrExpr))
	 */
	protected void sequence_BooleanAndExpr_BooleanOrExpr(ISerializationContext context, BooleanExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ComparisonExpr
	 *     BooleanOrExpr returns ComparisonExpr
	 *     BooleanOrExpr.BooleanExpr_1_0 returns ComparisonExpr
	 *     BooleanAndExpr returns ComparisonExpr
	 *     BooleanAndExpr.BooleanExpr_1_0 returns ComparisonExpr
	 *     BitOrExpr returns ComparisonExpr
	 *     BitOrExpr.BitExpr_1_0 returns ComparisonExpr
	 *     BitXOrExpr returns ComparisonExpr
	 *     BitXOrExpr.BitExpr_1_0 returns ComparisonExpr
	 *     BitAndExpr returns ComparisonExpr
	 *     BitAndExpr.BitExpr_1_0 returns ComparisonExpr
	 *     EqualityExpr returns ComparisonExpr
	 *     EqualityExpr.ComparisonExpr_1_0 returns ComparisonExpr
	 *     ComparisonExpr returns ComparisonExpr
	 *     ComparisonExpr.ComparisonExpr_1_0 returns ComparisonExpr
	 *     ShiftExpr returns ComparisonExpr
	 *     ShiftExpr.ShiftExpr_1_0 returns ComparisonExpr
	 *     AdditionExpr returns ComparisonExpr
	 *     AdditionExpr.AdditionExpr_1_0 returns ComparisonExpr
	 *     MultiplicationExpr returns ComparisonExpr
	 *     MultiplicationExpr.MultiplicationExpr_1_0 returns ComparisonExpr
	 *     UnitaryExpr returns ComparisonExpr
	 *     TypeConv returns ComparisonExpr
	 *     TypeConv.TypeConv_1_0 returns ComparisonExpr
	 *     Primary returns ComparisonExpr
	 *
	 * Constraint:
	 *     (
	 *         (left=EqualityExpr_ComparisonExpr_1_0 (op='==' | op='!=') right=ComparisonExpr) | 
	 *         (left=ComparisonExpr_ComparisonExpr_1_0 (op='<' | op='>' | op='<=' | op='>=') right=ShiftExpr)
	 *     )
	 */
	protected void sequence_ComparisonExpr_EqualityExpr(ISerializationContext context, ComparisonExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns ConditionalStmt
	 *     ConditionalStmt returns ConditionalStmt
	 *
	 * Constraint:
	 *     (cond=BooleanOrExpr (thenStmts+=Statement | thenStmts+=Statement+) (elseStmts+=Statement | elseStmts+=Statement+)?)
	 */
	protected void sequence_ConditionalStmt(ISerializationContext context, ConditionalStmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Constant returns Constant
	 *     ConstantDecl returns Constant
	 *     RValue returns Constant
	 *
	 * Constraint:
	 *     (name=ID constantDefault=ConstantDefault?)
	 */
	protected void sequence_ConstantDecl(ISerializationContext context, Constant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Constant returns ConstantDef
	 *     ConstantDef returns ConstantDef
	 *     RValue returns ConstantDef
	 *
	 * Constraint:
	 *     (name=ID value=NATURAL (attributes+=ConstAttribute attributes+=ConstAttribute*)?)
	 */
	protected void sequence_ConstantDef(ISerializationContext context, ConstantDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstantDefault returns ConstantDefault
	 *
	 * Constraint:
	 *     defaultValue=NATURAL
	 */
	protected void sequence_ConstantDefault(ISerializationContext context, ConstantDefault semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CoreDslPackage.Literals.CONSTANT_DEFAULT__DEFAULT_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoreDslPackage.Literals.CONSTANT_DEFAULT__DEFAULT_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstantDefaultAccess().getDefaultValueNATURALTerminalRuleCall_1_0(), semanticObject.getDefaultValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ISA returns CoreDef
	 *     CoreDef returns CoreDef
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (contributingType+=[InstructionSet|ID] contributingType+=[InstructionSet|ID]*)? 
	 *         templateName=STRING? 
	 *         constants+=ConstantDef* 
	 *         (spaces+=AddressSpace spaces+=AddressSpace*)? 
	 *         ((regs+=Register | regs+=RegisterFile | regs+=RegisterAlias) regs+=RegisterFile? ((regs+=Register | regs+=RegisterAlias)? regs+=RegisterFile?)*)? 
	 *         instr+=Instruction*
	 *     )
	 */
	protected void sequence_CoreDef(ISerializationContext context, CoreDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DescriptionContent returns DescriptionContent
	 *
	 * Constraint:
	 *     (imports+=Import* definitions+=ISA+)
	 */
	protected void sequence_DescriptionContent(ISerializationContext context, DescriptionContent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns DirectCode
	 *     DirectCode returns DirectCode
	 *
	 * Constraint:
	 *     (code+=STRING code+=STRING*)
	 */
	protected void sequence_DirectCode(ISerializationContext context, DirectCode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Encoding returns Encoding
	 *
	 * Constraint:
	 *     (fields+=Field fields+=Field*)
	 */
	protected void sequence_Encoding(ISerializationContext context, Encoding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CoreDslPackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoreDslPackage.Literals.IMPORT__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ISA returns InstructionSet
	 *     InstructionSet returns InstructionSet
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         superType=[InstructionSet|ID]? 
	 *         (constants+=ConstantDecl constants+=ConstantDecl*)? 
	 *         (spaces+=AddressSpace spaces+=AddressSpace*)? 
	 *         ((regs+=Register | regs+=RegisterFile | regs+=RegisterAlias) regs+=RegisterFile? ((regs+=Register | regs+=RegisterAlias)? regs+=RegisterFile?)*)? 
	 *         instr+=Instruction*
	 *     )
	 */
	protected void sequence_InstructionSet(ISerializationContext context, InstructionSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Instruction
	 *
	 * Constraint:
	 *     ((disass=STRING | operation=Operation)? (name=ID (attributes+=InstrAttribute attributes+=InstrAttribute*)? encoding=Encoding)?)+
	 */
	protected void sequence_Instruction(ISerializationContext context, Instruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns MultiplicationExpr
	 *     BooleanOrExpr returns MultiplicationExpr
	 *     BooleanOrExpr.BooleanExpr_1_0 returns MultiplicationExpr
	 *     BooleanAndExpr returns MultiplicationExpr
	 *     BooleanAndExpr.BooleanExpr_1_0 returns MultiplicationExpr
	 *     BitOrExpr returns MultiplicationExpr
	 *     BitOrExpr.BitExpr_1_0 returns MultiplicationExpr
	 *     BitXOrExpr returns MultiplicationExpr
	 *     BitXOrExpr.BitExpr_1_0 returns MultiplicationExpr
	 *     BitAndExpr returns MultiplicationExpr
	 *     BitAndExpr.BitExpr_1_0 returns MultiplicationExpr
	 *     EqualityExpr returns MultiplicationExpr
	 *     EqualityExpr.ComparisonExpr_1_0 returns MultiplicationExpr
	 *     ComparisonExpr returns MultiplicationExpr
	 *     ComparisonExpr.ComparisonExpr_1_0 returns MultiplicationExpr
	 *     ShiftExpr returns MultiplicationExpr
	 *     ShiftExpr.ShiftExpr_1_0 returns MultiplicationExpr
	 *     AdditionExpr returns MultiplicationExpr
	 *     AdditionExpr.AdditionExpr_1_0 returns MultiplicationExpr
	 *     MultiplicationExpr returns MultiplicationExpr
	 *     MultiplicationExpr.MultiplicationExpr_1_0 returns MultiplicationExpr
	 *     UnitaryExpr returns MultiplicationExpr
	 *     TypeConv returns MultiplicationExpr
	 *     TypeConv.TypeConv_1_0 returns MultiplicationExpr
	 *     Primary returns MultiplicationExpr
	 *
	 * Constraint:
	 *     (left=MultiplicationExpr_MultiplicationExpr_1_0 (op='*' | op='/' | op='%') right=UnitaryExpr)
	 */
	protected void sequence_MultiplicationExpr(ISerializationContext context, MultiplicationExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NumberLiteral returns NumberLiteral
	 *     Expression returns NumberLiteral
	 *     BooleanOrExpr returns NumberLiteral
	 *     BooleanOrExpr.BooleanExpr_1_0 returns NumberLiteral
	 *     BooleanAndExpr returns NumberLiteral
	 *     BooleanAndExpr.BooleanExpr_1_0 returns NumberLiteral
	 *     BitOrExpr returns NumberLiteral
	 *     BitOrExpr.BitExpr_1_0 returns NumberLiteral
	 *     BitXOrExpr returns NumberLiteral
	 *     BitXOrExpr.BitExpr_1_0 returns NumberLiteral
	 *     BitAndExpr returns NumberLiteral
	 *     BitAndExpr.BitExpr_1_0 returns NumberLiteral
	 *     EqualityExpr returns NumberLiteral
	 *     EqualityExpr.ComparisonExpr_1_0 returns NumberLiteral
	 *     ComparisonExpr returns NumberLiteral
	 *     ComparisonExpr.ComparisonExpr_1_0 returns NumberLiteral
	 *     ShiftExpr returns NumberLiteral
	 *     ShiftExpr.ShiftExpr_1_0 returns NumberLiteral
	 *     AdditionExpr returns NumberLiteral
	 *     AdditionExpr.AdditionExpr_1_0 returns NumberLiteral
	 *     MultiplicationExpr returns NumberLiteral
	 *     MultiplicationExpr.MultiplicationExpr_1_0 returns NumberLiteral
	 *     UnitaryExpr returns NumberLiteral
	 *     TypeConv returns NumberLiteral
	 *     TypeConv.TypeConv_1_0 returns NumberLiteral
	 *     Primary returns NumberLiteral
	 *
	 * Constraint:
	 *     value=NATURAL
	 */
	protected void sequence_NumberLiteral(ISerializationContext context, NumberLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CoreDslPackage.Literals.NUMBER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoreDslPackage.Literals.NUMBER_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberLiteralAccess().getValueNATURALTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     statements+=Statement+
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Function
	 *     BooleanOrExpr returns Function
	 *     BooleanOrExpr.BooleanExpr_1_0 returns Function
	 *     BooleanAndExpr returns Function
	 *     BooleanAndExpr.BooleanExpr_1_0 returns Function
	 *     BitOrExpr returns Function
	 *     BitOrExpr.BitExpr_1_0 returns Function
	 *     BitXOrExpr returns Function
	 *     BitXOrExpr.BitExpr_1_0 returns Function
	 *     BitAndExpr returns Function
	 *     BitAndExpr.BitExpr_1_0 returns Function
	 *     EqualityExpr returns Function
	 *     EqualityExpr.ComparisonExpr_1_0 returns Function
	 *     ComparisonExpr returns Function
	 *     ComparisonExpr.ComparisonExpr_1_0 returns Function
	 *     ShiftExpr returns Function
	 *     ShiftExpr.ShiftExpr_1_0 returns Function
	 *     AdditionExpr returns Function
	 *     AdditionExpr.AdditionExpr_1_0 returns Function
	 *     MultiplicationExpr returns Function
	 *     MultiplicationExpr.MultiplicationExpr_1_0 returns Function
	 *     UnitaryExpr returns Function
	 *     TypeConv returns Function
	 *     TypeConv.TypeConv_1_0 returns Function
	 *     Primary returns Function
	 *
	 * Constraint:
	 *     (name=FUNCTIONNAME (args+=Expression args+=Expression*)?)
	 */
	protected void sequence_Primary(ISerializationContext context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Procedure
	 *     Procedure returns Procedure
	 *
	 * Constraint:
	 *     (name=PROCEDURENAME args+=Expression args+=Expression*)
	 */
	protected void sequence_Procedure(ISerializationContext context, Procedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RangeSpec returns RangeSpec
	 *
	 * Constraint:
	 *     (left=NATURAL right=NATURAL)
	 */
	protected void sequence_RangeSpec(ISerializationContext context, RangeSpec semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CoreDslPackage.Literals.RANGE_SPEC__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoreDslPackage.Literals.RANGE_SPEC__LEFT));
			if (transientValues.isValueTransient(semanticObject, CoreDslPackage.Literals.RANGE_SPEC__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoreDslPackage.Literals.RANGE_SPEC__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRangeSpecAccess().getLeftNATURALTerminalRuleCall_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getRangeSpecAccess().getRightNATURALTerminalRuleCall_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns RegisterAlias
	 *     ScalarVariable returns RegisterAlias
	 *     RegisterVariable returns RegisterAlias
	 *     RegisterAlias returns RegisterAlias
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (bitSize=NATURAL | bitSizeConst=[Constant|ID]) 
	 *         (attributes+=RegAttribute attributes+=RegAttribute*)? 
	 *         (original=[Register|ID] | (original=[RegisterFile|ID] (index=NumberLiteral | index=ValueRef)))
	 *     )
	 */
	protected void sequence_RegisterAlias(ISerializationContext context, RegisterAlias semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns RegisterFile
	 *     IndexedVariable returns RegisterFile
	 *     RegisterFile returns RegisterFile
	 *
	 * Constraint:
	 *     (range=RangeSpec name=ID (bitSize=NATURAL | bitSizeConst=[Constant|ID]) (attributes+=RegAttribute attributes+=RegAttribute*)?)
	 */
	protected void sequence_RegisterFile(ISerializationContext context, RegisterFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Register
	 *     ScalarVariable returns Register
	 *     RegisterVariable returns Register
	 *     Register returns Register
	 *
	 * Constraint:
	 *     (name=ID (bitSize=NATURAL | bitSizeConst=[Constant|ID]) (attributes+=RegAttribute attributes+=RegAttribute*)?)
	 */
	protected void sequence_Register(ISerializationContext context, Register semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ScalarBase returns Scalar
	 *
	 * Constraint:
	 *     determined?='is_determined'
	 */
	protected void sequence_ScalarBase(ISerializationContext context, Scalar semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CoreDslPackage.Literals.SCALAR__DETERMINED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoreDslPackage.Literals.SCALAR__DETERMINED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScalarBaseAccess().getDeterminedIs_determinedKeyword_1_0(), semanticObject.isDetermined());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Scalar
	 *     ScalarVariable returns Scalar
	 *     Scalar returns Scalar
	 *
	 * Constraint:
	 *     (name=ID (bitSize=NATURAL | bitSizeConst=[Constant|ID]))
	 */
	protected void sequence_Scalar(ISerializationContext context, Scalar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ShiftExpr
	 *     BooleanOrExpr returns ShiftExpr
	 *     BooleanOrExpr.BooleanExpr_1_0 returns ShiftExpr
	 *     BooleanAndExpr returns ShiftExpr
	 *     BooleanAndExpr.BooleanExpr_1_0 returns ShiftExpr
	 *     BitOrExpr returns ShiftExpr
	 *     BitOrExpr.BitExpr_1_0 returns ShiftExpr
	 *     BitXOrExpr returns ShiftExpr
	 *     BitXOrExpr.BitExpr_1_0 returns ShiftExpr
	 *     BitAndExpr returns ShiftExpr
	 *     BitAndExpr.BitExpr_1_0 returns ShiftExpr
	 *     EqualityExpr returns ShiftExpr
	 *     EqualityExpr.ComparisonExpr_1_0 returns ShiftExpr
	 *     ComparisonExpr returns ShiftExpr
	 *     ComparisonExpr.ComparisonExpr_1_0 returns ShiftExpr
	 *     ShiftExpr returns ShiftExpr
	 *     ShiftExpr.ShiftExpr_1_0 returns ShiftExpr
	 *     AdditionExpr returns ShiftExpr
	 *     AdditionExpr.AdditionExpr_1_0 returns ShiftExpr
	 *     MultiplicationExpr returns ShiftExpr
	 *     MultiplicationExpr.MultiplicationExpr_1_0 returns ShiftExpr
	 *     UnitaryExpr returns ShiftExpr
	 *     TypeConv returns ShiftExpr
	 *     TypeConv.TypeConv_1_0 returns ShiftExpr
	 *     Primary returns ShiftExpr
	 *
	 * Constraint:
	 *     (left=ShiftExpr_ShiftExpr_1_0 (op='<<' | op='>>') right=AdditionExpr)
	 */
	protected void sequence_ShiftExpr(ISerializationContext context, ShiftExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns TypeConv
	 *     BooleanOrExpr returns TypeConv
	 *     BooleanOrExpr.BooleanExpr_1_0 returns TypeConv
	 *     BooleanAndExpr returns TypeConv
	 *     BooleanAndExpr.BooleanExpr_1_0 returns TypeConv
	 *     BitOrExpr returns TypeConv
	 *     BitOrExpr.BitExpr_1_0 returns TypeConv
	 *     BitXOrExpr returns TypeConv
	 *     BitXOrExpr.BitExpr_1_0 returns TypeConv
	 *     BitAndExpr returns TypeConv
	 *     BitAndExpr.BitExpr_1_0 returns TypeConv
	 *     EqualityExpr returns TypeConv
	 *     EqualityExpr.ComparisonExpr_1_0 returns TypeConv
	 *     ComparisonExpr returns TypeConv
	 *     ComparisonExpr.ComparisonExpr_1_0 returns TypeConv
	 *     ShiftExpr returns TypeConv
	 *     ShiftExpr.ShiftExpr_1_0 returns TypeConv
	 *     AdditionExpr returns TypeConv
	 *     AdditionExpr.AdditionExpr_1_0 returns TypeConv
	 *     MultiplicationExpr returns TypeConv
	 *     MultiplicationExpr.MultiplicationExpr_1_0 returns TypeConv
	 *     UnitaryExpr returns TypeConv
	 *     TypeConv returns TypeConv
	 *     TypeConv.TypeConv_1_0 returns TypeConv
	 *     Primary returns TypeConv
	 *
	 * Constraint:
	 *     (expr=TypeConv_TypeConv_1_0 type=DataType)
	 */
	protected void sequence_TypeConv(ISerializationContext context, TypeConv semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CoreDslPackage.Literals.TYPE_CONV__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoreDslPackage.Literals.TYPE_CONV__EXPR));
			if (transientValues.isValueTransient(semanticObject, CoreDslPackage.Literals.TYPE_CONV__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoreDslPackage.Literals.TYPE_CONV__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeConvAccess().getTypeConvExprAction_1_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getTypeConvAccess().getTypeDataTypeEnumRuleCall_1_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns UnitaryExpr
	 *     BooleanOrExpr returns UnitaryExpr
	 *     BooleanOrExpr.BooleanExpr_1_0 returns UnitaryExpr
	 *     BooleanAndExpr returns UnitaryExpr
	 *     BooleanAndExpr.BooleanExpr_1_0 returns UnitaryExpr
	 *     BitOrExpr returns UnitaryExpr
	 *     BitOrExpr.BitExpr_1_0 returns UnitaryExpr
	 *     BitXOrExpr returns UnitaryExpr
	 *     BitXOrExpr.BitExpr_1_0 returns UnitaryExpr
	 *     BitAndExpr returns UnitaryExpr
	 *     BitAndExpr.BitExpr_1_0 returns UnitaryExpr
	 *     EqualityExpr returns UnitaryExpr
	 *     EqualityExpr.ComparisonExpr_1_0 returns UnitaryExpr
	 *     ComparisonExpr returns UnitaryExpr
	 *     ComparisonExpr.ComparisonExpr_1_0 returns UnitaryExpr
	 *     ShiftExpr returns UnitaryExpr
	 *     ShiftExpr.ShiftExpr_1_0 returns UnitaryExpr
	 *     AdditionExpr returns UnitaryExpr
	 *     AdditionExpr.AdditionExpr_1_0 returns UnitaryExpr
	 *     MultiplicationExpr returns UnitaryExpr
	 *     MultiplicationExpr.MultiplicationExpr_1_0 returns UnitaryExpr
	 *     UnitaryExpr returns UnitaryExpr
	 *     TypeConv returns UnitaryExpr
	 *     TypeConv.TypeConv_1_0 returns UnitaryExpr
	 *     Primary returns UnitaryExpr
	 *
	 * Constraint:
	 *     ((op='-' | op='+' | op='~' | op='!') expr=UnitaryExpr)
	 */
	protected void sequence_UnitaryExpr(ISerializationContext context, UnitaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ValueRef
	 *     BooleanOrExpr returns ValueRef
	 *     BooleanOrExpr.BooleanExpr_1_0 returns ValueRef
	 *     BooleanAndExpr returns ValueRef
	 *     BooleanAndExpr.BooleanExpr_1_0 returns ValueRef
	 *     BitOrExpr returns ValueRef
	 *     BitOrExpr.BitExpr_1_0 returns ValueRef
	 *     BitXOrExpr returns ValueRef
	 *     BitXOrExpr.BitExpr_1_0 returns ValueRef
	 *     BitAndExpr returns ValueRef
	 *     BitAndExpr.BitExpr_1_0 returns ValueRef
	 *     EqualityExpr returns ValueRef
	 *     EqualityExpr.ComparisonExpr_1_0 returns ValueRef
	 *     ComparisonExpr returns ValueRef
	 *     ComparisonExpr.ComparisonExpr_1_0 returns ValueRef
	 *     ShiftExpr returns ValueRef
	 *     ShiftExpr.ShiftExpr_1_0 returns ValueRef
	 *     AdditionExpr returns ValueRef
	 *     AdditionExpr.AdditionExpr_1_0 returns ValueRef
	 *     MultiplicationExpr returns ValueRef
	 *     MultiplicationExpr.MultiplicationExpr_1_0 returns ValueRef
	 *     UnitaryExpr returns ValueRef
	 *     TypeConv returns ValueRef
	 *     TypeConv.TypeConv_1_0 returns ValueRef
	 *     Primary returns ValueRef
	 *     ValueRef returns ValueRef
	 *
	 * Constraint:
	 *     (((value=[IndexedVariable|ID] index=Expression) | value=[ScalarVariable|ID] | value=[RValue|ID]) bitWidth=BitSizeSpec?)
	 */
	protected void sequence_ValueRef(ISerializationContext context, ValueRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}