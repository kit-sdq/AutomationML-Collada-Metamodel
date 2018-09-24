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
 * A representation of the model object '<em><b>Lambert Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.LambertType#getEmission <em>Emission</em>}</li>
 *   <li>{@link org.khronos.collada.LambertType#getAmbient <em>Ambient</em>}</li>
 *   <li>{@link org.khronos.collada.LambertType#getDiffuse <em>Diffuse</em>}</li>
 *   <li>{@link org.khronos.collada.LambertType#getReflective <em>Reflective</em>}</li>
 *   <li>{@link org.khronos.collada.LambertType#getReflectivity <em>Reflectivity</em>}</li>
 *   <li>{@link org.khronos.collada.LambertType#getTransparent <em>Transparent</em>}</li>
 *   <li>{@link org.khronos.collada.LambertType#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link org.khronos.collada.LambertType#getIndexOfRefraction <em>Index Of Refraction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getLambertType()
 * @model extendedMetaData="name='lambert_._type' kind='elementOnly'"
 * @generated
 */
public interface LambertType extends EObject {
	/**
   * Returns the value of the '<em><b>Emission</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emission</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Emission</em>' containment reference.
   * @see #setEmission(CommonColorOrTextureType)
   * @see org.khronos.collada.ColladaPackage#getLambertType_Emission()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='emission' namespace='##targetNamespace'"
   * @generated
   */
	CommonColorOrTextureType getEmission();

	/**
   * Sets the value of the '{@link org.khronos.collada.LambertType#getEmission <em>Emission</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Emission</em>' containment reference.
   * @see #getEmission()
   * @generated
   */
	void setEmission(CommonColorOrTextureType value);

	/**
   * Returns the value of the '<em><b>Ambient</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ambient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Ambient</em>' containment reference.
   * @see #setAmbient(CommonColorOrTextureType)
   * @see org.khronos.collada.ColladaPackage#getLambertType_Ambient()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='ambient' namespace='##targetNamespace'"
   * @generated
   */
	CommonColorOrTextureType getAmbient();

	/**
   * Sets the value of the '{@link org.khronos.collada.LambertType#getAmbient <em>Ambient</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ambient</em>' containment reference.
   * @see #getAmbient()
   * @generated
   */
	void setAmbient(CommonColorOrTextureType value);

	/**
   * Returns the value of the '<em><b>Diffuse</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffuse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Diffuse</em>' containment reference.
   * @see #setDiffuse(CommonColorOrTextureType)
   * @see org.khronos.collada.ColladaPackage#getLambertType_Diffuse()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='diffuse' namespace='##targetNamespace'"
   * @generated
   */
	CommonColorOrTextureType getDiffuse();

	/**
   * Sets the value of the '{@link org.khronos.collada.LambertType#getDiffuse <em>Diffuse</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Diffuse</em>' containment reference.
   * @see #getDiffuse()
   * @generated
   */
	void setDiffuse(CommonColorOrTextureType value);

	/**
   * Returns the value of the '<em><b>Reflective</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reflective</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Reflective</em>' containment reference.
   * @see #setReflective(CommonColorOrTextureType)
   * @see org.khronos.collada.ColladaPackage#getLambertType_Reflective()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='reflective' namespace='##targetNamespace'"
   * @generated
   */
	CommonColorOrTextureType getReflective();

	/**
   * Sets the value of the '{@link org.khronos.collada.LambertType#getReflective <em>Reflective</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reflective</em>' containment reference.
   * @see #getReflective()
   * @generated
   */
	void setReflective(CommonColorOrTextureType value);

	/**
   * Returns the value of the '<em><b>Reflectivity</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reflectivity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Reflectivity</em>' containment reference.
   * @see #setReflectivity(CommonFloatOrParamType)
   * @see org.khronos.collada.ColladaPackage#getLambertType_Reflectivity()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='reflectivity' namespace='##targetNamespace'"
   * @generated
   */
	CommonFloatOrParamType getReflectivity();

	/**
   * Sets the value of the '{@link org.khronos.collada.LambertType#getReflectivity <em>Reflectivity</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reflectivity</em>' containment reference.
   * @see #getReflectivity()
   * @generated
   */
	void setReflectivity(CommonFloatOrParamType value);

	/**
   * Returns the value of the '<em><b>Transparent</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transparent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Transparent</em>' containment reference.
   * @see #setTransparent(CommonTransparentType)
   * @see org.khronos.collada.ColladaPackage#getLambertType_Transparent()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='transparent' namespace='##targetNamespace'"
   * @generated
   */
	CommonTransparentType getTransparent();

	/**
   * Sets the value of the '{@link org.khronos.collada.LambertType#getTransparent <em>Transparent</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transparent</em>' containment reference.
   * @see #getTransparent()
   * @generated
   */
	void setTransparent(CommonTransparentType value);

	/**
   * Returns the value of the '<em><b>Transparency</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transparency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Transparency</em>' containment reference.
   * @see #setTransparency(CommonFloatOrParamType)
   * @see org.khronos.collada.ColladaPackage#getLambertType_Transparency()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='transparency' namespace='##targetNamespace'"
   * @generated
   */
	CommonFloatOrParamType getTransparency();

	/**
   * Sets the value of the '{@link org.khronos.collada.LambertType#getTransparency <em>Transparency</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transparency</em>' containment reference.
   * @see #getTransparency()
   * @generated
   */
	void setTransparency(CommonFloatOrParamType value);

	/**
   * Returns the value of the '<em><b>Index Of Refraction</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Of Refraction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Index Of Refraction</em>' containment reference.
   * @see #setIndexOfRefraction(CommonFloatOrParamType)
   * @see org.khronos.collada.ColladaPackage#getLambertType_IndexOfRefraction()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='index_of_refraction' namespace='##targetNamespace'"
   * @generated
   */
	CommonFloatOrParamType getIndexOfRefraction();

	/**
   * Sets the value of the '{@link org.khronos.collada.LambertType#getIndexOfRefraction <em>Index Of Refraction</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index Of Refraction</em>' containment reference.
   * @see #getIndexOfRefraction()
   * @generated
   */
	void setIndexOfRefraction(CommonFloatOrParamType value);

} // LambertType