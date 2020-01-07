/**
 */
package xturtle.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import xturtle.Base;
import xturtle.Blank;
import xturtle.BlankCollection;
import xturtle.BlankObjects;
import xturtle.BooleanLiteral;
import xturtle.Directive;
import xturtle.DirectiveBlock;
import xturtle.Directives;
import xturtle.Literal;
import xturtle.NumberLiteral;
import xturtle.Predicate;
import xturtle.PredicateObjectList;
import xturtle.PrefixId;
import xturtle.QNameDef;
import xturtle.QNameRef;
import xturtle.Resource;
import xturtle.ResourceRef;
import xturtle.StringLiteral;
import xturtle.Subject;
import xturtle.Triples;
import xturtle.TypePredicate;
import xturtle.UriDef;
import xturtle.UriRef;
import xturtle.XturtlePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see xturtle.XturtlePackage
 * @generated
 */
public class XturtleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XturtlePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XturtleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XturtlePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XturtleSwitch<Adapter> modelSwitch =
		new XturtleSwitch<Adapter>() {
			@Override
			public Adapter caseDirectiveBlock(DirectiveBlock object) {
				return createDirectiveBlockAdapter();
			}
			@Override
			public Adapter caseDirectives(Directives object) {
				return createDirectivesAdapter();
			}
			@Override
			public Adapter caseDirective(Directive object) {
				return createDirectiveAdapter();
			}
			@Override
			public Adapter casePrefixId(PrefixId object) {
				return createPrefixIdAdapter();
			}
			@Override
			public Adapter caseBase(Base object) {
				return createBaseAdapter();
			}
			@Override
			public Adapter caseTriples(Triples object) {
				return createTriplesAdapter();
			}
			@Override
			public Adapter casePredicateObjectList(PredicateObjectList object) {
				return createPredicateObjectListAdapter();
			}
			@Override
			public Adapter caseSubject(Subject object) {
				return createSubjectAdapter();
			}
			@Override
			public Adapter caseObject(xturtle.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter casePredicate(Predicate object) {
				return createPredicateAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseResourceRef(ResourceRef object) {
				return createResourceRefAdapter();
			}
			@Override
			public Adapter caseBlank(Blank object) {
				return createBlankAdapter();
			}
			@Override
			public Adapter caseBlankObjects(BlankObjects object) {
				return createBlankObjectsAdapter();
			}
			@Override
			public Adapter caseBlankCollection(BlankCollection object) {
				return createBlankCollectionAdapter();
			}
			@Override
			public Adapter caseQNameDef(QNameDef object) {
				return createQNameDefAdapter();
			}
			@Override
			public Adapter caseQNameRef(QNameRef object) {
				return createQNameRefAdapter();
			}
			@Override
			public Adapter caseUriDef(UriDef object) {
				return createUriDefAdapter();
			}
			@Override
			public Adapter caseUriRef(UriRef object) {
				return createUriRefAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseNumberLiteral(NumberLiteral object) {
				return createNumberLiteralAdapter();
			}
			@Override
			public Adapter caseStringLiteral(StringLiteral object) {
				return createStringLiteralAdapter();
			}
			@Override
			public Adapter caseBooleanLiteral(BooleanLiteral object) {
				return createBooleanLiteralAdapter();
			}
			@Override
			public Adapter caseTypePredicate(TypePredicate object) {
				return createTypePredicateAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link xturtle.DirectiveBlock <em>Directive Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.DirectiveBlock
	 * @generated
	 */
	public Adapter createDirectiveBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.Directives <em>Directives</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.Directives
	 * @generated
	 */
	public Adapter createDirectivesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.Directive <em>Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.Directive
	 * @generated
	 */
	public Adapter createDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.PrefixId <em>Prefix Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.PrefixId
	 * @generated
	 */
	public Adapter createPrefixIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.Base <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.Base
	 * @generated
	 */
	public Adapter createBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.Triples <em>Triples</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.Triples
	 * @generated
	 */
	public Adapter createTriplesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.PredicateObjectList <em>Predicate Object List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.PredicateObjectList
	 * @generated
	 */
	public Adapter createPredicateObjectListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.Subject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.Subject
	 * @generated
	 */
	public Adapter createSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.Predicate
	 * @generated
	 */
	public Adapter createPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.ResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.ResourceRef
	 * @generated
	 */
	public Adapter createResourceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.Blank <em>Blank</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.Blank
	 * @generated
	 */
	public Adapter createBlankAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.BlankObjects <em>Blank Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.BlankObjects
	 * @generated
	 */
	public Adapter createBlankObjectsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.BlankCollection <em>Blank Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.BlankCollection
	 * @generated
	 */
	public Adapter createBlankCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.QNameDef <em>QName Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.QNameDef
	 * @generated
	 */
	public Adapter createQNameDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.QNameRef <em>QName Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.QNameRef
	 * @generated
	 */
	public Adapter createQNameRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.UriDef <em>Uri Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.UriDef
	 * @generated
	 */
	public Adapter createUriDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.UriRef <em>Uri Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.UriRef
	 * @generated
	 */
	public Adapter createUriRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.NumberLiteral <em>Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.NumberLiteral
	 * @generated
	 */
	public Adapter createNumberLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.StringLiteral
	 * @generated
	 */
	public Adapter createStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.BooleanLiteral
	 * @generated
	 */
	public Adapter createBooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xturtle.TypePredicate <em>Type Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xturtle.TypePredicate
	 * @generated
	 */
	public Adapter createTypePredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XturtleAdapterFactory
