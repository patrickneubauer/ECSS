/**
 */
package xturtle.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import xturtle.XturtleFactory;
import xturtle.XturtlePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XturtleFactoryImpl extends EFactoryImpl implements XturtleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XturtleFactory init() {
		try {
			XturtleFactory theXturtleFactory = (XturtleFactory)EPackage.Registry.INSTANCE.getEFactory(XturtlePackage.eNS_URI);
			if (theXturtleFactory != null) {
				return theXturtleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XturtleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XturtleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XturtlePackage.DIRECTIVE_BLOCK: return createDirectiveBlock();
			case XturtlePackage.DIRECTIVES: return createDirectives();
			case XturtlePackage.DIRECTIVE: return createDirective();
			case XturtlePackage.PREFIX_ID: return createPrefixId();
			case XturtlePackage.BASE: return createBase();
			case XturtlePackage.TRIPLES: return createTriples();
			case XturtlePackage.PREDICATE_OBJECT_LIST: return createPredicateObjectList();
			case XturtlePackage.SUBJECT: return createSubject();
			case XturtlePackage.OBJECT: return createObject();
			case XturtlePackage.PREDICATE: return createPredicate();
			case XturtlePackage.RESOURCE: return createResource();
			case XturtlePackage.RESOURCE_REF: return createResourceRef();
			case XturtlePackage.BLANK: return createBlank();
			case XturtlePackage.BLANK_OBJECTS: return createBlankObjects();
			case XturtlePackage.BLANK_COLLECTION: return createBlankCollection();
			case XturtlePackage.QNAME_DEF: return createQNameDef();
			case XturtlePackage.QNAME_REF: return createQNameRef();
			case XturtlePackage.URI_DEF: return createUriDef();
			case XturtlePackage.URI_REF: return createUriRef();
			case XturtlePackage.LITERAL: return createLiteral();
			case XturtlePackage.NUMBER_LITERAL: return createNumberLiteral();
			case XturtlePackage.STRING_LITERAL: return createStringLiteral();
			case XturtlePackage.BOOLEAN_LITERAL: return createBooleanLiteral();
			case XturtlePackage.TYPE_PREDICATE: return createTypePredicate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectiveBlock createDirectiveBlock() {
		DirectiveBlockImpl directiveBlock = new DirectiveBlockImpl();
		return directiveBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Directives createDirectives() {
		DirectivesImpl directives = new DirectivesImpl();
		return directives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Directive createDirective() {
		DirectiveImpl directive = new DirectiveImpl();
		return directive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrefixId createPrefixId() {
		PrefixIdImpl prefixId = new PrefixIdImpl();
		return prefixId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base createBase() {
		BaseImpl base = new BaseImpl();
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Triples createTriples() {
		TriplesImpl triples = new TriplesImpl();
		return triples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredicateObjectList createPredicateObjectList() {
		PredicateObjectListImpl predicateObjectList = new PredicateObjectListImpl();
		return predicateObjectList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subject createSubject() {
		SubjectImpl subject = new SubjectImpl();
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public xturtle.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate createPredicate() {
		PredicateImpl predicate = new PredicateImpl();
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceRef createResourceRef() {
		ResourceRefImpl resourceRef = new ResourceRefImpl();
		return resourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Blank createBlank() {
		BlankImpl blank = new BlankImpl();
		return blank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlankObjects createBlankObjects() {
		BlankObjectsImpl blankObjects = new BlankObjectsImpl();
		return blankObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlankCollection createBlankCollection() {
		BlankCollectionImpl blankCollection = new BlankCollectionImpl();
		return blankCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QNameDef createQNameDef() {
		QNameDefImpl qNameDef = new QNameDefImpl();
		return qNameDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QNameRef createQNameRef() {
		QNameRefImpl qNameRef = new QNameRefImpl();
		return qNameRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UriDef createUriDef() {
		UriDefImpl uriDef = new UriDefImpl();
		return uriDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UriRef createUriRef() {
		UriRefImpl uriRef = new UriRefImpl();
		return uriRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberLiteral createNumberLiteral() {
		NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
		return numberLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypePredicate createTypePredicate() {
		TypePredicateImpl typePredicate = new TypePredicateImpl();
		return typePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XturtlePackage getXturtlePackage() {
		return (XturtlePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XturtlePackage getPackage() {
		return XturtlePackage.eINSTANCE;
	}

} //XturtleFactoryImpl
