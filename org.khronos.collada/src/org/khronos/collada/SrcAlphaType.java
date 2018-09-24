/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Alpha Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.SrcAlphaType#getParam <em>Param</em>}</li>
 *   <li>{@link org.khronos.collada.SrcAlphaType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getSrcAlphaType()
 * @model extendedMetaData="name='src_alpha_._type' kind='empty'"
 * @generated
 */
public interface SrcAlphaType extends EObject {
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
   * @see org.khronos.collada.ColladaPackage#getSrcAlphaType_Param()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='param'"
   * @generated
   */
	String getParam();

	/**
   * Sets the value of the '{@link org.khronos.collada.SrcAlphaType#getParam <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' attribute.
   * @see #getParam()
   * @generated
   */
	void setParam(String value);

	/**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The default value is <code>"ONE"</code>.
   * The literals are from the enumeration {@link org.khronos.collada.GlBlendType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.khronos.collada.GlBlendType
   * @see #isSetValue()
   * @see #unsetValue()
   * @see #setValue(GlBlendType)
   * @see org.khronos.collada.ColladaPackage#getSrcAlphaType_Value()
   * @model default="ONE" unsettable="true"
   *        extendedMetaData="kind='attribute' name='value'"
   * @generated
   */
	GlBlendType getValue();

	/**
   * Sets the value of the '{@link org.khronos.collada.SrcAlphaType#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.khronos.collada.GlBlendType
   * @see #isSetValue()
   * @see #unsetValue()
   * @see #getValue()
   * @generated
   */
	void setValue(GlBlendType value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.SrcAlphaType#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetValue()
   * @see #getValue()
   * @see #setValue(GlBlendType)
   * @generated
   */
	void unsetValue();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.SrcAlphaType#getValue <em>Value</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Value</em>' attribute is set.
   * @see #unsetValue()
   * @see #getValue()
   * @see #setValue(GlBlendType)
   * @generated
   */
	boolean isSetValue();

} // SrcAlphaType