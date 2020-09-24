/**
 * generated by Xtext 2.22.0
 */
package com.minres.coredsl.coreDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.minres.coredsl.coreDsl.ConditionalStmt#getCond <em>Cond</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.ConditionalStmt#getThenStmts <em>Then Stmts</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.ConditionalStmt#getElseStmts <em>Else Stmts</em>}</li>
 * </ul>
 *
 * @see com.minres.coredsl.coreDsl.CoreDslPackage#getConditionalStmt()
 * @model
 * @generated
 */
public interface ConditionalStmt extends Statement
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(Expression)
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getConditionalStmt_Cond()
   * @model containment="true"
   * @generated
   */
  Expression getCond();

  /**
   * Sets the value of the '{@link com.minres.coredsl.coreDsl.ConditionalStmt#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(Expression value);

  /**
   * Returns the value of the '<em><b>Then Stmts</b></em>' containment reference list.
   * The list contents are of type {@link com.minres.coredsl.coreDsl.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Stmts</em>' containment reference list.
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getConditionalStmt_ThenStmts()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getThenStmts();

  /**
   * Returns the value of the '<em><b>Else Stmts</b></em>' containment reference list.
   * The list contents are of type {@link com.minres.coredsl.coreDsl.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Stmts</em>' containment reference list.
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getConditionalStmt_ElseStmts()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getElseStmts();

} // ConditionalStmt