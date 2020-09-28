/**
 * generated by Xtext 2.22.0
 */
package com.minres.coredsl.coreDsl.impl;

import com.minres.coredsl.coreDsl.CoreDslPackage;
import com.minres.coredsl.coreDsl.Enumerator;
import com.minres.coredsl.coreDsl.EnumeratorList;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumerator List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.minres.coredsl.coreDsl.impl.EnumeratorListImpl#getEnumerators <em>Enumerators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumeratorListImpl extends MinimalEObjectImpl.Container implements EnumeratorList
{
  /**
   * The cached value of the '{@link #getEnumerators() <em>Enumerators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumerators()
   * @generated
   * @ordered
   */
  protected EList<Enumerator> enumerators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumeratorListImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CoreDslPackage.Literals.ENUMERATOR_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Enumerator> getEnumerators()
  {
    if (enumerators == null)
    {
      enumerators = new EObjectContainmentEList<Enumerator>(Enumerator.class, this, CoreDslPackage.ENUMERATOR_LIST__ENUMERATORS);
    }
    return enumerators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CoreDslPackage.ENUMERATOR_LIST__ENUMERATORS:
        return ((InternalEList<?>)getEnumerators()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CoreDslPackage.ENUMERATOR_LIST__ENUMERATORS:
        return getEnumerators();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CoreDslPackage.ENUMERATOR_LIST__ENUMERATORS:
        getEnumerators().clear();
        getEnumerators().addAll((Collection<? extends Enumerator>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CoreDslPackage.ENUMERATOR_LIST__ENUMERATORS:
        getEnumerators().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CoreDslPackage.ENUMERATOR_LIST__ENUMERATORS:
        return enumerators != null && !enumerators.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EnumeratorListImpl