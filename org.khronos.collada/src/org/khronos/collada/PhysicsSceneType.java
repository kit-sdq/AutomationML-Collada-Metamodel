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
 * A representation of the model object '<em><b>Physics Scene Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.khronos.collada.PhysicsSceneType#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.PhysicsSceneType#getInstanceForceField <em>Instance Force Field</em>}</li>
 *   <li>{@link org.khronos.collada.PhysicsSceneType#getInstancePhysicsModel <em>Instance Physics Model</em>}</li>
 *   <li>{@link org.khronos.collada.PhysicsSceneType#getTechniqueCommon <em>Technique Common</em>}</li>
 *   <li>{@link org.khronos.collada.PhysicsSceneType#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.khronos.collada.PhysicsSceneType#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.PhysicsSceneType#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.PhysicsSceneType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.khronos.collada.ColladaPackage#getPhysicsSceneType()
 * @model extendedMetaData="name='physics_scene_._type' kind='elementOnly'"
 * @generated
 */
public interface PhysicsSceneType extends EObject {
	/**
	 * Returns the value of the '<em><b>Asset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						The physics_scene element may contain an asset element.
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asset</em>' containment reference.
	 * @see #setAsset(AssetType)
	 * @see org.khronos.collada.ColladaPackage#getPhysicsSceneType_Asset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asset' namespace='##targetNamespace'"
	 * @generated
	 */
	AssetType getAsset();

	/**
	 * Sets the value of the '{@link org.khronos.collada.PhysicsSceneType#getAsset <em>Asset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' containment reference.
	 * @see #getAsset()
	 * @generated
	 */
	void setAsset(AssetType value);

	/**
	 * Returns the value of the '<em><b>Instance Force Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.khronos.collada.InstanceWithExtra}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						There may be any number of instance_force_field elements.
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Force Field</em>' containment reference list.
	 * @see org.khronos.collada.ColladaPackage#getPhysicsSceneType_InstanceForceField()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instance_force_field' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InstanceWithExtra> getInstanceForceField();

	/**
	 * Returns the value of the '<em><b>Instance Physics Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.khronos.collada.InstancePhysicsModelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						There may be any number of instance_physics_model elements.
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Physics Model</em>' containment reference list.
	 * @see org.khronos.collada.ColladaPackage#getPhysicsSceneType_InstancePhysicsModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instance_physics_model' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InstancePhysicsModelType> getInstancePhysicsModel();

	/**
	 * Returns the value of the '<em><b>Technique Common</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						The technique_common element specifies the physics_scene information for the common profile 
	 * 						which all COLLADA implementations need to support.
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technique Common</em>' containment reference.
	 * @see #setTechniqueCommon(TechniqueCommonType7)
	 * @see org.khronos.collada.ColladaPackage#getPhysicsSceneType_TechniqueCommon()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='technique_common' namespace='##targetNamespace'"
	 * @generated
	 */
	TechniqueCommonType7 getTechniqueCommon();

	/**
	 * Sets the value of the '{@link org.khronos.collada.PhysicsSceneType#getTechniqueCommon <em>Technique Common</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technique Common</em>' containment reference.
	 * @see #getTechniqueCommon()
	 * @generated
	 */
	void setTechniqueCommon(TechniqueCommonType7 value);

	/**
	 * Returns the value of the '<em><b>Technique</b></em>' containment reference list.
	 * The list contents are of type {@link org.khronos.collada.TechniqueType4}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						This element may contain any number of non-common profile techniques.
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technique</em>' containment reference list.
	 * @see org.khronos.collada.ColladaPackage#getPhysicsSceneType_Technique()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='technique' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TechniqueType4> getTechnique();

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
	 * @see org.khronos.collada.ColladaPackage#getPhysicsSceneType_Extra()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExtraType> getExtra();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 					The id attribute is a text string containing the unique identifier of this element. 
	 * 					This value must be unique within the instance document. Optional attribute.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.khronos.collada.ColladaPackage#getPhysicsSceneType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.khronos.collada.PhysicsSceneType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see org.khronos.collada.ColladaPackage#getPhysicsSceneType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.khronos.collada.PhysicsSceneType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PhysicsSceneType
