/**
 * generated by Xtext 2.22.0
 */
package com.minres.coredsl.coreDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.minres.coredsl.coreDsl.ValueRef#getValue <em>Value</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.ValueRef#getIndex <em>Index</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.ValueRef#getBitWidth <em>Bit Width</em>}</li>
 * </ul>
 *
 * @see com.minres.coredsl.coreDsl.CoreDslPackage#getValueRef()
 * @model
 * @generated
 */
public interface ValueRef extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(EObject)
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getValueRef_Value()
   * @model
   * @generated
   */
  EObject getValue();

  /**
   * Sets the value of the '{@link com.minres.coredsl.coreDsl.ValueRef#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(EObject value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' containment reference.
   * @see #setIndex(Expression)
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getValueRef_Index()
   * @model containment="true"
   * @generated
   */
  Expression getIndex();

  /**
   * Sets the value of the '{@link com.minres.coredsl.coreDsl.ValueRef#getIndex <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' containment reference.
   * @see #getIndex()
   * @generated
   */
  void setIndex(Expression value);

  /**
   * Returns the value of the '<em><b>Bit Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bit Width</em>' containment reference.
   * @see #setBitWidth(BitSizeSpec)
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getValueRef_BitWidth()
   * @model containment="true"
   * @generated
   */
  BitSizeSpec getBitWidth();

  /**
   * Sets the value of the '{@link com.minres.coredsl.coreDsl.ValueRef#getBitWidth <em>Bit Width</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bit Width</em>' containment reference.
   * @see #getBitWidth()
   * @generated
   */
  void setBitWidth(BitSizeSpec value);

} // ValueRef
