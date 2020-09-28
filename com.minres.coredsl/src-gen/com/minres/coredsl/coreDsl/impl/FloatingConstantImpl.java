/**
 * generated by Xtext 2.22.0
 */
package com.minres.coredsl.coreDsl.impl;

import com.minres.coredsl.coreDsl.CoreDslPackage;
import com.minres.coredsl.coreDsl.FloatingConstant;
import com.minres.coredsl.coreDsl.FloatingSuffix;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Floating Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.minres.coredsl.coreDsl.impl.FloatingConstantImpl#isF <em>F</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.impl.FloatingConstantImpl#isL <em>L</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.impl.FloatingConstantImpl#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FloatingConstantImpl extends ConstantImpl implements FloatingConstant
{
  /**
   * The default value of the '{@link #isF() <em>F</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isF()
   * @generated
   * @ordered
   */
  protected static final boolean F_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isF() <em>F</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isF()
   * @generated
   * @ordered
   */
  protected boolean f = F_EDEFAULT;

  /**
   * The default value of the '{@link #isL() <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isL()
   * @generated
   * @ordered
   */
  protected static final boolean L_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isL() <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isL()
   * @generated
   * @ordered
   */
  protected boolean l = L_EDEFAULT;

  /**
   * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected static final BigDecimal VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected BigDecimal val = VAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FloatingConstantImpl()
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
    return CoreDslPackage.Literals.FLOATING_CONSTANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isF()
  {
    return f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setF(boolean newF)
  {
    boolean oldF = f;
    f = newF;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoreDslPackage.FLOATING_CONSTANT__F, oldF, f));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isL()
  {
    return l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setL(boolean newL)
  {
    boolean oldL = l;
    l = newL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoreDslPackage.FLOATING_CONSTANT__L, oldL, l));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVal(BigDecimal newVal)
  {
    BigDecimal oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoreDslPackage.FLOATING_CONSTANT__VAL, oldVal, val));
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
      case CoreDslPackage.FLOATING_CONSTANT__F:
        return isF();
      case CoreDslPackage.FLOATING_CONSTANT__L:
        return isL();
      case CoreDslPackage.FLOATING_CONSTANT__VAL:
        return getVal();
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
      case CoreDslPackage.FLOATING_CONSTANT__F:
        setF((Boolean)newValue);
        return;
      case CoreDslPackage.FLOATING_CONSTANT__L:
        setL((Boolean)newValue);
        return;
      case CoreDslPackage.FLOATING_CONSTANT__VAL:
        setVal((BigDecimal)newValue);
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
      case CoreDslPackage.FLOATING_CONSTANT__F:
        setF(F_EDEFAULT);
        return;
      case CoreDslPackage.FLOATING_CONSTANT__L:
        setL(L_EDEFAULT);
        return;
      case CoreDslPackage.FLOATING_CONSTANT__VAL:
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
      case CoreDslPackage.FLOATING_CONSTANT__F:
        return f != F_EDEFAULT;
      case CoreDslPackage.FLOATING_CONSTANT__L:
        return l != L_EDEFAULT;
      case CoreDslPackage.FLOATING_CONSTANT__VAL:
        return VAL_EDEFAULT == null ? val != null : !VAL_EDEFAULT.equals(val);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == FloatingSuffix.class)
    {
      switch (derivedFeatureID)
      {
        case CoreDslPackage.FLOATING_CONSTANT__F: return CoreDslPackage.FLOATING_SUFFIX__F;
        case CoreDslPackage.FLOATING_CONSTANT__L: return CoreDslPackage.FLOATING_SUFFIX__L;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == FloatingSuffix.class)
    {
      switch (baseFeatureID)
      {
        case CoreDslPackage.FLOATING_SUFFIX__F: return CoreDslPackage.FLOATING_CONSTANT__F;
        case CoreDslPackage.FLOATING_SUFFIX__L: return CoreDslPackage.FLOATING_CONSTANT__L;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (f: ");
    result.append(f);
    result.append(", l: ");
    result.append(l);
    result.append(", val: ");
    result.append(val);
    result.append(')');
    return result.toString();
  }

} //FloatingConstantImpl