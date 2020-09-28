/**
 * generated by Xtext 2.22.0
 */
package com.minres.coredsl.coreDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Or Var Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.minres.coredsl.coreDsl.TypeOrVarDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.TypeOrVarDeclaration#getSize <em>Size</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.TypeOrVarDeclaration#getInit <em>Init</em>}</li>
 * </ul>
 *
 * @see com.minres.coredsl.coreDsl.CoreDslPackage#getTypeOrVarDeclaration()
 * @model
 * @generated
 */
public interface TypeOrVarDeclaration extends Declaration, DeclarationSpecifier, AttributeList
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeSpecifier)
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getTypeOrVarDeclaration_Type()
   * @model containment="true"
   * @generated
   */
  TypeSpecifier getType();

  /**
   * Sets the value of the '{@link com.minres.coredsl.coreDsl.TypeOrVarDeclaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeSpecifier value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference.
   * @see #setSize(BitSizeSpecifier)
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getTypeOrVarDeclaration_Size()
   * @model containment="true"
   * @generated
   */
  BitSizeSpecifier getSize();

  /**
   * Sets the value of the '{@link com.minres.coredsl.coreDsl.TypeOrVarDeclaration#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(BitSizeSpecifier value);

  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference list.
   * The list contents are of type {@link com.minres.coredsl.coreDsl.InitDeclarator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference list.
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getTypeOrVarDeclaration_Init()
   * @model containment="true"
   * @generated
   */
  EList<InitDeclarator> getInit();

} // TypeOrVarDeclaration