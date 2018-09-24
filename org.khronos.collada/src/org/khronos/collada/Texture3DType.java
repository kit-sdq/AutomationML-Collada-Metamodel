/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Texture3 DType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.Texture3DType#getValue <em>Value</em>}</li>
 *   <li>{@link org.khronos.collada.Texture3DType#getParam <em>Param</em>}</li>
 *   <li>{@link org.khronos.collada.Texture3DType#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getTexture3DType()
 * @model extendedMetaData="name='texture3D_._type' kind='elementOnly'"
 * @generated
 */
public interface Texture3DType extends EObject {
	/**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(GlSampler3D)
   * @see org.khronos.collada.ColladaPackage#getTexture3DType_Value()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
   * @generated
   */
	GlSampler3D getValue();

	/**
   * Sets the value of the '{@link org.khronos.collada.Texture3DType#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
	void setValue(GlSampler3D value);

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
   * @see org.khronos.collada.ColladaPackage#getTexture3DType_Param()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
   *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
   * @generated
   */
	String getParam();

	/**
   * Sets the value of the '{@link org.khronos.collada.Texture3DType#getParam <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' attribute.
   * @see #getParam()
   * @generated
   */
	void setParam(String value);

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
   * @see org.khronos.collada.ColladaPackage#getTexture3DType_Index()
   * @model dataType="org.khronos.collada.GLMAXTEXTUREIMAGEUNITSIndex" required="true"
   *        extendedMetaData="kind='attribute' name='index'"
   * @generated
   */
	BigInteger getIndex();

	/**
   * Sets the value of the '{@link org.khronos.collada.Texture3DType#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
	void setIndex(BigInteger value);

} // Texture3DType