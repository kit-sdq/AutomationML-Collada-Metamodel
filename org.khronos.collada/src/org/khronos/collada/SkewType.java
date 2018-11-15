/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skew Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.khronos.collada.SkewType#getValue <em>Value</em>}</li>
 *   <li>{@link org.khronos.collada.SkewType#getSid <em>Sid</em>}</li>
 * </ul>
 *
 * @see org.khronos.collada.ColladaPackage#getSkewType()
 * @model extendedMetaData="name='skew_._type' kind='simple'"
 * @generated
 */
public interface SkewType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(List)
	 * @see org.khronos.collada.ColladaPackage#getSkewType_Value()
	 * @model dataType="org.khronos.collada.Float7" many="false"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	List<Double> getValue();

	/**
	 * Sets the value of the '{@link org.khronos.collada.SkewType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(List<Double> value);

	/**
	 * Returns the value of the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 							The sid attribute is a text string value containing the sub-identifier of this element. 
	 * 							This value must be unique within the scope of the parent element. Optional attribute.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sid</em>' attribute.
	 * @see #setSid(String)
	 * @see org.khronos.collada.ColladaPackage#getSkewType_Sid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='sid'"
	 * @generated
	 */
	String getSid();

	/**
	 * Sets the value of the '{@link org.khronos.collada.SkewType#getSid <em>Sid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sid</em>' attribute.
	 * @see #getSid()
	 * @generated
	 */
	void setSid(String value);

} // SkewType
