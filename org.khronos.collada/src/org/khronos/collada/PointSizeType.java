/**
 */
package org.khronos.collada;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Size Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.khronos.collada.PointSizeType#getParam <em>Param</em>}</li>
 *   <li>{@link org.khronos.collada.PointSizeType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.khronos.collada.ColladaPackage#getPointSizeType()
 * @model extendedMetaData="name='point_size_._type' kind='empty'"
 * @generated
 */
public interface PointSizeType extends EObject {
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
	 * @see org.khronos.collada.ColladaPackage#getPointSizeType_Param()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='param'"
	 * @generated
	 */
	String getParam();

	/**
	 * Sets the value of the '{@link org.khronos.collada.PointSizeType#getParam <em>Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' attribute.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(double)
	 * @see org.khronos.collada.ColladaPackage#getPointSizeType_Value()
	 * @model default="1" unsettable="true" dataType="org.khronos.collada.Float"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.khronos.collada.PointSizeType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Unsets the value of the '{@link org.khronos.collada.PointSizeType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(double)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.khronos.collada.PointSizeType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(double)
	 * @generated
	 */
	boolean isSetValue();

} // PointSizeType
