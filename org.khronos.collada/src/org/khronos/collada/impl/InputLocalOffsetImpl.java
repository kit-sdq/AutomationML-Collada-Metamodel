/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.khronos.collada.ColladaPackage;
import org.khronos.collada.InputLocalOffset;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Local Offset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.khronos.collada.impl.InputLocalOffsetImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InputLocalOffsetImpl#getSemantic <em>Semantic</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InputLocalOffsetImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.khronos.collada.impl.InputLocalOffsetImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputLocalOffsetImpl extends EObjectImpl implements InputLocalOffset {
	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected BigInteger offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemantic() <em>Semantic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemantic()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemantic() <em>Semantic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemantic()
	 * @generated
	 * @ordered
	 */
	protected String semantic = SEMANTIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getSet() <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSet() <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected BigInteger set = SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputLocalOffsetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColladaPackage.eINSTANCE.getInputLocalOffset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(BigInteger newOffset) {
		BigInteger oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INPUT_LOCAL_OFFSET__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemantic() {
		return semantic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemantic(String newSemantic) {
		String oldSemantic = semantic;
		semantic = newSemantic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INPUT_LOCAL_OFFSET__SEMANTIC, oldSemantic, semantic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSet() {
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSet(BigInteger newSet) {
		BigInteger oldSet = set;
		set = newSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INPUT_LOCAL_OFFSET__SET, oldSet, set));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.INPUT_LOCAL_OFFSET__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ColladaPackage.INPUT_LOCAL_OFFSET__OFFSET:
				return getOffset();
			case ColladaPackage.INPUT_LOCAL_OFFSET__SEMANTIC:
				return getSemantic();
			case ColladaPackage.INPUT_LOCAL_OFFSET__SET:
				return getSet();
			case ColladaPackage.INPUT_LOCAL_OFFSET__SOURCE:
				return getSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ColladaPackage.INPUT_LOCAL_OFFSET__OFFSET:
				setOffset((BigInteger)newValue);
				return;
			case ColladaPackage.INPUT_LOCAL_OFFSET__SEMANTIC:
				setSemantic((String)newValue);
				return;
			case ColladaPackage.INPUT_LOCAL_OFFSET__SET:
				setSet((BigInteger)newValue);
				return;
			case ColladaPackage.INPUT_LOCAL_OFFSET__SOURCE:
				setSource((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ColladaPackage.INPUT_LOCAL_OFFSET__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case ColladaPackage.INPUT_LOCAL_OFFSET__SEMANTIC:
				setSemantic(SEMANTIC_EDEFAULT);
				return;
			case ColladaPackage.INPUT_LOCAL_OFFSET__SET:
				setSet(SET_EDEFAULT);
				return;
			case ColladaPackage.INPUT_LOCAL_OFFSET__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ColladaPackage.INPUT_LOCAL_OFFSET__OFFSET:
				return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
			case ColladaPackage.INPUT_LOCAL_OFFSET__SEMANTIC:
				return SEMANTIC_EDEFAULT == null ? semantic != null : !SEMANTIC_EDEFAULT.equals(semantic);
			case ColladaPackage.INPUT_LOCAL_OFFSET__SET:
				return SET_EDEFAULT == null ? set != null : !SET_EDEFAULT.equals(set);
			case ColladaPackage.INPUT_LOCAL_OFFSET__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (offset: ");
		result.append(offset);
		result.append(", semantic: ");
		result.append(semantic);
		result.append(", set: ");
		result.append(set);
		result.append(", source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}

} //InputLocalOffsetImpl
