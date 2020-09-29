/**
 * generated by Xtext 2.22.0
 */
package com.minres.coredsl.coreDsl.impl;

import com.minres.coredsl.coreDsl.Attribute;
import com.minres.coredsl.coreDsl.AttributeList;
import com.minres.coredsl.coreDsl.BitSizeSpecifier;
import com.minres.coredsl.coreDsl.CoreDslPackage;
import com.minres.coredsl.coreDsl.DeclarationSpecifier;
import com.minres.coredsl.coreDsl.InitDeclarator;
import com.minres.coredsl.coreDsl.StorageClassSpecifier;
import com.minres.coredsl.coreDsl.TypeOrVarDeclaration;
import com.minres.coredsl.coreDsl.TypeQualifier;
import com.minres.coredsl.coreDsl.TypeSpecifier;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Or Var Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.minres.coredsl.coreDsl.impl.TypeOrVarDeclarationImpl#getAttrs <em>Attrs</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.impl.TypeOrVarDeclarationImpl#getStorage <em>Storage</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.impl.TypeOrVarDeclarationImpl#getQualifiers <em>Qualifiers</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.impl.TypeOrVarDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.impl.TypeOrVarDeclarationImpl#getSize <em>Size</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.impl.TypeOrVarDeclarationImpl#isIs_ptr <em>Is ptr</em>}</li>
 *   <li>{@link com.minres.coredsl.coreDsl.impl.TypeOrVarDeclarationImpl#getInit <em>Init</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeOrVarDeclarationImpl extends DeclarationImpl implements TypeOrVarDeclaration
{
  /**
   * The cached value of the '{@link #getAttrs() <em>Attrs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrs()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attrs;

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
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TypeSpecifier type;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected BitSizeSpecifier size;

  /**
   * The default value of the '{@link #isIs_ptr() <em>Is ptr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIs_ptr()
   * @generated
   * @ordered
   */
  protected static final boolean IS_PTR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIs_ptr() <em>Is ptr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIs_ptr()
   * @generated
   * @ordered
   */
  protected boolean is_ptr = IS_PTR_EDEFAULT;

  /**
   * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected EList<InitDeclarator> init;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeOrVarDeclarationImpl()
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
    return CoreDslPackage.Literals.TYPE_OR_VAR_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Attribute> getAttrs()
  {
    if (attrs == null)
    {
      attrs = new EObjectContainmentEList<Attribute>(Attribute.class, this, CoreDslPackage.TYPE_OR_VAR_DECLARATION__ATTRS);
    }
    return attrs;
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
      storage = new EDataTypeEList<StorageClassSpecifier>(StorageClassSpecifier.class, this, CoreDslPackage.TYPE_OR_VAR_DECLARATION__STORAGE);
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
      qualifiers = new EDataTypeEList<TypeQualifier>(TypeQualifier.class, this, CoreDslPackage.TYPE_OR_VAR_DECLARATION__QUALIFIERS);
    }
    return qualifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeSpecifier getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(TypeSpecifier newType, NotificationChain msgs)
  {
    TypeSpecifier oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoreDslPackage.TYPE_OR_VAR_DECLARATION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(TypeSpecifier newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoreDslPackage.TYPE_OR_VAR_DECLARATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoreDslPackage.TYPE_OR_VAR_DECLARATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoreDslPackage.TYPE_OR_VAR_DECLARATION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BitSizeSpecifier getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSize(BitSizeSpecifier newSize, NotificationChain msgs)
  {
    BitSizeSpecifier oldSize = size;
    size = newSize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoreDslPackage.TYPE_OR_VAR_DECLARATION__SIZE, oldSize, newSize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSize(BitSizeSpecifier newSize)
  {
    if (newSize != size)
    {
      NotificationChain msgs = null;
      if (size != null)
        msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoreDslPackage.TYPE_OR_VAR_DECLARATION__SIZE, null, msgs);
      if (newSize != null)
        msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoreDslPackage.TYPE_OR_VAR_DECLARATION__SIZE, null, msgs);
      msgs = basicSetSize(newSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoreDslPackage.TYPE_OR_VAR_DECLARATION__SIZE, newSize, newSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isIs_ptr()
  {
    return is_ptr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIs_ptr(boolean newIs_ptr)
  {
    boolean oldIs_ptr = is_ptr;
    is_ptr = newIs_ptr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoreDslPackage.TYPE_OR_VAR_DECLARATION__IS_PTR, oldIs_ptr, is_ptr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<InitDeclarator> getInit()
  {
    if (init == null)
    {
      init = new EObjectContainmentEList<InitDeclarator>(InitDeclarator.class, this, CoreDslPackage.TYPE_OR_VAR_DECLARATION__INIT);
    }
    return init;
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
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__ATTRS:
        return ((InternalEList<?>)getAttrs()).basicRemove(otherEnd, msgs);
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__TYPE:
        return basicSetType(null, msgs);
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__SIZE:
        return basicSetSize(null, msgs);
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__INIT:
        return ((InternalEList<?>)getInit()).basicRemove(otherEnd, msgs);
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
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__ATTRS:
        return getAttrs();
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__STORAGE:
        return getStorage();
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__QUALIFIERS:
        return getQualifiers();
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__TYPE:
        return getType();
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__SIZE:
        return getSize();
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__IS_PTR:
        return isIs_ptr();
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__INIT:
        return getInit();
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
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__ATTRS:
        getAttrs().clear();
        getAttrs().addAll((Collection<? extends Attribute>)newValue);
        return;
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__STORAGE:
        getStorage().clear();
        getStorage().addAll((Collection<? extends StorageClassSpecifier>)newValue);
        return;
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__QUALIFIERS:
        getQualifiers().clear();
        getQualifiers().addAll((Collection<? extends TypeQualifier>)newValue);
        return;
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__TYPE:
        setType((TypeSpecifier)newValue);
        return;
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__SIZE:
        setSize((BitSizeSpecifier)newValue);
        return;
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__IS_PTR:
        setIs_ptr((Boolean)newValue);
        return;
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__INIT:
        getInit().clear();
        getInit().addAll((Collection<? extends InitDeclarator>)newValue);
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
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__ATTRS:
        getAttrs().clear();
        return;
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__STORAGE:
        getStorage().clear();
        return;
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__QUALIFIERS:
        getQualifiers().clear();
        return;
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__TYPE:
        setType((TypeSpecifier)null);
        return;
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__SIZE:
        setSize((BitSizeSpecifier)null);
        return;
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__IS_PTR:
        setIs_ptr(IS_PTR_EDEFAULT);
        return;
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__INIT:
        getInit().clear();
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
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__ATTRS:
        return attrs != null && !attrs.isEmpty();
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__STORAGE:
        return storage != null && !storage.isEmpty();
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__QUALIFIERS:
        return qualifiers != null && !qualifiers.isEmpty();
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__TYPE:
        return type != null;
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__SIZE:
        return size != null;
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__IS_PTR:
        return is_ptr != IS_PTR_EDEFAULT;
      case CoreDslPackage.TYPE_OR_VAR_DECLARATION__INIT:
        return init != null && !init.isEmpty();
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
    if (baseClass == AttributeList.class)
    {
      switch (derivedFeatureID)
      {
        case CoreDslPackage.TYPE_OR_VAR_DECLARATION__ATTRS: return CoreDslPackage.ATTRIBUTE_LIST__ATTRS;
        default: return -1;
      }
    }
    if (baseClass == DeclarationSpecifier.class)
    {
      switch (derivedFeatureID)
      {
        case CoreDslPackage.TYPE_OR_VAR_DECLARATION__STORAGE: return CoreDslPackage.DECLARATION_SPECIFIER__STORAGE;
        case CoreDslPackage.TYPE_OR_VAR_DECLARATION__QUALIFIERS: return CoreDslPackage.DECLARATION_SPECIFIER__QUALIFIERS;
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
    if (baseClass == AttributeList.class)
    {
      switch (baseFeatureID)
      {
        case CoreDslPackage.ATTRIBUTE_LIST__ATTRS: return CoreDslPackage.TYPE_OR_VAR_DECLARATION__ATTRS;
        default: return -1;
      }
    }
    if (baseClass == DeclarationSpecifier.class)
    {
      switch (baseFeatureID)
      {
        case CoreDslPackage.DECLARATION_SPECIFIER__STORAGE: return CoreDslPackage.TYPE_OR_VAR_DECLARATION__STORAGE;
        case CoreDslPackage.DECLARATION_SPECIFIER__QUALIFIERS: return CoreDslPackage.TYPE_OR_VAR_DECLARATION__QUALIFIERS;
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
    result.append(" (storage: ");
    result.append(storage);
    result.append(", qualifiers: ");
    result.append(qualifiers);
    result.append(", is_ptr: ");
    result.append(is_ptr);
    result.append(')');
    return result.toString();
  }

} //TypeOrVarDeclarationImpl
