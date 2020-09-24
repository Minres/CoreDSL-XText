/**
 * generated by Xtext 2.22.0
 */
package com.minres.coredsl.coreDsl;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.minres.coredsl.coreDsl.ConstantDef#getValue <em>Value</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.ConstantDef#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see com.minres.coredsl.coreDsl.CoreDslPackage#getConstantDef()
 * @model
 * @generated
 */
public interface ConstantDef extends Constant
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(BigInteger)
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getConstantDef_Value()
   * @model
   * @generated
   */
  BigInteger getValue();

  /**
   * Sets the value of the '{@link com.minres.coredsl.coreDsl.ConstantDef#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(BigInteger value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' attribute list.
   * The list contents are of type {@link com.minres.coredsl.coreDsl.ConstAttribute}.
   * The literals are from the enumeration {@link com.minres.coredsl.coreDsl.ConstAttribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' attribute list.
   * @see com.minres.coredsl.coreDsl.ConstAttribute
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getConstantDef_Attributes()
   * @model unique="false"
   * @generated
   */
  EList<ConstAttribute> getAttributes();

} // ConstantDef
