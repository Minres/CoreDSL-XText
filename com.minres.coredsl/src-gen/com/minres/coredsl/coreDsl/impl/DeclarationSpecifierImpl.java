/**
 * generated by Xtext 2.22.0
 */
package com.minres.coredsl.coreDsl.impl;

import com.minres.coredsl.coreDsl.CoreDslPackage;
import com.minres.coredsl.coreDsl.DeclarationSpecifier;
import com.minres.coredsl.coreDsl.StorageClassSpecifier;
import com.minres.coredsl.coreDsl.TypeQualifier;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration Specifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.minres.coredsl.coreDsl.impl.DeclarationSpecifierImpl#getStorage <em>Storage</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.impl.DeclarationSpecifierImpl#getQualifiers <em>Qualifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarationSpecifierImpl extends AttributeListImpl implements DeclarationSpecifier
{
  /**
   * The cached value of the '{@link #getStorage() <em>Storage</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStorage()
   * @generated
   * @ordered
   */
  protected EList<StorageClassSpecifier> storage;

  /**
   * The cached value of the '{@link #getQualifiers() <em>Qualifiers</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiers()
   * @generated
   * @ordered
   */
  protected EList<TypeQualifier> qualifiers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarationSpecifierImpl()
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
    return CoreDslPackage.Literals.DECLARATION_SPECIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<StorageClassSpecifier> getStorage()
  {
    if (storage == null)
    {
      storage = new EDataTypeEList<StorageClassSpecifier>(StorageClassSpecifier.class, this, CoreDslPackage.DECLARATION_SPECIFIER__STORAGE);
    }
    return storage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<TypeQualifier> getQualifiers()
  {
    if (qualifiers == null)
    {
      qualifiers = new EDataTypeEList<TypeQualifier>(TypeQualifier.class, this, CoreDslPackage.DECLARATION_SPECIFIER__QUALIFIERS);
    }
    return qualifiers;
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
      case CoreDslPackage.DECLARATION_SPECIFIER__STORAGE:
        return getStorage();
      case CoreDslPackage.DECLARATION_SPECIFIER__QUALIFIERS:
        return getQualifiers();
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
      case CoreDslPackage.DECLARATION_SPECIFIER__STORAGE:
        getStorage().clear();
        getStorage().addAll((Collection<? extends StorageClassSpecifier>)newValue);
        return;
      case CoreDslPackage.DECLARATION_SPECIFIER__QUALIFIERS:
        getQualifiers().clear();
        getQualifiers().addAll((Collection<? extends TypeQualifier>)newValue);
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
      case CoreDslPackage.DECLARATION_SPECIFIER__STORAGE:
        getStorage().clear();
        return;
      case CoreDslPackage.DECLARATION_SPECIFIER__QUALIFIERS:
        getQualifiers().clear();
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
      case CoreDslPackage.DECLARATION_SPECIFIER__STORAGE:
        return storage != null && !storage.isEmpty();
      case CoreDslPackage.DECLARATION_SPECIFIER__QUALIFIERS:
        return qualifiers != null && !qualifiers.isEmpty();
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
    result.append(" (storage: ");
    result.append(storage);
    result.append(", qualifiers: ");
    result.append(qualifiers);
    result.append(')');
    return result.toString();
  }

} //DeclarationSpecifierImpl