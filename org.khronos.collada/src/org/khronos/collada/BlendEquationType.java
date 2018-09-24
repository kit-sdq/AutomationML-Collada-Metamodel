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
 * A representation of the model object '<em><b>Blend Equation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.BlendEquationType#getParam <em>Param</em>}</li>
 *   <li>{@link org.khronos.collada.BlendEquationType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getBlendEquationType()
 * @model extendedMetaData="name='blend_equation_._type' kind='empty'"
 * @generated
 */
public interface BlendEquationType extends EObject {
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
   * @see org.khronos.collada.ColladaPackage#getBlendEquationType_Param()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='attribute' name='param'"
   * @generated
   */
	String getParam();

	/**
   * Sets the value of the '{@link org.khronos.collada.BlendEquationType#getParam <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' attribute.
   * @see #getParam()
   * @generated
   */
	void setParam(String value);

	/**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The default value is <code>"FUNC_ADD"</code>.
   * The literals are from the enumeration {@link org.khronos.collada.GlBlendEquationType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.khronos.collada.GlBlendEquationType
   * @see #isSetValue()
   * @see #unsetValue()
   * @see #setValue(GlBlendEquationType)
   * @see org.khronos.collada.ColladaPackage#getBlendEquationType_Value()
   * @model default="FUNC_ADD" unsettable="true"
   *        extendedMetaData="kind='attribute' name='value'"
   * @generated
   */
	GlBlendEquationType getValue();

	/**
   * Sets the value of the '{@link org.khronos.collada.BlendEquationType#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.khronos.collada.GlBlendEquationType
   * @see #isSetValue()
   * @see #unsetValue()
   * @see #getValue()
   * @generated
   */
	void setValue(GlBlendEquationType value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.BlendEquationType#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetValue()
   * @see #getValue()
   * @see #setValue(GlBlendEquationType)
   * @generated
   */
	void unsetValue();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.BlendEquationType#getValue <em>Value</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Value</em>' attribute is set.
   * @see #unsetValue()
   * @see #getValue()
   * @see #setValue(GlBlendEquationType)
   * @generated
   */
	boolean isSetValue();

} // BlendEquationType