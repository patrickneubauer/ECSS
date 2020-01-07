/**
 */
package wollokDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see wollokDsl.WollokDslFactory
 * @model kind="package"
 * @generated
 */
public interface WollokDslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wollokDsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.org.srclang/uqbar/project/wollok/WollokDsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wollokDsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WollokDslPackage eINSTANCE = wollokDsl.impl.WollokDslPackageImpl.init();

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WFileImpl <em>WFile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WFileImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWFile()
	 * @generated
	 */
	int WFILE = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFILE__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFILE__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFILE__MAIN = 2;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFILE__TESTS = 3;

	/**
	 * The feature id for the '<em><b>Suites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFILE__SUITES = 4;

	/**
	 * The number of structural features of the '<em>WFile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFILE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>WFile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.ImportImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WProgramImpl <em>WProgram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WProgramImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWProgram()
	 * @generated
	 */
	int WPROGRAM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPROGRAM__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>WProgram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPROGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>WProgram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WTestImpl <em>WTest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WTestImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWTest()
	 * @generated
	 */
	int WTEST = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTEST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTEST__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>WTest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>WTest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WMethodContainerImpl <em>WMethod Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WMethodContainerImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWMethodContainer()
	 * @generated
	 */
	int WMETHOD_CONTAINER = 9;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMETHOD_CONTAINER__MEMBERS = 0;

	/**
	 * The number of structural features of the '<em>WMethod Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMETHOD_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>WMethod Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMETHOD_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WSuiteImpl <em>WSuite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WSuiteImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWSuite()
	 * @generated
	 */
	int WSUITE = 4;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSUITE__MEMBERS = WMETHOD_CONTAINER__MEMBERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSUITE__NAME = WMETHOD_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fixture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSUITE__FIXTURE = WMETHOD_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSUITE__TESTS = WMETHOD_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>WSuite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSUITE_FEATURE_COUNT = WMETHOD_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>WSuite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSUITE_OPERATION_COUNT = WMETHOD_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WFixtureImpl <em>WFixture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WFixtureImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWFixture()
	 * @generated
	 */
	int WFIXTURE = 5;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFIXTURE__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>WFixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFIXTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>WFixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFIXTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WLibraryElementImpl <em>WLibrary Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WLibraryElementImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWLibraryElement()
	 * @generated
	 */
	int WLIBRARY_ELEMENT = 7;

	/**
	 * The number of structural features of the '<em>WLibrary Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WLIBRARY_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>WLibrary Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WLIBRARY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WPackageImpl <em>WPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WPackageImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWPackage()
	 * @generated
	 */
	int WPACKAGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPACKAGE__NAME = WLIBRARY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPACKAGE__ELEMENTS = WLIBRARY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>WPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPACKAGE_FEATURE_COUNT = WLIBRARY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>WPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPACKAGE_OPERATION_COUNT = WLIBRARY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WNamedImpl <em>WNamed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WNamedImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWNamed()
	 * @generated
	 */
	int WNAMED = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>WNamed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNAMED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>WNamed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNAMED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WReferenciableImpl <em>WReferenciable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WReferenciableImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWReferenciable()
	 * @generated
	 */
	int WREFERENCIABLE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WREFERENCIABLE__NAME = WNAMED__NAME;

	/**
	 * The number of structural features of the '<em>WReferenciable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WREFERENCIABLE_FEATURE_COUNT = WNAMED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WReferenciable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WREFERENCIABLE_OPERATION_COUNT = WNAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WExpressionImpl <em>WExpression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WExpressionImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWExpression()
	 * @generated
	 */
	int WEXPRESSION = 11;

	/**
	 * The number of structural features of the '<em>WExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEXPRESSION_FEATURE_COUNT = WLIBRARY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEXPRESSION_OPERATION_COUNT = WLIBRARY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WMethodDeclarationImpl <em>WMethod Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WMethodDeclarationImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWMethodDeclaration()
	 * @generated
	 */
	int WMETHOD_DECLARATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMETHOD_DECLARATION__NAME = WNAMED__NAME;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMETHOD_DECLARATION__OVERRIDES = WNAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMETHOD_DECLARATION__PARAMETERS = WNAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMETHOD_DECLARATION__NATIVE = WNAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMETHOD_DECLARATION__EXPRESSION = WNAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Expression Returns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMETHOD_DECLARATION__EXPRESSION_RETURNS = WNAMED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>WMethod Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMETHOD_DECLARATION_FEATURE_COUNT = WNAMED_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>WMethod Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMETHOD_DECLARATION_OPERATION_COUNT = WNAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WParameterImpl <em>WParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WParameterImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWParameter()
	 * @generated
	 */
	int WPARAMETER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPARAMETER__NAME = WREFERENCIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Var Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPARAMETER__VAR_ARG = WREFERENCIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPARAMETER_FEATURE_COUNT = WREFERENCIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>WParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPARAMETER_OPERATION_COUNT = WREFERENCIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WVariableImpl <em>WVariable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WVariableImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWVariable()
	 * @generated
	 */
	int WVARIABLE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVARIABLE__NAME = WREFERENCIABLE__NAME;

	/**
	 * The number of structural features of the '<em>WVariable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVARIABLE_FEATURE_COUNT = WREFERENCIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WVariable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVARIABLE_OPERATION_COUNT = WREFERENCIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WFeatureCallImpl <em>WFeature Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WFeatureCallImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWFeatureCall()
	 * @generated
	 */
	int WFEATURE_CALL = 15;

	/**
	 * The number of structural features of the '<em>WFeature Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFEATURE_CALL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>WFeature Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFEATURE_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WVariableReferenceImpl <em>WVariable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WVariableReferenceImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWVariableReference()
	 * @generated
	 */
	int WVARIABLE_REFERENCE = 16;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVARIABLE_REFERENCE__REF = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WVariable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVARIABLE_REFERENCE_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>WVariable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVARIABLE_REFERENCE_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WIfExpressionImpl <em>WIf Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WIfExpressionImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWIfExpression()
	 * @generated
	 */
	int WIF_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIF_EXPRESSION__CONDITION = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIF_EXPRESSION__THEN = WEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIF_EXPRESSION__ELSE = WEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>WIf Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIF_EXPRESSION_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>WIf Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIF_EXPRESSION_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WCollectionLiteralImpl <em>WCollection Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WCollectionLiteralImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWCollectionLiteral()
	 * @generated
	 */
	int WCOLLECTION_LITERAL = 18;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCOLLECTION_LITERAL__ELEMENTS = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WCollection Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCOLLECTION_LITERAL_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>WCollection Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCOLLECTION_LITERAL_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WListLiteralImpl <em>WList Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WListLiteralImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWListLiteral()
	 * @generated
	 */
	int WLIST_LITERAL = 19;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WLIST_LITERAL__ELEMENTS = WCOLLECTION_LITERAL__ELEMENTS;

	/**
	 * The number of structural features of the '<em>WList Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WLIST_LITERAL_FEATURE_COUNT = WCOLLECTION_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WList Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WLIST_LITERAL_OPERATION_COUNT = WCOLLECTION_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WSetLiteralImpl <em>WSet Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WSetLiteralImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWSetLiteral()
	 * @generated
	 */
	int WSET_LITERAL = 20;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSET_LITERAL__ELEMENTS = WCOLLECTION_LITERAL__ELEMENTS;

	/**
	 * The number of structural features of the '<em>WSet Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSET_LITERAL_FEATURE_COUNT = WCOLLECTION_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WSet Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSET_LITERAL_OPERATION_COUNT = WCOLLECTION_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WNamedObjectImpl <em>WNamed Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WNamedObjectImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWNamedObject()
	 * @generated
	 */
	int WNAMED_OBJECT = 21;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNAMED_OBJECT__MEMBERS = WLIBRARY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNAMED_OBJECT__NAME = WLIBRARY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNAMED_OBJECT__PARENT = WLIBRARY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNAMED_OBJECT__PARENT_PARAMETERS = WLIBRARY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNAMED_OBJECT__MIXINS = WLIBRARY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>WNamed Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNAMED_OBJECT_FEATURE_COUNT = WLIBRARY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>WNamed Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNAMED_OBJECT_OPERATION_COUNT = WLIBRARY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WCanExtendClassImpl <em>WCan Extend Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WCanExtendClassImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWCanExtendClass()
	 * @generated
	 */
	int WCAN_EXTEND_CLASS = 22;

	/**
	 * The number of structural features of the '<em>WCan Extend Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCAN_EXTEND_CLASS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>WCan Extend Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCAN_EXTEND_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WClassImpl <em>WClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WClassImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWClass()
	 * @generated
	 */
	int WCLASS = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLASS__NAME = WLIBRARY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLASS__MEMBERS = WLIBRARY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLASS__PARENT = WLIBRARY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLASS__MIXINS = WLIBRARY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLASS__CONSTRUCTORS = WLIBRARY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>WClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLASS_FEATURE_COUNT = WLIBRARY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>WClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLASS_OPERATION_COUNT = WLIBRARY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WMixinImpl <em>WMixin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WMixinImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWMixin()
	 * @generated
	 */
	int WMIXIN = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMIXIN__NAME = WLIBRARY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMIXIN__MEMBERS = WLIBRARY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>WMixin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMIXIN_FEATURE_COUNT = WLIBRARY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>WMixin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMIXIN_OPERATION_COUNT = WLIBRARY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WMemberImpl <em>WMember</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WMemberImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWMember()
	 * @generated
	 */
	int WMEMBER = 25;

	/**
	 * The number of structural features of the '<em>WMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMEMBER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>WMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WConstructorImpl <em>WConstructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WConstructorImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWConstructor()
	 * @generated
	 */
	int WCONSTRUCTOR = 26;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCONSTRUCTOR__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Delegating Constructor Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCONSTRUCTOR__DELEGATING_CONSTRUCTOR_CALL = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCONSTRUCTOR__EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>WConstructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCONSTRUCTOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>WConstructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCONSTRUCTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WDelegatingConstructorCallImpl <em>WDelegating Constructor Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WDelegatingConstructorCallImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWDelegatingConstructorCall()
	 * @generated
	 */
	int WDELEGATING_CONSTRUCTOR_CALL = 27;

	/**
	 * The feature id for the '<em><b>Argument List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WDELEGATING_CONSTRUCTOR_CALL__ARGUMENT_LIST = 0;

	/**
	 * The number of structural features of the '<em>WDelegating Constructor Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WDELEGATING_CONSTRUCTOR_CALL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>WDelegating Constructor Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WDELEGATING_CONSTRUCTOR_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WSelfDelegatingConstructorCallImpl <em>WSelf Delegating Constructor Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WSelfDelegatingConstructorCallImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWSelfDelegatingConstructorCall()
	 * @generated
	 */
	int WSELF_DELEGATING_CONSTRUCTOR_CALL = 28;

	/**
	 * The feature id for the '<em><b>Argument List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSELF_DELEGATING_CONSTRUCTOR_CALL__ARGUMENT_LIST = WDELEGATING_CONSTRUCTOR_CALL__ARGUMENT_LIST;

	/**
	 * The number of structural features of the '<em>WSelf Delegating Constructor Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSELF_DELEGATING_CONSTRUCTOR_CALL_FEATURE_COUNT = WDELEGATING_CONSTRUCTOR_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WSelf Delegating Constructor Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSELF_DELEGATING_CONSTRUCTOR_CALL_OPERATION_COUNT = WDELEGATING_CONSTRUCTOR_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WSuperDelegatingConstructorCallImpl <em>WSuper Delegating Constructor Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WSuperDelegatingConstructorCallImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWSuperDelegatingConstructorCall()
	 * @generated
	 */
	int WSUPER_DELEGATING_CONSTRUCTOR_CALL = 29;

	/**
	 * The feature id for the '<em><b>Argument List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSUPER_DELEGATING_CONSTRUCTOR_CALL__ARGUMENT_LIST = WDELEGATING_CONSTRUCTOR_CALL__ARGUMENT_LIST;

	/**
	 * The number of structural features of the '<em>WSuper Delegating Constructor Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSUPER_DELEGATING_CONSTRUCTOR_CALL_FEATURE_COUNT = WDELEGATING_CONSTRUCTOR_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WSuper Delegating Constructor Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSUPER_DELEGATING_CONSTRUCTOR_CALL_OPERATION_COUNT = WDELEGATING_CONSTRUCTOR_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WConstructorCallImpl <em>WConstructor Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WConstructorCallImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWConstructorCall()
	 * @generated
	 */
	int WCONSTRUCTOR_CALL = 30;

	/**
	 * The feature id for the '<em><b>Class Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCONSTRUCTOR_CALL__CLASS_REF = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCONSTRUCTOR_CALL__ARGUMENT_LIST = WEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCONSTRUCTOR_CALL__MIXINS = WEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>WConstructor Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCONSTRUCTOR_CALL_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>WConstructor Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCONSTRUCTOR_CALL_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WArgumentListImpl <em>WArgument List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WArgumentListImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWArgumentList()
	 * @generated
	 */
	int WARGUMENT_LIST = 31;

	/**
	 * The number of structural features of the '<em>WArgument List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARGUMENT_LIST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>WArgument List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARGUMENT_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WNamedArgumentsListImpl <em>WNamed Arguments List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WNamedArgumentsListImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWNamedArgumentsList()
	 * @generated
	 */
	int WNAMED_ARGUMENTS_LIST = 32;

	/**
	 * The feature id for the '<em><b>Initializers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNAMED_ARGUMENTS_LIST__INITIALIZERS = WARGUMENT_LIST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WNamed Arguments List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNAMED_ARGUMENTS_LIST_FEATURE_COUNT = WARGUMENT_LIST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>WNamed Arguments List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNAMED_ARGUMENTS_LIST_OPERATION_COUNT = WARGUMENT_LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WPositionalArgumentsListImpl <em>WPositional Arguments List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WPositionalArgumentsListImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWPositionalArgumentsList()
	 * @generated
	 */
	int WPOSITIONAL_ARGUMENTS_LIST = 33;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPOSITIONAL_ARGUMENTS_LIST__VALUES = WARGUMENT_LIST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WPositional Arguments List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPOSITIONAL_ARGUMENTS_LIST_FEATURE_COUNT = WARGUMENT_LIST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>WPositional Arguments List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPOSITIONAL_ARGUMENTS_LIST_OPERATION_COUNT = WARGUMENT_LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WInitializerImpl <em>WInitializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WInitializerImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWInitializer()
	 * @generated
	 */
	int WINITIALIZER = 34;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINITIALIZER__INITIALIZER = 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINITIALIZER__INITIAL_VALUE = 1;

	/**
	 * The number of structural features of the '<em>WInitializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINITIALIZER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>WInitializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINITIALIZER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WTryImpl <em>WTry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WTryImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWTry()
	 * @generated
	 */
	int WTRY = 35;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTRY__EXPRESSION = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Catch Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTRY__CATCH_BLOCKS = WEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Always Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTRY__ALWAYS_EXPRESSION = WEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>WTry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTRY_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>WTry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTRY_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WCatchImpl <em>WCatch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WCatchImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWCatch()
	 * @generated
	 */
	int WCATCH = 36;

	/**
	 * The feature id for the '<em><b>Exception Var Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCATCH__EXCEPTION_VAR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Exception Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCATCH__EXCEPTION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCATCH__EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>WCatch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCATCH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>WCatch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WReturnExpressionImpl <em>WReturn Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WReturnExpressionImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWReturnExpression()
	 * @generated
	 */
	int WRETURN_EXPRESSION = 37;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRETURN_EXPRESSION__EXPRESSION = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WReturn Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRETURN_EXPRESSION_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>WReturn Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRETURN_EXPRESSION_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WThrowImpl <em>WThrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WThrowImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWThrow()
	 * @generated
	 */
	int WTHROW = 38;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTHROW__EXCEPTION = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WThrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTHROW_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>WThrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTHROW_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WObjectLiteralImpl <em>WObject Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WObjectLiteralImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWObjectLiteral()
	 * @generated
	 */
	int WOBJECT_LITERAL = 39;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOBJECT_LITERAL__MEMBERS = WMETHOD_CONTAINER__MEMBERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOBJECT_LITERAL__PARENT = WMETHOD_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOBJECT_LITERAL__PARENT_PARAMETERS = WMETHOD_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOBJECT_LITERAL__MIXINS = WMETHOD_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>WObject Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOBJECT_LITERAL_FEATURE_COUNT = WMETHOD_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>WObject Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOBJECT_LITERAL_OPERATION_COUNT = WMETHOD_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WVariableDeclarationImpl <em>WVariable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WVariableDeclarationImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWVariableDeclaration()
	 * @generated
	 */
	int WVARIABLE_DECLARATION = 40;

	/**
	 * The feature id for the '<em><b>Writeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVARIABLE_DECLARATION__WRITEABLE = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVARIABLE_DECLARATION__PROPERTY = WEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVARIABLE_DECLARATION__VARIABLE = WEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVARIABLE_DECLARATION__RIGHT = WEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>WVariable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVARIABLE_DECLARATION_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>WVariable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVARIABLE_DECLARATION_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WAssignmentImpl <em>WAssignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WAssignmentImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWAssignment()
	 * @generated
	 */
	int WASSIGNMENT = 41;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASSIGNMENT__FEATURE = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASSIGNMENT__VALUE = WEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>WAssignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASSIGNMENT_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>WAssignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASSIGNMENT_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WBinaryOperationImpl <em>WBinary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WBinaryOperationImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWBinaryOperation()
	 * @generated
	 */
	int WBINARY_OPERATION = 42;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBINARY_OPERATION__LEFT_OPERAND = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBINARY_OPERATION__FEATURE = WEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBINARY_OPERATION__RIGHT_OPERAND = WEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>WBinary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBINARY_OPERATION_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>WBinary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBINARY_OPERATION_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WUnaryOperationImpl <em>WUnary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WUnaryOperationImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWUnaryOperation()
	 * @generated
	 */
	int WUNARY_OPERATION = 43;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WUNARY_OPERATION__FEATURE = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WUNARY_OPERATION__OPERAND = WEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>WUnary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WUNARY_OPERATION_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>WUnary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WUNARY_OPERATION_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WPostfixOperationImpl <em>WPostfix Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WPostfixOperationImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWPostfixOperation()
	 * @generated
	 */
	int WPOSTFIX_OPERATION = 44;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPOSTFIX_OPERATION__OPERAND = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPOSTFIX_OPERATION__FEATURE = WEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>WPostfix Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPOSTFIX_OPERATION_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>WPostfix Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPOSTFIX_OPERATION_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WMemberFeatureCallImpl <em>WMember Feature Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WMemberFeatureCallImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWMemberFeatureCall()
	 * @generated
	 */
	int WMEMBER_FEATURE_CALL = 45;

	/**
	 * The feature id for the '<em><b>Member Call Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Null Safe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMEMBER_FEATURE_CALL__NULL_SAFE = WEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMEMBER_FEATURE_CALL__FEATURE = WEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Member Call Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS = WEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>WMember Feature Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMEMBER_FEATURE_CALL_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>WMember Feature Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMEMBER_FEATURE_CALL_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WSelfImpl <em>WSelf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WSelfImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWSelf()
	 * @generated
	 */
	int WSELF = 46;

	/**
	 * The number of structural features of the '<em>WSelf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSELF_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WSelf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSELF_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WSuperInvocationImpl <em>WSuper Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WSuperInvocationImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWSuperInvocation()
	 * @generated
	 */
	int WSUPER_INVOCATION = 47;

	/**
	 * The feature id for the '<em><b>Member Call Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSUPER_INVOCATION__MEMBER_CALL_ARGUMENTS = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WSuper Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSUPER_INVOCATION_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>WSuper Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSUPER_INVOCATION_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WBlockExpressionImpl <em>WBlock Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WBlockExpressionImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWBlockExpression()
	 * @generated
	 */
	int WBLOCK_EXPRESSION = 48;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBLOCK_EXPRESSION__EXPRESSIONS = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WBlock Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBLOCK_EXPRESSION_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>WBlock Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBLOCK_EXPRESSION_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WBooleanLiteralImpl <em>WBoolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WBooleanLiteralImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWBooleanLiteral()
	 * @generated
	 */
	int WBOOLEAN_LITERAL = 49;

	/**
	 * The feature id for the '<em><b>Is True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBOOLEAN_LITERAL__IS_TRUE = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WBoolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBOOLEAN_LITERAL_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>WBoolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBOOLEAN_LITERAL_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WNullLiteralImpl <em>WNull Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WNullLiteralImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWNullLiteral()
	 * @generated
	 */
	int WNULL_LITERAL = 50;

	/**
	 * The number of structural features of the '<em>WNull Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNULL_LITERAL_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WNull Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNULL_LITERAL_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WStringLiteralImpl <em>WString Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WStringLiteralImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWStringLiteral()
	 * @generated
	 */
	int WSTRING_LITERAL = 51;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTRING_LITERAL__VALUE = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WString Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTRING_LITERAL_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>WString Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTRING_LITERAL_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WNumberLiteralImpl <em>WNumber Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WNumberLiteralImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWNumberLiteral()
	 * @generated
	 */
	int WNUMBER_LITERAL = 52;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNUMBER_LITERAL__VALUE = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WNumber Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNUMBER_LITERAL_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>WNumber Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNUMBER_LITERAL_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wollokDsl.impl.WClosureImpl <em>WClosure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wollokDsl.impl.WClosureImpl
	 * @see wollokDsl.impl.WollokDslPackageImpl#getWClosure()
	 * @generated
	 */
	int WCLOSURE = 53;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLOSURE__PARAMETERS = WEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLOSURE__EXPRESSION = WEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>WClosure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLOSURE_FEATURE_COUNT = WEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>WClosure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLOSURE_OPERATION_COUNT = WEXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link wollokDsl.WFile <em>WFile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WFile</em>'.
	 * @see wollokDsl.WFile
	 * @generated
	 */
	EClass getWFile();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WFile#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see wollokDsl.WFile#getImports()
	 * @see #getWFile()
	 * @generated
	 */
	EReference getWFile_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WFile#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see wollokDsl.WFile#getElements()
	 * @see #getWFile()
	 * @generated
	 */
	EReference getWFile_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WFile#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main</em>'.
	 * @see wollokDsl.WFile#getMain()
	 * @see #getWFile()
	 * @generated
	 */
	EReference getWFile_Main();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WFile#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see wollokDsl.WFile#getTests()
	 * @see #getWFile()
	 * @generated
	 */
	EReference getWFile_Tests();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WFile#getSuites <em>Suites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Suites</em>'.
	 * @see wollokDsl.WFile#getSuites()
	 * @see #getWFile()
	 * @generated
	 */
	EReference getWFile_Suites();

	/**
	 * Returns the meta object for class '{@link wollokDsl.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see wollokDsl.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link wollokDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see wollokDsl.Import#getImportedNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WProgram <em>WProgram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WProgram</em>'.
	 * @see wollokDsl.WProgram
	 * @generated
	 */
	EClass getWProgram();

	/**
	 * Returns the meta object for the attribute '{@link wollokDsl.WProgram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wollokDsl.WProgram#getName()
	 * @see #getWProgram()
	 * @generated
	 */
	EAttribute getWProgram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WProgram#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see wollokDsl.WProgram#getElements()
	 * @see #getWProgram()
	 * @generated
	 */
	EReference getWProgram_Elements();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WTest <em>WTest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WTest</em>'.
	 * @see wollokDsl.WTest
	 * @generated
	 */
	EClass getWTest();

	/**
	 * Returns the meta object for the attribute '{@link wollokDsl.WTest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wollokDsl.WTest#getName()
	 * @see #getWTest()
	 * @generated
	 */
	EAttribute getWTest_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WTest#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see wollokDsl.WTest#getElements()
	 * @see #getWTest()
	 * @generated
	 */
	EReference getWTest_Elements();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WSuite <em>WSuite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSuite</em>'.
	 * @see wollokDsl.WSuite
	 * @generated
	 */
	EClass getWSuite();

	/**
	 * Returns the meta object for the attribute '{@link wollokDsl.WSuite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wollokDsl.WSuite#getName()
	 * @see #getWSuite()
	 * @generated
	 */
	EAttribute getWSuite_Name();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WSuite#getFixture <em>Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fixture</em>'.
	 * @see wollokDsl.WSuite#getFixture()
	 * @see #getWSuite()
	 * @generated
	 */
	EReference getWSuite_Fixture();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WSuite#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see wollokDsl.WSuite#getTests()
	 * @see #getWSuite()
	 * @generated
	 */
	EReference getWSuite_Tests();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WFixture <em>WFixture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WFixture</em>'.
	 * @see wollokDsl.WFixture
	 * @generated
	 */
	EClass getWFixture();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WFixture#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see wollokDsl.WFixture#getElements()
	 * @see #getWFixture()
	 * @generated
	 */
	EReference getWFixture_Elements();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WPackage <em>WPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WPackage</em>'.
	 * @see wollokDsl.WPackage
	 * @generated
	 */
	EClass getWPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WPackage#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see wollokDsl.WPackage#getElements()
	 * @see #getWPackage()
	 * @generated
	 */
	EReference getWPackage_Elements();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WLibraryElement <em>WLibrary Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WLibrary Element</em>'.
	 * @see wollokDsl.WLibraryElement
	 * @generated
	 */
	EClass getWLibraryElement();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WNamed <em>WNamed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WNamed</em>'.
	 * @see wollokDsl.WNamed
	 * @generated
	 */
	EClass getWNamed();

	/**
	 * Returns the meta object for the attribute '{@link wollokDsl.WNamed#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wollokDsl.WNamed#getName()
	 * @see #getWNamed()
	 * @generated
	 */
	EAttribute getWNamed_Name();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WMethodContainer <em>WMethod Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WMethod Container</em>'.
	 * @see wollokDsl.WMethodContainer
	 * @generated
	 */
	EClass getWMethodContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WMethodContainer#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see wollokDsl.WMethodContainer#getMembers()
	 * @see #getWMethodContainer()
	 * @generated
	 */
	EReference getWMethodContainer_Members();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WReferenciable <em>WReferenciable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WReferenciable</em>'.
	 * @see wollokDsl.WReferenciable
	 * @generated
	 */
	EClass getWReferenciable();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WExpression <em>WExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WExpression</em>'.
	 * @see wollokDsl.WExpression
	 * @generated
	 */
	EClass getWExpression();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WMethodDeclaration <em>WMethod Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WMethod Declaration</em>'.
	 * @see wollokDsl.WMethodDeclaration
	 * @generated
	 */
	EClass getWMethodDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link wollokDsl.WMethodDeclaration#isOverrides <em>Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overrides</em>'.
	 * @see wollokDsl.WMethodDeclaration#isOverrides()
	 * @see #getWMethodDeclaration()
	 * @generated
	 */
	EAttribute getWMethodDeclaration_Overrides();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WMethodDeclaration#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see wollokDsl.WMethodDeclaration#getParameters()
	 * @see #getWMethodDeclaration()
	 * @generated
	 */
	EReference getWMethodDeclaration_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link wollokDsl.WMethodDeclaration#isNative <em>Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Native</em>'.
	 * @see wollokDsl.WMethodDeclaration#isNative()
	 * @see #getWMethodDeclaration()
	 * @generated
	 */
	EAttribute getWMethodDeclaration_Native();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WMethodDeclaration#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see wollokDsl.WMethodDeclaration#getExpression()
	 * @see #getWMethodDeclaration()
	 * @generated
	 */
	EReference getWMethodDeclaration_Expression();

	/**
	 * Returns the meta object for the attribute '{@link wollokDsl.WMethodDeclaration#isExpressionReturns <em>Expression Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Returns</em>'.
	 * @see wollokDsl.WMethodDeclaration#isExpressionReturns()
	 * @see #getWMethodDeclaration()
	 * @generated
	 */
	EAttribute getWMethodDeclaration_ExpressionReturns();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WParameter <em>WParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WParameter</em>'.
	 * @see wollokDsl.WParameter
	 * @generated
	 */
	EClass getWParameter();

	/**
	 * Returns the meta object for the attribute '{@link wollokDsl.WParameter#isVarArg <em>Var Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Arg</em>'.
	 * @see wollokDsl.WParameter#isVarArg()
	 * @see #getWParameter()
	 * @generated
	 */
	EAttribute getWParameter_VarArg();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WVariable <em>WVariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WVariable</em>'.
	 * @see wollokDsl.WVariable
	 * @generated
	 */
	EClass getWVariable();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WFeatureCall <em>WFeature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WFeature Call</em>'.
	 * @see wollokDsl.WFeatureCall
	 * @generated
	 */
	EClass getWFeatureCall();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WVariableReference <em>WVariable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WVariable Reference</em>'.
	 * @see wollokDsl.WVariableReference
	 * @generated
	 */
	EClass getWVariableReference();

	/**
	 * Returns the meta object for the reference '{@link wollokDsl.WVariableReference#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see wollokDsl.WVariableReference#getRef()
	 * @see #getWVariableReference()
	 * @generated
	 */
	EReference getWVariableReference_Ref();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WIfExpression <em>WIf Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WIf Expression</em>'.
	 * @see wollokDsl.WIfExpression
	 * @generated
	 */
	EClass getWIfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WIfExpression#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see wollokDsl.WIfExpression#getCondition()
	 * @see #getWIfExpression()
	 * @generated
	 */
	EReference getWIfExpression_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WIfExpression#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see wollokDsl.WIfExpression#getThen()
	 * @see #getWIfExpression()
	 * @generated
	 */
	EReference getWIfExpression_Then();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WIfExpression#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see wollokDsl.WIfExpression#getElse()
	 * @see #getWIfExpression()
	 * @generated
	 */
	EReference getWIfExpression_Else();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WCollectionLiteral <em>WCollection Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WCollection Literal</em>'.
	 * @see wollokDsl.WCollectionLiteral
	 * @generated
	 */
	EClass getWCollectionLiteral();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WCollectionLiteral#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see wollokDsl.WCollectionLiteral#getElements()
	 * @see #getWCollectionLiteral()
	 * @generated
	 */
	EReference getWCollectionLiteral_Elements();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WListLiteral <em>WList Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WList Literal</em>'.
	 * @see wollokDsl.WListLiteral
	 * @generated
	 */
	EClass getWListLiteral();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WSetLiteral <em>WSet Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSet Literal</em>'.
	 * @see wollokDsl.WSetLiteral
	 * @generated
	 */
	EClass getWSetLiteral();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WNamedObject <em>WNamed Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WNamed Object</em>'.
	 * @see wollokDsl.WNamedObject
	 * @generated
	 */
	EClass getWNamedObject();

	/**
	 * Returns the meta object for the reference '{@link wollokDsl.WNamedObject#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see wollokDsl.WNamedObject#getParent()
	 * @see #getWNamedObject()
	 * @generated
	 */
	EReference getWNamedObject_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WNamedObject#getParentParameters <em>Parent Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent Parameters</em>'.
	 * @see wollokDsl.WNamedObject#getParentParameters()
	 * @see #getWNamedObject()
	 * @generated
	 */
	EReference getWNamedObject_ParentParameters();

	/**
	 * Returns the meta object for the reference list '{@link wollokDsl.WNamedObject#getMixins <em>Mixins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mixins</em>'.
	 * @see wollokDsl.WNamedObject#getMixins()
	 * @see #getWNamedObject()
	 * @generated
	 */
	EReference getWNamedObject_Mixins();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WCanExtendClass <em>WCan Extend Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WCan Extend Class</em>'.
	 * @see wollokDsl.WCanExtendClass
	 * @generated
	 */
	EClass getWCanExtendClass();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WClass <em>WClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WClass</em>'.
	 * @see wollokDsl.WClass
	 * @generated
	 */
	EClass getWClass();

	/**
	 * Returns the meta object for the reference '{@link wollokDsl.WClass#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see wollokDsl.WClass#getParent()
	 * @see #getWClass()
	 * @generated
	 */
	EReference getWClass_Parent();

	/**
	 * Returns the meta object for the reference list '{@link wollokDsl.WClass#getMixins <em>Mixins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mixins</em>'.
	 * @see wollokDsl.WClass#getMixins()
	 * @see #getWClass()
	 * @generated
	 */
	EReference getWClass_Mixins();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WClass#getConstructors <em>Constructors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constructors</em>'.
	 * @see wollokDsl.WClass#getConstructors()
	 * @see #getWClass()
	 * @generated
	 */
	EReference getWClass_Constructors();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WMixin <em>WMixin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WMixin</em>'.
	 * @see wollokDsl.WMixin
	 * @generated
	 */
	EClass getWMixin();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WMember <em>WMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WMember</em>'.
	 * @see wollokDsl.WMember
	 * @generated
	 */
	EClass getWMember();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WConstructor <em>WConstructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WConstructor</em>'.
	 * @see wollokDsl.WConstructor
	 * @generated
	 */
	EClass getWConstructor();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WConstructor#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see wollokDsl.WConstructor#getParameters()
	 * @see #getWConstructor()
	 * @generated
	 */
	EReference getWConstructor_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WConstructor#getDelegatingConstructorCall <em>Delegating Constructor Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegating Constructor Call</em>'.
	 * @see wollokDsl.WConstructor#getDelegatingConstructorCall()
	 * @see #getWConstructor()
	 * @generated
	 */
	EReference getWConstructor_DelegatingConstructorCall();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WConstructor#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see wollokDsl.WConstructor#getExpression()
	 * @see #getWConstructor()
	 * @generated
	 */
	EReference getWConstructor_Expression();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WDelegatingConstructorCall <em>WDelegating Constructor Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WDelegating Constructor Call</em>'.
	 * @see wollokDsl.WDelegatingConstructorCall
	 * @generated
	 */
	EClass getWDelegatingConstructorCall();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WDelegatingConstructorCall#getArgumentList <em>Argument List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument List</em>'.
	 * @see wollokDsl.WDelegatingConstructorCall#getArgumentList()
	 * @see #getWDelegatingConstructorCall()
	 * @generated
	 */
	EReference getWDelegatingConstructorCall_ArgumentList();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WSelfDelegatingConstructorCall <em>WSelf Delegating Constructor Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSelf Delegating Constructor Call</em>'.
	 * @see wollokDsl.WSelfDelegatingConstructorCall
	 * @generated
	 */
	EClass getWSelfDelegatingConstructorCall();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WSuperDelegatingConstructorCall <em>WSuper Delegating Constructor Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSuper Delegating Constructor Call</em>'.
	 * @see wollokDsl.WSuperDelegatingConstructorCall
	 * @generated
	 */
	EClass getWSuperDelegatingConstructorCall();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WConstructorCall <em>WConstructor Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WConstructor Call</em>'.
	 * @see wollokDsl.WConstructorCall
	 * @generated
	 */
	EClass getWConstructorCall();

	/**
	 * Returns the meta object for the reference '{@link wollokDsl.WConstructorCall#getClassRef <em>Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class Ref</em>'.
	 * @see wollokDsl.WConstructorCall#getClassRef()
	 * @see #getWConstructorCall()
	 * @generated
	 */
	EReference getWConstructorCall_ClassRef();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WConstructorCall#getArgumentList <em>Argument List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument List</em>'.
	 * @see wollokDsl.WConstructorCall#getArgumentList()
	 * @see #getWConstructorCall()
	 * @generated
	 */
	EReference getWConstructorCall_ArgumentList();

	/**
	 * Returns the meta object for the reference list '{@link wollokDsl.WConstructorCall#getMixins <em>Mixins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mixins</em>'.
	 * @see wollokDsl.WConstructorCall#getMixins()
	 * @see #getWConstructorCall()
	 * @generated
	 */
	EReference getWConstructorCall_Mixins();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WArgumentList <em>WArgument List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WArgument List</em>'.
	 * @see wollokDsl.WArgumentList
	 * @generated
	 */
	EClass getWArgumentList();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WNamedArgumentsList <em>WNamed Arguments List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WNamed Arguments List</em>'.
	 * @see wollokDsl.WNamedArgumentsList
	 * @generated
	 */
	EClass getWNamedArgumentsList();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WNamedArgumentsList#getInitializers <em>Initializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initializers</em>'.
	 * @see wollokDsl.WNamedArgumentsList#getInitializers()
	 * @see #getWNamedArgumentsList()
	 * @generated
	 */
	EReference getWNamedArgumentsList_Initializers();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WPositionalArgumentsList <em>WPositional Arguments List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WPositional Arguments List</em>'.
	 * @see wollokDsl.WPositionalArgumentsList
	 * @generated
	 */
	EClass getWPositionalArgumentsList();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WPositionalArgumentsList#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see wollokDsl.WPositionalArgumentsList#getValues()
	 * @see #getWPositionalArgumentsList()
	 * @generated
	 */
	EReference getWPositionalArgumentsList_Values();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WInitializer <em>WInitializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WInitializer</em>'.
	 * @see wollokDsl.WInitializer
	 * @generated
	 */
	EClass getWInitializer();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WInitializer#getInitializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initializer</em>'.
	 * @see wollokDsl.WInitializer#getInitializer()
	 * @see #getWInitializer()
	 * @generated
	 */
	EReference getWInitializer_Initializer();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WInitializer#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see wollokDsl.WInitializer#getInitialValue()
	 * @see #getWInitializer()
	 * @generated
	 */
	EReference getWInitializer_InitialValue();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WTry <em>WTry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WTry</em>'.
	 * @see wollokDsl.WTry
	 * @generated
	 */
	EClass getWTry();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WTry#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see wollokDsl.WTry#getExpression()
	 * @see #getWTry()
	 * @generated
	 */
	EReference getWTry_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WTry#getCatchBlocks <em>Catch Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catch Blocks</em>'.
	 * @see wollokDsl.WTry#getCatchBlocks()
	 * @see #getWTry()
	 * @generated
	 */
	EReference getWTry_CatchBlocks();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WTry#getAlwaysExpression <em>Always Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Always Expression</em>'.
	 * @see wollokDsl.WTry#getAlwaysExpression()
	 * @see #getWTry()
	 * @generated
	 */
	EReference getWTry_AlwaysExpression();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WCatch <em>WCatch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WCatch</em>'.
	 * @see wollokDsl.WCatch
	 * @generated
	 */
	EClass getWCatch();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WCatch#getExceptionVarName <em>Exception Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Var Name</em>'.
	 * @see wollokDsl.WCatch#getExceptionVarName()
	 * @see #getWCatch()
	 * @generated
	 */
	EReference getWCatch_ExceptionVarName();

	/**
	 * Returns the meta object for the reference '{@link wollokDsl.WCatch#getExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exception Type</em>'.
	 * @see wollokDsl.WCatch#getExceptionType()
	 * @see #getWCatch()
	 * @generated
	 */
	EReference getWCatch_ExceptionType();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WCatch#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see wollokDsl.WCatch#getExpression()
	 * @see #getWCatch()
	 * @generated
	 */
	EReference getWCatch_Expression();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WReturnExpression <em>WReturn Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WReturn Expression</em>'.
	 * @see wollokDsl.WReturnExpression
	 * @generated
	 */
	EClass getWReturnExpression();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WReturnExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see wollokDsl.WReturnExpression#getExpression()
	 * @see #getWReturnExpression()
	 * @generated
	 */
	EReference getWReturnExpression_Expression();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WThrow <em>WThrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WThrow</em>'.
	 * @see wollokDsl.WThrow
	 * @generated
	 */
	EClass getWThrow();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WThrow#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception</em>'.
	 * @see wollokDsl.WThrow#getException()
	 * @see #getWThrow()
	 * @generated
	 */
	EReference getWThrow_Exception();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WObjectLiteral <em>WObject Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WObject Literal</em>'.
	 * @see wollokDsl.WObjectLiteral
	 * @generated
	 */
	EClass getWObjectLiteral();

	/**
	 * Returns the meta object for the reference '{@link wollokDsl.WObjectLiteral#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see wollokDsl.WObjectLiteral#getParent()
	 * @see #getWObjectLiteral()
	 * @generated
	 */
	EReference getWObjectLiteral_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WObjectLiteral#getParentParameters <em>Parent Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent Parameters</em>'.
	 * @see wollokDsl.WObjectLiteral#getParentParameters()
	 * @see #getWObjectLiteral()
	 * @generated
	 */
	EReference getWObjectLiteral_ParentParameters();

	/**
	 * Returns the meta object for the reference list '{@link wollokDsl.WObjectLiteral#getMixins <em>Mixins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mixins</em>'.
	 * @see wollokDsl.WObjectLiteral#getMixins()
	 * @see #getWObjectLiteral()
	 * @generated
	 */
	EReference getWObjectLiteral_Mixins();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WVariableDeclaration <em>WVariable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WVariable Declaration</em>'.
	 * @see wollokDsl.WVariableDeclaration
	 * @generated
	 */
	EClass getWVariableDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link wollokDsl.WVariableDeclaration#isWriteable <em>Writeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writeable</em>'.
	 * @see wollokDsl.WVariableDeclaration#isWriteable()
	 * @see #getWVariableDeclaration()
	 * @generated
	 */
	EAttribute getWVariableDeclaration_Writeable();

	/**
	 * Returns the meta object for the attribute '{@link wollokDsl.WVariableDeclaration#isProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see wollokDsl.WVariableDeclaration#isProperty()
	 * @see #getWVariableDeclaration()
	 * @generated
	 */
	EAttribute getWVariableDeclaration_Property();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WVariableDeclaration#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see wollokDsl.WVariableDeclaration#getVariable()
	 * @see #getWVariableDeclaration()
	 * @generated
	 */
	EReference getWVariableDeclaration_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WVariableDeclaration#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see wollokDsl.WVariableDeclaration#getRight()
	 * @see #getWVariableDeclaration()
	 * @generated
	 */
	EReference getWVariableDeclaration_Right();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WAssignment <em>WAssignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WAssignment</em>'.
	 * @see wollokDsl.WAssignment
	 * @generated
	 */
	EClass getWAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WAssignment#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see wollokDsl.WAssignment#getFeature()
	 * @see #getWAssignment()
	 * @generated
	 */
	EReference getWAssignment_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see wollokDsl.WAssignment#getValue()
	 * @see #getWAssignment()
	 * @generated
	 */
	EReference getWAssignment_Value();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WBinaryOperation <em>WBinary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WBinary Operation</em>'.
	 * @see wollokDsl.WBinaryOperation
	 * @generated
	 */
	EClass getWBinaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WBinaryOperation#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see wollokDsl.WBinaryOperation#getLeftOperand()
	 * @see #getWBinaryOperation()
	 * @generated
	 */
	EReference getWBinaryOperation_LeftOperand();

	/**
	 * Returns the meta object for the attribute '{@link wollokDsl.WBinaryOperation#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see wollokDsl.WBinaryOperation#getFeature()
	 * @see #getWBinaryOperation()
	 * @generated
	 */
	EAttribute getWBinaryOperation_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WBinaryOperation#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see wollokDsl.WBinaryOperation#getRightOperand()
	 * @see #getWBinaryOperation()
	 * @generated
	 */
	EReference getWBinaryOperation_RightOperand();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WUnaryOperation <em>WUnary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WUnary Operation</em>'.
	 * @see wollokDsl.WUnaryOperation
	 * @generated
	 */
	EClass getWUnaryOperation();

	/**
	 * Returns the meta object for the attribute '{@link wollokDsl.WUnaryOperation#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see wollokDsl.WUnaryOperation#getFeature()
	 * @see #getWUnaryOperation()
	 * @generated
	 */
	EAttribute getWUnaryOperation_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WUnaryOperation#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see wollokDsl.WUnaryOperation#getOperand()
	 * @see #getWUnaryOperation()
	 * @generated
	 */
	EReference getWUnaryOperation_Operand();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WPostfixOperation <em>WPostfix Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WPostfix Operation</em>'.
	 * @see wollokDsl.WPostfixOperation
	 * @generated
	 */
	EClass getWPostfixOperation();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WPostfixOperation#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see wollokDsl.WPostfixOperation#getOperand()
	 * @see #getWPostfixOperation()
	 * @generated
	 */
	EReference getWPostfixOperation_Operand();

	/**
	 * Returns the meta object for the attribute '{@link wollokDsl.WPostfixOperation#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see wollokDsl.WPostfixOperation#getFeature()
	 * @see #getWPostfixOperation()
	 * @generated
	 */
	EAttribute getWPostfixOperation_Feature();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WMemberFeatureCall <em>WMember Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WMember Feature Call</em>'.
	 * @see wollokDsl.WMemberFeatureCall
	 * @generated
	 */
	EClass getWMemberFeatureCall();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WMemberFeatureCall#getMemberCallTarget <em>Member Call Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Member Call Target</em>'.
	 * @see wollokDsl.WMemberFeatureCall#getMemberCallTarget()
	 * @see #getWMemberFeatureCall()
	 * @generated
	 */
	EReference getWMemberFeatureCall_MemberCallTarget();

	/**
	 * Returns the meta object for the attribute '{@link wollokDsl.WMemberFeatureCall#isNullSafe <em>Null Safe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Safe</em>'.
	 * @see wollokDsl.WMemberFeatureCall#isNullSafe()
	 * @see #getWMemberFeatureCall()
	 * @generated
	 */
	EAttribute getWMemberFeatureCall_NullSafe();

	/**
	 * Returns the meta object for the attribute '{@link wollokDsl.WMemberFeatureCall#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see wollokDsl.WMemberFeatureCall#getFeature()
	 * @see #getWMemberFeatureCall()
	 * @generated
	 */
	EAttribute getWMemberFeatureCall_Feature();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WMemberFeatureCall#getMemberCallArguments <em>Member Call Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Call Arguments</em>'.
	 * @see wollokDsl.WMemberFeatureCall#getMemberCallArguments()
	 * @see #getWMemberFeatureCall()
	 * @generated
	 */
	EReference getWMemberFeatureCall_MemberCallArguments();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WSelf <em>WSelf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSelf</em>'.
	 * @see wollokDsl.WSelf
	 * @generated
	 */
	EClass getWSelf();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WSuperInvocation <em>WSuper Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSuper Invocation</em>'.
	 * @see wollokDsl.WSuperInvocation
	 * @generated
	 */
	EClass getWSuperInvocation();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WSuperInvocation#getMemberCallArguments <em>Member Call Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Call Arguments</em>'.
	 * @see wollokDsl.WSuperInvocation#getMemberCallArguments()
	 * @see #getWSuperInvocation()
	 * @generated
	 */
	EReference getWSuperInvocation_MemberCallArguments();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WBlockExpression <em>WBlock Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WBlock Expression</em>'.
	 * @see wollokDsl.WBlockExpression
	 * @generated
	 */
	EClass getWBlockExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WBlockExpression#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see wollokDsl.WBlockExpression#getExpressions()
	 * @see #getWBlockExpression()
	 * @generated
	 */
	EReference getWBlockExpression_Expressions();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WBooleanLiteral <em>WBoolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WBoolean Literal</em>'.
	 * @see wollokDsl.WBooleanLiteral
	 * @generated
	 */
	EClass getWBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link wollokDsl.WBooleanLiteral#isIsTrue <em>Is True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is True</em>'.
	 * @see wollokDsl.WBooleanLiteral#isIsTrue()
	 * @see #getWBooleanLiteral()
	 * @generated
	 */
	EAttribute getWBooleanLiteral_IsTrue();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WNullLiteral <em>WNull Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WNull Literal</em>'.
	 * @see wollokDsl.WNullLiteral
	 * @generated
	 */
	EClass getWNullLiteral();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WStringLiteral <em>WString Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WString Literal</em>'.
	 * @see wollokDsl.WStringLiteral
	 * @generated
	 */
	EClass getWStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link wollokDsl.WStringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see wollokDsl.WStringLiteral#getValue()
	 * @see #getWStringLiteral()
	 * @generated
	 */
	EAttribute getWStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WNumberLiteral <em>WNumber Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WNumber Literal</em>'.
	 * @see wollokDsl.WNumberLiteral
	 * @generated
	 */
	EClass getWNumberLiteral();

	/**
	 * Returns the meta object for the attribute '{@link wollokDsl.WNumberLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see wollokDsl.WNumberLiteral#getValue()
	 * @see #getWNumberLiteral()
	 * @generated
	 */
	EAttribute getWNumberLiteral_Value();

	/**
	 * Returns the meta object for class '{@link wollokDsl.WClosure <em>WClosure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WClosure</em>'.
	 * @see wollokDsl.WClosure
	 * @generated
	 */
	EClass getWClosure();

	/**
	 * Returns the meta object for the containment reference list '{@link wollokDsl.WClosure#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see wollokDsl.WClosure#getParameters()
	 * @see #getWClosure()
	 * @generated
	 */
	EReference getWClosure_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link wollokDsl.WClosure#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see wollokDsl.WClosure#getExpression()
	 * @see #getWClosure()
	 * @generated
	 */
	EReference getWClosure_Expression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WollokDslFactory getWollokDslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WFileImpl <em>WFile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WFileImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWFile()
		 * @generated
		 */
		EClass WFILE = eINSTANCE.getWFile();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WFILE__IMPORTS = eINSTANCE.getWFile_Imports();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WFILE__ELEMENTS = eINSTANCE.getWFile_Elements();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WFILE__MAIN = eINSTANCE.getWFile_Main();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WFILE__TESTS = eINSTANCE.getWFile_Tests();

		/**
		 * The meta object literal for the '<em><b>Suites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WFILE__SUITES = eINSTANCE.getWFile_Suites();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.ImportImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WProgramImpl <em>WProgram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WProgramImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWProgram()
		 * @generated
		 */
		EClass WPROGRAM = eINSTANCE.getWProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPROGRAM__NAME = eINSTANCE.getWProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WPROGRAM__ELEMENTS = eINSTANCE.getWProgram_Elements();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WTestImpl <em>WTest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WTestImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWTest()
		 * @generated
		 */
		EClass WTEST = eINSTANCE.getWTest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WTEST__NAME = eINSTANCE.getWTest_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WTEST__ELEMENTS = eINSTANCE.getWTest_Elements();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WSuiteImpl <em>WSuite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WSuiteImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWSuite()
		 * @generated
		 */
		EClass WSUITE = eINSTANCE.getWSuite();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSUITE__NAME = eINSTANCE.getWSuite_Name();

		/**
		 * The meta object literal for the '<em><b>Fixture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSUITE__FIXTURE = eINSTANCE.getWSuite_Fixture();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSUITE__TESTS = eINSTANCE.getWSuite_Tests();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WFixtureImpl <em>WFixture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WFixtureImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWFixture()
		 * @generated
		 */
		EClass WFIXTURE = eINSTANCE.getWFixture();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WFIXTURE__ELEMENTS = eINSTANCE.getWFixture_Elements();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WPackageImpl <em>WPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WPackageImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWPackage()
		 * @generated
		 */
		EClass WPACKAGE = eINSTANCE.getWPackage();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WPACKAGE__ELEMENTS = eINSTANCE.getWPackage_Elements();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WLibraryElementImpl <em>WLibrary Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WLibraryElementImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWLibraryElement()
		 * @generated
		 */
		EClass WLIBRARY_ELEMENT = eINSTANCE.getWLibraryElement();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WNamedImpl <em>WNamed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WNamedImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWNamed()
		 * @generated
		 */
		EClass WNAMED = eINSTANCE.getWNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WNAMED__NAME = eINSTANCE.getWNamed_Name();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WMethodContainerImpl <em>WMethod Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WMethodContainerImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWMethodContainer()
		 * @generated
		 */
		EClass WMETHOD_CONTAINER = eINSTANCE.getWMethodContainer();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WMETHOD_CONTAINER__MEMBERS = eINSTANCE.getWMethodContainer_Members();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WReferenciableImpl <em>WReferenciable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WReferenciableImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWReferenciable()
		 * @generated
		 */
		EClass WREFERENCIABLE = eINSTANCE.getWReferenciable();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WExpressionImpl <em>WExpression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WExpressionImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWExpression()
		 * @generated
		 */
		EClass WEXPRESSION = eINSTANCE.getWExpression();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WMethodDeclarationImpl <em>WMethod Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WMethodDeclarationImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWMethodDeclaration()
		 * @generated
		 */
		EClass WMETHOD_DECLARATION = eINSTANCE.getWMethodDeclaration();

		/**
		 * The meta object literal for the '<em><b>Overrides</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WMETHOD_DECLARATION__OVERRIDES = eINSTANCE.getWMethodDeclaration_Overrides();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WMETHOD_DECLARATION__PARAMETERS = eINSTANCE.getWMethodDeclaration_Parameters();

		/**
		 * The meta object literal for the '<em><b>Native</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WMETHOD_DECLARATION__NATIVE = eINSTANCE.getWMethodDeclaration_Native();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WMETHOD_DECLARATION__EXPRESSION = eINSTANCE.getWMethodDeclaration_Expression();

		/**
		 * The meta object literal for the '<em><b>Expression Returns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WMETHOD_DECLARATION__EXPRESSION_RETURNS = eINSTANCE.getWMethodDeclaration_ExpressionReturns();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WParameterImpl <em>WParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WParameterImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWParameter()
		 * @generated
		 */
		EClass WPARAMETER = eINSTANCE.getWParameter();

		/**
		 * The meta object literal for the '<em><b>Var Arg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPARAMETER__VAR_ARG = eINSTANCE.getWParameter_VarArg();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WVariableImpl <em>WVariable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WVariableImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWVariable()
		 * @generated
		 */
		EClass WVARIABLE = eINSTANCE.getWVariable();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WFeatureCallImpl <em>WFeature Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WFeatureCallImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWFeatureCall()
		 * @generated
		 */
		EClass WFEATURE_CALL = eINSTANCE.getWFeatureCall();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WVariableReferenceImpl <em>WVariable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WVariableReferenceImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWVariableReference()
		 * @generated
		 */
		EClass WVARIABLE_REFERENCE = eINSTANCE.getWVariableReference();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WVARIABLE_REFERENCE__REF = eINSTANCE.getWVariableReference_Ref();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WIfExpressionImpl <em>WIf Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WIfExpressionImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWIfExpression()
		 * @generated
		 */
		EClass WIF_EXPRESSION = eINSTANCE.getWIfExpression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIF_EXPRESSION__CONDITION = eINSTANCE.getWIfExpression_Condition();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIF_EXPRESSION__THEN = eINSTANCE.getWIfExpression_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIF_EXPRESSION__ELSE = eINSTANCE.getWIfExpression_Else();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WCollectionLiteralImpl <em>WCollection Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WCollectionLiteralImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWCollectionLiteral()
		 * @generated
		 */
		EClass WCOLLECTION_LITERAL = eINSTANCE.getWCollectionLiteral();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCOLLECTION_LITERAL__ELEMENTS = eINSTANCE.getWCollectionLiteral_Elements();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WListLiteralImpl <em>WList Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WListLiteralImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWListLiteral()
		 * @generated
		 */
		EClass WLIST_LITERAL = eINSTANCE.getWListLiteral();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WSetLiteralImpl <em>WSet Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WSetLiteralImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWSetLiteral()
		 * @generated
		 */
		EClass WSET_LITERAL = eINSTANCE.getWSetLiteral();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WNamedObjectImpl <em>WNamed Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WNamedObjectImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWNamedObject()
		 * @generated
		 */
		EClass WNAMED_OBJECT = eINSTANCE.getWNamedObject();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WNAMED_OBJECT__PARENT = eINSTANCE.getWNamedObject_Parent();

		/**
		 * The meta object literal for the '<em><b>Parent Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WNAMED_OBJECT__PARENT_PARAMETERS = eINSTANCE.getWNamedObject_ParentParameters();

		/**
		 * The meta object literal for the '<em><b>Mixins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WNAMED_OBJECT__MIXINS = eINSTANCE.getWNamedObject_Mixins();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WCanExtendClassImpl <em>WCan Extend Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WCanExtendClassImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWCanExtendClass()
		 * @generated
		 */
		EClass WCAN_EXTEND_CLASS = eINSTANCE.getWCanExtendClass();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WClassImpl <em>WClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WClassImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWClass()
		 * @generated
		 */
		EClass WCLASS = eINSTANCE.getWClass();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCLASS__PARENT = eINSTANCE.getWClass_Parent();

		/**
		 * The meta object literal for the '<em><b>Mixins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCLASS__MIXINS = eINSTANCE.getWClass_Mixins();

		/**
		 * The meta object literal for the '<em><b>Constructors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCLASS__CONSTRUCTORS = eINSTANCE.getWClass_Constructors();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WMixinImpl <em>WMixin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WMixinImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWMixin()
		 * @generated
		 */
		EClass WMIXIN = eINSTANCE.getWMixin();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WMemberImpl <em>WMember</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WMemberImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWMember()
		 * @generated
		 */
		EClass WMEMBER = eINSTANCE.getWMember();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WConstructorImpl <em>WConstructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WConstructorImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWConstructor()
		 * @generated
		 */
		EClass WCONSTRUCTOR = eINSTANCE.getWConstructor();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCONSTRUCTOR__PARAMETERS = eINSTANCE.getWConstructor_Parameters();

		/**
		 * The meta object literal for the '<em><b>Delegating Constructor Call</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCONSTRUCTOR__DELEGATING_CONSTRUCTOR_CALL = eINSTANCE.getWConstructor_DelegatingConstructorCall();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCONSTRUCTOR__EXPRESSION = eINSTANCE.getWConstructor_Expression();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WDelegatingConstructorCallImpl <em>WDelegating Constructor Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WDelegatingConstructorCallImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWDelegatingConstructorCall()
		 * @generated
		 */
		EClass WDELEGATING_CONSTRUCTOR_CALL = eINSTANCE.getWDelegatingConstructorCall();

		/**
		 * The meta object literal for the '<em><b>Argument List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WDELEGATING_CONSTRUCTOR_CALL__ARGUMENT_LIST = eINSTANCE.getWDelegatingConstructorCall_ArgumentList();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WSelfDelegatingConstructorCallImpl <em>WSelf Delegating Constructor Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WSelfDelegatingConstructorCallImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWSelfDelegatingConstructorCall()
		 * @generated
		 */
		EClass WSELF_DELEGATING_CONSTRUCTOR_CALL = eINSTANCE.getWSelfDelegatingConstructorCall();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WSuperDelegatingConstructorCallImpl <em>WSuper Delegating Constructor Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WSuperDelegatingConstructorCallImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWSuperDelegatingConstructorCall()
		 * @generated
		 */
		EClass WSUPER_DELEGATING_CONSTRUCTOR_CALL = eINSTANCE.getWSuperDelegatingConstructorCall();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WConstructorCallImpl <em>WConstructor Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WConstructorCallImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWConstructorCall()
		 * @generated
		 */
		EClass WCONSTRUCTOR_CALL = eINSTANCE.getWConstructorCall();

		/**
		 * The meta object literal for the '<em><b>Class Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCONSTRUCTOR_CALL__CLASS_REF = eINSTANCE.getWConstructorCall_ClassRef();

		/**
		 * The meta object literal for the '<em><b>Argument List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCONSTRUCTOR_CALL__ARGUMENT_LIST = eINSTANCE.getWConstructorCall_ArgumentList();

		/**
		 * The meta object literal for the '<em><b>Mixins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCONSTRUCTOR_CALL__MIXINS = eINSTANCE.getWConstructorCall_Mixins();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WArgumentListImpl <em>WArgument List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WArgumentListImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWArgumentList()
		 * @generated
		 */
		EClass WARGUMENT_LIST = eINSTANCE.getWArgumentList();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WNamedArgumentsListImpl <em>WNamed Arguments List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WNamedArgumentsListImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWNamedArgumentsList()
		 * @generated
		 */
		EClass WNAMED_ARGUMENTS_LIST = eINSTANCE.getWNamedArgumentsList();

		/**
		 * The meta object literal for the '<em><b>Initializers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WNAMED_ARGUMENTS_LIST__INITIALIZERS = eINSTANCE.getWNamedArgumentsList_Initializers();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WPositionalArgumentsListImpl <em>WPositional Arguments List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WPositionalArgumentsListImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWPositionalArgumentsList()
		 * @generated
		 */
		EClass WPOSITIONAL_ARGUMENTS_LIST = eINSTANCE.getWPositionalArgumentsList();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WPOSITIONAL_ARGUMENTS_LIST__VALUES = eINSTANCE.getWPositionalArgumentsList_Values();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WInitializerImpl <em>WInitializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WInitializerImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWInitializer()
		 * @generated
		 */
		EClass WINITIALIZER = eINSTANCE.getWInitializer();

		/**
		 * The meta object literal for the '<em><b>Initializer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINITIALIZER__INITIALIZER = eINSTANCE.getWInitializer_Initializer();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINITIALIZER__INITIAL_VALUE = eINSTANCE.getWInitializer_InitialValue();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WTryImpl <em>WTry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WTryImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWTry()
		 * @generated
		 */
		EClass WTRY = eINSTANCE.getWTry();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WTRY__EXPRESSION = eINSTANCE.getWTry_Expression();

		/**
		 * The meta object literal for the '<em><b>Catch Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WTRY__CATCH_BLOCKS = eINSTANCE.getWTry_CatchBlocks();

		/**
		 * The meta object literal for the '<em><b>Always Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WTRY__ALWAYS_EXPRESSION = eINSTANCE.getWTry_AlwaysExpression();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WCatchImpl <em>WCatch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WCatchImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWCatch()
		 * @generated
		 */
		EClass WCATCH = eINSTANCE.getWCatch();

		/**
		 * The meta object literal for the '<em><b>Exception Var Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCATCH__EXCEPTION_VAR_NAME = eINSTANCE.getWCatch_ExceptionVarName();

		/**
		 * The meta object literal for the '<em><b>Exception Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCATCH__EXCEPTION_TYPE = eINSTANCE.getWCatch_ExceptionType();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCATCH__EXPRESSION = eINSTANCE.getWCatch_Expression();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WReturnExpressionImpl <em>WReturn Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WReturnExpressionImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWReturnExpression()
		 * @generated
		 */
		EClass WRETURN_EXPRESSION = eINSTANCE.getWReturnExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRETURN_EXPRESSION__EXPRESSION = eINSTANCE.getWReturnExpression_Expression();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WThrowImpl <em>WThrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WThrowImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWThrow()
		 * @generated
		 */
		EClass WTHROW = eINSTANCE.getWThrow();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WTHROW__EXCEPTION = eINSTANCE.getWThrow_Exception();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WObjectLiteralImpl <em>WObject Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WObjectLiteralImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWObjectLiteral()
		 * @generated
		 */
		EClass WOBJECT_LITERAL = eINSTANCE.getWObjectLiteral();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WOBJECT_LITERAL__PARENT = eINSTANCE.getWObjectLiteral_Parent();

		/**
		 * The meta object literal for the '<em><b>Parent Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WOBJECT_LITERAL__PARENT_PARAMETERS = eINSTANCE.getWObjectLiteral_ParentParameters();

		/**
		 * The meta object literal for the '<em><b>Mixins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WOBJECT_LITERAL__MIXINS = eINSTANCE.getWObjectLiteral_Mixins();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WVariableDeclarationImpl <em>WVariable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WVariableDeclarationImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWVariableDeclaration()
		 * @generated
		 */
		EClass WVARIABLE_DECLARATION = eINSTANCE.getWVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Writeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WVARIABLE_DECLARATION__WRITEABLE = eINSTANCE.getWVariableDeclaration_Writeable();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WVARIABLE_DECLARATION__PROPERTY = eINSTANCE.getWVariableDeclaration_Property();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WVARIABLE_DECLARATION__VARIABLE = eINSTANCE.getWVariableDeclaration_Variable();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WVARIABLE_DECLARATION__RIGHT = eINSTANCE.getWVariableDeclaration_Right();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WAssignmentImpl <em>WAssignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WAssignmentImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWAssignment()
		 * @generated
		 */
		EClass WASSIGNMENT = eINSTANCE.getWAssignment();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WASSIGNMENT__FEATURE = eINSTANCE.getWAssignment_Feature();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WASSIGNMENT__VALUE = eINSTANCE.getWAssignment_Value();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WBinaryOperationImpl <em>WBinary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WBinaryOperationImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWBinaryOperation()
		 * @generated
		 */
		EClass WBINARY_OPERATION = eINSTANCE.getWBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WBINARY_OPERATION__LEFT_OPERAND = eINSTANCE.getWBinaryOperation_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WBINARY_OPERATION__FEATURE = eINSTANCE.getWBinaryOperation_Feature();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WBINARY_OPERATION__RIGHT_OPERAND = eINSTANCE.getWBinaryOperation_RightOperand();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WUnaryOperationImpl <em>WUnary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WUnaryOperationImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWUnaryOperation()
		 * @generated
		 */
		EClass WUNARY_OPERATION = eINSTANCE.getWUnaryOperation();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WUNARY_OPERATION__FEATURE = eINSTANCE.getWUnaryOperation_Feature();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WUNARY_OPERATION__OPERAND = eINSTANCE.getWUnaryOperation_Operand();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WPostfixOperationImpl <em>WPostfix Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WPostfixOperationImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWPostfixOperation()
		 * @generated
		 */
		EClass WPOSTFIX_OPERATION = eINSTANCE.getWPostfixOperation();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WPOSTFIX_OPERATION__OPERAND = eINSTANCE.getWPostfixOperation_Operand();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPOSTFIX_OPERATION__FEATURE = eINSTANCE.getWPostfixOperation_Feature();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WMemberFeatureCallImpl <em>WMember Feature Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WMemberFeatureCallImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWMemberFeatureCall()
		 * @generated
		 */
		EClass WMEMBER_FEATURE_CALL = eINSTANCE.getWMemberFeatureCall();

		/**
		 * The meta object literal for the '<em><b>Member Call Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET = eINSTANCE.getWMemberFeatureCall_MemberCallTarget();

		/**
		 * The meta object literal for the '<em><b>Null Safe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WMEMBER_FEATURE_CALL__NULL_SAFE = eINSTANCE.getWMemberFeatureCall_NullSafe();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WMEMBER_FEATURE_CALL__FEATURE = eINSTANCE.getWMemberFeatureCall_Feature();

		/**
		 * The meta object literal for the '<em><b>Member Call Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS = eINSTANCE.getWMemberFeatureCall_MemberCallArguments();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WSelfImpl <em>WSelf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WSelfImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWSelf()
		 * @generated
		 */
		EClass WSELF = eINSTANCE.getWSelf();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WSuperInvocationImpl <em>WSuper Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WSuperInvocationImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWSuperInvocation()
		 * @generated
		 */
		EClass WSUPER_INVOCATION = eINSTANCE.getWSuperInvocation();

		/**
		 * The meta object literal for the '<em><b>Member Call Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSUPER_INVOCATION__MEMBER_CALL_ARGUMENTS = eINSTANCE.getWSuperInvocation_MemberCallArguments();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WBlockExpressionImpl <em>WBlock Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WBlockExpressionImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWBlockExpression()
		 * @generated
		 */
		EClass WBLOCK_EXPRESSION = eINSTANCE.getWBlockExpression();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WBLOCK_EXPRESSION__EXPRESSIONS = eINSTANCE.getWBlockExpression_Expressions();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WBooleanLiteralImpl <em>WBoolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WBooleanLiteralImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWBooleanLiteral()
		 * @generated
		 */
		EClass WBOOLEAN_LITERAL = eINSTANCE.getWBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Is True</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WBOOLEAN_LITERAL__IS_TRUE = eINSTANCE.getWBooleanLiteral_IsTrue();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WNullLiteralImpl <em>WNull Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WNullLiteralImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWNullLiteral()
		 * @generated
		 */
		EClass WNULL_LITERAL = eINSTANCE.getWNullLiteral();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WStringLiteralImpl <em>WString Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WStringLiteralImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWStringLiteral()
		 * @generated
		 */
		EClass WSTRING_LITERAL = eINSTANCE.getWStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSTRING_LITERAL__VALUE = eINSTANCE.getWStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WNumberLiteralImpl <em>WNumber Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WNumberLiteralImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWNumberLiteral()
		 * @generated
		 */
		EClass WNUMBER_LITERAL = eINSTANCE.getWNumberLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WNUMBER_LITERAL__VALUE = eINSTANCE.getWNumberLiteral_Value();

		/**
		 * The meta object literal for the '{@link wollokDsl.impl.WClosureImpl <em>WClosure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wollokDsl.impl.WClosureImpl
		 * @see wollokDsl.impl.WollokDslPackageImpl#getWClosure()
		 * @generated
		 */
		EClass WCLOSURE = eINSTANCE.getWClosure();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCLOSURE__PARAMETERS = eINSTANCE.getWClosure_Parameters();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCLOSURE__EXPRESSION = eINSTANCE.getWClosure_Expression();

	}

} //WollokDslPackage
