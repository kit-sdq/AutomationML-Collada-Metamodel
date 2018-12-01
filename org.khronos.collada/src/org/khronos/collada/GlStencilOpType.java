/**
 */
package org.khronos.collada;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gl Stencil Op Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.khronos.collada.ColladaPackage#getGlStencilOpType()
 * @model extendedMetaData="name='gl_stencil_op_type'"
 * @generated
 */
public enum GlStencilOpType implements Enumerator {
	/**
	 * The '<em><b>KEEP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEP_VALUE
	 * @generated
	 * @ordered
	 */
	KEEP(0, "KEEP", "KEEP"),

	/**
	 * The '<em><b>ZERO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_VALUE
	 * @generated
	 * @ordered
	 */
	ZERO(1, "ZERO", "ZERO"),

	/**
	 * The '<em><b>REPLACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACE_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACE(2, "REPLACE", "REPLACE"),

	/**
	 * The '<em><b>INCR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCR_VALUE
	 * @generated
	 * @ordered
	 */
	INCR(3, "INCR", "INCR"),

	/**
	 * The '<em><b>DECR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECR_VALUE
	 * @generated
	 * @ordered
	 */
	DECR(4, "DECR", "DECR"),

	/**
	 * The '<em><b>INVERT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVERT_VALUE
	 * @generated
	 * @ordered
	 */
	INVERT(5, "INVERT", "INVERT"),

	/**
	 * The '<em><b>INCRWRAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCRWRAP_VALUE
	 * @generated
	 * @ordered
	 */
	INCRWRAP(6, "INCRWRAP", "INCR_WRAP"),

	/**
	 * The '<em><b>DECRWRAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECRWRAP_VALUE
	 * @generated
	 * @ordered
	 */
	DECRWRAP(7, "DECRWRAP", "DECR_WRAP");

	/**
	 * The '<em><b>KEEP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEEP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEEP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEEP_VALUE = 0;

	/**
	 * The '<em><b>ZERO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ZERO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZERO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZERO_VALUE = 1;

	/**
	 * The '<em><b>REPLACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REPLACE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPLACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REPLACE_VALUE = 2;

	/**
	 * The '<em><b>INCR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INCR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCR_VALUE = 3;

	/**
	 * The '<em><b>DECR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DECR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DECR_VALUE = 4;

	/**
	 * The '<em><b>INVERT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INVERT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INVERT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INVERT_VALUE = 5;

	/**
	 * The '<em><b>INCRWRAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INCRWRAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCRWRAP
	 * @model literal="INCR_WRAP"
	 * @generated
	 * @ordered
	 */
	public static final int INCRWRAP_VALUE = 6;

	/**
	 * The '<em><b>DECRWRAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DECRWRAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECRWRAP
	 * @model literal="DECR_WRAP"
	 * @generated
	 * @ordered
	 */
	public static final int DECRWRAP_VALUE = 7;

	/**
	 * An array of all the '<em><b>Gl Stencil Op Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GlStencilOpType[] VALUES_ARRAY =
		new GlStencilOpType[] {
			KEEP,
			ZERO,
			REPLACE,
			INCR,
			DECR,
			INVERT,
			INCRWRAP,
			DECRWRAP,
		};

	/**
	 * A public read-only list of all the '<em><b>Gl Stencil Op Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GlStencilOpType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gl Stencil Op Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GlStencilOpType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GlStencilOpType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gl Stencil Op Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GlStencilOpType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GlStencilOpType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gl Stencil Op Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GlStencilOpType get(int value) {
		switch (value) {
			case KEEP_VALUE: return KEEP;
			case ZERO_VALUE: return ZERO;
			case REPLACE_VALUE: return REPLACE;
			case INCR_VALUE: return INCR;
			case DECR_VALUE: return DECR;
			case INVERT_VALUE: return INVERT;
			case INCRWRAP_VALUE: return INCRWRAP;
			case DECRWRAP_VALUE: return DECRWRAP;
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
	private GlStencilOpType(int value, String name, String literal) {
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
	
} //GlStencilOpType
