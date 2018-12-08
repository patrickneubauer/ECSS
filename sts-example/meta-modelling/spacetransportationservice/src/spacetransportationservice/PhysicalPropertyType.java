/**
 */
package spacetransportationservice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Physical Property Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see spacetransportationservice.SpacetransportationservicePackage#getPhysicalPropertyType()
 * @model
 * @generated
 */
public enum PhysicalPropertyType implements Enumerator {
	/**
	 * The '<em><b>LENGTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	LENGTH(0, "LENGTH", "LENGTH"),

	/**
	 * The '<em><b>WIDTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDTH_VALUE
	 * @generated
	 * @ordered
	 */
	WIDTH(1, "WIDTH", "WIDTH"),

	/**
	 * The '<em><b>DIAMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	DIAMETER(2, "DIAMETER", "DIAMETER"),

	/**
	 * The '<em><b>PERIMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERIMETER_VALUE
	 * @generated
	 * @ordered
	 */
	PERIMETER(3, "PERIMETER", "PERIMETER"),

	/**
	 * The '<em><b>AREA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AREA_VALUE
	 * @generated
	 * @ordered
	 */
	AREA(4, "AREA", "AREA"),

	/**
	 * The '<em><b>VOLUME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLUME_VALUE
	 * @generated
	 * @ordered
	 */
	VOLUME(5, "VOLUME", "VOLUME"),

	/**
	 * The '<em><b>MASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASS_VALUE
	 * @generated
	 * @ordered
	 */
	MASS(6, "MASS", "MASS");

	/**
	 * The '<em><b>LENGTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LENGTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LENGTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_VALUE = 0;

	/**
	 * The '<em><b>WIDTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIDTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIDTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIDTH_VALUE = 1;

	/**
	 * The '<em><b>DIAMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIAMETER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIAMETER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIAMETER_VALUE = 2;

	/**
	 * The '<em><b>PERIMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERIMETER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERIMETER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERIMETER_VALUE = 3;

	/**
	 * The '<em><b>AREA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AREA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AREA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AREA_VALUE = 4;

	/**
	 * The '<em><b>VOLUME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VOLUME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOLUME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VOLUME_VALUE = 5;

	/**
	 * The '<em><b>MASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MASS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MASS_VALUE = 6;

	/**
	 * An array of all the '<em><b>Physical Property Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PhysicalPropertyType[] VALUES_ARRAY =
		new PhysicalPropertyType[] {
			LENGTH,
			WIDTH,
			DIAMETER,
			PERIMETER,
			AREA,
			VOLUME,
			MASS,
		};

	/**
	 * A public read-only list of all the '<em><b>Physical Property Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PhysicalPropertyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Physical Property Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PhysicalPropertyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PhysicalPropertyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Physical Property Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PhysicalPropertyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PhysicalPropertyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Physical Property Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PhysicalPropertyType get(int value) {
		switch (value) {
			case LENGTH_VALUE: return LENGTH;
			case WIDTH_VALUE: return WIDTH;
			case DIAMETER_VALUE: return DIAMETER;
			case PERIMETER_VALUE: return PERIMETER;
			case AREA_VALUE: return AREA;
			case VOLUME_VALUE: return VOLUME;
			case MASS_VALUE: return MASS;
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
	private PhysicalPropertyType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //PhysicalPropertyType
