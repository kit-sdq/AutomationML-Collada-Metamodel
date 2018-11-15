/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Light Ambient Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.khronos.collada.LightAmbientType1#getIndex <em>Index</em>}</li>
 *   <li>{@link org.khronos.collada.LightAmbientType1#getParam <em>Param</em>}</li>
 *   <li>{@link org.khronos.collada.LightAmbientType1#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.khronos.collada.ColladaPackage#getLightAmbientType1()
 * @model extendedMetaData="name='light_ambient_._1_._type' kind='empty'"
 * @generated
 */
public interface LightAmbientType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(BigInteger)
	 * @see org.khronos.collada.ColladaPackage#getLightAmbientType1_Index()
	 * @model dataType="org.khronos.collada.GLMAXLIGHTSIndex" required="true"
	 *        extendedMetaData="kind='attribute' name='index'"
	 * @generated
	 */
	BigInteger getIndex();

	/**
	 * Sets the value of the '{@link org.khronos.collada.LightAmbientType1#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' attribute.
	 * @see #setParam(String)
	 * @see org.khronos.collada.ColladaPackage#getLightAmbientType1_Param()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='param'"
	 * @generated
	 */
	String getParam();

	/**
	 * Sets the value of the '{@link org.khronos.collada.LightAmbientType1#getParam <em>Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' attribute.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0 0 0 1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(List)
	 * @see org.khronos.collada.ColladaPackage#getLightAmbientType1_Value()
	 * @model default="0 0 0 1" unsettable="true" dataType="org.khronos.collada.Float4" many="false"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	List<Double> getValue();

	/**
	 * Sets the value of the '{@link org.khronos.collada.LightAmbientType1#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(List<Double> value);

	/**
	 * Unsets the value of the '{@link org.khronos.collada.LightAmbientType1#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(List)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.khronos.collada.LightAmbientType1#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(List)
	 * @generated
	 */
	boolean isSetValue();

} // LightAmbientType1
