/**
 * generated by Xtext 2.22.0
 */
package com.minres.coredsl.coreDsl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.minres.coredsl.coreDsl.Variable#getName <em>Name</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.Variable#getBitSize <em>Bit Size</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.Variable#getBitSizeConst <em>Bit Size Const</em>}</li>
 * </ul>
 *
 * @see com.minres.coredsl.coreDsl.CoreDslPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.minres.coredsl.coreDsl.Variable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Bit Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bit Size</em>' attribute.
   * @see #setBitSize(BigInteger)
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getVariable_BitSize()
   * @model
   * @generated
   */
  BigInteger getBitSize();

  /**
   * Sets the value of the '{@link com.minres.coredsl.coreDsl.Variable#getBitSize <em>Bit Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bit Size</em>' attribute.
   * @see #getBitSize()
   * @generated
   */
  void setBitSize(BigInteger value);

  /**
   * Returns the value of the '<em><b>Bit Size Const</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bit Size Const</em>' reference.
   * @see #setBitSizeConst(Constant)
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getVariable_BitSizeConst()
   * @model
   * @generated
   */
  Constant getBitSizeConst();

  /**
   * Sets the value of the '{@link com.minres.coredsl.coreDsl.Variable#getBitSizeConst <em>Bit Size Const</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bit Size Const</em>' reference.
   * @see #getBitSizeConst()
   * @generated
   */
  void setBitSizeConst(Constant value);

} // Variable