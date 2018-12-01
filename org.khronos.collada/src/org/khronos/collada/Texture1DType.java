/**
 */
package org.khronos.collada;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Texture1 DType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.khronos.collada.Texture1DType#getValue <em>Value</em>}</li>
 *   <li>{@link org.khronos.collada.Texture1DType#getParam <em>Param</em>}</li>
 *   <li>{@link org.khronos.collada.Texture1DType#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see org.khronos.collada.ColladaPackage#getTexture1DType()
 * @model extendedMetaData="name='texture1D_._type' kind='elementOnly'"
 * @generated
 */
public interface Texture1DType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(GlSampler1D)
	 * @see org.khronos.collada.ColladaPackage#getTexture1DType_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	GlSampler1D getValue();

	/**
	 * Sets the value of the '{@link org.khronos.collada.Texture1DType#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(GlSampler1D value);

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
	 * @see org.khronos.collada.ColladaPackage#getTexture1DType_Param()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
	 * @generated
	 */
	String getParam();

	/**
	 * Sets the value of the '{@link org.khronos.collada.Texture1DType#getParam <em>Param</em>}' attribute.
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
	 * @see org.khronos.collada.ColladaPackage#getTexture1DType_Index()
	 * @model dataType="org.khronos.collada.GLMAXTEXTUREIMAGEUNITSIndex" required="true"
	 *        extendedMetaData="kind='attribute' name='index'"
	 * @generated
	 */
	BigInteger getIndex();

	/**
	 * Sets the value of the '{@link org.khronos.collada.Texture1DType#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(BigInteger value);

} // Texture1DType
