/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.khronos.collada.InstanceGeometryType#getBindMaterial <em>Bind Material</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceGeometryType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceGeometryType#getName <em>Name</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceGeometryType#getSid <em>Sid</em>}</li>
 *   <li>{@link org.khronos.collada.InstanceGeometryType#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see org.khronos.collada.ColladaPackage#getInstanceGeometryType()
 * @model extendedMetaData="name='instance_geometry_._type' kind='elementOnly'"
 * @generated
 */
public interface InstanceGeometryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bind Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Bind a specific material to a piece of geometry, binding varying and uniform parameters at the 
	 * 						same time.
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bind Material</em>' containment reference.
	 * @see #setBindMaterial(BindMaterialType)
	 * @see org.khronos.collada.ColladaPackage#getInstanceGeometryType_BindMaterial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bind_material' namespace='##targetNamespace'"
	 * @generated
	 */
	BindMaterialType getBindMaterial();

	/**
	 * Sets the value of the '{@link org.khronos.collada.InstanceGeometryType#getBindMaterial <em>Bind Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind Material</em>' containment reference.
	 * @see #getBindMaterial()
	 * @generated
	 */
	void setBindMaterial(BindMaterialType value);

	/**
	 * Returns the value of the '<em><b>Extra</b></em>' containment reference list.
	 * The list contents are of type {@link org.khronos.collada.ExtraType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						The extra element may appear any number of times.
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extra</em>' containment reference list.
	 * @see org.khronos.collada.ColladaPackage#getInstanceGeometryType_Extra()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExtraType> getExtra();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 					The name attribute is the text string name of this element. Optional attribute.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.khronos.collada.ColladaPackage#getInstanceGeometryType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.khronos.collada.InstanceGeometryType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 					The sid attribute is a text string value containing the sub-identifier of this element. This 
	 * 					value must be unique within the scope of the parent element. Optional attribute.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sid</em>' attribute.
	 * @see #setSid(String)
	 * @see org.khronos.collada.ColladaPackage#getInstanceGeometryType_Sid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='sid'"
	 * @generated
	 */
	String getSid();

	/**
	 * Sets the value of the '{@link org.khronos.collada.InstanceGeometryType#getSid <em>Sid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sid</em>' attribute.
	 * @see #getSid()
	 * @generated
	 */
	void setSid(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 					The url attribute refers to resource.  This may refer to a local resource using a relative URL 
	 * 					fragment identifier that begins with the �#� character. The url attribute may refer to an external 
	 * 					resource using an absolute or relative URL.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.khronos.collada.ColladaPackage#getInstanceGeometryType_Url()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='url'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.khronos.collada.InstanceGeometryType#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // InstanceGeometryType
