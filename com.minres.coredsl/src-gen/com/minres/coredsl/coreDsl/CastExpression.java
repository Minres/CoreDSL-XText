/**
 * generated by Xtext 2.22.0
 */
package com.minres.coredsl.coreDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.minres.coredsl.coreDsl.CastExpression#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.minres.coredsl.coreDsl.CoreDslPackage#getCastExpression()
 * @model
 * @generated
 */
public interface CastExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(DataTypeSpecifier)
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getCastExpression_Type()
   * @model containment="true"
   * @generated
   */
  DataTypeSpecifier getType();

  /**
   * Sets the value of the '{@link com.minres.coredsl.coreDsl.CastExpression#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(DataTypeSpecifier value);

} // CastExpression