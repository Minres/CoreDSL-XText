/**
 * generated by Xtext 2.22.0
 */
package com.minres.coredsl.coreDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encoding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.minres.coredsl.coreDsl.Encoding#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see com.minres.coredsl.coreDsl.CoreDslPackage#getEncoding()
 * @model
 * @generated
 */
public interface Encoding extends EObject
{
  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link com.minres.coredsl.coreDsl.Field}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see com.minres.coredsl.coreDsl.CoreDslPackage#getEncoding_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // Encoding