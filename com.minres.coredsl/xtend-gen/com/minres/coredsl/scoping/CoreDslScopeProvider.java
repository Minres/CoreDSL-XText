/**
 * generated by Xtext 2.10.0
 */
package com.minres.coredsl.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.minres.coredsl.coreDsl.CoreDef;
import com.minres.coredsl.coreDsl.DirectDeclarator;
import com.minres.coredsl.coreDsl.ISA;
import com.minres.coredsl.coreDsl.InstructionSet;
import com.minres.coredsl.coreDsl.TypedefDeclaration;
import com.minres.coredsl.coreDsl.VariableRef;
import com.minres.coredsl.scoping.AbstractCoreDslScopeProvider;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class CoreDslScopeProvider extends AbstractCoreDslScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    String _name = reference.getEReferenceType().getName();
    boolean _equals = Objects.equal(_name, "VariableRef");
    if (_equals) {
      ISA _parentOfType = this.<ISA>parentOfType(context, ISA.class);
      final ISA isa = ((ISA) _parentOfType);
      return Scopes.scopeFor(this.<VariableRef>allOfType(isa, VariableRef.class));
    } else {
      String _name_1 = reference.getEReferenceType().getName();
      boolean _equals_1 = Objects.equal(_name_1, "TypedefDeclaration");
      if (_equals_1) {
        ISA _parentOfType_1 = this.<ISA>parentOfType(context, ISA.class);
        final ISA isa_1 = ((ISA) _parentOfType_1);
        final Iterable<TypedefDeclaration> res = this.<TypedefDeclaration>allOfType(isa_1, TypedefDeclaration.class);
        return Scopes.scopeFor(res);
      } else {
        String _name_2 = reference.getEReferenceType().getName();
        boolean _equals_2 = Objects.equal(_name_2, "DirectDeclarator");
        if (_equals_2) {
          ISA _parentOfType_2 = this.<ISA>parentOfType(context, ISA.class);
          final ISA isa_2 = ((ISA) _parentOfType_2);
          return Scopes.scopeFor(this.<DirectDeclarator>allOfType(isa_2, DirectDeclarator.class));
        } else {
          Class<? extends EObject> _class = context.getClass();
          String _plus = ("Unmatched: context " + _class);
          String _plus_1 = (_plus + " in ");
          EObject _eContainer = context.eContainer();
          String _plus_2 = (_plus_1 + _eContainer);
          String _plus_3 = (_plus_2 + ", reference ");
          String _name_3 = reference.getEReferenceType().getName();
          String _plus_4 = (_plus_3 + _name_3);
          InputOutput.<String>println(_plus_4);
          return super.getScope(context, reference);
        }
      }
    }
  }
  
  public <T extends EObject> T parentOfType(final EObject obj, final Class<T> clazz) {
    EObject _eContainer = obj.eContainer();
    boolean _tripleEquals = (_eContainer == null);
    if (_tripleEquals) {
      return null;
    }
    boolean _isInstance = clazz.isInstance(obj.eContainer());
    if (_isInstance) {
      EObject _eContainer_1 = obj.eContainer();
      return ((T) _eContainer_1);
    }
    return this.<T>parentOfType(obj.eContainer(), clazz);
  }
  
  public <T extends EObject> T childOfparentOfType(final EObject obj, final Class<T> clazz) {
    EObject _eContainer = obj.eContainer();
    boolean _tripleEquals = (_eContainer == null);
    if (_tripleEquals) {
      return null;
    }
    boolean _isInstance = clazz.isInstance(obj.eContainer());
    if (_isInstance) {
      return ((T) obj);
    }
    return this.<T>childOfparentOfType(obj.eContainer(), clazz);
  }
  
  public <T extends EObject> Iterable<T> allOfType(final ISA isa, final Class<T> clazz) {
    boolean _eIsProxy = isa.eIsProxy();
    if (_eIsProxy) {
      EcoreUtil2.resolveAll(isa);
    }
    boolean _matched = false;
    if (isa instanceof CoreDef) {
      _matched=true;
      EList<InstructionSet> _contributingType = ((CoreDef)isa).getContributingType();
      boolean _tripleEquals = (_contributingType == null);
      if (_tripleEquals) {
        return EcoreUtil2.<T>getAllContentsOfType(isa, clazz);
      } else {
        List<T> _allContentsOfType = EcoreUtil2.<T>getAllContentsOfType(isa, clazz);
        final Function1<InstructionSet, Iterable<T>> _function = (InstructionSet it) -> {
          return this.<T>allOfType(it, clazz);
        };
        Iterable<T> _flatten = Iterables.<T>concat(ListExtensions.<InstructionSet, Iterable<T>>map(((CoreDef)isa).getContributingType(), _function));
        return Iterables.<T>concat(_allContentsOfType, _flatten);
      }
    }
    if (!_matched) {
      if (isa instanceof InstructionSet) {
        _matched=true;
        InstructionSet _superType = ((InstructionSet)isa).getSuperType();
        boolean _tripleEquals = (_superType == null);
        if (_tripleEquals) {
          return EcoreUtil2.<T>getAllContentsOfType(isa, clazz);
        } else {
          List<T> _allContentsOfType = EcoreUtil2.<T>getAllContentsOfType(isa, clazz);
          Iterable<T> _allOfType = this.<T>allOfType(((InstructionSet)isa).getSuperType(), clazz);
          return Iterables.<T>concat(_allContentsOfType, _allOfType);
        }
      }
    }
    return null;
  }
}