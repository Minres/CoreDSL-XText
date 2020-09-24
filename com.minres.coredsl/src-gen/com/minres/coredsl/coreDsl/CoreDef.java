/**
 * generated by Xtext 2.22.0
 */
package com.minres.coredsl.coreDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.minres.coredsl.coreDsl.CoreDef#getContributingType <em>Contributing Type</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.CoreDef#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.CoreDef#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @see com.minres.coredsl.coreDsl.CoreDslPackage#getCoreDef()
 * @model
 * @generated
 */
public interface CoreDef extends ISA
{
  /**
   * Returns the value of the '<em><b>Contributing Type</b></em>' reference list.
   * The list contents are of type {@link com.minres.coredsl.coreDsl.InstructionSet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contributing Type</em>' reference list.
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getCoreDef_ContributingType()
   * @model
   * @generated
   */
  EList<InstructionSet> getContributingType();

  /**
   * Returns the value of the '<em><b>Template Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template Name</em>' attribute.
   * @see #setTemplateName(String)
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getCoreDef_TemplateName()
   * @model
   * @generated
   */
  String getTemplateName();

  /**
   * Sets the value of the '{@link com.minres.coredsl.coreDsl.CoreDef#getTemplateName <em>Template Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template Name</em>' attribute.
   * @see #getTemplateName()
   * @generated
   */
  void setTemplateName(String value);

  /**
   * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
   * The list contents are of type {@link com.minres.coredsl.coreDsl.ConstantDef}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constants</em>' containment reference list.
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getCoreDef_Constants()
   * @model containment="true"
   * @generated
   */
  EList<ConstantDef> getConstants();

} // CoreDef