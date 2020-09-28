/**
 * generated by Xtext 2.22.0
 */
package com.minres.coredsl.coreDsl.impl;

import com.minres.coredsl.coreDsl.BoolConstant;
import com.minres.coredsl.coreDsl.CoreDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bool Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.minres.coredsl.coreDsl.impl.BoolConstantImpl#isVal <em>Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoolConstantImpl extends ConstantImpl implements BoolConstant
{
  /**
   * The default value of the '{@link #isVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVal()
   * @generated
   * @ordered
   */
  protected static final boolean VAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVal()
   * @generated
   * @ordered
   */
  protected boolean val = VAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BoolConstantImpl()
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
    return CoreDslPackage.Literals.BOOL_CONSTANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVal(boolean newVal)
  {
    boolean oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoreDslPackage.BOOL_CONSTANT__VAL, oldVal, val));
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
      case CoreDslPackage.BOOL_CONSTANT__VAL:
        return isVal();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CoreDslPackage.BOOL_CONSTANT__VAL:
        setVal((Boolean)newValue);
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
      case CoreDslPackage.BOOL_CONSTANT__VAL:
        setVal(VAL_EDEFAULT);
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
      case CoreDslPackage.BOOL_CONSTANT__VAL:
        return val != VAL_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (val: ");
    result.append(val);
    result.append(')');
    return result.toString();
  }

} //BoolConstantImpl