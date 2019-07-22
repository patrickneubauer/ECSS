/**
 */
package spacetransportationservice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Function</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see spacetransportationservice.SpacetransportationservicePackage#getFunction()
 * @model
 * @generated
 */
public enum Function implements Enumerator {
	/**
	 * The '<em><b>MARS COLONIZATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARS_COLONIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	MARS_COLONIZATION(0, "MARS_COLONIZATION", "MARS_COLONIZATION"),

	/**
	 * The '<em><b>EARTH LUNAR TRANSPORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARTH_LUNAR_TRANSPORT_VALUE
	 * @generated
	 * @ordered
	 */
	EARTH_LUNAR_TRANSPORT(1, "EARTH_LUNAR_TRANSPORT", "EARTH_LUNAR_TRANSPORT"),

	/**
	 * The '<em><b>MULTIPLANETARY TRANSPORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLANETARY_TRANSPORT_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLANETARY_TRANSPORT(2, "MULTIPLANETARY_TRANSPORT", "MULTIPLANETARY_TRANSPORT"),

	/**
	 * The '<em><b>INTERCONTINENTAL TRANSPORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERCONTINENTAL_TRANSPORT_VALUE
	 * @generated
	 * @ordered
	 */
	INTERCONTINENTAL_TRANSPORT(3, "INTERCONTINENTAL_TRANSPORT", "INTERCONTINENTAL_TRANSPORT"),

	/**
	 * The '<em><b>ORBITAL LAUNCHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORBITAL_LAUNCHER_VALUE
	 * @generated
	 * @ordered
	 */
	ORBITAL_LAUNCHER(4, "ORBITAL_LAUNCHER", "ORBITAL_LAUNCHER");

	/**
	 * The '<em><b>MARS COLONIZATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MARS COLONIZATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MARS_COLONIZATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MARS_COLONIZATION_VALUE = 0;

	/**
	 * The '<em><b>EARTH LUNAR TRANSPORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EARTH LUNAR TRANSPORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EARTH_LUNAR_TRANSPORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EARTH_LUNAR_TRANSPORT_VALUE = 1;

	/**
	 * The '<em><b>MULTIPLANETARY TRANSPORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTIPLANETARY TRANSPORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLANETARY_TRANSPORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLANETARY_TRANSPORT_VALUE = 2;

	/**
	 * The '<em><b>INTERCONTINENTAL TRANSPORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERCONTINENTAL TRANSPORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERCONTINENTAL_TRANSPORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERCONTINENTAL_TRANSPORT_VALUE = 3;

	/**
	 * The '<em><b>ORBITAL LAUNCHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORBITAL LAUNCHER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORBITAL_LAUNCHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORBITAL_LAUNCHER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Function[] VALUES_ARRAY =
		new Function[] {
			MARS_COLONIZATION,
			EARTH_LUNAR_TRANSPORT,
			MULTIPLANETARY_TRANSPORT,
			INTERCONTINENTAL_TRANSPORT,
			ORBITAL_LAUNCHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Function> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Function</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Function get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Function result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Function</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Function getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Function result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Function</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Function get(int value) {
		switch (value) {
			case MARS_COLONIZATION_VALUE: return MARS_COLONIZATION;
			case EARTH_LUNAR_TRANSPORT_VALUE: return EARTH_LUNAR_TRANSPORT;
			case MULTIPLANETARY_TRANSPORT_VALUE: return MULTIPLANETARY_TRANSPORT;
			case INTERCONTINENTAL_TRANSPORT_VALUE: return INTERCONTINENTAL_TRANSPORT;
			case ORBITAL_LAUNCHER_VALUE: return ORBITAL_LAUNCHER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Function(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Function
