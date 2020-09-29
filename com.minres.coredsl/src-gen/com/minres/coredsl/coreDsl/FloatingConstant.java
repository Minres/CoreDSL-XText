/**
 * generated by Xtext 2.22.0
 */
package com.minres.coredsl.coreDsl;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floating Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.minres.coredsl.coreDsl.FloatingConstant#getVal <em>Val</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.FloatingConstant#isF <em>F</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.FloatingConstant#isL <em>L</em>}</li>
 * </ul>
 *
 * @see com.minres.coredsl.coreDsl.CoreDslPackage#getFloatingConstant()
 * @model
 * @generated
 */
public interface FloatingConstant extends Constant
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(BigDecimal)
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getFloatingConstant_Val()
   * @model
   * @generated
   */
  BigDecimal getVal();

  /**
   * Sets the value of the '{@link com.minres.coredsl.coreDsl.FloatingConstant#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(BigDecimal value);

  /**
   * Returns the value of the '<em><b>F</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>F</em>' attribute.
   * @see #setF(boolean)
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getFloatingConstant_F()
   * @model
   * @generated
   */
  boolean isF();

  /**
   * Sets the value of the '{@link com.minres.coredsl.coreDsl.FloatingConstant#isF <em>F</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F</em>' attribute.
   * @see #isF()
   * @generated
   */
  void setF(boolean value);

  /**
   * Returns the value of the '<em><b>L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' attribute.
   * @see #setL(boolean)
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getFloatingConstant_L()
   * @model
   * @generated
   */
  boolean isL();

  /**
   * Sets the value of the '{@link com.minres.coredsl.coreDsl.FloatingConstant#isL <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' attribute.
   * @see #isL()
   * @generated
   */
  void setL(boolean value);

} // FloatingConstant
