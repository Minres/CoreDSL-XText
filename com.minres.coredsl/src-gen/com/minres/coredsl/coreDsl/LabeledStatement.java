/**
 * generated by Xtext 2.22.0
 */
package com.minres.coredsl.coreDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.minres.coredsl.coreDsl.LabeledStatement#getConstExpr <em>Const Expr</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.LabeledStatement#getStmt <em>Stmt</em>}</li>
 * </ul>
 *
 * @see com.minres.coredsl.coreDsl.CoreDslPackage#getLabeledStatement()
 * @model
 * @generated
 */
public interface LabeledStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Const Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const Expr</em>' containment reference.
   * @see #setConstExpr(Expression)
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getLabeledStatement_ConstExpr()
   * @model containment="true"
   * @generated
   */
  Expression getConstExpr();

  /**
   * Sets the value of the '{@link com.minres.coredsl.coreDsl.LabeledStatement#getConstExpr <em>Const Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const Expr</em>' containment reference.
   * @see #getConstExpr()
   * @generated
   */
  void setConstExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt</em>' containment reference.
   * @see #setStmt(Statement)
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getLabeledStatement_Stmt()
   * @model containment="true"
   * @generated
   */
  Statement getStmt();

  /**
   * Sets the value of the '{@link com.minres.coredsl.coreDsl.LabeledStatement#getStmt <em>Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmt</em>' containment reference.
   * @see #getStmt()
   * @generated
   */
  void setStmt(Statement value);

} // LabeledStatement