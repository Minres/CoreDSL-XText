/**
 * generated by Xtext 2.22.0
 */
package com.minres.coredsl.coreDsl.impl;

import com.minres.coredsl.coreDsl.ConstantDef;
import com.minres.coredsl.coreDsl.CoreDef;
import com.minres.coredsl.coreDsl.CoreDslPackage;
import com.minres.coredsl.coreDsl.InstructionSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.minres.coredsl.coreDsl.impl.CoreDefImpl#getContributingType <em>Contributing Type</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.impl.CoreDefImpl#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.impl.CoreDefImpl#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoreDefImpl extends ISAImpl implements CoreDef
{
  /**
   * The cached value of the '{@link #getContributingType() <em>Contributing Type</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContributingType()
   * @generated
   * @ordered
   */
  protected EList<InstructionSet> contributingType;

  /**
   * The default value of the '{@link #getTemplateName() <em>Template Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplateName()
   * @generated
   * @ordered
   */
  protected static final String TEMPLATE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTemplateName() <em>Template Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplateName()
   * @generated
   * @ordered
   */
  protected String templateName = TEMPLATE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstants()
   * @generated
   * @ordered
   */
  protected EList<ConstantDef> constants;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CoreDefImpl()
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
    return CoreDslPackage.Literals.CORE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<InstructionSet> getContributingType()
  {
    if (contributingType == null)
    {
      contributingType = new EObjectResolvingEList<InstructionSet>(InstructionSet.class, this, CoreDslPackage.CORE_DEF__CONTRIBUTING_TYPE);
    }
    return contributingType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTemplateName()
  {
    return templateName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTemplateName(String newTemplateName)
  {
    String oldTemplateName = templateName;
    templateName = newTemplateName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoreDslPackage.CORE_DEF__TEMPLATE_NAME, oldTemplateName, templateName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ConstantDef> getConstants()
  {
    if (constants == null)
    {
      constants = new EObjectContainmentEList<ConstantDef>(ConstantDef.class, this, CoreDslPackage.CORE_DEF__CONSTANTS);
    }
    return constants;
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
      case CoreDslPackage.CORE_DEF__CONSTANTS:
        return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
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
      case CoreDslPackage.CORE_DEF__CONTRIBUTING_TYPE:
        return getContributingType();
      case CoreDslPackage.CORE_DEF__TEMPLATE_NAME:
        return getTemplateName();
      case CoreDslPackage.CORE_DEF__CONSTANTS:
        return getConstants();
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
      case CoreDslPackage.CORE_DEF__CONTRIBUTING_TYPE:
        getContributingType().clear();
        getContributingType().addAll((Collection<? extends InstructionSet>)newValue);
        return;
      case CoreDslPackage.CORE_DEF__TEMPLATE_NAME:
        setTemplateName((String)newValue);
        return;
      case CoreDslPackage.CORE_DEF__CONSTANTS:
        getConstants().clear();
        getConstants().addAll((Collection<? extends ConstantDef>)newValue);
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
      case CoreDslPackage.CORE_DEF__CONTRIBUTING_TYPE:
        getContributingType().clear();
        return;
      case CoreDslPackage.CORE_DEF__TEMPLATE_NAME:
        setTemplateName(TEMPLATE_NAME_EDEFAULT);
        return;
      case CoreDslPackage.CORE_DEF__CONSTANTS:
        getConstants().clear();
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
      case CoreDslPackage.CORE_DEF__CONTRIBUTING_TYPE:
        return contributingType != null && !contributingType.isEmpty();
      case CoreDslPackage.CORE_DEF__TEMPLATE_NAME:
        return TEMPLATE_NAME_EDEFAULT == null ? templateName != null : !TEMPLATE_NAME_EDEFAULT.equals(templateName);
      case CoreDslPackage.CORE_DEF__CONSTANTS:
        return constants != null && !constants.isEmpty();
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
    result.append(" (templateName: ");
    result.append(templateName);
    result.append(')');
    return result.toString();
  }

} //CoreDefImpl
