/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.khronos.collada.ColladaFactory;
import org.khronos.collada.ColladaPackage;

import org.khronos.collada.util.ColladaValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColladaPackageImpl extends EPackageImpl implements ColladaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "../../../../../collada.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphaFuncTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphaFuncType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphaTestEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphaTestEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ambientTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angularTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animationClipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autoNormalEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindMaterialTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindVertexInputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blendColorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blendEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blendEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blendEquationSeparateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blendEquationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blendFuncSeparateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blendFuncTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blendFuncType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blinnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolArrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cameraTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capsuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cgConnectParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cgNewarrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cgNewparamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cgSampler1DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cgSampler2DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cgSampler3DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cgSamplerCUBEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cgSamplerDEPTHEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cgSamplerRECTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cgSetarrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cgSetparamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cgSetparamSimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cgSetuserTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cgSurfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearColorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearColorType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearDepthTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearDepthType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearStencilTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearStencilType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clipPlaneEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clipPlaneEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clipPlaneTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clipPlaneType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colladaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorLogicOpEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorLogicOpEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorMaskTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorMaskType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorMaterialEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorMaterialEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorMaterialTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonColorOrTextureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonFloatOrParamTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonNewparamTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonTransparentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilerTargetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilerTargetType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contributorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlVerticesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convexMeshTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cullFaceEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cullFaceEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cullFaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cullFaceType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cylinderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depthBoundsEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depthBoundsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depthClampEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depthFuncTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depthFuncType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depthMaskTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depthMaskType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depthRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depthRangeType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depthTestEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depthTestEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destAlphaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destRgbTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ditherEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ditherEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ellipsoidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enabledTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluateSceneTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extraTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faceType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faceType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faceType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faceType4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatArrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogColorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogColorType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogCoordSrcTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogDensityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogDensityType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogEndTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogEndType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogModeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogModeType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogStartTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogStartType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forceFieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frontFaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frontFaceType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frontTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxAnnotateCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxClearcolorCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxCleardepthCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxClearstencilCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxCodeProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxColortargetCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxDepthtargetCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxIncludeCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxNewparamCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxSampler1DCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxSampler2DCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxSampler3DCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxSamplerCUBECommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxSamplerDEPTHCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxSamplerRECTCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxStenciltargetCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxSurfaceCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxSurfaceFormatHintCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxSurfaceInitCubeCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxSurfaceInitFromCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxSurfaceInitPlanarCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxSurfaceInitVolumeCommonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glesNewparamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glesSamplerStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glesTexcombinerArgumentAlphaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glesTexcombinerArgumentRGBTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glesTexcombinerCommandAlphaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glesTexcombinerCommandRGBTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glesTexcombinerCommandTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glesTexenvCommandTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glesTextureConstantTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glesTexturePipelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glesTextureUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glSampler1DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glSampler2DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glSampler3DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glSamplerCUBEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glSamplerDEPTHEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glSamplerRECTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glslNewarrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glslNewparamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glslSetarrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glslSetparamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glslSetparamSimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glslSurfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hollowTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hollowType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idrefArrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputGlobalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputLocalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputLocalOffsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceControllerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEffectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceGeometryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceMaterialTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instancePhysicsModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceRigidBodyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceRigidConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceWithExtraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intArrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interpenetrateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jointsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambertTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryAnimationClipsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryAnimationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryCamerasTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryControllersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEffectsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryForceFieldsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryGeometriesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryImagesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryLightsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryMaterialsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryNodesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryPhysicsMaterialsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryPhysicsModelsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryPhysicsScenesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryVisualScenesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightAmbientTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightAmbientType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightConstantAttenuationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightConstantAttenuationType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightDiffuseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightDiffuseType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightingEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightingEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightLinearAttenuationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightLinearAttenutationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightModelAmbientTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightModelAmbientType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightModelColorControlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightModelLocalViewerEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightModelTwoSideEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightModelTwoSideEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightPositionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightPositionType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightQuadraticAttenuationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightQuadraticAttenuationType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightSpecularTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightSpecularType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightSpotCutoffTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightSpotCutoffType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightSpotDirectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightSpotDirectionType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightSpotExponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightSpotExponentType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass limitsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineSmoothEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineSmoothEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineStippleEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineStippleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linestripsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineWidthTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineWidthType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicOpEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicOpTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicOpType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lookatTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maskTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maskType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maskType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maskType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass massFrameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass massFrameType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialAmbientTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialAmbientType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialDiffuseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialDiffuseType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialEmissionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialEmissionType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialShininessTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialShininessType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialSpecularTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialSpecularType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrixTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meshTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelViewMatrixTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelViewMatrixType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass morphTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multisampleEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multisampleEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameArrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalizeEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalizeEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opticsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orthographicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramType4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perspectiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phongTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicsMaterialTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicsModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicsSceneTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointDistanceAttenuationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointDistanceAttenuationType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointFadeThresholdSizeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointFadeThresholdSizeType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointSizeMaxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointSizeMaxType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointSizeMinTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointSizeMinType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointSizeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointSizeType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointSmoothEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointSmoothEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonModeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonOffsetFillEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonOffsetFillEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonOffsetLineEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonOffsetPointEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonOffsetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonOffsetType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonSmoothEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonStippleEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polylistTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileCGTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileCOMMONTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileGLESTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileGLSLTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectionMatrixTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectionMatrixType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refAttachmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rescaleNormalEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rescaleNormalEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rgbTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rigidBodyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rigidConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleAlphaToCoverageEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleAlphaToCoverageEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleAlphaToOneEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleAlphaToOneEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleCoverageEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleCoverageEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass samplerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sceneTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scissorTestEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scissorTestEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scissorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scissorType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setparamTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setparamType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shadeModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shadeModelType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shaderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shaderType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skewTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skinTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphereTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splineTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spotTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass springType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcAlphaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcRgbTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stencilFuncSeparateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stencilFuncTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stencilFuncType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stencilMaskSeparateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stencilMaskTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stencilMaskType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stencilOpSeparateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stencilOpTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stencilOpType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stencilTestEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stencilTestEnableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swingConeAndTwistTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taperedCapsuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taperedCylinderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetableFloatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetableFloat3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techniqueCommonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techniqueCommonType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techniqueCommonType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techniqueCommonType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techniqueCommonType4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techniqueCommonType5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techniqueCommonType6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techniqueCommonType7EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techniqueCommonType8EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techniqueHintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techniqueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techniqueType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techniqueType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techniqueType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techniqueType4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass texcoordTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass texture1DEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass texture1DTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass texture2DEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass texture2DTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass texture3DEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass texture3DTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textureCUBEEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textureCUBETypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textureDEPTHEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textureDEPTHTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textureEnvColorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textureEnvModeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass texturePipelineEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass texturePipelineTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textureRECTEnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textureRECTTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trianglesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trifansTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tristripsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertexWeightsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verticesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualSceneTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zfailTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zfailType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zfailType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zpassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zpassType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zpassType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cgPipelineStageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commonProfileInputEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commonProfileParamEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fxModifierEnumCommonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fxOpaqueEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fxPipelineStageCommonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fxSamplerFilterCommonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fxSamplerWrapCommonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fxSurfaceFaceEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fxSurfaceFormatHintChannelsEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fxSurfaceFormatHintOptionEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fxSurfaceFormatHintPrecisionEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fxSurfaceFormatHintRangeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fxSurfaceTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glBlendEquationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glBlendTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glesSamplerWrapEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glesStencilOpTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glesTexcombinerOperandAlphaEnumsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glesTexcombinerOperandRGBEnumsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glesTexcombinerOperatorAlphaEnumsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glesTexcombinerOperatorRGBEnumsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glesTexcombinerSourceEnumsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glesTexenvModeEnumsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glFaceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glFogCoordSrcTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glFogTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glFrontFaceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glFuncTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glLightModelColorControlTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glLogicOpTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glMaterialTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glPolygonModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glShadeModelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glslPipelineStageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glStencilOpTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum morphMethodTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum springTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum upAxisTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum versionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType boolEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bool2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bool3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bool4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType boolObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBoolEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool1x1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool1x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool1x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool1x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool2x1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool2x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool2x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool2x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool3x1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool3x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool3x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool3x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool4x1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool4x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool4x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBool4x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgBoolObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixedEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed1x1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed1x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed1x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed1x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed2x1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed2x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed2x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed2x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed3x1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed3x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed3x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed3x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed4x1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed4x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed4x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixed4x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFixedObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat1x1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat1x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat1x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat1x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat2x1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat2x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat2x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat2x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat3x1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat3x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat3x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat3x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat4x1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat4x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat4x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloat4x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgFloatObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalfEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf1x1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf1x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf1x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf1x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf2x1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf2x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf2x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf2x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf3x1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf3x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf3x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf3x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf4x1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf4x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf4x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalf4x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgHalfObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgIdentifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgIntEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt1x1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt1x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt1x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt1x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt2x1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt2x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt2x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt2x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt3x1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt3x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt3x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt3x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt4x1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt4x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt4x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgInt4x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgIntObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgListOfBoolEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgListOfFixedEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgListOfFloatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgListOfHalfEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgListOfIntEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cgPipelineStageObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType commonProfileInputObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType commonProfileParamObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType float2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType float2x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType float2x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType float2x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType float3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType float3x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType float3x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType float3x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType float4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType float4x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType float4x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType float4x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType float7EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fxColorCommonEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fxDrawCommonEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fxModifierEnumCommonObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fxOpaqueEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fxPipelineStageCommonObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fxSamplerFilterCommonObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fxSamplerWrapCommonObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fxSurfaceFaceEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fxSurfaceFormatHintChannelsEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fxSurfaceFormatHintOptionEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fxSurfaceFormatHintPrecisionEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fxSurfaceFormatHintRangeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fxSurfaceTypeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glAlphaValueTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glAlphaValueTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glBlendEquationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glBlendTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glEnumerationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glesEnumerationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glesmaxclipplanesIndexEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glesmaxlightsIndexEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glesmaxtexturecoordsIndexEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glesmaxtextureimageunitsIndexEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glesRendertargetCommonEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glesSamplerWrapObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glesStencilOpTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glesTexcombinerArgumentIndexTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glesTexcombinerOperandAlphaEnumsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glesTexcombinerOperandRGBEnumsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glesTexcombinerOperatorAlphaEnumsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glesTexcombinerOperatorRGBEnumsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glesTexcombinerSourceEnumsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glesTexenvModeEnumsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glFaceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glFogCoordSrcTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glFogTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glFrontFaceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glFuncTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glLightModelColorControlTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glLogicOpTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glMaterialTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glmaxclipplanesIndexEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glmaxlightsIndexEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glmaxtextureimageunitsIndexEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glPolygonModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glShadeModelTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslBoolEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslBool2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslBool3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslBool4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslBoolObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslFloatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslFloat2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslFloat2x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslFloat3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslFloat3x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslFloat4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslFloat4x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslFloatObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslIdentifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslIntEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslInt2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslInt3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslInt4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslIntObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslListOfBoolEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslListOfFloatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslListOfIntEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glslPipelineStageObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glStencilOpTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType intEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType int2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType int2x2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType int3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType int3x3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType int4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType int4x4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType intObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listOfBoolsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listOfFloatsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listOfHexBinaryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listOfIntsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listOfNamesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listOfTokensEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listOfUIntsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType morphMethodTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nodeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType springTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tokenEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uintEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType upAxisTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriFragmentTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.khronos.collada.ColladaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ColladaPackageImpl() {
		super(eNS_URI, ColladaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ColladaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ColladaPackage init() {
		if (isInited) return (ColladaPackage)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI);

		// Obtain or create and register package
		ColladaPackageImpl theColladaPackage = (ColladaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ColladaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ColladaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Load packages
		theColladaPackage.loadPackage();

		// Fix loaded packages
		theColladaPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theColladaPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ColladaValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theColladaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ColladaPackage.eNS_URI, theColladaPackage);
		return theColladaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessorType() {
		if (accessorTypeEClass == null) {
			accessorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(0);
		}
		return accessorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessorType_Param() {
        return (EReference)getAccessorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessorType_Count() {
        return (EAttribute)getAccessorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessorType_Offset() {
        return (EAttribute)getAccessorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessorType_Source() {
        return (EAttribute)getAccessorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessorType_Stride() {
        return (EAttribute)getAccessorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllType() {
		if (allTypeEClass == null) {
			allTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(1);
		}
		return allTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllType_Ref() {
        return (EAttribute)getAllType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllType1() {
		if (allType1EClass == null) {
			allType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(2);
		}
		return allType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllType1_Ref() {
        return (EAttribute)getAllType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllType2() {
		if (allType2EClass == null) {
			allType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(3);
		}
		return allType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllType2_Ref() {
        return (EAttribute)getAllType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphaFuncType() {
		if (alphaFuncTypeEClass == null) {
			alphaFuncTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(4);
		}
		return alphaFuncTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphaFuncType_Func() {
        return (EReference)getAlphaFuncType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphaFuncType_Value() {
        return (EReference)getAlphaFuncType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphaFuncType1() {
		if (alphaFuncType1EClass == null) {
			alphaFuncType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(5);
		}
		return alphaFuncType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphaFuncType1_Func() {
        return (EReference)getAlphaFuncType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphaFuncType1_Value() {
        return (EReference)getAlphaFuncType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphaTestEnableType() {
		if (alphaTestEnableTypeEClass == null) {
			alphaTestEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(6);
		}
		return alphaTestEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphaTestEnableType_Param() {
        return (EAttribute)getAlphaTestEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphaTestEnableType_Value() {
        return (EAttribute)getAlphaTestEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphaTestEnableType1() {
		if (alphaTestEnableType1EClass == null) {
			alphaTestEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(7);
		}
		return alphaTestEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphaTestEnableType1_Param() {
        return (EAttribute)getAlphaTestEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphaTestEnableType1_Value() {
        return (EAttribute)getAlphaTestEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphaType() {
		if (alphaTypeEClass == null) {
			alphaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(8);
		}
		return alphaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphaType_Param() {
        return (EAttribute)getAlphaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphaType_Value() {
        return (EAttribute)getAlphaType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmbientType() {
		if (ambientTypeEClass == null) {
			ambientTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(9);
		}
		return ambientTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmbientType_Color() {
        return (EReference)getAmbientType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngularType() {
		if (angularTypeEClass == null) {
			angularTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(10);
		}
		return angularTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAngularType_Stiffness() {
        return (EReference)getAngularType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAngularType_Damping() {
        return (EReference)getAngularType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAngularType_TargetValue() {
        return (EReference)getAngularType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimationClipType() {
		if (animationClipTypeEClass == null) {
			animationClipTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(11);
		}
		return animationClipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationClipType_Asset() {
        return (EReference)getAnimationClipType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationClipType_InstanceAnimation() {
        return (EReference)getAnimationClipType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationClipType_Extra() {
        return (EReference)getAnimationClipType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimationClipType_End() {
        return (EAttribute)getAnimationClipType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimationClipType_Id() {
        return (EAttribute)getAnimationClipType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimationClipType_Name() {
        return (EAttribute)getAnimationClipType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimationClipType_Start() {
        return (EAttribute)getAnimationClipType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimationType() {
		if (animationTypeEClass == null) {
			animationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(12);
		}
		return animationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationType_Asset() {
        return (EReference)getAnimationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationType_Source() {
        return (EReference)getAnimationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationType_Sampler() {
        return (EReference)getAnimationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationType_Channel() {
        return (EReference)getAnimationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationType_Animation() {
        return (EReference)getAnimationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationType_Animation1() {
        return (EReference)getAnimationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationType_Sampler1() {
        return (EReference)getAnimationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationType_Channel1() {
        return (EReference)getAnimationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationType_Animation2() {
        return (EReference)getAnimationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationType_Animation3() {
        return (EReference)getAnimationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationType_Extra() {
        return (EReference)getAnimationType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimationType_Id() {
        return (EAttribute)getAnimationType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimationType_Name() {
        return (EAttribute)getAnimationType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssetType() {
		if (assetTypeEClass == null) {
			assetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(13);
		}
		return assetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssetType_Contributor() {
        return (EReference)getAssetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetType_Created() {
        return (EAttribute)getAssetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetType_Keywords() {
        return (EAttribute)getAssetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetType_Modified() {
        return (EAttribute)getAssetType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetType_Revision() {
        return (EAttribute)getAssetType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetType_Subject() {
        return (EAttribute)getAssetType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetType_Title() {
        return (EAttribute)getAssetType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssetType_Unit() {
        return (EReference)getAssetType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetType_UpAxis() {
        return (EAttribute)getAssetType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentType() {
		if (attachmentTypeEClass == null) {
			attachmentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(14);
		}
		return attachmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachmentType_Group() {
        return (EAttribute)getAttachmentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentType_Translate() {
        return (EReference)getAttachmentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentType_Rotate() {
        return (EReference)getAttachmentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentType_Extra() {
        return (EReference)getAttachmentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachmentType_RigidBody() {
        return (EAttribute)getAttachmentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutoNormalEnableType() {
		if (autoNormalEnableTypeEClass == null) {
			autoNormalEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(15);
		}
		return autoNormalEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutoNormalEnableType_Param() {
        return (EAttribute)getAutoNormalEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutoNormalEnableType_Value() {
        return (EAttribute)getAutoNormalEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackType() {
		if (backTypeEClass == null) {
			backTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(16);
		}
		return backTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackType_Param() {
        return (EAttribute)getBackType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackType_Value() {
        return (EAttribute)getBackType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindMaterialType() {
		if (bindMaterialTypeEClass == null) {
			bindMaterialTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(17);
		}
		return bindMaterialTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindMaterialType_Param() {
        return (EReference)getBindMaterialType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindMaterialType_TechniqueCommon() {
        return (EReference)getBindMaterialType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindMaterialType_Technique() {
        return (EReference)getBindMaterialType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindMaterialType_Extra() {
        return (EReference)getBindMaterialType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindType() {
		if (bindTypeEClass == null) {
			bindTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(18);
		}
		return bindTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType_Bool() {
        return (EAttribute)getBindType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType_Bool2() {
        return (EAttribute)getBindType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType_Bool3() {
        return (EAttribute)getBindType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType_Bool4() {
        return (EAttribute)getBindType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType_Float() {
        return (EAttribute)getBindType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType_Float2() {
        return (EAttribute)getBindType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType_Float3() {
        return (EAttribute)getBindType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType_Float4() {
        return (EAttribute)getBindType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType_Float2x2() {
        return (EAttribute)getBindType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType_Float3x3() {
        return (EAttribute)getBindType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType_Float4x4() {
        return (EAttribute)getBindType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType_Int() {
        return (EAttribute)getBindType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType_Int2() {
        return (EAttribute)getBindType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType_Int3() {
        return (EAttribute)getBindType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType_Int4() {
        return (EAttribute)getBindType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindType_Surface() {
        return (EReference)getBindType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindType_Sampler1D() {
        return (EReference)getBindType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindType_Sampler2D() {
        return (EReference)getBindType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindType_Sampler3D() {
        return (EReference)getBindType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindType_SamplerCUBE() {
        return (EReference)getBindType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindType_SamplerRECT() {
        return (EReference)getBindType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindType_SamplerDEPTH() {
        return (EReference)getBindType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType_Enum() {
        return (EAttribute)getBindType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindType_Param() {
        return (EReference)getBindType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType_Symbol() {
        return (EAttribute)getBindType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindType1() {
		if (bindType1EClass == null) {
			bindType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(19);
		}
		return bindType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool1x1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool1x2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool1x3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool1x4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool2x1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool2x2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool2x3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool2x4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool3x1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool3x2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool3x3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool3x4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool4x1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool4x2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool4x3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Bool4x4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float1x1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float1x2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float1x3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float1x4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float2x1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float2x2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float2x3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float2x4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float3x1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float3x2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float3x3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float3x4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float4x1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float4x2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float4x3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Float4x4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int1x1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int1x2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int1x3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int1x4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int2x1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int2x2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int2x3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int2x4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int3x1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int3x2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int3x3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int3x4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int4x1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int4x2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int4x3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Int4x4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half1x1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half1x2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half1x3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half1x4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half2x1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half2x2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half2x3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half2x4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half3x1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half3x2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half3x3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half3x4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half4x1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half4x2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half4x3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Half4x4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed1x1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed1x2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed1x3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed1x4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed2x1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed2x2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed2x3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed2x4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed3x1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed3x2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed3x3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed3x4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed4x1() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed4x2() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed4x3() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Fixed4x4() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindType1_Surface() {
        return (EReference)getBindType1().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindType1_Sampler1D() {
        return (EReference)getBindType1().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindType1_Sampler2D() {
        return (EReference)getBindType1().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindType1_Sampler3D() {
        return (EReference)getBindType1().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindType1_SamplerRECT() {
        return (EReference)getBindType1().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindType1_SamplerCUBE() {
        return (EReference)getBindType1().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindType1_SamplerDEPTH() {
        return (EReference)getBindType1().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_String() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Enum() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindType1_Param() {
        return (EReference)getBindType1().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType1_Symbol() {
        return (EAttribute)getBindType1().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindType2() {
		if (bindType2EClass == null) {
			bindType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(20);
		}
		return bindType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType2_Semantic() {
        return (EAttribute)getBindType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindType2_Target() {
        return (EAttribute)getBindType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindVertexInputType() {
		if (bindVertexInputTypeEClass == null) {
			bindVertexInputTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(21);
		}
		return bindVertexInputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindVertexInputType_InputSemantic() {
        return (EAttribute)getBindVertexInputType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindVertexInputType_InputSet() {
        return (EAttribute)getBindVertexInputType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindVertexInputType_Semantic() {
        return (EAttribute)getBindVertexInputType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlendColorType() {
		if (blendColorTypeEClass == null) {
			blendColorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(22);
		}
		return blendColorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlendColorType_Param() {
        return (EAttribute)getBlendColorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlendColorType_Value() {
        return (EAttribute)getBlendColorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlendEnableType() {
		if (blendEnableTypeEClass == null) {
			blendEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(23);
		}
		return blendEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlendEnableType_Param() {
        return (EAttribute)getBlendEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlendEnableType_Value() {
        return (EAttribute)getBlendEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlendEnableType1() {
		if (blendEnableType1EClass == null) {
			blendEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(24);
		}
		return blendEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlendEnableType1_Param() {
        return (EAttribute)getBlendEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlendEnableType1_Value() {
        return (EAttribute)getBlendEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlendEquationSeparateType() {
		if (blendEquationSeparateTypeEClass == null) {
			blendEquationSeparateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(25);
		}
		return blendEquationSeparateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlendEquationSeparateType_Rgb() {
        return (EReference)getBlendEquationSeparateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlendEquationSeparateType_Alpha() {
        return (EReference)getBlendEquationSeparateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlendEquationType() {
		if (blendEquationTypeEClass == null) {
			blendEquationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(26);
		}
		return blendEquationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlendEquationType_Param() {
        return (EAttribute)getBlendEquationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlendEquationType_Value() {
        return (EAttribute)getBlendEquationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlendFuncSeparateType() {
		if (blendFuncSeparateTypeEClass == null) {
			blendFuncSeparateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(27);
		}
		return blendFuncSeparateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlendFuncSeparateType_SrcRgb() {
        return (EReference)getBlendFuncSeparateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlendFuncSeparateType_DestRgb() {
        return (EReference)getBlendFuncSeparateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlendFuncSeparateType_SrcAlpha() {
        return (EReference)getBlendFuncSeparateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlendFuncSeparateType_DestAlpha() {
        return (EReference)getBlendFuncSeparateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlendFuncType() {
		if (blendFuncTypeEClass == null) {
			blendFuncTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(28);
		}
		return blendFuncTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlendFuncType_Src() {
        return (EReference)getBlendFuncType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlendFuncType_Dest() {
        return (EReference)getBlendFuncType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlendFuncType1() {
		if (blendFuncType1EClass == null) {
			blendFuncType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(29);
		}
		return blendFuncType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlendFuncType1_Src() {
        return (EReference)getBlendFuncType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlendFuncType1_Dest() {
        return (EReference)getBlendFuncType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlinnType() {
		if (blinnTypeEClass == null) {
			blinnTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(30);
		}
		return blinnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlinnType_Emission() {
        return (EReference)getBlinnType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlinnType_Ambient() {
        return (EReference)getBlinnType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlinnType_Diffuse() {
        return (EReference)getBlinnType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlinnType_Specular() {
        return (EReference)getBlinnType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlinnType_Shininess() {
        return (EReference)getBlinnType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlinnType_Reflective() {
        return (EReference)getBlinnType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlinnType_Reflectivity() {
        return (EReference)getBlinnType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlinnType_Transparent() {
        return (EReference)getBlinnType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlinnType_Transparency() {
        return (EReference)getBlinnType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlinnType_IndexOfRefraction() {
        return (EReference)getBlinnType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolArrayType() {
		if (boolArrayTypeEClass == null) {
			boolArrayTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(35);
		}
		return boolArrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolArrayType_Value() {
        return (EAttribute)getBoolArrayType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolArrayType_Count() {
        return (EAttribute)getBoolArrayType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolArrayType_Id() {
        return (EAttribute)getBoolArrayType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolArrayType_Name() {
        return (EAttribute)getBoolArrayType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoxType() {
		if (boxTypeEClass == null) {
			boxTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(37);
		}
		return boxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoxType_HalfExtents() {
        return (EAttribute)getBoxType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoxType_Extra() {
        return (EReference)getBoxType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCameraType() {
		if (cameraTypeEClass == null) {
			cameraTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(38);
		}
		return cameraTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCameraType_Asset() {
        return (EReference)getCameraType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCameraType_Optics() {
        return (EReference)getCameraType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCameraType_Imager() {
        return (EReference)getCameraType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCameraType_Extra() {
        return (EReference)getCameraType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCameraType_Id() {
        return (EAttribute)getCameraType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCameraType_Name() {
        return (EAttribute)getCameraType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapsuleType() {
		if (capsuleTypeEClass == null) {
			capsuleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(39);
		}
		return capsuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapsuleType_Height() {
        return (EAttribute)getCapsuleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapsuleType_Radius() {
        return (EAttribute)getCapsuleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapsuleType_Extra() {
        return (EReference)getCapsuleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCgConnectParam() {
		if (cgConnectParamEClass == null) {
			cgConnectParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(63);
		}
		return cgConnectParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgConnectParam_Ref() {
        return (EAttribute)getCgConnectParam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCgNewarrayType() {
		if (cgNewarrayTypeEClass == null) {
			cgNewarrayTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(162);
		}
		return cgNewarrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Group() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool1x1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool1x2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool1x3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool1x4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool2x1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool2x2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool2x3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool2x4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool3x1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool3x2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool3x3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool3x4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool4x1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool4x2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool4x3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Bool4x4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float1x1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float1x2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float1x3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float1x4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float2x1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float2x2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float2x3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float2x4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float3x1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float3x2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float3x3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float3x4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float4x1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float4x2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float4x3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Float4x4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int1x1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int1x2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int1x3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int1x4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int2x1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int2x2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int2x3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int2x4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int3x1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int3x2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int3x3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int3x4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int4x1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int4x2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int4x3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Int4x4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half1x1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half1x2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half1x3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half1x4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half2x1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half2x2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half2x3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half2x4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half3x1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half3x2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half3x3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half3x4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half4x1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half4x2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half4x3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Half4x4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed1x1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed1x2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed1x3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed1x4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed2x1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed2x2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed2x3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed2x4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed3x1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed3x2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed3x3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed3x4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed4x1() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed4x2() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed4x3() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Fixed4x4() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgNewarrayType_Surface() {
        return (EReference)getCgNewarrayType().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgNewarrayType_Sampler1D() {
        return (EReference)getCgNewarrayType().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgNewarrayType_Sampler2D() {
        return (EReference)getCgNewarrayType().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgNewarrayType_Sampler3D() {
        return (EReference)getCgNewarrayType().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgNewarrayType_SamplerRECT() {
        return (EReference)getCgNewarrayType().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgNewarrayType_SamplerCUBE() {
        return (EReference)getCgNewarrayType().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgNewarrayType_SamplerDEPTH() {
        return (EReference)getCgNewarrayType().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_String() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Enum() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgNewarrayType_Array() {
        return (EReference)getCgNewarrayType().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgNewarrayType_Usertype() {
        return (EReference)getCgNewarrayType().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgNewarrayType_ConnectParam() {
        return (EReference)getCgNewarrayType().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewarrayType_Length() {
        return (EAttribute)getCgNewarrayType().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCgNewparam() {
		if (cgNewparamEClass == null) {
			cgNewparamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(163);
		}
		return cgNewparamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgNewparam_Annotate() {
        return (EReference)getCgNewparam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Semantic() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Modifier() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool1x1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool1x2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool1x3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool1x4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool2x1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool2x2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool2x3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool2x4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool3x1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool3x2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool3x3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool3x4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool4x1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool4x2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool4x3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Bool4x4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float1x1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float1x2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float1x3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float1x4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float2x1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float2x2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float2x3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float2x4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float3x1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float3x2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float3x3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float3x4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float4x1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float4x2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float4x3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Float4x4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int1x1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int1x2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int1x3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int1x4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int2x1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int2x2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int2x3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int2x4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int3x1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int3x2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int3x3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int3x4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int4x1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int4x2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int4x3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Int4x4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half1x1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half1x2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half1x3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half1x4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half2x1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half2x2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half2x3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half2x4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half3x1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half3x2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half3x3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half3x4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half4x1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half4x2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half4x3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Half4x4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed1x1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed1x2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed1x3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed1x4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed2x1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed2x2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed2x3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed2x4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed3x1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed3x2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed3x3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed3x4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed4x1() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed4x2() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed4x3() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Fixed4x4() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgNewparam_Surface() {
        return (EReference)getCgNewparam().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgNewparam_Sampler1D() {
        return (EReference)getCgNewparam().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgNewparam_Sampler2D() {
        return (EReference)getCgNewparam().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgNewparam_Sampler3D() {
        return (EReference)getCgNewparam().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgNewparam_SamplerRECT() {
        return (EReference)getCgNewparam().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgNewparam_SamplerCUBE() {
        return (EReference)getCgNewparam().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgNewparam_SamplerDEPTH() {
        return (EReference)getCgNewparam().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_String() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Enum() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgNewparam_Usertype() {
        return (EReference)getCgNewparam().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgNewparam_Array() {
        return (EReference)getCgNewparam().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgNewparam_Sid() {
        return (EAttribute)getCgNewparam().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCgSampler1D() {
		if (cgSampler1DEClass == null) {
			cgSampler1DEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(166);
		}
		return cgSampler1DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCgSampler2D() {
		if (cgSampler2DEClass == null) {
			cgSampler2DEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(167);
		}
		return cgSampler2DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCgSampler3D() {
		if (cgSampler3DEClass == null) {
			cgSampler3DEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(168);
		}
		return cgSampler3DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCgSamplerCUBE() {
		if (cgSamplerCUBEEClass == null) {
			cgSamplerCUBEEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(169);
		}
		return cgSamplerCUBEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCgSamplerDEPTH() {
		if (cgSamplerDEPTHEClass == null) {
			cgSamplerDEPTHEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(170);
		}
		return cgSamplerDEPTHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCgSamplerRECT() {
		if (cgSamplerRECTEClass == null) {
			cgSamplerRECTEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(171);
		}
		return cgSamplerRECTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCgSetarrayType() {
		if (cgSetarrayTypeEClass == null) {
			cgSetarrayTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(172);
		}
		return cgSetarrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Group() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool1x1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool1x2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool1x3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool1x4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool2x1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool2x2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool2x3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool2x4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool3x1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool3x2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool3x3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool3x4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool4x1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool4x2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool4x3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Bool4x4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float1x1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float1x2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float1x3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float1x4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float2x1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float2x2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float2x3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float2x4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float3x1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float3x2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float3x3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float3x4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float4x1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float4x2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float4x3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Float4x4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int1x1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int1x2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int1x3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int1x4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int2x1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int2x2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int2x3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int2x4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int3x1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int3x2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int3x3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int3x4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int4x1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int4x2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int4x3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Int4x4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half1x1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half1x2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half1x3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half1x4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half2x1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half2x2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half2x3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half2x4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half3x1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half3x2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half3x3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half3x4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half4x1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half4x2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half4x3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Half4x4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed1x1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed1x2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed1x3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed1x4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed2x1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed2x2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed2x3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed2x4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed3x1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed3x2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed3x3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed3x4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed4x1() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed4x2() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed4x3() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Fixed4x4() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetarrayType_Surface() {
        return (EReference)getCgSetarrayType().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetarrayType_Sampler1D() {
        return (EReference)getCgSetarrayType().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetarrayType_Sampler2D() {
        return (EReference)getCgSetarrayType().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetarrayType_Sampler3D() {
        return (EReference)getCgSetarrayType().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetarrayType_SamplerRECT() {
        return (EReference)getCgSetarrayType().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetarrayType_SamplerCUBE() {
        return (EReference)getCgSetarrayType().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetarrayType_SamplerDEPTH() {
        return (EReference)getCgSetarrayType().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_String() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Enum() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetarrayType_Array() {
        return (EReference)getCgSetarrayType().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetarrayType_Usertype() {
        return (EReference)getCgSetarrayType().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetarrayType_Length() {
        return (EAttribute)getCgSetarrayType().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCgSetparam() {
		if (cgSetparamEClass == null) {
			cgSetparamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(173);
		}
		return cgSetparamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool1x1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool1x2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool1x3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool1x4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool2x1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool2x2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool2x3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool2x4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool3x1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool3x2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool3x3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool3x4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool4x1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool4x2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool4x3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Bool4x4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float1x1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float1x2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float1x3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float1x4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float2x1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float2x2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float2x3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float2x4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float3x1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float3x2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float3x3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float3x4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float4x1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float4x2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float4x3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Float4x4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int1x1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int1x2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int1x3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int1x4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int2x1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int2x2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int2x3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int2x4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int3x1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int3x2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int3x3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int3x4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int4x1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int4x2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int4x3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Int4x4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half1x1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half1x2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half1x3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half1x4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half2x1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half2x2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half2x3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half2x4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half3x1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half3x2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half3x3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half3x4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half4x1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half4x2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half4x3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Half4x4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed1x1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed1x2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed1x3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed1x4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed2x1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed2x2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed2x3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed2x4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed3x1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed3x2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed3x3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed3x4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed4x1() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed4x2() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed4x3() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Fixed4x4() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetparam_Surface() {
        return (EReference)getCgSetparam().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetparam_Sampler1D() {
        return (EReference)getCgSetparam().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetparam_Sampler2D() {
        return (EReference)getCgSetparam().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetparam_Sampler3D() {
        return (EReference)getCgSetparam().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetparam_SamplerRECT() {
        return (EReference)getCgSetparam().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetparam_SamplerCUBE() {
        return (EReference)getCgSetparam().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetparam_SamplerDEPTH() {
        return (EReference)getCgSetparam().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_String() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Enum() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetparam_Usertype() {
        return (EReference)getCgSetparam().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetparam_Array() {
        return (EReference)getCgSetparam().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetparam_ConnectParam() {
        return (EReference)getCgSetparam().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Program() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparam_Ref() {
        return (EAttribute)getCgSetparam().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCgSetparamSimple() {
		if (cgSetparamSimpleEClass == null) {
			cgSetparamSimpleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(174);
		}
		return cgSetparamSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetparamSimple_Annotate() {
        return (EReference)getCgSetparamSimple().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool1x1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool1x2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool1x3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool1x4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool2x1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool2x2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool2x3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool2x4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool3x1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool3x2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool3x3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool3x4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool4x1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool4x2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool4x3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Bool4x4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float1x1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float1x2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float1x3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float1x4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float2x1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float2x2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float2x3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float2x4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float3x1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float3x2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float3x3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float3x4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float4x1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float4x2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float4x3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Float4x4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int1x1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int1x2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int1x3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int1x4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int2x1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int2x2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int2x3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int2x4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int3x1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int3x2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int3x3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int3x4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int4x1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int4x2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int4x3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Int4x4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half1x1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half1x2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half1x3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half1x4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half2x1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half2x2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half2x3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half2x4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half3x1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half3x2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half3x3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half3x4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half4x1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half4x2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half4x3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Half4x4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed1x1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed1x2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed1x3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed1x4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed2x1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed2x2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed2x3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed2x4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed3x1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed3x2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed3x3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed3x4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed4x1() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed4x2() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed4x3() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Fixed4x4() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetparamSimple_Surface() {
        return (EReference)getCgSetparamSimple().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetparamSimple_Sampler1D() {
        return (EReference)getCgSetparamSimple().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetparamSimple_Sampler2D() {
        return (EReference)getCgSetparamSimple().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetparamSimple_Sampler3D() {
        return (EReference)getCgSetparamSimple().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetparamSimple_SamplerRECT() {
        return (EReference)getCgSetparamSimple().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetparamSimple_SamplerCUBE() {
        return (EReference)getCgSetparamSimple().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetparamSimple_SamplerDEPTH() {
        return (EReference)getCgSetparamSimple().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_String() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Enum() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetparamSimple_Ref() {
        return (EAttribute)getCgSetparamSimple().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCgSetuserType() {
		if (cgSetuserTypeEClass == null) {
			cgSetuserTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(175);
		}
		return cgSetuserTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Group() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool1x1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool1x2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool1x3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool1x4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool2x1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool2x2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool2x3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool2x4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool3x1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool3x2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool3x3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool3x4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool4x1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool4x2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool4x3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Bool4x4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float1x1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float1x2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float1x3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float1x4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float2x1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float2x2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float2x3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float2x4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float3x1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float3x2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float3x3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float3x4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float4x1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float4x2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float4x3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Float4x4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int1x1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int1x2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int1x3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int1x4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int2x1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int2x2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int2x3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int2x4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int3x1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int3x2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int3x3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int3x4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int4x1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int4x2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int4x3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Int4x4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half1x1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half1x2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half1x3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half1x4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half2x1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half2x2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half2x3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half2x4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half3x1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half3x2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half3x3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half3x4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half4x1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half4x2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half4x3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Half4x4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed1x1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed1x2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed1x3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed1x4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed2x1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed2x2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed2x3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed2x4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed3x1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed3x2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed3x3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed3x4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed4x1() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed4x2() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed4x3() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Fixed4x4() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetuserType_Surface() {
        return (EReference)getCgSetuserType().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetuserType_Sampler1D() {
        return (EReference)getCgSetuserType().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetuserType_Sampler2D() {
        return (EReference)getCgSetuserType().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetuserType_Sampler3D() {
        return (EReference)getCgSetuserType().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetuserType_SamplerRECT() {
        return (EReference)getCgSetuserType().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetuserType_SamplerCUBE() {
        return (EReference)getCgSetuserType().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetuserType_SamplerDEPTH() {
        return (EReference)getCgSetuserType().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_String() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Enum() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetuserType_Array() {
        return (EReference)getCgSetuserType().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetuserType_Usertype() {
        return (EReference)getCgSetuserType().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetuserType_ConnectParam() {
        return (EReference)getCgSetuserType().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSetuserType_Setparam() {
        return (EReference)getCgSetuserType().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Name() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCgSetuserType_Source() {
        return (EAttribute)getCgSetuserType().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCgSurfaceType() {
		if (cgSurfaceTypeEClass == null) {
			cgSurfaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(176);
		}
		return cgSurfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCgSurfaceType_Generator() {
        return (EReference)getCgSurfaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelType() {
		if (channelTypeEClass == null) {
			channelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(177);
		}
		return channelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelType_Source() {
        return (EAttribute)getChannelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelType_Target() {
        return (EAttribute)getChannelType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearColorType() {
		if (clearColorTypeEClass == null) {
			clearColorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(178);
		}
		return clearColorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClearColorType_Param() {
        return (EAttribute)getClearColorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClearColorType_Value() {
        return (EAttribute)getClearColorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearColorType1() {
		if (clearColorType1EClass == null) {
			clearColorType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(179);
		}
		return clearColorType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClearColorType1_Param() {
        return (EAttribute)getClearColorType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClearColorType1_Value() {
        return (EAttribute)getClearColorType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearDepthType() {
		if (clearDepthTypeEClass == null) {
			clearDepthTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(180);
		}
		return clearDepthTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClearDepthType_Param() {
        return (EAttribute)getClearDepthType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClearDepthType_Value() {
        return (EAttribute)getClearDepthType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearDepthType1() {
		if (clearDepthType1EClass == null) {
			clearDepthType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(181);
		}
		return clearDepthType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClearDepthType1_Param() {
        return (EAttribute)getClearDepthType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClearDepthType1_Value() {
        return (EAttribute)getClearDepthType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearStencilType() {
		if (clearStencilTypeEClass == null) {
			clearStencilTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(182);
		}
		return clearStencilTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClearStencilType_Param() {
        return (EAttribute)getClearStencilType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClearStencilType_Value() {
        return (EAttribute)getClearStencilType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearStencilType1() {
		if (clearStencilType1EClass == null) {
			clearStencilType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(183);
		}
		return clearStencilType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClearStencilType1_Param() {
        return (EAttribute)getClearStencilType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClearStencilType1_Value() {
        return (EAttribute)getClearStencilType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClipPlaneEnableType() {
		if (clipPlaneEnableTypeEClass == null) {
			clipPlaneEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(184);
		}
		return clipPlaneEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClipPlaneEnableType_Index() {
        return (EAttribute)getClipPlaneEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClipPlaneEnableType_Param() {
        return (EAttribute)getClipPlaneEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClipPlaneEnableType_Value() {
        return (EAttribute)getClipPlaneEnableType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClipPlaneEnableType1() {
		if (clipPlaneEnableType1EClass == null) {
			clipPlaneEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(185);
		}
		return clipPlaneEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClipPlaneEnableType1_Index() {
        return (EAttribute)getClipPlaneEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClipPlaneEnableType1_Param() {
        return (EAttribute)getClipPlaneEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClipPlaneEnableType1_Value() {
        return (EAttribute)getClipPlaneEnableType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClipPlaneType() {
		if (clipPlaneTypeEClass == null) {
			clipPlaneTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(186);
		}
		return clipPlaneTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClipPlaneType_Index() {
        return (EAttribute)getClipPlaneType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClipPlaneType_Param() {
        return (EAttribute)getClipPlaneType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClipPlaneType_Value() {
        return (EAttribute)getClipPlaneType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClipPlaneType1() {
		if (clipPlaneType1EClass == null) {
			clipPlaneType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(187);
		}
		return clipPlaneType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClipPlaneType1_Index() {
        return (EAttribute)getClipPlaneType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClipPlaneType1_Param() {
        return (EAttribute)getClipPlaneType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClipPlaneType1_Value() {
        return (EAttribute)getClipPlaneType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOLLADAType() {
		if (colladaTypeEClass == null) {
			colladaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(188);
		}
		return colladaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOLLADAType_Asset() {
        return (EReference)getCOLLADAType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOLLADAType_Group() {
        return (EAttribute)getCOLLADAType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOLLADAType_LibraryAnimations() {
        return (EReference)getCOLLADAType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOLLADAType_LibraryAnimationClips() {
        return (EReference)getCOLLADAType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOLLADAType_LibraryCameras() {
        return (EReference)getCOLLADAType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOLLADAType_LibraryControllers() {
        return (EReference)getCOLLADAType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOLLADAType_LibraryGeometries() {
        return (EReference)getCOLLADAType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOLLADAType_LibraryEffects() {
        return (EReference)getCOLLADAType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOLLADAType_LibraryForceFields() {
        return (EReference)getCOLLADAType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOLLADAType_LibraryImages() {
        return (EReference)getCOLLADAType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOLLADAType_LibraryLights() {
        return (EReference)getCOLLADAType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOLLADAType_LibraryMaterials() {
        return (EReference)getCOLLADAType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOLLADAType_LibraryNodes() {
        return (EReference)getCOLLADAType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOLLADAType_LibraryPhysicsMaterials() {
        return (EReference)getCOLLADAType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOLLADAType_LibraryPhysicsModels() {
        return (EReference)getCOLLADAType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOLLADAType_LibraryPhysicsScenes() {
        return (EReference)getCOLLADAType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOLLADAType_LibraryVisualScenes() {
        return (EReference)getCOLLADAType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOLLADAType_Scene() {
        return (EReference)getCOLLADAType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOLLADAType_Extra() {
        return (EReference)getCOLLADAType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOLLADAType_Base() {
        return (EAttribute)getCOLLADAType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOLLADAType_Version() {
        return (EAttribute)getCOLLADAType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOLLADAType_ProjectName() {
        return (EAttribute)getCOLLADAType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorLogicOpEnableType() {
		if (colorLogicOpEnableTypeEClass == null) {
			colorLogicOpEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(189);
		}
		return colorLogicOpEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorLogicOpEnableType_Param() {
        return (EAttribute)getColorLogicOpEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorLogicOpEnableType_Value() {
        return (EAttribute)getColorLogicOpEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorLogicOpEnableType1() {
		if (colorLogicOpEnableType1EClass == null) {
			colorLogicOpEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(190);
		}
		return colorLogicOpEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorLogicOpEnableType1_Param() {
        return (EAttribute)getColorLogicOpEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorLogicOpEnableType1_Value() {
        return (EAttribute)getColorLogicOpEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorMaskType() {
		if (colorMaskTypeEClass == null) {
			colorMaskTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(191);
		}
		return colorMaskTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorMaskType_Param() {
        return (EAttribute)getColorMaskType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorMaskType_Value() {
        return (EAttribute)getColorMaskType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorMaskType1() {
		if (colorMaskType1EClass == null) {
			colorMaskType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(192);
		}
		return colorMaskType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorMaskType1_Param() {
        return (EAttribute)getColorMaskType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorMaskType1_Value() {
        return (EAttribute)getColorMaskType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorMaterialEnableType() {
		if (colorMaterialEnableTypeEClass == null) {
			colorMaterialEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(193);
		}
		return colorMaterialEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorMaterialEnableType_Param() {
        return (EAttribute)getColorMaterialEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorMaterialEnableType_Value() {
        return (EAttribute)getColorMaterialEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorMaterialEnableType1() {
		if (colorMaterialEnableType1EClass == null) {
			colorMaterialEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(194);
		}
		return colorMaterialEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorMaterialEnableType1_Param() {
        return (EAttribute)getColorMaterialEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorMaterialEnableType1_Value() {
        return (EAttribute)getColorMaterialEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorMaterialType() {
		if (colorMaterialTypeEClass == null) {
			colorMaterialTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(195);
		}
		return colorMaterialTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColorMaterialType_Face() {
        return (EReference)getColorMaterialType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColorMaterialType_Mode() {
        return (EReference)getColorMaterialType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorType() {
		if (colorTypeEClass == null) {
			colorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(196);
		}
		return colorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorType_Value() {
        return (EAttribute)getColorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorType_Sid() {
        return (EAttribute)getColorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonColorOrTextureType() {
		if (commonColorOrTextureTypeEClass == null) {
			commonColorOrTextureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(197);
		}
		return commonColorOrTextureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonColorOrTextureType_Color() {
        return (EReference)getCommonColorOrTextureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonColorOrTextureType_Param() {
        return (EReference)getCommonColorOrTextureType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonColorOrTextureType_Texture() {
        return (EReference)getCommonColorOrTextureType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonFloatOrParamType() {
		if (commonFloatOrParamTypeEClass == null) {
			commonFloatOrParamTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(198);
		}
		return commonFloatOrParamTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonFloatOrParamType_Float() {
        return (EReference)getCommonFloatOrParamType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonFloatOrParamType_Param() {
        return (EReference)getCommonFloatOrParamType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonNewparamType() {
		if (commonNewparamTypeEClass == null) {
			commonNewparamTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(199);
		}
		return commonNewparamTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonNewparamType_Semantic() {
        return (EAttribute)getCommonNewparamType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonNewparamType_Float() {
        return (EAttribute)getCommonNewparamType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonNewparamType_Float2() {
        return (EAttribute)getCommonNewparamType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonNewparamType_Float3() {
        return (EAttribute)getCommonNewparamType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonNewparamType_Float4() {
        return (EAttribute)getCommonNewparamType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonNewparamType_Surface() {
        return (EReference)getCommonNewparamType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonNewparamType_Sampler2D() {
        return (EReference)getCommonNewparamType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonNewparamType_Sid() {
        return (EAttribute)getCommonNewparamType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonTransparentType() {
		if (commonTransparentTypeEClass == null) {
			commonTransparentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(204);
		}
		return commonTransparentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonTransparentType_Opaque() {
        return (EAttribute)getCommonTransparentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilerTargetType() {
		if (compilerTargetTypeEClass == null) {
			compilerTargetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(205);
		}
		return compilerTargetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompilerTargetType_Value() {
        return (EAttribute)getCompilerTargetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilerTargetType1() {
		if (compilerTargetType1EClass == null) {
			compilerTargetType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(206);
		}
		return compilerTargetType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompilerTargetType1_Value() {
        return (EAttribute)getCompilerTargetType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantType() {
		if (constantTypeEClass == null) {
			constantTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(207);
		}
		return constantTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantType_Emission() {
        return (EReference)getConstantType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantType_Reflective() {
        return (EReference)getConstantType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantType_Reflectivity() {
        return (EReference)getConstantType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantType_Transparent() {
        return (EReference)getConstantType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantType_Transparency() {
        return (EReference)getConstantType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantType_IndexOfRefraction() {
        return (EReference)getConstantType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContributorType() {
		if (contributorTypeEClass == null) {
			contributorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(208);
		}
		return contributorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContributorType_Author() {
        return (EAttribute)getContributorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContributorType_AuthoringTool() {
        return (EAttribute)getContributorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContributorType_Comments() {
        return (EAttribute)getContributorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContributorType_Copyright() {
        return (EAttribute)getContributorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContributorType_SourceData() {
        return (EAttribute)getContributorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerType() {
		if (controllerTypeEClass == null) {
			controllerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(209);
		}
		return controllerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerType_Asset() {
        return (EReference)getControllerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerType_Skin() {
        return (EReference)getControllerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerType_Morph() {
        return (EReference)getControllerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerType_Extra() {
        return (EReference)getControllerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerType_Id() {
        return (EAttribute)getControllerType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerType_Name() {
        return (EAttribute)getControllerType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlVerticesType() {
		if (controlVerticesTypeEClass == null) {
			controlVerticesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(210);
		}
		return controlVerticesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlVerticesType_Input() {
        return (EReference)getControlVerticesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlVerticesType_Extra() {
        return (EReference)getControlVerticesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConvexMeshType() {
		if (convexMeshTypeEClass == null) {
			convexMeshTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(211);
		}
		return convexMeshTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConvexMeshType_Source() {
        return (EReference)getConvexMeshType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConvexMeshType_Vertices() {
        return (EReference)getConvexMeshType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConvexMeshType_Group() {
        return (EAttribute)getConvexMeshType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConvexMeshType_Lines() {
        return (EReference)getConvexMeshType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConvexMeshType_Linestrips() {
        return (EReference)getConvexMeshType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConvexMeshType_Polygons() {
        return (EReference)getConvexMeshType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConvexMeshType_Polylist() {
        return (EReference)getConvexMeshType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConvexMeshType_Triangles() {
        return (EReference)getConvexMeshType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConvexMeshType_Trifans() {
        return (EReference)getConvexMeshType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConvexMeshType_Tristrips() {
        return (EReference)getConvexMeshType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConvexMeshType_Extra() {
        return (EReference)getConvexMeshType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConvexMeshType_ConvexHullOf() {
        return (EAttribute)getConvexMeshType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCullFaceEnableType() {
		if (cullFaceEnableTypeEClass == null) {
			cullFaceEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(212);
		}
		return cullFaceEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCullFaceEnableType_Param() {
        return (EAttribute)getCullFaceEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCullFaceEnableType_Value() {
        return (EAttribute)getCullFaceEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCullFaceEnableType1() {
		if (cullFaceEnableType1EClass == null) {
			cullFaceEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(213);
		}
		return cullFaceEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCullFaceEnableType1_Param() {
        return (EAttribute)getCullFaceEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCullFaceEnableType1_Value() {
        return (EAttribute)getCullFaceEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCullFaceType() {
		if (cullFaceTypeEClass == null) {
			cullFaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(214);
		}
		return cullFaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCullFaceType_Param() {
        return (EAttribute)getCullFaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCullFaceType_Value() {
        return (EAttribute)getCullFaceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCullFaceType1() {
		if (cullFaceType1EClass == null) {
			cullFaceType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(215);
		}
		return cullFaceType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCullFaceType1_Param() {
        return (EAttribute)getCullFaceType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCullFaceType1_Value() {
        return (EAttribute)getCullFaceType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCylinderType() {
		if (cylinderTypeEClass == null) {
			cylinderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(216);
		}
		return cylinderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylinderType_Height() {
        return (EAttribute)getCylinderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylinderType_Radius() {
        return (EAttribute)getCylinderType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCylinderType_Extra() {
        return (EReference)getCylinderType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepthBoundsEnableType() {
		if (depthBoundsEnableTypeEClass == null) {
			depthBoundsEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(218);
		}
		return depthBoundsEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthBoundsEnableType_Param() {
        return (EAttribute)getDepthBoundsEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthBoundsEnableType_Value() {
        return (EAttribute)getDepthBoundsEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepthBoundsType() {
		if (depthBoundsTypeEClass == null) {
			depthBoundsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(219);
		}
		return depthBoundsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthBoundsType_Param() {
        return (EAttribute)getDepthBoundsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthBoundsType_Value() {
        return (EAttribute)getDepthBoundsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepthClampEnableType() {
		if (depthClampEnableTypeEClass == null) {
			depthClampEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(220);
		}
		return depthClampEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthClampEnableType_Param() {
        return (EAttribute)getDepthClampEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthClampEnableType_Value() {
        return (EAttribute)getDepthClampEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepthFuncType() {
		if (depthFuncTypeEClass == null) {
			depthFuncTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(221);
		}
		return depthFuncTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthFuncType_Param() {
        return (EAttribute)getDepthFuncType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthFuncType_Value() {
        return (EAttribute)getDepthFuncType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepthFuncType1() {
		if (depthFuncType1EClass == null) {
			depthFuncType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(222);
		}
		return depthFuncType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthFuncType1_Param() {
        return (EAttribute)getDepthFuncType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthFuncType1_Value() {
        return (EAttribute)getDepthFuncType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepthMaskType() {
		if (depthMaskTypeEClass == null) {
			depthMaskTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(223);
		}
		return depthMaskTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthMaskType_Param() {
        return (EAttribute)getDepthMaskType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthMaskType_Value() {
        return (EAttribute)getDepthMaskType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepthMaskType1() {
		if (depthMaskType1EClass == null) {
			depthMaskType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(224);
		}
		return depthMaskType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthMaskType1_Param() {
        return (EAttribute)getDepthMaskType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthMaskType1_Value() {
        return (EAttribute)getDepthMaskType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepthRangeType() {
		if (depthRangeTypeEClass == null) {
			depthRangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(225);
		}
		return depthRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthRangeType_Param() {
        return (EAttribute)getDepthRangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthRangeType_Value() {
        return (EAttribute)getDepthRangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepthRangeType1() {
		if (depthRangeType1EClass == null) {
			depthRangeType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(226);
		}
		return depthRangeType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthRangeType1_Param() {
        return (EAttribute)getDepthRangeType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthRangeType1_Value() {
        return (EAttribute)getDepthRangeType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepthTestEnableType() {
		if (depthTestEnableTypeEClass == null) {
			depthTestEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(227);
		}
		return depthTestEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthTestEnableType_Param() {
        return (EAttribute)getDepthTestEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthTestEnableType_Value() {
        return (EAttribute)getDepthTestEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepthTestEnableType1() {
		if (depthTestEnableType1EClass == null) {
			depthTestEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(228);
		}
		return depthTestEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthTestEnableType1_Param() {
        return (EAttribute)getDepthTestEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthTestEnableType1_Value() {
        return (EAttribute)getDepthTestEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestAlphaType() {
		if (destAlphaTypeEClass == null) {
			destAlphaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(229);
		}
		return destAlphaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestAlphaType_Param() {
        return (EAttribute)getDestAlphaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestAlphaType_Value() {
        return (EAttribute)getDestAlphaType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestRgbType() {
		if (destRgbTypeEClass == null) {
			destRgbTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(230);
		}
		return destRgbTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestRgbType_Param() {
        return (EAttribute)getDestRgbType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestRgbType_Value() {
        return (EAttribute)getDestRgbType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestType() {
		if (destTypeEClass == null) {
			destTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(231);
		}
		return destTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestType_Param() {
        return (EAttribute)getDestType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestType_Value() {
        return (EAttribute)getDestType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestType1() {
		if (destType1EClass == null) {
			destType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(232);
		}
		return destType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestType1_Param() {
        return (EAttribute)getDestType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestType1_Value() {
        return (EAttribute)getDestType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectionalType() {
		if (directionalTypeEClass == null) {
			directionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(233);
		}
		return directionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectionalType_Color() {
        return (EReference)getDirectionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDitherEnableType() {
		if (ditherEnableTypeEClass == null) {
			ditherEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(234);
		}
		return ditherEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDitherEnableType_Param() {
        return (EAttribute)getDitherEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDitherEnableType_Value() {
        return (EAttribute)getDitherEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDitherEnableType1() {
		if (ditherEnableType1EClass == null) {
			ditherEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(235);
		}
		return ditherEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDitherEnableType1_Param() {
        return (EAttribute)getDitherEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDitherEnableType1_Value() {
        return (EAttribute)getDitherEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(236);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Accessor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Animation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AnimationClip() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Asset() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BindMaterial() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BoolArray() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Box() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Camera() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Capsule() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Channel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_COLLADA() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Controller() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConvexMesh() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Cylinder() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Effect() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Ellipsoid() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Extra() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FloatArray() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ForceField() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FxProfileAbstract() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Geometry() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GlHookAbstract() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IDREFArray() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Image() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InstanceCamera() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InstanceController() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InstanceEffect() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InstanceForceField() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InstanceGeometry() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InstanceLight() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InstanceMaterial() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InstanceNode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InstancePhysicsMaterial() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InstancePhysicsModel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InstanceRigidBody() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InstanceRigidConstraint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IntArray() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LibraryAnimationClips() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LibraryAnimations() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LibraryCameras() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LibraryControllers() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LibraryEffects() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LibraryForceFields() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LibraryGeometries() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LibraryImages() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LibraryLights() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LibraryMaterials() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LibraryNodes() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LibraryPhysicsMaterials() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LibraryPhysicsModels() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LibraryPhysicsScenes() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LibraryVisualScenes() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Light() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Lines() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Linestrips() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Lookat() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Material() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Matrix() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Mesh() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Morph() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NameArray() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Node() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_P() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Param() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PhysicsMaterial() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PhysicsModel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PhysicsScene() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Plane() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Polygons() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Polylist() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProfileCG() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProfileCOMMON() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProfileGLES() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProfileGLSL() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RigidBody() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RigidConstraint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Rotate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Sampler() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Scale() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Skew() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Skin() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Source() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Sphere() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Spline() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TaperedCapsule() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TaperedCylinder() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Technique() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Translate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Triangles() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Trifans() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Tristrips() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Vertices() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VisualScene() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicType() {
		if (dynamicTypeEClass == null) {
			dynamicTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(237);
		}
		return dynamicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicType_Value() {
        return (EAttribute)getDynamicType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicType_Sid() {
        return (EAttribute)getDynamicType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicType1() {
		if (dynamicType1EClass == null) {
			dynamicType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(238);
		}
		return dynamicType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicType1_Value() {
        return (EAttribute)getDynamicType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicType1_Sid() {
        return (EAttribute)getDynamicType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEffectType() {
		if (effectTypeEClass == null) {
			effectTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(239);
		}
		return effectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectType_Asset() {
        return (EReference)getEffectType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectType_Annotate() {
        return (EReference)getEffectType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectType_Image() {
        return (EReference)getEffectType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectType_Newparam() {
        return (EReference)getEffectType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffectType_FxProfileAbstractGroup() {
        return (EAttribute)getEffectType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectType_FxProfileAbstract() {
        return (EReference)getEffectType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectType_Extra() {
        return (EReference)getEffectType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffectType_Id() {
        return (EAttribute)getEffectType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffectType_Name() {
        return (EAttribute)getEffectType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEllipsoidType() {
		if (ellipsoidTypeEClass == null) {
			ellipsoidTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(240);
		}
		return ellipsoidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsoidType_Size() {
        return (EAttribute)getEllipsoidType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnabledType() {
		if (enabledTypeEClass == null) {
			enabledTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(241);
		}
		return enabledTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnabledType_Value() {
        return (EAttribute)getEnabledType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnabledType_Sid() {
        return (EAttribute)getEnabledType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluateSceneType() {
		if (evaluateSceneTypeEClass == null) {
			evaluateSceneTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(242);
		}
		return evaluateSceneTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluateSceneType_Render() {
        return (EReference)getEvaluateSceneType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluateSceneType_Name() {
        return (EAttribute)getEvaluateSceneType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtraType() {
		if (extraTypeEClass == null) {
			extraTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(243);
		}
		return extraTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtraType_Asset() {
        return (EReference)getExtraType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtraType_Technique() {
        return (EReference)getExtraType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtraType_Id() {
        return (EAttribute)getExtraType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtraType_Name() {
        return (EAttribute)getExtraType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtraType_Type() {
        return (EAttribute)getExtraType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaceType() {
		if (faceTypeEClass == null) {
			faceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(244);
		}
		return faceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceType_Param() {
        return (EAttribute)getFaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceType_Value() {
        return (EAttribute)getFaceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaceType1() {
		if (faceType1EClass == null) {
			faceType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(245);
		}
		return faceType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceType1_Param() {
        return (EAttribute)getFaceType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceType1_Value() {
        return (EAttribute)getFaceType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaceType2() {
		if (faceType2EClass == null) {
			faceType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(246);
		}
		return faceType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceType2_Param() {
        return (EAttribute)getFaceType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceType2_Value() {
        return (EAttribute)getFaceType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaceType3() {
		if (faceType3EClass == null) {
			faceType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(247);
		}
		return faceType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceType3_Param() {
        return (EAttribute)getFaceType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceType3_Value() {
        return (EAttribute)getFaceType3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaceType4() {
		if (faceType4EClass == null) {
			faceType4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(248);
		}
		return faceType4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceType4_Ref() {
        return (EAttribute)getFaceType4().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailType() {
		if (failTypeEClass == null) {
			failTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(249);
		}
		return failTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailType_Param() {
        return (EAttribute)getFailType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailType_Value() {
        return (EAttribute)getFailType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailType1() {
		if (failType1EClass == null) {
			failType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(250);
		}
		return failType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailType1_Param() {
        return (EAttribute)getFailType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailType1_Value() {
        return (EAttribute)getFailType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailType2() {
		if (failType2EClass == null) {
			failType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(251);
		}
		return failType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailType2_Param() {
        return (EAttribute)getFailType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailType2_Value() {
        return (EAttribute)getFailType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatArrayType() {
		if (floatArrayTypeEClass == null) {
			floatArrayTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(266);
		}
		return floatArrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatArrayType_Value() {
        return (EAttribute)getFloatArrayType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatArrayType_Count() {
        return (EAttribute)getFloatArrayType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatArrayType_Digits() {
        return (EAttribute)getFloatArrayType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatArrayType_Id() {
        return (EAttribute)getFloatArrayType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatArrayType_Magnitude() {
        return (EAttribute)getFloatArrayType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatArrayType_Name() {
        return (EAttribute)getFloatArrayType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatType() {
		if (floatTypeEClass == null) {
			floatTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(268);
		}
		return floatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatType_Value() {
        return (EAttribute)getFloatType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatType_Sid() {
        return (EAttribute)getFloatType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFogColorType() {
		if (fogColorTypeEClass == null) {
			fogColorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(269);
		}
		return fogColorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogColorType_Param() {
        return (EAttribute)getFogColorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogColorType_Value() {
        return (EAttribute)getFogColorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFogColorType1() {
		if (fogColorType1EClass == null) {
			fogColorType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(270);
		}
		return fogColorType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogColorType1_Param() {
        return (EAttribute)getFogColorType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogColorType1_Value() {
        return (EAttribute)getFogColorType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFogCoordSrcType() {
		if (fogCoordSrcTypeEClass == null) {
			fogCoordSrcTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(271);
		}
		return fogCoordSrcTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogCoordSrcType_Param() {
        return (EAttribute)getFogCoordSrcType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogCoordSrcType_Value() {
        return (EAttribute)getFogCoordSrcType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFogDensityType() {
		if (fogDensityTypeEClass == null) {
			fogDensityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(272);
		}
		return fogDensityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogDensityType_Param() {
        return (EAttribute)getFogDensityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogDensityType_Value() {
        return (EAttribute)getFogDensityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFogDensityType1() {
		if (fogDensityType1EClass == null) {
			fogDensityType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(273);
		}
		return fogDensityType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogDensityType1_Param() {
        return (EAttribute)getFogDensityType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogDensityType1_Value() {
        return (EAttribute)getFogDensityType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFogEnableType() {
		if (fogEnableTypeEClass == null) {
			fogEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(274);
		}
		return fogEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogEnableType_Param() {
        return (EAttribute)getFogEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogEnableType_Value() {
        return (EAttribute)getFogEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFogEnableType1() {
		if (fogEnableType1EClass == null) {
			fogEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(275);
		}
		return fogEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogEnableType1_Param() {
        return (EAttribute)getFogEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogEnableType1_Value() {
        return (EAttribute)getFogEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFogEndType() {
		if (fogEndTypeEClass == null) {
			fogEndTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(276);
		}
		return fogEndTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogEndType_Param() {
        return (EAttribute)getFogEndType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogEndType_Value() {
        return (EAttribute)getFogEndType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFogEndType1() {
		if (fogEndType1EClass == null) {
			fogEndType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(277);
		}
		return fogEndType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogEndType1_Param() {
        return (EAttribute)getFogEndType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogEndType1_Value() {
        return (EAttribute)getFogEndType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFogModeType() {
		if (fogModeTypeEClass == null) {
			fogModeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(278);
		}
		return fogModeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogModeType_Param() {
        return (EAttribute)getFogModeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogModeType_Value() {
        return (EAttribute)getFogModeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFogModeType1() {
		if (fogModeType1EClass == null) {
			fogModeType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(279);
		}
		return fogModeType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogModeType1_Param() {
        return (EAttribute)getFogModeType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogModeType1_Value() {
        return (EAttribute)getFogModeType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFogStartType() {
		if (fogStartTypeEClass == null) {
			fogStartTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(280);
		}
		return fogStartTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogStartType_Param() {
        return (EAttribute)getFogStartType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogStartType_Value() {
        return (EAttribute)getFogStartType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFogStartType1() {
		if (fogStartType1EClass == null) {
			fogStartType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(281);
		}
		return fogStartType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogStartType1_Param() {
        return (EAttribute)getFogStartType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogStartType1_Value() {
        return (EAttribute)getFogStartType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForceFieldType() {
		if (forceFieldTypeEClass == null) {
			forceFieldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(282);
		}
		return forceFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForceFieldType_Asset() {
        return (EReference)getForceFieldType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForceFieldType_Technique() {
        return (EReference)getForceFieldType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForceFieldType_Extra() {
        return (EReference)getForceFieldType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForceFieldType_Id() {
        return (EAttribute)getForceFieldType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForceFieldType_Name() {
        return (EAttribute)getForceFieldType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrontFaceType() {
		if (frontFaceTypeEClass == null) {
			frontFaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(283);
		}
		return frontFaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrontFaceType_Param() {
        return (EAttribute)getFrontFaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrontFaceType_Value() {
        return (EAttribute)getFrontFaceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrontFaceType1() {
		if (frontFaceType1EClass == null) {
			frontFaceType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(284);
		}
		return frontFaceType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrontFaceType1_Param() {
        return (EAttribute)getFrontFaceType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrontFaceType1_Value() {
        return (EAttribute)getFrontFaceType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrontType() {
		if (frontTypeEClass == null) {
			frontTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(285);
		}
		return frontTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrontType_Param() {
        return (EAttribute)getFrontType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrontType_Value() {
        return (EAttribute)getFrontType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuncType() {
		if (funcTypeEClass == null) {
			funcTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(286);
		}
		return funcTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuncType_Param() {
        return (EAttribute)getFuncType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuncType_Value() {
        return (EAttribute)getFuncType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuncType1() {
		if (funcType1EClass == null) {
			funcType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(287);
		}
		return funcType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuncType1_Param() {
        return (EAttribute)getFuncType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuncType1_Value() {
        return (EAttribute)getFuncType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuncType2() {
		if (funcType2EClass == null) {
			funcType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(288);
		}
		return funcType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuncType2_Param() {
        return (EAttribute)getFuncType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuncType2_Value() {
        return (EAttribute)getFuncType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuncType3() {
		if (funcType3EClass == null) {
			funcType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(289);
		}
		return funcType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuncType3_Param() {
        return (EAttribute)getFuncType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuncType3_Value() {
        return (EAttribute)getFuncType3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxAnnotateCommon() {
		if (fxAnnotateCommonEClass == null) {
			fxAnnotateCommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(290);
		}
		return fxAnnotateCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxAnnotateCommon_Bool() {
        return (EAttribute)getFxAnnotateCommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxAnnotateCommon_Bool2() {
        return (EAttribute)getFxAnnotateCommon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxAnnotateCommon_Bool3() {
        return (EAttribute)getFxAnnotateCommon().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxAnnotateCommon_Bool4() {
        return (EAttribute)getFxAnnotateCommon().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxAnnotateCommon_Int() {
        return (EAttribute)getFxAnnotateCommon().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxAnnotateCommon_Int2() {
        return (EAttribute)getFxAnnotateCommon().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxAnnotateCommon_Int3() {
        return (EAttribute)getFxAnnotateCommon().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxAnnotateCommon_Int4() {
        return (EAttribute)getFxAnnotateCommon().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxAnnotateCommon_Float() {
        return (EAttribute)getFxAnnotateCommon().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxAnnotateCommon_Float2() {
        return (EAttribute)getFxAnnotateCommon().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxAnnotateCommon_Float3() {
        return (EAttribute)getFxAnnotateCommon().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxAnnotateCommon_Float4() {
        return (EAttribute)getFxAnnotateCommon().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxAnnotateCommon_Float2x2() {
        return (EAttribute)getFxAnnotateCommon().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxAnnotateCommon_Float3x3() {
        return (EAttribute)getFxAnnotateCommon().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxAnnotateCommon_Float4x4() {
        return (EAttribute)getFxAnnotateCommon().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxAnnotateCommon_String() {
        return (EAttribute)getFxAnnotateCommon().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxAnnotateCommon_Name() {
        return (EAttribute)getFxAnnotateCommon().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxClearcolorCommon() {
		if (fxClearcolorCommonEClass == null) {
			fxClearcolorCommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(291);
		}
		return fxClearcolorCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxClearcolorCommon_Value() {
        return (EAttribute)getFxClearcolorCommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxClearcolorCommon_Index() {
        return (EAttribute)getFxClearcolorCommon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxCleardepthCommon() {
		if (fxCleardepthCommonEClass == null) {
			fxCleardepthCommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(292);
		}
		return fxCleardepthCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxCleardepthCommon_Value() {
        return (EAttribute)getFxCleardepthCommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxCleardepthCommon_Index() {
        return (EAttribute)getFxCleardepthCommon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxClearstencilCommon() {
		if (fxClearstencilCommonEClass == null) {
			fxClearstencilCommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(293);
		}
		return fxClearstencilCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxClearstencilCommon_Value() {
        return (EAttribute)getFxClearstencilCommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxClearstencilCommon_Index() {
        return (EAttribute)getFxClearstencilCommon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxCodeProfile() {
		if (fxCodeProfileEClass == null) {
			fxCodeProfileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(294);
		}
		return fxCodeProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxCodeProfile_Value() {
        return (EAttribute)getFxCodeProfile().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxCodeProfile_Sid() {
        return (EAttribute)getFxCodeProfile().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxColortargetCommon() {
		if (fxColortargetCommonEClass == null) {
			fxColortargetCommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(296);
		}
		return fxColortargetCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxColortargetCommon_Value() {
        return (EAttribute)getFxColortargetCommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxColortargetCommon_Face() {
        return (EAttribute)getFxColortargetCommon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxColortargetCommon_Index() {
        return (EAttribute)getFxColortargetCommon().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxColortargetCommon_Mip() {
        return (EAttribute)getFxColortargetCommon().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxColortargetCommon_Slice() {
        return (EAttribute)getFxColortargetCommon().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxDepthtargetCommon() {
		if (fxDepthtargetCommonEClass == null) {
			fxDepthtargetCommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(297);
		}
		return fxDepthtargetCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxDepthtargetCommon_Value() {
        return (EAttribute)getFxDepthtargetCommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxDepthtargetCommon_Face() {
        return (EAttribute)getFxDepthtargetCommon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxDepthtargetCommon_Index() {
        return (EAttribute)getFxDepthtargetCommon().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxDepthtargetCommon_Mip() {
        return (EAttribute)getFxDepthtargetCommon().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxDepthtargetCommon_Slice() {
        return (EAttribute)getFxDepthtargetCommon().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxIncludeCommon() {
		if (fxIncludeCommonEClass == null) {
			fxIncludeCommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(299);
		}
		return fxIncludeCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxIncludeCommon_Sid() {
        return (EAttribute)getFxIncludeCommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxIncludeCommon_Url() {
        return (EAttribute)getFxIncludeCommon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxNewparamCommon() {
		if (fxNewparamCommonEClass == null) {
			fxNewparamCommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(302);
		}
		return fxNewparamCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxNewparamCommon_Annotate() {
        return (EReference)getFxNewparamCommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Semantic() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Modifier() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Bool() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Bool2() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Bool3() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Bool4() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Int() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Int2() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Int3() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Int4() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Float() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Float2() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Float3() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Float4() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Float1x1() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Float1x2() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Float1x3() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Float1x4() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Float2x1() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Float2x2() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Float2x3() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Float2x4() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Float3x1() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Float3x2() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Float3x3() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Float3x4() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Float4x1() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Float4x2() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Float4x3() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Float4x4() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxNewparamCommon_Surface() {
        return (EReference)getFxNewparamCommon().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxNewparamCommon_Sampler1D() {
        return (EReference)getFxNewparamCommon().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxNewparamCommon_Sampler2D() {
        return (EReference)getFxNewparamCommon().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxNewparamCommon_Sampler3D() {
        return (EReference)getFxNewparamCommon().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxNewparamCommon_SamplerCUBE() {
        return (EReference)getFxNewparamCommon().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxNewparamCommon_SamplerRECT() {
        return (EReference)getFxNewparamCommon().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxNewparamCommon_SamplerDEPTH() {
        return (EReference)getFxNewparamCommon().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Enum() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxNewparamCommon_Sid() {
        return (EAttribute)getFxNewparamCommon().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxSampler1DCommon() {
		if (fxSampler1DCommonEClass == null) {
			fxSampler1DCommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(307);
		}
		return fxSampler1DCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler1DCommon_Source() {
        return (EAttribute)getFxSampler1DCommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler1DCommon_WrapS() {
        return (EAttribute)getFxSampler1DCommon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler1DCommon_Minfilter() {
        return (EAttribute)getFxSampler1DCommon().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler1DCommon_Magfilter() {
        return (EAttribute)getFxSampler1DCommon().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler1DCommon_Mipfilter() {
        return (EAttribute)getFxSampler1DCommon().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler1DCommon_BorderColor() {
        return (EAttribute)getFxSampler1DCommon().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler1DCommon_MipmapMaxlevel() {
        return (EAttribute)getFxSampler1DCommon().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler1DCommon_MipmapBias() {
        return (EAttribute)getFxSampler1DCommon().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSampler1DCommon_Extra() {
        return (EReference)getFxSampler1DCommon().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxSampler2DCommon() {
		if (fxSampler2DCommonEClass == null) {
			fxSampler2DCommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(308);
		}
		return fxSampler2DCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler2DCommon_Source() {
        return (EAttribute)getFxSampler2DCommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler2DCommon_WrapS() {
        return (EAttribute)getFxSampler2DCommon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler2DCommon_WrapT() {
        return (EAttribute)getFxSampler2DCommon().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler2DCommon_Minfilter() {
        return (EAttribute)getFxSampler2DCommon().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler2DCommon_Magfilter() {
        return (EAttribute)getFxSampler2DCommon().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler2DCommon_Mipfilter() {
        return (EAttribute)getFxSampler2DCommon().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler2DCommon_BorderColor() {
        return (EAttribute)getFxSampler2DCommon().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler2DCommon_MipmapMaxlevel() {
        return (EAttribute)getFxSampler2DCommon().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler2DCommon_MipmapBias() {
        return (EAttribute)getFxSampler2DCommon().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSampler2DCommon_Extra() {
        return (EReference)getFxSampler2DCommon().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxSampler3DCommon() {
		if (fxSampler3DCommonEClass == null) {
			fxSampler3DCommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(309);
		}
		return fxSampler3DCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler3DCommon_Source() {
        return (EAttribute)getFxSampler3DCommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler3DCommon_WrapS() {
        return (EAttribute)getFxSampler3DCommon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler3DCommon_WrapT() {
        return (EAttribute)getFxSampler3DCommon().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler3DCommon_WrapP() {
        return (EAttribute)getFxSampler3DCommon().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler3DCommon_Minfilter() {
        return (EAttribute)getFxSampler3DCommon().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler3DCommon_Magfilter() {
        return (EAttribute)getFxSampler3DCommon().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler3DCommon_Mipfilter() {
        return (EAttribute)getFxSampler3DCommon().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler3DCommon_BorderColor() {
        return (EAttribute)getFxSampler3DCommon().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler3DCommon_MipmapMaxlevel() {
        return (EAttribute)getFxSampler3DCommon().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSampler3DCommon_MipmapBias() {
        return (EAttribute)getFxSampler3DCommon().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSampler3DCommon_Extra() {
        return (EReference)getFxSampler3DCommon().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxSamplerCUBECommon() {
		if (fxSamplerCUBECommonEClass == null) {
			fxSamplerCUBECommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(310);
		}
		return fxSamplerCUBECommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerCUBECommon_Source() {
        return (EAttribute)getFxSamplerCUBECommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerCUBECommon_WrapS() {
        return (EAttribute)getFxSamplerCUBECommon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerCUBECommon_WrapT() {
        return (EAttribute)getFxSamplerCUBECommon().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerCUBECommon_WrapP() {
        return (EAttribute)getFxSamplerCUBECommon().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerCUBECommon_Minfilter() {
        return (EAttribute)getFxSamplerCUBECommon().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerCUBECommon_Magfilter() {
        return (EAttribute)getFxSamplerCUBECommon().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerCUBECommon_Mipfilter() {
        return (EAttribute)getFxSamplerCUBECommon().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerCUBECommon_BorderColor() {
        return (EAttribute)getFxSamplerCUBECommon().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerCUBECommon_MipmapMaxlevel() {
        return (EAttribute)getFxSamplerCUBECommon().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerCUBECommon_MipmapBias() {
        return (EAttribute)getFxSamplerCUBECommon().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSamplerCUBECommon_Extra() {
        return (EReference)getFxSamplerCUBECommon().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxSamplerDEPTHCommon() {
		if (fxSamplerDEPTHCommonEClass == null) {
			fxSamplerDEPTHCommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(311);
		}
		return fxSamplerDEPTHCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerDEPTHCommon_Source() {
        return (EAttribute)getFxSamplerDEPTHCommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerDEPTHCommon_WrapS() {
        return (EAttribute)getFxSamplerDEPTHCommon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerDEPTHCommon_WrapT() {
        return (EAttribute)getFxSamplerDEPTHCommon().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerDEPTHCommon_Minfilter() {
        return (EAttribute)getFxSamplerDEPTHCommon().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerDEPTHCommon_Magfilter() {
        return (EAttribute)getFxSamplerDEPTHCommon().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSamplerDEPTHCommon_Extra() {
        return (EReference)getFxSamplerDEPTHCommon().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxSamplerRECTCommon() {
		if (fxSamplerRECTCommonEClass == null) {
			fxSamplerRECTCommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(314);
		}
		return fxSamplerRECTCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerRECTCommon_Source() {
        return (EAttribute)getFxSamplerRECTCommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerRECTCommon_WrapS() {
        return (EAttribute)getFxSamplerRECTCommon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerRECTCommon_WrapT() {
        return (EAttribute)getFxSamplerRECTCommon().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerRECTCommon_Minfilter() {
        return (EAttribute)getFxSamplerRECTCommon().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerRECTCommon_Magfilter() {
        return (EAttribute)getFxSamplerRECTCommon().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerRECTCommon_Mipfilter() {
        return (EAttribute)getFxSamplerRECTCommon().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerRECTCommon_BorderColor() {
        return (EAttribute)getFxSamplerRECTCommon().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerRECTCommon_MipmapMaxlevel() {
        return (EAttribute)getFxSamplerRECTCommon().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSamplerRECTCommon_MipmapBias() {
        return (EAttribute)getFxSamplerRECTCommon().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSamplerRECTCommon_Extra() {
        return (EReference)getFxSamplerRECTCommon().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxStenciltargetCommon() {
		if (fxStenciltargetCommonEClass == null) {
			fxStenciltargetCommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(317);
		}
		return fxStenciltargetCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxStenciltargetCommon_Value() {
        return (EAttribute)getFxStenciltargetCommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxStenciltargetCommon_Face() {
        return (EAttribute)getFxStenciltargetCommon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxStenciltargetCommon_Index() {
        return (EAttribute)getFxStenciltargetCommon().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxStenciltargetCommon_Mip() {
        return (EAttribute)getFxStenciltargetCommon().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxStenciltargetCommon_Slice() {
        return (EAttribute)getFxStenciltargetCommon().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxSurfaceCommon() {
		if (fxSurfaceCommonEClass == null) {
			fxSurfaceCommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(318);
		}
		return fxSurfaceCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSurfaceCommon_InitAsNull() {
        return (EReference)getFxSurfaceCommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSurfaceCommon_InitAsTarget() {
        return (EReference)getFxSurfaceCommon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSurfaceCommon_InitCube() {
        return (EReference)getFxSurfaceCommon().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSurfaceCommon_InitVolume() {
        return (EReference)getFxSurfaceCommon().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSurfaceCommon_InitPlanar() {
        return (EReference)getFxSurfaceCommon().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSurfaceCommon_InitFrom() {
        return (EReference)getFxSurfaceCommon().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSurfaceCommon_Format() {
        return (EAttribute)getFxSurfaceCommon().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSurfaceCommon_FormatHint() {
        return (EReference)getFxSurfaceCommon().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSurfaceCommon_Size() {
        return (EAttribute)getFxSurfaceCommon().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSurfaceCommon_ViewportRatio() {
        return (EAttribute)getFxSurfaceCommon().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSurfaceCommon_MipLevels() {
        return (EAttribute)getFxSurfaceCommon().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSurfaceCommon_MipmapGenerate() {
        return (EAttribute)getFxSurfaceCommon().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSurfaceCommon_Extra() {
        return (EReference)getFxSurfaceCommon().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSurfaceCommon_Type() {
        return (EAttribute)getFxSurfaceCommon().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxSurfaceFormatHintCommon() {
		if (fxSurfaceFormatHintCommonEClass == null) {
			fxSurfaceFormatHintCommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(323);
		}
		return fxSurfaceFormatHintCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSurfaceFormatHintCommon_Channels() {
        return (EAttribute)getFxSurfaceFormatHintCommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSurfaceFormatHintCommon_Range() {
        return (EAttribute)getFxSurfaceFormatHintCommon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSurfaceFormatHintCommon_Precision() {
        return (EAttribute)getFxSurfaceFormatHintCommon().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSurfaceFormatHintCommon_Option() {
        return (EAttribute)getFxSurfaceFormatHintCommon().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSurfaceFormatHintCommon_Extra() {
        return (EReference)getFxSurfaceFormatHintCommon().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxSurfaceInitCubeCommon() {
		if (fxSurfaceInitCubeCommonEClass == null) {
			fxSurfaceInitCubeCommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(330);
		}
		return fxSurfaceInitCubeCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSurfaceInitCubeCommon_All() {
        return (EReference)getFxSurfaceInitCubeCommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSurfaceInitCubeCommon_Primary() {
        return (EReference)getFxSurfaceInitCubeCommon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSurfaceInitCubeCommon_Face() {
        return (EReference)getFxSurfaceInitCubeCommon().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxSurfaceInitFromCommon() {
		if (fxSurfaceInitFromCommonEClass == null) {
			fxSurfaceInitFromCommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(331);
		}
		return fxSurfaceInitFromCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSurfaceInitFromCommon_Value() {
        return (EAttribute)getFxSurfaceInitFromCommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSurfaceInitFromCommon_Face() {
        return (EAttribute)getFxSurfaceInitFromCommon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSurfaceInitFromCommon_Mip() {
        return (EAttribute)getFxSurfaceInitFromCommon().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxSurfaceInitFromCommon_Slice() {
        return (EAttribute)getFxSurfaceInitFromCommon().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxSurfaceInitPlanarCommon() {
		if (fxSurfaceInitPlanarCommonEClass == null) {
			fxSurfaceInitPlanarCommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(332);
		}
		return fxSurfaceInitPlanarCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSurfaceInitPlanarCommon_All() {
        return (EReference)getFxSurfaceInitPlanarCommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxSurfaceInitVolumeCommon() {
		if (fxSurfaceInitVolumeCommonEClass == null) {
			fxSurfaceInitVolumeCommonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(333);
		}
		return fxSurfaceInitVolumeCommonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSurfaceInitVolumeCommon_All() {
        return (EReference)getFxSurfaceInitVolumeCommon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxSurfaceInitVolumeCommon_Primary() {
        return (EReference)getFxSurfaceInitVolumeCommon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorType() {
		if (generatorTypeEClass == null) {
			generatorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(336);
		}
		return generatorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorType_Annotate() {
        return (EReference)getGeneratorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorType_Group() {
        return (EAttribute)getGeneratorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorType_Code() {
        return (EReference)getGeneratorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorType_Include() {
        return (EReference)getGeneratorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorType_Name() {
        return (EReference)getGeneratorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorType_Setparam() {
        return (EReference)getGeneratorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorType1() {
		if (generatorType1EClass == null) {
			generatorType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(337);
		}
		return generatorType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorType1_Annotate() {
        return (EReference)getGeneratorType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorType1_Group() {
        return (EAttribute)getGeneratorType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorType1_Code() {
        return (EReference)getGeneratorType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorType1_Include() {
        return (EReference)getGeneratorType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorType1_Name() {
        return (EReference)getGeneratorType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorType1_Setparam() {
        return (EReference)getGeneratorType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometryType() {
		if (geometryTypeEClass == null) {
			geometryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(338);
		}
		return geometryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometryType_Asset() {
        return (EReference)getGeometryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometryType_ConvexMesh() {
        return (EReference)getGeometryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometryType_Mesh() {
        return (EReference)getGeometryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometryType_Spline() {
        return (EReference)getGeometryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometryType_Extra() {
        return (EReference)getGeometryType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryType_Id() {
        return (EAttribute)getGeometryType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryType_Name() {
        return (EAttribute)getGeometryType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlesNewparam() {
		if (glesNewparamEClass == null) {
			glesNewparamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(351);
		}
		return glesNewparamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlesNewparam_Annotate() {
        return (EReference)getGlesNewparam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Semantic() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Modifier() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Bool() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Bool2() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Bool3() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Bool4() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Int() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Int2() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Int3() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Int4() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Float() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Float2() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Float3() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Float4() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Float1x1() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Float1x2() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Float1x3() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Float1x4() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Float2x1() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Float2x2() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Float2x3() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Float2x4() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Float3x1() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Float3x2() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Float3x3() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Float3x4() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Float4x1() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Float4x2() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Float4x3() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Float4x4() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlesNewparam_Surface() {
        return (EReference)getGlesNewparam().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlesNewparam_TexturePipeline() {
        return (EReference)getGlesNewparam().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlesNewparam_SamplerState() {
        return (EReference)getGlesNewparam().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlesNewparam_TextureUnit() {
        return (EReference)getGlesNewparam().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Enum() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesNewparam_Sid() {
        return (EAttribute)getGlesNewparam().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlesSamplerState() {
		if (glesSamplerStateEClass == null) {
			glesSamplerStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(353);
		}
		return glesSamplerStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesSamplerState_WrapS() {
        return (EAttribute)getGlesSamplerState().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesSamplerState_WrapT() {
        return (EAttribute)getGlesSamplerState().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesSamplerState_Minfilter() {
        return (EAttribute)getGlesSamplerState().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesSamplerState_Magfilter() {
        return (EAttribute)getGlesSamplerState().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesSamplerState_Mipfilter() {
        return (EAttribute)getGlesSamplerState().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesSamplerState_MipmapMaxlevel() {
        return (EAttribute)getGlesSamplerState().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesSamplerState_MipmapBias() {
        return (EAttribute)getGlesSamplerState().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlesSamplerState_Extra() {
        return (EReference)getGlesSamplerState().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesSamplerState_Sid() {
        return (EAttribute)getGlesSamplerState().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlesTexcombinerArgumentAlphaType() {
		if (glesTexcombinerArgumentAlphaTypeEClass == null) {
			glesTexcombinerArgumentAlphaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(358);
		}
		return glesTexcombinerArgumentAlphaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesTexcombinerArgumentAlphaType_Operand() {
        return (EAttribute)getGlesTexcombinerArgumentAlphaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesTexcombinerArgumentAlphaType_Source() {
        return (EAttribute)getGlesTexcombinerArgumentAlphaType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesTexcombinerArgumentAlphaType_Unit() {
        return (EAttribute)getGlesTexcombinerArgumentAlphaType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlesTexcombinerArgumentRGBType() {
		if (glesTexcombinerArgumentRGBTypeEClass == null) {
			glesTexcombinerArgumentRGBTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(360);
		}
		return glesTexcombinerArgumentRGBTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesTexcombinerArgumentRGBType_Operand() {
        return (EAttribute)getGlesTexcombinerArgumentRGBType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesTexcombinerArgumentRGBType_Source() {
        return (EAttribute)getGlesTexcombinerArgumentRGBType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesTexcombinerArgumentRGBType_Unit() {
        return (EAttribute)getGlesTexcombinerArgumentRGBType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlesTexcombinerCommandAlphaType() {
		if (glesTexcombinerCommandAlphaTypeEClass == null) {
			glesTexcombinerCommandAlphaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(361);
		}
		return glesTexcombinerCommandAlphaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlesTexcombinerCommandAlphaType_Argument() {
        return (EReference)getGlesTexcombinerCommandAlphaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesTexcombinerCommandAlphaType_Operator() {
        return (EAttribute)getGlesTexcombinerCommandAlphaType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesTexcombinerCommandAlphaType_Scale() {
        return (EAttribute)getGlesTexcombinerCommandAlphaType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlesTexcombinerCommandRGBType() {
		if (glesTexcombinerCommandRGBTypeEClass == null) {
			glesTexcombinerCommandRGBTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(362);
		}
		return glesTexcombinerCommandRGBTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlesTexcombinerCommandRGBType_Argument() {
        return (EReference)getGlesTexcombinerCommandRGBType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesTexcombinerCommandRGBType_Operator() {
        return (EAttribute)getGlesTexcombinerCommandRGBType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesTexcombinerCommandRGBType_Scale() {
        return (EAttribute)getGlesTexcombinerCommandRGBType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlesTexcombinerCommandType() {
		if (glesTexcombinerCommandTypeEClass == null) {
			glesTexcombinerCommandTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(363);
		}
		return glesTexcombinerCommandTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlesTexcombinerCommandType_Constant() {
        return (EReference)getGlesTexcombinerCommandType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlesTexcombinerCommandType_RGB() {
        return (EReference)getGlesTexcombinerCommandType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlesTexcombinerCommandType_Alpha() {
        return (EReference)getGlesTexcombinerCommandType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlesTexenvCommandType() {
		if (glesTexenvCommandTypeEClass == null) {
			glesTexenvCommandTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(374);
		}
		return glesTexenvCommandTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlesTexenvCommandType_Constant() {
        return (EReference)getGlesTexenvCommandType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesTexenvCommandType_Operator() {
        return (EAttribute)getGlesTexenvCommandType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesTexenvCommandType_Unit() {
        return (EAttribute)getGlesTexenvCommandType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlesTextureConstantType() {
		if (glesTextureConstantTypeEClass == null) {
			glesTextureConstantTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(377);
		}
		return glesTextureConstantTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesTextureConstantType_Param() {
        return (EAttribute)getGlesTextureConstantType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesTextureConstantType_Value() {
        return (EAttribute)getGlesTextureConstantType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlesTexturePipeline() {
		if (glesTexturePipelineEClass == null) {
			glesTexturePipelineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(378);
		}
		return glesTexturePipelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesTexturePipeline_Group() {
        return (EAttribute)getGlesTexturePipeline().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlesTexturePipeline_Texcombiner() {
        return (EReference)getGlesTexturePipeline().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlesTexturePipeline_Texenv() {
        return (EReference)getGlesTexturePipeline().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlesTexturePipeline_Extra() {
        return (EReference)getGlesTexturePipeline().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesTexturePipeline_Sid() {
        return (EAttribute)getGlesTexturePipeline().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlesTextureUnit() {
		if (glesTextureUnitEClass == null) {
			glesTextureUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(379);
		}
		return glesTextureUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesTextureUnit_Surface() {
        return (EAttribute)getGlesTextureUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesTextureUnit_SamplerState() {
        return (EAttribute)getGlesTextureUnit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlesTextureUnit_Texcoord() {
        return (EReference)getGlesTextureUnit().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlesTextureUnit_Extra() {
        return (EReference)getGlesTextureUnit().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlesTextureUnit_Sid() {
        return (EAttribute)getGlesTextureUnit().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlSampler1D() {
		if (glSampler1DEClass == null) {
			glSampler1DEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(401);
		}
		return glSampler1DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlSampler2D() {
		if (glSampler2DEClass == null) {
			glSampler2DEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(402);
		}
		return glSampler2DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlSampler3D() {
		if (glSampler3DEClass == null) {
			glSampler3DEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(403);
		}
		return glSampler3DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlSamplerCUBE() {
		if (glSamplerCUBEEClass == null) {
			glSamplerCUBEEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(404);
		}
		return glSamplerCUBEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlSamplerDEPTH() {
		if (glSamplerDEPTHEClass == null) {
			glSamplerDEPTHEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(405);
		}
		return glSamplerDEPTHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlSamplerRECT() {
		if (glSamplerRECTEClass == null) {
			glSamplerRECTEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(406);
		}
		return glSamplerRECTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlslNewarrayType() {
		if (glslNewarrayTypeEClass == null) {
			glslNewarrayTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(431);
		}
		return glslNewarrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewarrayType_Group() {
        return (EAttribute)getGlslNewarrayType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewarrayType_Bool() {
        return (EAttribute)getGlslNewarrayType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewarrayType_Bool2() {
        return (EAttribute)getGlslNewarrayType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewarrayType_Bool3() {
        return (EAttribute)getGlslNewarrayType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewarrayType_Bool4() {
        return (EAttribute)getGlslNewarrayType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewarrayType_Float() {
        return (EAttribute)getGlslNewarrayType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewarrayType_Float2() {
        return (EAttribute)getGlslNewarrayType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewarrayType_Float3() {
        return (EAttribute)getGlslNewarrayType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewarrayType_Float4() {
        return (EAttribute)getGlslNewarrayType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewarrayType_Float2x2() {
        return (EAttribute)getGlslNewarrayType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewarrayType_Float3x3() {
        return (EAttribute)getGlslNewarrayType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewarrayType_Float4x4() {
        return (EAttribute)getGlslNewarrayType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewarrayType_Int() {
        return (EAttribute)getGlslNewarrayType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewarrayType_Int2() {
        return (EAttribute)getGlslNewarrayType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewarrayType_Int3() {
        return (EAttribute)getGlslNewarrayType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewarrayType_Int4() {
        return (EAttribute)getGlslNewarrayType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslNewarrayType_Surface() {
        return (EReference)getGlslNewarrayType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslNewarrayType_Sampler1D() {
        return (EReference)getGlslNewarrayType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslNewarrayType_Sampler2D() {
        return (EReference)getGlslNewarrayType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslNewarrayType_Sampler3D() {
        return (EReference)getGlslNewarrayType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslNewarrayType_SamplerCUBE() {
        return (EReference)getGlslNewarrayType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslNewarrayType_SamplerRECT() {
        return (EReference)getGlslNewarrayType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslNewarrayType_SamplerDEPTH() {
        return (EReference)getGlslNewarrayType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewarrayType_Enum() {
        return (EAttribute)getGlslNewarrayType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslNewarrayType_Array() {
        return (EReference)getGlslNewarrayType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewarrayType_Length() {
        return (EAttribute)getGlslNewarrayType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlslNewparam() {
		if (glslNewparamEClass == null) {
			glslNewparamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(432);
		}
		return glslNewparamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslNewparam_Annotate() {
        return (EReference)getGlslNewparam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewparam_Semantic() {
        return (EAttribute)getGlslNewparam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewparam_Modifier() {
        return (EAttribute)getGlslNewparam().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewparam_Bool() {
        return (EAttribute)getGlslNewparam().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewparam_Bool2() {
        return (EAttribute)getGlslNewparam().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewparam_Bool3() {
        return (EAttribute)getGlslNewparam().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewparam_Bool4() {
        return (EAttribute)getGlslNewparam().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewparam_Float() {
        return (EAttribute)getGlslNewparam().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewparam_Float2() {
        return (EAttribute)getGlslNewparam().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewparam_Float3() {
        return (EAttribute)getGlslNewparam().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewparam_Float4() {
        return (EAttribute)getGlslNewparam().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewparam_Float2x2() {
        return (EAttribute)getGlslNewparam().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewparam_Float3x3() {
        return (EAttribute)getGlslNewparam().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewparam_Float4x4() {
        return (EAttribute)getGlslNewparam().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewparam_Int() {
        return (EAttribute)getGlslNewparam().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewparam_Int2() {
        return (EAttribute)getGlslNewparam().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewparam_Int3() {
        return (EAttribute)getGlslNewparam().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewparam_Int4() {
        return (EAttribute)getGlslNewparam().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslNewparam_Surface() {
        return (EReference)getGlslNewparam().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslNewparam_Sampler1D() {
        return (EReference)getGlslNewparam().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslNewparam_Sampler2D() {
        return (EReference)getGlslNewparam().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslNewparam_Sampler3D() {
        return (EReference)getGlslNewparam().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslNewparam_SamplerCUBE() {
        return (EReference)getGlslNewparam().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslNewparam_SamplerRECT() {
        return (EReference)getGlslNewparam().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslNewparam_SamplerDEPTH() {
        return (EReference)getGlslNewparam().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewparam_Enum() {
        return (EAttribute)getGlslNewparam().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslNewparam_Array() {
        return (EReference)getGlslNewparam().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslNewparam_Sid() {
        return (EAttribute)getGlslNewparam().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlslSetarrayType() {
		if (glslSetarrayTypeEClass == null) {
			glslSetarrayTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(435);
		}
		return glslSetarrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetarrayType_Group() {
        return (EAttribute)getGlslSetarrayType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetarrayType_Bool() {
        return (EAttribute)getGlslSetarrayType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetarrayType_Bool2() {
        return (EAttribute)getGlslSetarrayType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetarrayType_Bool3() {
        return (EAttribute)getGlslSetarrayType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetarrayType_Bool4() {
        return (EAttribute)getGlslSetarrayType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetarrayType_Float() {
        return (EAttribute)getGlslSetarrayType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetarrayType_Float2() {
        return (EAttribute)getGlslSetarrayType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetarrayType_Float3() {
        return (EAttribute)getGlslSetarrayType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetarrayType_Float4() {
        return (EAttribute)getGlslSetarrayType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetarrayType_Float2x2() {
        return (EAttribute)getGlslSetarrayType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetarrayType_Float3x3() {
        return (EAttribute)getGlslSetarrayType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetarrayType_Float4x4() {
        return (EAttribute)getGlslSetarrayType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetarrayType_Int() {
        return (EAttribute)getGlslSetarrayType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetarrayType_Int2() {
        return (EAttribute)getGlslSetarrayType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetarrayType_Int3() {
        return (EAttribute)getGlslSetarrayType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetarrayType_Int4() {
        return (EAttribute)getGlslSetarrayType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetarrayType_Surface() {
        return (EReference)getGlslSetarrayType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetarrayType_Sampler1D() {
        return (EReference)getGlslSetarrayType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetarrayType_Sampler2D() {
        return (EReference)getGlslSetarrayType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetarrayType_Sampler3D() {
        return (EReference)getGlslSetarrayType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetarrayType_SamplerCUBE() {
        return (EReference)getGlslSetarrayType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetarrayType_SamplerRECT() {
        return (EReference)getGlslSetarrayType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetarrayType_SamplerDEPTH() {
        return (EReference)getGlslSetarrayType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetarrayType_Enum() {
        return (EAttribute)getGlslSetarrayType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetarrayType_Array() {
        return (EReference)getGlslSetarrayType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetarrayType_Length() {
        return (EAttribute)getGlslSetarrayType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlslSetparam() {
		if (glslSetparamEClass == null) {
			glslSetparamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(436);
		}
		return glslSetparamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetparam_Annotate() {
        return (EReference)getGlslSetparam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparam_Bool() {
        return (EAttribute)getGlslSetparam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparam_Bool2() {
        return (EAttribute)getGlslSetparam().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparam_Bool3() {
        return (EAttribute)getGlslSetparam().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparam_Bool4() {
        return (EAttribute)getGlslSetparam().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparam_Float() {
        return (EAttribute)getGlslSetparam().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparam_Float2() {
        return (EAttribute)getGlslSetparam().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparam_Float3() {
        return (EAttribute)getGlslSetparam().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparam_Float4() {
        return (EAttribute)getGlslSetparam().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparam_Float2x2() {
        return (EAttribute)getGlslSetparam().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparam_Float3x3() {
        return (EAttribute)getGlslSetparam().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparam_Float4x4() {
        return (EAttribute)getGlslSetparam().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparam_Int() {
        return (EAttribute)getGlslSetparam().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparam_Int2() {
        return (EAttribute)getGlslSetparam().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparam_Int3() {
        return (EAttribute)getGlslSetparam().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparam_Int4() {
        return (EAttribute)getGlslSetparam().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetparam_Surface() {
        return (EReference)getGlslSetparam().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetparam_Sampler1D() {
        return (EReference)getGlslSetparam().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetparam_Sampler2D() {
        return (EReference)getGlslSetparam().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetparam_Sampler3D() {
        return (EReference)getGlslSetparam().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetparam_SamplerCUBE() {
        return (EReference)getGlslSetparam().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetparam_SamplerRECT() {
        return (EReference)getGlslSetparam().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetparam_SamplerDEPTH() {
        return (EReference)getGlslSetparam().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparam_Enum() {
        return (EAttribute)getGlslSetparam().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetparam_Array() {
        return (EReference)getGlslSetparam().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparam_Program() {
        return (EAttribute)getGlslSetparam().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparam_Ref() {
        return (EAttribute)getGlslSetparam().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlslSetparamSimple() {
		if (glslSetparamSimpleEClass == null) {
			glslSetparamSimpleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(437);
		}
		return glslSetparamSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetparamSimple_Annotate() {
        return (EReference)getGlslSetparamSimple().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparamSimple_Bool() {
        return (EAttribute)getGlslSetparamSimple().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparamSimple_Bool2() {
        return (EAttribute)getGlslSetparamSimple().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparamSimple_Bool3() {
        return (EAttribute)getGlslSetparamSimple().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparamSimple_Bool4() {
        return (EAttribute)getGlslSetparamSimple().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparamSimple_Float() {
        return (EAttribute)getGlslSetparamSimple().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparamSimple_Float2() {
        return (EAttribute)getGlslSetparamSimple().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparamSimple_Float3() {
        return (EAttribute)getGlslSetparamSimple().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparamSimple_Float4() {
        return (EAttribute)getGlslSetparamSimple().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparamSimple_Float2x2() {
        return (EAttribute)getGlslSetparamSimple().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparamSimple_Float3x3() {
        return (EAttribute)getGlslSetparamSimple().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparamSimple_Float4x4() {
        return (EAttribute)getGlslSetparamSimple().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparamSimple_Int() {
        return (EAttribute)getGlslSetparamSimple().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparamSimple_Int2() {
        return (EAttribute)getGlslSetparamSimple().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparamSimple_Int3() {
        return (EAttribute)getGlslSetparamSimple().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparamSimple_Int4() {
        return (EAttribute)getGlslSetparamSimple().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetparamSimple_Surface() {
        return (EReference)getGlslSetparamSimple().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetparamSimple_Sampler1D() {
        return (EReference)getGlslSetparamSimple().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetparamSimple_Sampler2D() {
        return (EReference)getGlslSetparamSimple().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetparamSimple_Sampler3D() {
        return (EReference)getGlslSetparamSimple().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetparamSimple_SamplerCUBE() {
        return (EReference)getGlslSetparamSimple().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetparamSimple_SamplerRECT() {
        return (EReference)getGlslSetparamSimple().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSetparamSimple_SamplerDEPTH() {
        return (EReference)getGlslSetparamSimple().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparamSimple_Enum() {
        return (EAttribute)getGlslSetparamSimple().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlslSetparamSimple_Ref() {
        return (EAttribute)getGlslSetparamSimple().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlslSurfaceType() {
		if (glslSurfaceTypeEClass == null) {
			glslSurfaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(438);
		}
		return glslSurfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlslSurfaceType_Generator() {
        return (EReference)getGlslSurfaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHollowType() {
		if (hollowTypeEClass == null) {
			hollowTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(441);
		}
		return hollowTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHollowType_Value() {
        return (EAttribute)getHollowType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHollowType_Sid() {
        return (EAttribute)getHollowType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHollowType1() {
		if (hollowType1EClass == null) {
			hollowType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(442);
		}
		return hollowType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHollowType1_Value() {
        return (EAttribute)getHollowType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHollowType1_Sid() {
        return (EAttribute)getHollowType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDREFArrayType() {
		if (idrefArrayTypeEClass == null) {
			idrefArrayTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(443);
		}
		return idrefArrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDREFArrayType_Value() {
        return (EAttribute)getIDREFArrayType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDREFArrayType_Count() {
        return (EAttribute)getIDREFArrayType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDREFArrayType_Id() {
        return (EAttribute)getIDREFArrayType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDREFArrayType_Name() {
        return (EAttribute)getIDREFArrayType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagerType() {
		if (imagerTypeEClass == null) {
			imagerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(444);
		}
		return imagerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagerType_Technique() {
        return (EReference)getImagerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagerType_Extra() {
        return (EReference)getImagerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageType() {
		if (imageTypeEClass == null) {
			imageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(445);
		}
		return imageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageType_Asset() {
        return (EReference)getImageType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_Data() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_InitFrom() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageType_Extra() {
        return (EReference)getImageType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_Depth() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_Format() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_Height() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_Id() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_Name() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_Width() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputGlobal() {
		if (inputGlobalEClass == null) {
			inputGlobalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(446);
		}
		return inputGlobalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputGlobal_Semantic() {
        return (EAttribute)getInputGlobal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputGlobal_Source() {
        return (EAttribute)getInputGlobal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputLocal() {
		if (inputLocalEClass == null) {
			inputLocalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(447);
		}
		return inputLocalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputLocal_Semantic() {
        return (EAttribute)getInputLocal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputLocal_Source() {
        return (EAttribute)getInputLocal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputLocalOffset() {
		if (inputLocalOffsetEClass == null) {
			inputLocalOffsetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(448);
		}
		return inputLocalOffsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputLocalOffset_Offset() {
        return (EAttribute)getInputLocalOffset().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputLocalOffset_Semantic() {
        return (EAttribute)getInputLocalOffset().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputLocalOffset_Set() {
        return (EAttribute)getInputLocalOffset().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputLocalOffset_Source() {
        return (EAttribute)getInputLocalOffset().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceControllerType() {
		if (instanceControllerTypeEClass == null) {
			instanceControllerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(449);
		}
		return instanceControllerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceControllerType_Skeleton() {
        return (EAttribute)getInstanceControllerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceControllerType_BindMaterial() {
        return (EReference)getInstanceControllerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceControllerType_Extra() {
        return (EReference)getInstanceControllerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceControllerType_Name() {
        return (EAttribute)getInstanceControllerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceControllerType_Sid() {
        return (EAttribute)getInstanceControllerType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceControllerType_Url() {
        return (EAttribute)getInstanceControllerType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceEffectType() {
		if (instanceEffectTypeEClass == null) {
			instanceEffectTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(450);
		}
		return instanceEffectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceEffectType_TechniqueHint() {
        return (EReference)getInstanceEffectType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceEffectType_Setparam() {
        return (EReference)getInstanceEffectType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceEffectType_Extra() {
        return (EReference)getInstanceEffectType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceEffectType_Name() {
        return (EAttribute)getInstanceEffectType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceEffectType_Sid() {
        return (EAttribute)getInstanceEffectType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceEffectType_Url() {
        return (EAttribute)getInstanceEffectType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceGeometryType() {
		if (instanceGeometryTypeEClass == null) {
			instanceGeometryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(451);
		}
		return instanceGeometryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceGeometryType_BindMaterial() {
        return (EReference)getInstanceGeometryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceGeometryType_Extra() {
        return (EReference)getInstanceGeometryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceGeometryType_Name() {
        return (EAttribute)getInstanceGeometryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceGeometryType_Sid() {
        return (EAttribute)getInstanceGeometryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceGeometryType_Url() {
        return (EAttribute)getInstanceGeometryType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceMaterialType() {
		if (instanceMaterialTypeEClass == null) {
			instanceMaterialTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(452);
		}
		return instanceMaterialTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceMaterialType_Bind() {
        return (EReference)getInstanceMaterialType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceMaterialType_BindVertexInput() {
        return (EReference)getInstanceMaterialType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceMaterialType_Extra() {
        return (EReference)getInstanceMaterialType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceMaterialType_Name() {
        return (EAttribute)getInstanceMaterialType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceMaterialType_Sid() {
        return (EAttribute)getInstanceMaterialType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceMaterialType_Symbol() {
        return (EAttribute)getInstanceMaterialType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceMaterialType_Target() {
        return (EAttribute)getInstanceMaterialType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstancePhysicsModelType() {
		if (instancePhysicsModelTypeEClass == null) {
			instancePhysicsModelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(453);
		}
		return instancePhysicsModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstancePhysicsModelType_InstanceForceField() {
        return (EReference)getInstancePhysicsModelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstancePhysicsModelType_InstanceRigidBody() {
        return (EReference)getInstancePhysicsModelType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstancePhysicsModelType_InstanceRigidConstraint() {
        return (EReference)getInstancePhysicsModelType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstancePhysicsModelType_Extra() {
        return (EReference)getInstancePhysicsModelType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstancePhysicsModelType_Name() {
        return (EAttribute)getInstancePhysicsModelType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstancePhysicsModelType_Parent() {
        return (EAttribute)getInstancePhysicsModelType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstancePhysicsModelType_Sid() {
        return (EAttribute)getInstancePhysicsModelType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstancePhysicsModelType_Url() {
        return (EAttribute)getInstancePhysicsModelType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceRigidBodyType() {
		if (instanceRigidBodyTypeEClass == null) {
			instanceRigidBodyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(454);
		}
		return instanceRigidBodyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceRigidBodyType_TechniqueCommon() {
        return (EReference)getInstanceRigidBodyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceRigidBodyType_Technique() {
        return (EReference)getInstanceRigidBodyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceRigidBodyType_Extra() {
        return (EReference)getInstanceRigidBodyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceRigidBodyType_Body() {
        return (EAttribute)getInstanceRigidBodyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceRigidBodyType_Name() {
        return (EAttribute)getInstanceRigidBodyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceRigidBodyType_Sid() {
        return (EAttribute)getInstanceRigidBodyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceRigidBodyType_Target() {
        return (EAttribute)getInstanceRigidBodyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceRigidConstraintType() {
		if (instanceRigidConstraintTypeEClass == null) {
			instanceRigidConstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(455);
		}
		return instanceRigidConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceRigidConstraintType_Extra() {
        return (EReference)getInstanceRigidConstraintType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceRigidConstraintType_Constraint() {
        return (EAttribute)getInstanceRigidConstraintType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceRigidConstraintType_Name() {
        return (EAttribute)getInstanceRigidConstraintType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceRigidConstraintType_Sid() {
        return (EAttribute)getInstanceRigidConstraintType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceWithExtra() {
		if (instanceWithExtraEClass == null) {
			instanceWithExtraEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(456);
		}
		return instanceWithExtraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceWithExtra_Extra() {
        return (EReference)getInstanceWithExtra().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceWithExtra_Name() {
        return (EAttribute)getInstanceWithExtra().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceWithExtra_Sid() {
        return (EAttribute)getInstanceWithExtra().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceWithExtra_Url() {
        return (EAttribute)getInstanceWithExtra().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntArrayType() {
		if (intArrayTypeEClass == null) {
			intArrayTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(464);
		}
		return intArrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntArrayType_Value() {
        return (EAttribute)getIntArrayType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntArrayType_Count() {
        return (EAttribute)getIntArrayType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntArrayType_Id() {
        return (EAttribute)getIntArrayType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntArrayType_MaxInclusive() {
        return (EAttribute)getIntArrayType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntArrayType_MinInclusive() {
        return (EAttribute)getIntArrayType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntArrayType_Name() {
        return (EAttribute)getIntArrayType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterpenetrateType() {
		if (interpenetrateTypeEClass == null) {
			interpenetrateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(465);
		}
		return interpenetrateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterpenetrateType_Value() {
        return (EAttribute)getInterpenetrateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterpenetrateType_Sid() {
        return (EAttribute)getInterpenetrateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJointsType() {
		if (jointsTypeEClass == null) {
			jointsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(467);
		}
		return jointsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJointsType_Input() {
        return (EReference)getJointsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJointsType_Extra() {
        return (EReference)getJointsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLambertType() {
		if (lambertTypeEClass == null) {
			lambertTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(468);
		}
		return lambertTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambertType_Emission() {
        return (EReference)getLambertType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambertType_Ambient() {
        return (EReference)getLambertType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambertType_Diffuse() {
        return (EReference)getLambertType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambertType_Reflective() {
        return (EReference)getLambertType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambertType_Reflectivity() {
        return (EReference)getLambertType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambertType_Transparent() {
        return (EReference)getLambertType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambertType_Transparency() {
        return (EReference)getLambertType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambertType_IndexOfRefraction() {
        return (EReference)getLambertType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryAnimationClipsType() {
		if (libraryAnimationClipsTypeEClass == null) {
			libraryAnimationClipsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(469);
		}
		return libraryAnimationClipsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryAnimationClipsType_Asset() {
        return (EReference)getLibraryAnimationClipsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryAnimationClipsType_AnimationClip() {
        return (EReference)getLibraryAnimationClipsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryAnimationClipsType_Extra() {
        return (EReference)getLibraryAnimationClipsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryAnimationClipsType_Id() {
        return (EAttribute)getLibraryAnimationClipsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryAnimationClipsType_Name() {
        return (EAttribute)getLibraryAnimationClipsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryAnimationsType() {
		if (libraryAnimationsTypeEClass == null) {
			libraryAnimationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(470);
		}
		return libraryAnimationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryAnimationsType_Asset() {
        return (EReference)getLibraryAnimationsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryAnimationsType_Animation() {
        return (EReference)getLibraryAnimationsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryAnimationsType_Extra() {
        return (EReference)getLibraryAnimationsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryAnimationsType_Id() {
        return (EAttribute)getLibraryAnimationsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryAnimationsType_Name() {
        return (EAttribute)getLibraryAnimationsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryCamerasType() {
		if (libraryCamerasTypeEClass == null) {
			libraryCamerasTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(471);
		}
		return libraryCamerasTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryCamerasType_Asset() {
        return (EReference)getLibraryCamerasType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryCamerasType_Camera() {
        return (EReference)getLibraryCamerasType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryCamerasType_Extra() {
        return (EReference)getLibraryCamerasType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryCamerasType_Id() {
        return (EAttribute)getLibraryCamerasType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryCamerasType_Name() {
        return (EAttribute)getLibraryCamerasType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryControllersType() {
		if (libraryControllersTypeEClass == null) {
			libraryControllersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(472);
		}
		return libraryControllersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryControllersType_Asset() {
        return (EReference)getLibraryControllersType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryControllersType_Controller() {
        return (EReference)getLibraryControllersType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryControllersType_Extra() {
        return (EReference)getLibraryControllersType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryControllersType_Id() {
        return (EAttribute)getLibraryControllersType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryControllersType_Name() {
        return (EAttribute)getLibraryControllersType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryEffectsType() {
		if (libraryEffectsTypeEClass == null) {
			libraryEffectsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(473);
		}
		return libraryEffectsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryEffectsType_Asset() {
        return (EReference)getLibraryEffectsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryEffectsType_Effect() {
        return (EReference)getLibraryEffectsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryEffectsType_Extra() {
        return (EReference)getLibraryEffectsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryEffectsType_Id() {
        return (EAttribute)getLibraryEffectsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryEffectsType_Name() {
        return (EAttribute)getLibraryEffectsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryForceFieldsType() {
		if (libraryForceFieldsTypeEClass == null) {
			libraryForceFieldsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(474);
		}
		return libraryForceFieldsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryForceFieldsType_Asset() {
        return (EReference)getLibraryForceFieldsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryForceFieldsType_ForceField() {
        return (EReference)getLibraryForceFieldsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryForceFieldsType_Extra() {
        return (EReference)getLibraryForceFieldsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryForceFieldsType_Id() {
        return (EAttribute)getLibraryForceFieldsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryForceFieldsType_Name() {
        return (EAttribute)getLibraryForceFieldsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryGeometriesType() {
		if (libraryGeometriesTypeEClass == null) {
			libraryGeometriesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(475);
		}
		return libraryGeometriesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryGeometriesType_Asset() {
        return (EReference)getLibraryGeometriesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryGeometriesType_Geometry() {
        return (EReference)getLibraryGeometriesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryGeometriesType_Extra() {
        return (EReference)getLibraryGeometriesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryGeometriesType_Id() {
        return (EAttribute)getLibraryGeometriesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryGeometriesType_Name() {
        return (EAttribute)getLibraryGeometriesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryImagesType() {
		if (libraryImagesTypeEClass == null) {
			libraryImagesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(476);
		}
		return libraryImagesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryImagesType_Asset() {
        return (EReference)getLibraryImagesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryImagesType_Image() {
        return (EReference)getLibraryImagesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryImagesType_Extra() {
        return (EReference)getLibraryImagesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryImagesType_Id() {
        return (EAttribute)getLibraryImagesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryImagesType_Name() {
        return (EAttribute)getLibraryImagesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryLightsType() {
		if (libraryLightsTypeEClass == null) {
			libraryLightsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(477);
		}
		return libraryLightsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryLightsType_Asset() {
        return (EReference)getLibraryLightsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryLightsType_Light() {
        return (EReference)getLibraryLightsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryLightsType_Extra() {
        return (EReference)getLibraryLightsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryLightsType_Id() {
        return (EAttribute)getLibraryLightsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryLightsType_Name() {
        return (EAttribute)getLibraryLightsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryMaterialsType() {
		if (libraryMaterialsTypeEClass == null) {
			libraryMaterialsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(478);
		}
		return libraryMaterialsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryMaterialsType_Asset() {
        return (EReference)getLibraryMaterialsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryMaterialsType_Material() {
        return (EReference)getLibraryMaterialsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryMaterialsType_Extra() {
        return (EReference)getLibraryMaterialsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryMaterialsType_Id() {
        return (EAttribute)getLibraryMaterialsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryMaterialsType_Name() {
        return (EAttribute)getLibraryMaterialsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryNodesType() {
		if (libraryNodesTypeEClass == null) {
			libraryNodesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(479);
		}
		return libraryNodesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryNodesType_Asset() {
        return (EReference)getLibraryNodesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryNodesType_Node() {
        return (EReference)getLibraryNodesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryNodesType_Extra() {
        return (EReference)getLibraryNodesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryNodesType_Id() {
        return (EAttribute)getLibraryNodesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryNodesType_Name() {
        return (EAttribute)getLibraryNodesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryPhysicsMaterialsType() {
		if (libraryPhysicsMaterialsTypeEClass == null) {
			libraryPhysicsMaterialsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(480);
		}
		return libraryPhysicsMaterialsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryPhysicsMaterialsType_Asset() {
        return (EReference)getLibraryPhysicsMaterialsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryPhysicsMaterialsType_PhysicsMaterial() {
        return (EReference)getLibraryPhysicsMaterialsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryPhysicsMaterialsType_Extra() {
        return (EReference)getLibraryPhysicsMaterialsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryPhysicsMaterialsType_Id() {
        return (EAttribute)getLibraryPhysicsMaterialsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryPhysicsMaterialsType_Name() {
        return (EAttribute)getLibraryPhysicsMaterialsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryPhysicsModelsType() {
		if (libraryPhysicsModelsTypeEClass == null) {
			libraryPhysicsModelsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(481);
		}
		return libraryPhysicsModelsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryPhysicsModelsType_Asset() {
        return (EReference)getLibraryPhysicsModelsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryPhysicsModelsType_PhysicsModel() {
        return (EReference)getLibraryPhysicsModelsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryPhysicsModelsType_Extra() {
        return (EReference)getLibraryPhysicsModelsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryPhysicsModelsType_Id() {
        return (EAttribute)getLibraryPhysicsModelsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryPhysicsModelsType_Name() {
        return (EAttribute)getLibraryPhysicsModelsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryPhysicsScenesType() {
		if (libraryPhysicsScenesTypeEClass == null) {
			libraryPhysicsScenesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(482);
		}
		return libraryPhysicsScenesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryPhysicsScenesType_Asset() {
        return (EReference)getLibraryPhysicsScenesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryPhysicsScenesType_PhysicsScene() {
        return (EReference)getLibraryPhysicsScenesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryPhysicsScenesType_Extra() {
        return (EReference)getLibraryPhysicsScenesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryPhysicsScenesType_Id() {
        return (EAttribute)getLibraryPhysicsScenesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryPhysicsScenesType_Name() {
        return (EAttribute)getLibraryPhysicsScenesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryVisualScenesType() {
		if (libraryVisualScenesTypeEClass == null) {
			libraryVisualScenesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(483);
		}
		return libraryVisualScenesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryVisualScenesType_Asset() {
        return (EReference)getLibraryVisualScenesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryVisualScenesType_VisualScene() {
        return (EReference)getLibraryVisualScenesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryVisualScenesType_Extra() {
        return (EReference)getLibraryVisualScenesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryVisualScenesType_Id() {
        return (EAttribute)getLibraryVisualScenesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibraryVisualScenesType_Name() {
        return (EAttribute)getLibraryVisualScenesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightAmbientType() {
		if (lightAmbientTypeEClass == null) {
			lightAmbientTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(484);
		}
		return lightAmbientTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightAmbientType_Index() {
        return (EAttribute)getLightAmbientType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightAmbientType_Param() {
        return (EAttribute)getLightAmbientType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightAmbientType_Value() {
        return (EAttribute)getLightAmbientType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightAmbientType1() {
		if (lightAmbientType1EClass == null) {
			lightAmbientType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(485);
		}
		return lightAmbientType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightAmbientType1_Index() {
        return (EAttribute)getLightAmbientType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightAmbientType1_Param() {
        return (EAttribute)getLightAmbientType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightAmbientType1_Value() {
        return (EAttribute)getLightAmbientType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightConstantAttenuationType() {
		if (lightConstantAttenuationTypeEClass == null) {
			lightConstantAttenuationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(486);
		}
		return lightConstantAttenuationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightConstantAttenuationType_Index() {
        return (EAttribute)getLightConstantAttenuationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightConstantAttenuationType_Param() {
        return (EAttribute)getLightConstantAttenuationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightConstantAttenuationType_Value() {
        return (EAttribute)getLightConstantAttenuationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightConstantAttenuationType1() {
		if (lightConstantAttenuationType1EClass == null) {
			lightConstantAttenuationType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(487);
		}
		return lightConstantAttenuationType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightConstantAttenuationType1_Index() {
        return (EAttribute)getLightConstantAttenuationType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightConstantAttenuationType1_Param() {
        return (EAttribute)getLightConstantAttenuationType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightConstantAttenuationType1_Value() {
        return (EAttribute)getLightConstantAttenuationType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightDiffuseType() {
		if (lightDiffuseTypeEClass == null) {
			lightDiffuseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(488);
		}
		return lightDiffuseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightDiffuseType_Index() {
        return (EAttribute)getLightDiffuseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightDiffuseType_Param() {
        return (EAttribute)getLightDiffuseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightDiffuseType_Value() {
        return (EAttribute)getLightDiffuseType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightDiffuseType1() {
		if (lightDiffuseType1EClass == null) {
			lightDiffuseType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(489);
		}
		return lightDiffuseType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightDiffuseType1_Index() {
        return (EAttribute)getLightDiffuseType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightDiffuseType1_Param() {
        return (EAttribute)getLightDiffuseType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightDiffuseType1_Value() {
        return (EAttribute)getLightDiffuseType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightEnableType() {
		if (lightEnableTypeEClass == null) {
			lightEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(490);
		}
		return lightEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightEnableType_Index() {
        return (EAttribute)getLightEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightEnableType_Param() {
        return (EAttribute)getLightEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightEnableType_Value() {
        return (EAttribute)getLightEnableType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightEnableType1() {
		if (lightEnableType1EClass == null) {
			lightEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(491);
		}
		return lightEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightEnableType1_Index() {
        return (EAttribute)getLightEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightEnableType1_Param() {
        return (EAttribute)getLightEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightEnableType1_Value() {
        return (EAttribute)getLightEnableType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightingEnableType() {
		if (lightingEnableTypeEClass == null) {
			lightingEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(492);
		}
		return lightingEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightingEnableType_Param() {
        return (EAttribute)getLightingEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightingEnableType_Value() {
        return (EAttribute)getLightingEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightingEnableType1() {
		if (lightingEnableType1EClass == null) {
			lightingEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(493);
		}
		return lightingEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightingEnableType1_Param() {
        return (EAttribute)getLightingEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightingEnableType1_Value() {
        return (EAttribute)getLightingEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightLinearAttenuationType() {
		if (lightLinearAttenuationTypeEClass == null) {
			lightLinearAttenuationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(494);
		}
		return lightLinearAttenuationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightLinearAttenuationType_Index() {
        return (EAttribute)getLightLinearAttenuationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightLinearAttenuationType_Param() {
        return (EAttribute)getLightLinearAttenuationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightLinearAttenuationType_Value() {
        return (EAttribute)getLightLinearAttenuationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightLinearAttenutationType() {
		if (lightLinearAttenutationTypeEClass == null) {
			lightLinearAttenutationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(495);
		}
		return lightLinearAttenutationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightLinearAttenutationType_Index() {
        return (EAttribute)getLightLinearAttenutationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightLinearAttenutationType_Param() {
        return (EAttribute)getLightLinearAttenutationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightLinearAttenutationType_Value() {
        return (EAttribute)getLightLinearAttenutationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightModelAmbientType() {
		if (lightModelAmbientTypeEClass == null) {
			lightModelAmbientTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(496);
		}
		return lightModelAmbientTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightModelAmbientType_Param() {
        return (EAttribute)getLightModelAmbientType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightModelAmbientType_Value() {
        return (EAttribute)getLightModelAmbientType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightModelAmbientType1() {
		if (lightModelAmbientType1EClass == null) {
			lightModelAmbientType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(497);
		}
		return lightModelAmbientType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightModelAmbientType1_Param() {
        return (EAttribute)getLightModelAmbientType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightModelAmbientType1_Value() {
        return (EAttribute)getLightModelAmbientType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightModelColorControlType() {
		if (lightModelColorControlTypeEClass == null) {
			lightModelColorControlTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(498);
		}
		return lightModelColorControlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightModelColorControlType_Param() {
        return (EAttribute)getLightModelColorControlType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightModelColorControlType_Value() {
        return (EAttribute)getLightModelColorControlType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightModelLocalViewerEnableType() {
		if (lightModelLocalViewerEnableTypeEClass == null) {
			lightModelLocalViewerEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(499);
		}
		return lightModelLocalViewerEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightModelLocalViewerEnableType_Param() {
        return (EAttribute)getLightModelLocalViewerEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightModelLocalViewerEnableType_Value() {
        return (EAttribute)getLightModelLocalViewerEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightModelTwoSideEnableType() {
		if (lightModelTwoSideEnableTypeEClass == null) {
			lightModelTwoSideEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(500);
		}
		return lightModelTwoSideEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightModelTwoSideEnableType_Param() {
        return (EAttribute)getLightModelTwoSideEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightModelTwoSideEnableType_Value() {
        return (EAttribute)getLightModelTwoSideEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightModelTwoSideEnableType1() {
		if (lightModelTwoSideEnableType1EClass == null) {
			lightModelTwoSideEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(501);
		}
		return lightModelTwoSideEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightModelTwoSideEnableType1_Param() {
        return (EAttribute)getLightModelTwoSideEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightModelTwoSideEnableType1_Value() {
        return (EAttribute)getLightModelTwoSideEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightPositionType() {
		if (lightPositionTypeEClass == null) {
			lightPositionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(502);
		}
		return lightPositionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightPositionType_Index() {
        return (EAttribute)getLightPositionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightPositionType_Param() {
        return (EAttribute)getLightPositionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightPositionType_Value() {
        return (EAttribute)getLightPositionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightPositionType1() {
		if (lightPositionType1EClass == null) {
			lightPositionType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(503);
		}
		return lightPositionType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightPositionType1_Index() {
        return (EAttribute)getLightPositionType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightPositionType1_Param() {
        return (EAttribute)getLightPositionType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightPositionType1_Value() {
        return (EAttribute)getLightPositionType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightQuadraticAttenuationType() {
		if (lightQuadraticAttenuationTypeEClass == null) {
			lightQuadraticAttenuationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(504);
		}
		return lightQuadraticAttenuationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightQuadraticAttenuationType_Index() {
        return (EAttribute)getLightQuadraticAttenuationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightQuadraticAttenuationType_Param() {
        return (EAttribute)getLightQuadraticAttenuationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightQuadraticAttenuationType_Value() {
        return (EAttribute)getLightQuadraticAttenuationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightQuadraticAttenuationType1() {
		if (lightQuadraticAttenuationType1EClass == null) {
			lightQuadraticAttenuationType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(505);
		}
		return lightQuadraticAttenuationType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightQuadraticAttenuationType1_Index() {
        return (EAttribute)getLightQuadraticAttenuationType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightQuadraticAttenuationType1_Param() {
        return (EAttribute)getLightQuadraticAttenuationType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightQuadraticAttenuationType1_Value() {
        return (EAttribute)getLightQuadraticAttenuationType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightSpecularType() {
		if (lightSpecularTypeEClass == null) {
			lightSpecularTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(506);
		}
		return lightSpecularTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpecularType_Index() {
        return (EAttribute)getLightSpecularType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpecularType_Param() {
        return (EAttribute)getLightSpecularType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpecularType_Value() {
        return (EAttribute)getLightSpecularType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightSpecularType1() {
		if (lightSpecularType1EClass == null) {
			lightSpecularType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(507);
		}
		return lightSpecularType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpecularType1_Index() {
        return (EAttribute)getLightSpecularType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpecularType1_Param() {
        return (EAttribute)getLightSpecularType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpecularType1_Value() {
        return (EAttribute)getLightSpecularType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightSpotCutoffType() {
		if (lightSpotCutoffTypeEClass == null) {
			lightSpotCutoffTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(508);
		}
		return lightSpotCutoffTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpotCutoffType_Index() {
        return (EAttribute)getLightSpotCutoffType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpotCutoffType_Param() {
        return (EAttribute)getLightSpotCutoffType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpotCutoffType_Value() {
        return (EAttribute)getLightSpotCutoffType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightSpotCutoffType1() {
		if (lightSpotCutoffType1EClass == null) {
			lightSpotCutoffType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(509);
		}
		return lightSpotCutoffType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpotCutoffType1_Index() {
        return (EAttribute)getLightSpotCutoffType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpotCutoffType1_Param() {
        return (EAttribute)getLightSpotCutoffType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpotCutoffType1_Value() {
        return (EAttribute)getLightSpotCutoffType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightSpotDirectionType() {
		if (lightSpotDirectionTypeEClass == null) {
			lightSpotDirectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(510);
		}
		return lightSpotDirectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpotDirectionType_Index() {
        return (EAttribute)getLightSpotDirectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpotDirectionType_Param() {
        return (EAttribute)getLightSpotDirectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpotDirectionType_Value() {
        return (EAttribute)getLightSpotDirectionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightSpotDirectionType1() {
		if (lightSpotDirectionType1EClass == null) {
			lightSpotDirectionType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(511);
		}
		return lightSpotDirectionType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpotDirectionType1_Index() {
        return (EAttribute)getLightSpotDirectionType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpotDirectionType1_Param() {
        return (EAttribute)getLightSpotDirectionType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpotDirectionType1_Value() {
        return (EAttribute)getLightSpotDirectionType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightSpotExponentType() {
		if (lightSpotExponentTypeEClass == null) {
			lightSpotExponentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(512);
		}
		return lightSpotExponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpotExponentType_Index() {
        return (EAttribute)getLightSpotExponentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpotExponentType_Param() {
        return (EAttribute)getLightSpotExponentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpotExponentType_Value() {
        return (EAttribute)getLightSpotExponentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightSpotExponentType1() {
		if (lightSpotExponentType1EClass == null) {
			lightSpotExponentType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(513);
		}
		return lightSpotExponentType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpotExponentType1_Index() {
        return (EAttribute)getLightSpotExponentType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpotExponentType1_Param() {
        return (EAttribute)getLightSpotExponentType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSpotExponentType1_Value() {
        return (EAttribute)getLightSpotExponentType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightType() {
		if (lightTypeEClass == null) {
			lightTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(514);
		}
		return lightTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLightType_Asset() {
        return (EReference)getLightType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLightType_TechniqueCommon() {
        return (EReference)getLightType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLightType_Technique() {
        return (EReference)getLightType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLightType_Extra() {
        return (EReference)getLightType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightType_Id() {
        return (EAttribute)getLightType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightType_Name() {
        return (EAttribute)getLightType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLimitsType() {
		if (limitsTypeEClass == null) {
			limitsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(515);
		}
		return limitsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLimitsType_SwingConeAndTwist() {
        return (EReference)getLimitsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLimitsType_Linear() {
        return (EReference)getLimitsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearType() {
		if (linearTypeEClass == null) {
			linearTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(516);
		}
		return linearTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinearType_Stiffness() {
        return (EReference)getLinearType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinearType_Damping() {
        return (EReference)getLinearType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinearType_TargetValue() {
        return (EReference)getLinearType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearType1() {
		if (linearType1EClass == null) {
			linearType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(517);
		}
		return linearType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinearType1_Min() {
        return (EReference)getLinearType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinearType1_Max() {
        return (EReference)getLinearType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineSmoothEnableType() {
		if (lineSmoothEnableTypeEClass == null) {
			lineSmoothEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(518);
		}
		return lineSmoothEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineSmoothEnableType_Param() {
        return (EAttribute)getLineSmoothEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineSmoothEnableType_Value() {
        return (EAttribute)getLineSmoothEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineSmoothEnableType1() {
		if (lineSmoothEnableType1EClass == null) {
			lineSmoothEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(519);
		}
		return lineSmoothEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineSmoothEnableType1_Param() {
        return (EAttribute)getLineSmoothEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineSmoothEnableType1_Value() {
        return (EAttribute)getLineSmoothEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineStippleEnableType() {
		if (lineStippleEnableTypeEClass == null) {
			lineStippleEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(520);
		}
		return lineStippleEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineStippleEnableType_Param() {
        return (EAttribute)getLineStippleEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineStippleEnableType_Value() {
        return (EAttribute)getLineStippleEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineStippleType() {
		if (lineStippleTypeEClass == null) {
			lineStippleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(521);
		}
		return lineStippleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineStippleType_Param() {
        return (EAttribute)getLineStippleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineStippleType_Value() {
        return (EAttribute)getLineStippleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinestripsType() {
		if (linestripsTypeEClass == null) {
			linestripsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(522);
		}
		return linestripsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinestripsType_Input() {
        return (EReference)getLinestripsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinestripsType_P() {
        return (EAttribute)getLinestripsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinestripsType_Extra() {
        return (EReference)getLinestripsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinestripsType_Count() {
        return (EAttribute)getLinestripsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinestripsType_Material() {
        return (EAttribute)getLinestripsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinestripsType_Name() {
        return (EAttribute)getLinestripsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinesType() {
		if (linesTypeEClass == null) {
			linesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(523);
		}
		return linesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinesType_Input() {
        return (EReference)getLinesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinesType_P() {
        return (EAttribute)getLinesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinesType_Extra() {
        return (EReference)getLinesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinesType_Count() {
        return (EAttribute)getLinesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinesType_Material() {
        return (EAttribute)getLinesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinesType_Name() {
        return (EAttribute)getLinesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineWidthType() {
		if (lineWidthTypeEClass == null) {
			lineWidthTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(524);
		}
		return lineWidthTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineWidthType_Param() {
        return (EAttribute)getLineWidthType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineWidthType_Value() {
        return (EAttribute)getLineWidthType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineWidthType1() {
		if (lineWidthType1EClass == null) {
			lineWidthType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(525);
		}
		return lineWidthType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineWidthType1_Param() {
        return (EAttribute)getLineWidthType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineWidthType1_Value() {
        return (EAttribute)getLineWidthType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicOpEnableType() {
		if (logicOpEnableTypeEClass == null) {
			logicOpEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(533);
		}
		return logicOpEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicOpEnableType_Param() {
        return (EAttribute)getLogicOpEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicOpEnableType_Value() {
        return (EAttribute)getLogicOpEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicOpType() {
		if (logicOpTypeEClass == null) {
			logicOpTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(534);
		}
		return logicOpTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicOpType_Param() {
        return (EAttribute)getLogicOpType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicOpType_Value() {
        return (EAttribute)getLogicOpType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicOpType1() {
		if (logicOpType1EClass == null) {
			logicOpType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(535);
		}
		return logicOpType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicOpType1_Param() {
        return (EAttribute)getLogicOpType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicOpType1_Value() {
        return (EAttribute)getLogicOpType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLookatType() {
		if (lookatTypeEClass == null) {
			lookatTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(536);
		}
		return lookatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookatType_Value() {
        return (EAttribute)getLookatType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookatType_Sid() {
        return (EAttribute)getLookatType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaskType() {
		if (maskTypeEClass == null) {
			maskTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(537);
		}
		return maskTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaskType_Param() {
        return (EAttribute)getMaskType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaskType_Value() {
        return (EAttribute)getMaskType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaskType1() {
		if (maskType1EClass == null) {
			maskType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(538);
		}
		return maskType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaskType1_Param() {
        return (EAttribute)getMaskType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaskType1_Value() {
        return (EAttribute)getMaskType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaskType2() {
		if (maskType2EClass == null) {
			maskType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(539);
		}
		return maskType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaskType2_Param() {
        return (EAttribute)getMaskType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaskType2_Value() {
        return (EAttribute)getMaskType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaskType3() {
		if (maskType3EClass == null) {
			maskType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(540);
		}
		return maskType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaskType3_Param() {
        return (EAttribute)getMaskType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaskType3_Value() {
        return (EAttribute)getMaskType3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMassFrameType() {
		if (massFrameTypeEClass == null) {
			massFrameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(541);
		}
		return massFrameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMassFrameType_Group() {
        return (EAttribute)getMassFrameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMassFrameType_Translate() {
        return (EReference)getMassFrameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMassFrameType_Rotate() {
        return (EReference)getMassFrameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMassFrameType1() {
		if (massFrameType1EClass == null) {
			massFrameType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(542);
		}
		return massFrameType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMassFrameType1_Group() {
        return (EAttribute)getMassFrameType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMassFrameType1_Translate() {
        return (EReference)getMassFrameType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMassFrameType1_Rotate() {
        return (EReference)getMassFrameType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterialAmbientType() {
		if (materialAmbientTypeEClass == null) {
			materialAmbientTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(543);
		}
		return materialAmbientTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialAmbientType_Param() {
        return (EAttribute)getMaterialAmbientType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialAmbientType_Value() {
        return (EAttribute)getMaterialAmbientType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterialAmbientType1() {
		if (materialAmbientType1EClass == null) {
			materialAmbientType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(544);
		}
		return materialAmbientType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialAmbientType1_Param() {
        return (EAttribute)getMaterialAmbientType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialAmbientType1_Value() {
        return (EAttribute)getMaterialAmbientType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterialDiffuseType() {
		if (materialDiffuseTypeEClass == null) {
			materialDiffuseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(545);
		}
		return materialDiffuseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialDiffuseType_Param() {
        return (EAttribute)getMaterialDiffuseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialDiffuseType_Value() {
        return (EAttribute)getMaterialDiffuseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterialDiffuseType1() {
		if (materialDiffuseType1EClass == null) {
			materialDiffuseType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(546);
		}
		return materialDiffuseType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialDiffuseType1_Param() {
        return (EAttribute)getMaterialDiffuseType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialDiffuseType1_Value() {
        return (EAttribute)getMaterialDiffuseType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterialEmissionType() {
		if (materialEmissionTypeEClass == null) {
			materialEmissionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(547);
		}
		return materialEmissionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialEmissionType_Param() {
        return (EAttribute)getMaterialEmissionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialEmissionType_Value() {
        return (EAttribute)getMaterialEmissionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterialEmissionType1() {
		if (materialEmissionType1EClass == null) {
			materialEmissionType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(548);
		}
		return materialEmissionType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialEmissionType1_Param() {
        return (EAttribute)getMaterialEmissionType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialEmissionType1_Value() {
        return (EAttribute)getMaterialEmissionType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterialShininessType() {
		if (materialShininessTypeEClass == null) {
			materialShininessTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(549);
		}
		return materialShininessTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialShininessType_Param() {
        return (EAttribute)getMaterialShininessType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialShininessType_Value() {
        return (EAttribute)getMaterialShininessType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterialShininessType1() {
		if (materialShininessType1EClass == null) {
			materialShininessType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(550);
		}
		return materialShininessType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialShininessType1_Param() {
        return (EAttribute)getMaterialShininessType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialShininessType1_Value() {
        return (EAttribute)getMaterialShininessType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterialSpecularType() {
		if (materialSpecularTypeEClass == null) {
			materialSpecularTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(551);
		}
		return materialSpecularTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialSpecularType_Param() {
        return (EAttribute)getMaterialSpecularType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialSpecularType_Value() {
        return (EAttribute)getMaterialSpecularType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterialSpecularType1() {
		if (materialSpecularType1EClass == null) {
			materialSpecularType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(552);
		}
		return materialSpecularType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialSpecularType1_Param() {
        return (EAttribute)getMaterialSpecularType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialSpecularType1_Value() {
        return (EAttribute)getMaterialSpecularType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterialType() {
		if (materialTypeEClass == null) {
			materialTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(553);
		}
		return materialTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialType_Asset() {
        return (EReference)getMaterialType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialType_InstanceEffect() {
        return (EReference)getMaterialType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialType_Extra() {
        return (EReference)getMaterialType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialType_Id() {
        return (EAttribute)getMaterialType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialType_Name() {
        return (EAttribute)getMaterialType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatrixType() {
		if (matrixTypeEClass == null) {
			matrixTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(554);
		}
		return matrixTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrixType_Value() {
        return (EAttribute)getMatrixType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrixType_Sid() {
        return (EAttribute)getMatrixType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeshType() {
		if (meshTypeEClass == null) {
			meshTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(555);
		}
		return meshTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeshType_Source() {
        return (EReference)getMeshType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeshType_Vertices() {
        return (EReference)getMeshType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeshType_Group() {
        return (EAttribute)getMeshType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeshType_Lines() {
        return (EReference)getMeshType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeshType_Linestrips() {
        return (EReference)getMeshType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeshType_Polygons() {
        return (EReference)getMeshType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeshType_Polylist() {
        return (EReference)getMeshType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeshType_Triangles() {
        return (EReference)getMeshType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeshType_Trifans() {
        return (EReference)getMeshType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeshType_Tristrips() {
        return (EReference)getMeshType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeshType_Extra() {
        return (EReference)getMeshType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelViewMatrixType() {
		if (modelViewMatrixTypeEClass == null) {
			modelViewMatrixTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(556);
		}
		return modelViewMatrixTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelViewMatrixType_Param() {
        return (EAttribute)getModelViewMatrixType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelViewMatrixType_Value() {
        return (EAttribute)getModelViewMatrixType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelViewMatrixType1() {
		if (modelViewMatrixType1EClass == null) {
			modelViewMatrixType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(557);
		}
		return modelViewMatrixType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelViewMatrixType1_Param() {
        return (EAttribute)getModelViewMatrixType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelViewMatrixType1_Value() {
        return (EAttribute)getModelViewMatrixType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeType() {
		if (modeTypeEClass == null) {
			modeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(558);
		}
		return modeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModeType_Param() {
        return (EAttribute)getModeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModeType_Value() {
        return (EAttribute)getModeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeType1() {
		if (modeType1EClass == null) {
			modeType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(559);
		}
		return modeType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModeType1_Param() {
        return (EAttribute)getModeType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModeType1_Value() {
        return (EAttribute)getModeType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMorphType() {
		if (morphTypeEClass == null) {
			morphTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(562);
		}
		return morphTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMorphType_Source() {
        return (EReference)getMorphType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMorphType_Targets() {
        return (EReference)getMorphType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMorphType_Extra() {
        return (EReference)getMorphType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMorphType_Method() {
        return (EAttribute)getMorphType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMorphType_Source1() {
        return (EAttribute)getMorphType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultisampleEnableType() {
		if (multisampleEnableTypeEClass == null) {
			multisampleEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(563);
		}
		return multisampleEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultisampleEnableType_Param() {
        return (EAttribute)getMultisampleEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultisampleEnableType_Value() {
        return (EAttribute)getMultisampleEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultisampleEnableType1() {
		if (multisampleEnableType1EClass == null) {
			multisampleEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(564);
		}
		return multisampleEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultisampleEnableType1_Param() {
        return (EAttribute)getMultisampleEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultisampleEnableType1_Value() {
        return (EAttribute)getMultisampleEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameArrayType() {
		if (nameArrayTypeEClass == null) {
			nameArrayTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(566);
		}
		return nameArrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameArrayType_Value() {
        return (EAttribute)getNameArrayType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameArrayType_Count() {
        return (EAttribute)getNameArrayType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameArrayType_Id() {
        return (EAttribute)getNameArrayType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameArrayType_Name() {
        return (EAttribute)getNameArrayType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameType() {
		if (nameTypeEClass == null) {
			nameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(567);
		}
		return nameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameType_Value() {
        return (EAttribute)getNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameType_Source() {
        return (EAttribute)getNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameType1() {
		if (nameType1EClass == null) {
			nameType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(568);
		}
		return nameType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameType1_Value() {
        return (EAttribute)getNameType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameType1_Source() {
        return (EAttribute)getNameType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameType2() {
		if (nameType2EClass == null) {
			nameType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(569);
		}
		return nameType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameType2_Value() {
        return (EAttribute)getNameType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameType2_Source() {
        return (EAttribute)getNameType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameType3() {
		if (nameType3EClass == null) {
			nameType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(570);
		}
		return nameType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameType3_Value() {
        return (EAttribute)getNameType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameType3_Source() {
        return (EAttribute)getNameType3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeType1() {
		if (nodeType1EClass == null) {
			nodeType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(572);
		}
		return nodeType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType1_Asset() {
        return (EReference)getNodeType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType1_Group() {
        return (EAttribute)getNodeType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType1_Lookat() {
        return (EReference)getNodeType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType1_Matrix() {
        return (EReference)getNodeType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType1_Rotate() {
        return (EReference)getNodeType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType1_Scale() {
        return (EReference)getNodeType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType1_Skew() {
        return (EReference)getNodeType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType1_Translate() {
        return (EReference)getNodeType1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType1_InstanceCamera() {
        return (EReference)getNodeType1().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType1_InstanceController() {
        return (EReference)getNodeType1().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType1_InstanceGeometry() {
        return (EReference)getNodeType1().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType1_InstanceLight() {
        return (EReference)getNodeType1().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType1_InstanceNode() {
        return (EReference)getNodeType1().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType1_Node() {
        return (EReference)getNodeType1().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType1_Extra() {
        return (EReference)getNodeType1().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType1_Id() {
        return (EAttribute)getNodeType1().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType1_Layer() {
        return (EAttribute)getNodeType1().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType1_Name() {
        return (EAttribute)getNodeType1().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType1_Sid() {
        return (EAttribute)getNodeType1().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType1_Type() {
        return (EAttribute)getNodeType1().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalizeEnableType() {
		if (normalizeEnableTypeEClass == null) {
			normalizeEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(574);
		}
		return normalizeEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizeEnableType_Param() {
        return (EAttribute)getNormalizeEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizeEnableType_Value() {
        return (EAttribute)getNormalizeEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalizeEnableType1() {
		if (normalizeEnableType1EClass == null) {
			normalizeEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(575);
		}
		return normalizeEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizeEnableType1_Param() {
        return (EAttribute)getNormalizeEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizeEnableType1_Value() {
        return (EAttribute)getNormalizeEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpticsType() {
		if (opticsTypeEClass == null) {
			opticsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(576);
		}
		return opticsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpticsType_TechniqueCommon() {
        return (EReference)getOpticsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpticsType_Technique() {
        return (EReference)getOpticsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpticsType_Extra() {
        return (EReference)getOpticsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrthographicType() {
		if (orthographicTypeEClass == null) {
			orthographicTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(577);
		}
		return orthographicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrthographicType_Xmag() {
        return (EReference)getOrthographicType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrthographicType_Ymag() {
        return (EReference)getOrthographicType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrthographicType_AspectRatio() {
        return (EReference)getOrthographicType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrthographicType_Ymag1() {
        return (EReference)getOrthographicType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrthographicType_AspectRatio1() {
        return (EReference)getOrthographicType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrthographicType_Znear() {
        return (EReference)getOrthographicType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrthographicType_Zfar() {
        return (EReference)getOrthographicType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamType() {
		if (paramTypeEClass == null) {
			paramTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(578);
		}
		return paramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Ref() {
        return (EAttribute)getParamType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamType1() {
		if (paramType1EClass == null) {
			paramType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(579);
		}
		return paramType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType1_Ref() {
        return (EAttribute)getParamType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamType2() {
		if (paramType2EClass == null) {
			paramType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(580);
		}
		return paramType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType2_Ref() {
        return (EAttribute)getParamType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamType3() {
		if (paramType3EClass == null) {
			paramType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(581);
		}
		return paramType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType3_Ref() {
        return (EAttribute)getParamType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamType4() {
		if (paramType4EClass == null) {
			paramType4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(582);
		}
		return paramType4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType4_Value() {
        return (EAttribute)getParamType4().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType4_Name() {
        return (EAttribute)getParamType4().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType4_Semantic() {
        return (EAttribute)getParamType4().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType4_Sid() {
        return (EAttribute)getParamType4().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType4_Type() {
        return (EAttribute)getParamType4().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassType() {
		if (passTypeEClass == null) {
			passTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(583);
		}
		return passTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_Annotate() {
        return (EReference)getPassType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassType_ColorTarget() {
        return (EAttribute)getPassType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassType_DepthTarget() {
        return (EAttribute)getPassType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassType_StencilTarget() {
        return (EAttribute)getPassType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassType_ColorClear() {
        return (EAttribute)getPassType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassType_DepthClear() {
        return (EAttribute)getPassType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassType_StencilClear() {
        return (EAttribute)getPassType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassType_Draw() {
        return (EAttribute)getPassType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassType_GlesPipelineSettings() {
        return (EAttribute)getPassType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_AlphaFunc() {
        return (EReference)getPassType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_BlendFunc() {
        return (EReference)getPassType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_ClearColor() {
        return (EReference)getPassType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_ClearStencil() {
        return (EReference)getPassType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_ClearDepth() {
        return (EReference)getPassType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_ClipPlane() {
        return (EReference)getPassType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_ColorMask() {
        return (EReference)getPassType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_CullFace() {
        return (EReference)getPassType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_DepthFunc() {
        return (EReference)getPassType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_DepthMask() {
        return (EReference)getPassType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_DepthRange() {
        return (EReference)getPassType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_FogColor() {
        return (EReference)getPassType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_FogDensity() {
        return (EReference)getPassType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_FogMode() {
        return (EReference)getPassType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_FogStart() {
        return (EReference)getPassType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_FogEnd() {
        return (EReference)getPassType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_FrontFace() {
        return (EReference)getPassType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_TexturePipeline() {
        return (EReference)getPassType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_LogicOp() {
        return (EReference)getPassType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_LightAmbient() {
        return (EReference)getPassType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_LightDiffuse() {
        return (EReference)getPassType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_LightSpecular() {
        return (EReference)getPassType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_LightPosition() {
        return (EReference)getPassType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_LightConstantAttenuation() {
        return (EReference)getPassType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_LightLinearAttenutation() {
        return (EReference)getPassType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_LightQuadraticAttenuation() {
        return (EReference)getPassType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_LightSpotCutoff() {
        return (EReference)getPassType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_LightSpotDirection() {
        return (EReference)getPassType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_LightSpotExponent() {
        return (EReference)getPassType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_LightModelAmbient() {
        return (EReference)getPassType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_LineWidth() {
        return (EReference)getPassType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_MaterialAmbient() {
        return (EReference)getPassType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_MaterialDiffuse() {
        return (EReference)getPassType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_MaterialEmission() {
        return (EReference)getPassType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_MaterialShininess() {
        return (EReference)getPassType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_MaterialSpecular() {
        return (EReference)getPassType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_ModelViewMatrix() {
        return (EReference)getPassType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_PointDistanceAttenuation() {
        return (EReference)getPassType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_PointFadeThresholdSize() {
        return (EReference)getPassType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_PointSize() {
        return (EReference)getPassType().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_PointSizeMin() {
        return (EReference)getPassType().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_PointSizeMax() {
        return (EReference)getPassType().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_PolygonOffset() {
        return (EReference)getPassType().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_ProjectionMatrix() {
        return (EReference)getPassType().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_Scissor() {
        return (EReference)getPassType().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_ShadeModel() {
        return (EReference)getPassType().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_StencilFunc() {
        return (EReference)getPassType().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_StencilMask() {
        return (EReference)getPassType().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_StencilOp() {
        return (EReference)getPassType().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_AlphaTestEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_BlendEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_ClipPlaneEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_ColorLogicOpEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_ColorMaterialEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_CullFaceEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_DepthTestEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_DitherEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_FogEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_TexturePipelineEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_LightEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_LightingEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_LightModelTwoSideEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_LineSmoothEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_MultisampleEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_NormalizeEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_PointSmoothEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_PolygonOffsetFillEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_RescaleNormalEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_SampleAlphaToCoverageEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_SampleAlphaToOneEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_SampleCoverageEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_ScissorTestEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_StencilTestEnable() {
        return (EReference)getPassType().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType_Extra() {
        return (EReference)getPassType().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassType_Sid() {
        return (EAttribute)getPassType().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassType1() {
		if (passType1EClass == null) {
			passType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(584);
		}
		return passType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_Annotate() {
        return (EReference)getPassType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_ColorTarget() {
        return (EReference)getPassType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_DepthTarget() {
        return (EReference)getPassType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_StencilTarget() {
        return (EReference)getPassType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_ColorClear() {
        return (EReference)getPassType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_DepthClear() {
        return (EReference)getPassType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_StencilClear() {
        return (EReference)getPassType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassType1_Draw() {
        return (EAttribute)getPassType1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassType1_Group() {
        return (EAttribute)getPassType1().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_AlphaFunc() {
        return (EReference)getPassType1().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_BlendFunc() {
        return (EReference)getPassType1().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_BlendFuncSeparate() {
        return (EReference)getPassType1().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_BlendEquation() {
        return (EReference)getPassType1().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_BlendEquationSeparate() {
        return (EReference)getPassType1().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_ColorMaterial() {
        return (EReference)getPassType1().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_CullFace() {
        return (EReference)getPassType1().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_DepthFunc() {
        return (EReference)getPassType1().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_FogMode() {
        return (EReference)getPassType1().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_FogCoordSrc() {
        return (EReference)getPassType1().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_FrontFace() {
        return (EReference)getPassType1().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LightModelColorControl() {
        return (EReference)getPassType1().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LogicOp() {
        return (EReference)getPassType1().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_PolygonMode() {
        return (EReference)getPassType1().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_ShadeModel() {
        return (EReference)getPassType1().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_StencilFunc() {
        return (EReference)getPassType1().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_StencilOp() {
        return (EReference)getPassType1().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_StencilFuncSeparate() {
        return (EReference)getPassType1().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_StencilOpSeparate() {
        return (EReference)getPassType1().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_StencilMaskSeparate() {
        return (EReference)getPassType1().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LightEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LightAmbient() {
        return (EReference)getPassType1().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LightDiffuse() {
        return (EReference)getPassType1().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LightSpecular() {
        return (EReference)getPassType1().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LightPosition() {
        return (EReference)getPassType1().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LightConstantAttenuation() {
        return (EReference)getPassType1().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LightLinearAttenuation() {
        return (EReference)getPassType1().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LightQuadraticAttenuation() {
        return (EReference)getPassType1().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LightSpotCutoff() {
        return (EReference)getPassType1().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LightSpotDirection() {
        return (EReference)getPassType1().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LightSpotExponent() {
        return (EReference)getPassType1().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_Texture1D() {
        return (EReference)getPassType1().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_Texture2D() {
        return (EReference)getPassType1().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_Texture3D() {
        return (EReference)getPassType1().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_TextureCUBE() {
        return (EReference)getPassType1().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_TextureRECT() {
        return (EReference)getPassType1().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_TextureDEPTH() {
        return (EReference)getPassType1().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_Texture1DEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_Texture2DEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_Texture3DEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_TextureCUBEEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_TextureRECTEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_TextureDEPTHEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_TextureEnvColor() {
        return (EReference)getPassType1().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_TextureEnvMode() {
        return (EReference)getPassType1().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_ClipPlane() {
        return (EReference)getPassType1().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_ClipPlaneEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_BlendColor() {
        return (EReference)getPassType1().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_ClearColor() {
        return (EReference)getPassType1().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_ClearStencil() {
        return (EReference)getPassType1().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_ClearDepth() {
        return (EReference)getPassType1().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_ColorMask() {
        return (EReference)getPassType1().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_DepthBounds() {
        return (EReference)getPassType1().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_DepthMask() {
        return (EReference)getPassType1().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_DepthRange() {
        return (EReference)getPassType1().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_FogDensity() {
        return (EReference)getPassType1().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_FogStart() {
        return (EReference)getPassType1().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_FogEnd() {
        return (EReference)getPassType1().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_FogColor() {
        return (EReference)getPassType1().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LightModelAmbient() {
        return (EReference)getPassType1().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LightingEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LineStipple() {
        return (EReference)getPassType1().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LineWidth() {
        return (EReference)getPassType1().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_MaterialAmbient() {
        return (EReference)getPassType1().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_MaterialDiffuse() {
        return (EReference)getPassType1().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_MaterialEmission() {
        return (EReference)getPassType1().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_MaterialShininess() {
        return (EReference)getPassType1().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_MaterialSpecular() {
        return (EReference)getPassType1().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_ModelViewMatrix() {
        return (EReference)getPassType1().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_PointDistanceAttenuation() {
        return (EReference)getPassType1().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_PointFadeThresholdSize() {
        return (EReference)getPassType1().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_PointSize() {
        return (EReference)getPassType1().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_PointSizeMin() {
        return (EReference)getPassType1().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_PointSizeMax() {
        return (EReference)getPassType1().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_PolygonOffset() {
        return (EReference)getPassType1().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_ProjectionMatrix() {
        return (EReference)getPassType1().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_Scissor() {
        return (EReference)getPassType1().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_StencilMask() {
        return (EReference)getPassType1().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_AlphaTestEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_AutoNormalEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_BlendEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_ColorLogicOpEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_ColorMaterialEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_CullFaceEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_DepthBoundsEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_DepthClampEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_DepthTestEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_DitherEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_FogEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LightModelLocalViewerEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LightModelTwoSideEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LineSmoothEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LineStippleEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_LogicOpEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_MultisampleEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_NormalizeEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_PointSmoothEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_PolygonOffsetFillEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_PolygonOffsetLineEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_PolygonOffsetPointEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_PolygonSmoothEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_PolygonStippleEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_RescaleNormalEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_SampleAlphaToCoverageEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_SampleAlphaToOneEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_SampleCoverageEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_ScissorTestEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_StencilTestEnable() {
        return (EReference)getPassType1().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassType1_GlHookAbstractGroup() {
        return (EAttribute)getPassType1().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_GlHookAbstract() {
        return (EReference)getPassType1().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_Shader() {
        return (EReference)getPassType1().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType1_Extra() {
        return (EReference)getPassType1().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassType1_Sid() {
        return (EAttribute)getPassType1().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassType2() {
		if (passType2EClass == null) {
			passType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(585);
		}
		return passType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_Annotate() {
        return (EReference)getPassType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_ColorTarget() {
        return (EReference)getPassType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_DepthTarget() {
        return (EReference)getPassType2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_StencilTarget() {
        return (EReference)getPassType2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_ColorClear() {
        return (EReference)getPassType2().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_DepthClear() {
        return (EReference)getPassType2().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_StencilClear() {
        return (EReference)getPassType2().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassType2_Draw() {
        return (EAttribute)getPassType2().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassType2_Group() {
        return (EAttribute)getPassType2().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_AlphaFunc() {
        return (EReference)getPassType2().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_BlendFunc() {
        return (EReference)getPassType2().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_BlendFuncSeparate() {
        return (EReference)getPassType2().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_BlendEquation() {
        return (EReference)getPassType2().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_BlendEquationSeparate() {
        return (EReference)getPassType2().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_ColorMaterial() {
        return (EReference)getPassType2().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_CullFace() {
        return (EReference)getPassType2().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_DepthFunc() {
        return (EReference)getPassType2().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_FogMode() {
        return (EReference)getPassType2().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_FogCoordSrc() {
        return (EReference)getPassType2().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_FrontFace() {
        return (EReference)getPassType2().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LightModelColorControl() {
        return (EReference)getPassType2().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LogicOp() {
        return (EReference)getPassType2().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_PolygonMode() {
        return (EReference)getPassType2().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_ShadeModel() {
        return (EReference)getPassType2().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_StencilFunc() {
        return (EReference)getPassType2().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_StencilOp() {
        return (EReference)getPassType2().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_StencilFuncSeparate() {
        return (EReference)getPassType2().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_StencilOpSeparate() {
        return (EReference)getPassType2().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_StencilMaskSeparate() {
        return (EReference)getPassType2().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LightEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LightAmbient() {
        return (EReference)getPassType2().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LightDiffuse() {
        return (EReference)getPassType2().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LightSpecular() {
        return (EReference)getPassType2().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LightPosition() {
        return (EReference)getPassType2().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LightConstantAttenuation() {
        return (EReference)getPassType2().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LightLinearAttenuation() {
        return (EReference)getPassType2().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LightQuadraticAttenuation() {
        return (EReference)getPassType2().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LightSpotCutoff() {
        return (EReference)getPassType2().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LightSpotDirection() {
        return (EReference)getPassType2().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LightSpotExponent() {
        return (EReference)getPassType2().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_Texture1D() {
        return (EReference)getPassType2().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_Texture2D() {
        return (EReference)getPassType2().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_Texture3D() {
        return (EReference)getPassType2().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_TextureCUBE() {
        return (EReference)getPassType2().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_TextureRECT() {
        return (EReference)getPassType2().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_TextureDEPTH() {
        return (EReference)getPassType2().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_Texture1DEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_Texture2DEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_Texture3DEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_TextureCUBEEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_TextureRECTEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_TextureDEPTHEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_TextureEnvColor() {
        return (EReference)getPassType2().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_TextureEnvMode() {
        return (EReference)getPassType2().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_ClipPlane() {
        return (EReference)getPassType2().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_ClipPlaneEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_BlendColor() {
        return (EReference)getPassType2().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_ClearColor() {
        return (EReference)getPassType2().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_ClearStencil() {
        return (EReference)getPassType2().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_ClearDepth() {
        return (EReference)getPassType2().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_ColorMask() {
        return (EReference)getPassType2().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_DepthBounds() {
        return (EReference)getPassType2().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_DepthMask() {
        return (EReference)getPassType2().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_DepthRange() {
        return (EReference)getPassType2().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_FogDensity() {
        return (EReference)getPassType2().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_FogStart() {
        return (EReference)getPassType2().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_FogEnd() {
        return (EReference)getPassType2().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_FogColor() {
        return (EReference)getPassType2().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LightModelAmbient() {
        return (EReference)getPassType2().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LightingEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LineStipple() {
        return (EReference)getPassType2().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LineWidth() {
        return (EReference)getPassType2().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_MaterialAmbient() {
        return (EReference)getPassType2().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_MaterialDiffuse() {
        return (EReference)getPassType2().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_MaterialEmission() {
        return (EReference)getPassType2().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_MaterialShininess() {
        return (EReference)getPassType2().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_MaterialSpecular() {
        return (EReference)getPassType2().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_ModelViewMatrix() {
        return (EReference)getPassType2().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_PointDistanceAttenuation() {
        return (EReference)getPassType2().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_PointFadeThresholdSize() {
        return (EReference)getPassType2().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_PointSize() {
        return (EReference)getPassType2().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_PointSizeMin() {
        return (EReference)getPassType2().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_PointSizeMax() {
        return (EReference)getPassType2().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_PolygonOffset() {
        return (EReference)getPassType2().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_ProjectionMatrix() {
        return (EReference)getPassType2().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_Scissor() {
        return (EReference)getPassType2().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_StencilMask() {
        return (EReference)getPassType2().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_AlphaTestEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_AutoNormalEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_BlendEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_ColorLogicOpEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_ColorMaterialEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_CullFaceEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_DepthBoundsEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_DepthClampEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_DepthTestEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_DitherEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_FogEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LightModelLocalViewerEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LightModelTwoSideEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LineSmoothEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LineStippleEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_LogicOpEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_MultisampleEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_NormalizeEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_PointSmoothEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_PolygonOffsetFillEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_PolygonOffsetLineEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_PolygonOffsetPointEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_PolygonSmoothEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_PolygonStippleEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_RescaleNormalEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_SampleAlphaToCoverageEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_SampleAlphaToOneEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_SampleCoverageEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_ScissorTestEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_StencilTestEnable() {
        return (EReference)getPassType2().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassType2_GlHookAbstractGroup() {
        return (EAttribute)getPassType2().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_GlHookAbstract() {
        return (EReference)getPassType2().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_Shader() {
        return (EReference)getPassType2().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassType2_Extra() {
        return (EReference)getPassType2().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassType2_Sid() {
        return (EAttribute)getPassType2().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerspectiveType() {
		if (perspectiveTypeEClass == null) {
			perspectiveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(586);
		}
		return perspectiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerspectiveType_Xfov() {
        return (EReference)getPerspectiveType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerspectiveType_Yfov() {
        return (EReference)getPerspectiveType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerspectiveType_AspectRatio() {
        return (EReference)getPerspectiveType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerspectiveType_Yfov1() {
        return (EReference)getPerspectiveType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerspectiveType_AspectRatio1() {
        return (EReference)getPerspectiveType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerspectiveType_Znear() {
        return (EReference)getPerspectiveType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerspectiveType_Zfar() {
        return (EReference)getPerspectiveType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhongType() {
		if (phongTypeEClass == null) {
			phongTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(587);
		}
		return phongTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhongType_Emission() {
        return (EReference)getPhongType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhongType_Ambient() {
        return (EReference)getPhongType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhongType_Diffuse() {
        return (EReference)getPhongType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhongType_Specular() {
        return (EReference)getPhongType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhongType_Shininess() {
        return (EReference)getPhongType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhongType_Reflective() {
        return (EReference)getPhongType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhongType_Reflectivity() {
        return (EReference)getPhongType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhongType_Transparent() {
        return (EReference)getPhongType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhongType_Transparency() {
        return (EReference)getPhongType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhongType_IndexOfRefraction() {
        return (EReference)getPhongType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhType() {
		if (phTypeEClass == null) {
			phTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(588);
		}
		return phTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhType_P() {
        return (EAttribute)getPhType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhType_H() {
        return (EAttribute)getPhType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicsMaterialType() {
		if (physicsMaterialTypeEClass == null) {
			physicsMaterialTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(589);
		}
		return physicsMaterialTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicsMaterialType_Asset() {
        return (EReference)getPhysicsMaterialType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicsMaterialType_TechniqueCommon() {
        return (EReference)getPhysicsMaterialType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicsMaterialType_Technique() {
        return (EReference)getPhysicsMaterialType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicsMaterialType_Extra() {
        return (EReference)getPhysicsMaterialType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicsMaterialType_Id() {
        return (EAttribute)getPhysicsMaterialType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicsMaterialType_Name() {
        return (EAttribute)getPhysicsMaterialType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicsModelType() {
		if (physicsModelTypeEClass == null) {
			physicsModelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(590);
		}
		return physicsModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicsModelType_Asset() {
        return (EReference)getPhysicsModelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicsModelType_RigidBody() {
        return (EReference)getPhysicsModelType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicsModelType_RigidConstraint() {
        return (EReference)getPhysicsModelType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicsModelType_InstancePhysicsModel() {
        return (EReference)getPhysicsModelType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicsModelType_Extra() {
        return (EReference)getPhysicsModelType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicsModelType_Id() {
        return (EAttribute)getPhysicsModelType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicsModelType_Name() {
        return (EAttribute)getPhysicsModelType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicsSceneType() {
		if (physicsSceneTypeEClass == null) {
			physicsSceneTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(591);
		}
		return physicsSceneTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicsSceneType_Asset() {
        return (EReference)getPhysicsSceneType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicsSceneType_InstanceForceField() {
        return (EReference)getPhysicsSceneType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicsSceneType_InstancePhysicsModel() {
        return (EReference)getPhysicsSceneType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicsSceneType_TechniqueCommon() {
        return (EReference)getPhysicsSceneType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicsSceneType_Technique() {
        return (EReference)getPhysicsSceneType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicsSceneType_Extra() {
        return (EReference)getPhysicsSceneType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicsSceneType_Id() {
        return (EAttribute)getPhysicsSceneType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicsSceneType_Name() {
        return (EAttribute)getPhysicsSceneType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaneType() {
		if (planeTypeEClass == null) {
			planeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(592);
		}
		return planeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaneType_Equation() {
        return (EAttribute)getPlaneType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaneType_Extra() {
        return (EReference)getPlaneType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointDistanceAttenuationType() {
		if (pointDistanceAttenuationTypeEClass == null) {
			pointDistanceAttenuationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(593);
		}
		return pointDistanceAttenuationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointDistanceAttenuationType_Param() {
        return (EAttribute)getPointDistanceAttenuationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointDistanceAttenuationType_Value() {
        return (EAttribute)getPointDistanceAttenuationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointDistanceAttenuationType1() {
		if (pointDistanceAttenuationType1EClass == null) {
			pointDistanceAttenuationType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(594);
		}
		return pointDistanceAttenuationType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointDistanceAttenuationType1_Param() {
        return (EAttribute)getPointDistanceAttenuationType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointDistanceAttenuationType1_Value() {
        return (EAttribute)getPointDistanceAttenuationType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointFadeThresholdSizeType() {
		if (pointFadeThresholdSizeTypeEClass == null) {
			pointFadeThresholdSizeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(595);
		}
		return pointFadeThresholdSizeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointFadeThresholdSizeType_Param() {
        return (EAttribute)getPointFadeThresholdSizeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointFadeThresholdSizeType_Value() {
        return (EAttribute)getPointFadeThresholdSizeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointFadeThresholdSizeType1() {
		if (pointFadeThresholdSizeType1EClass == null) {
			pointFadeThresholdSizeType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(596);
		}
		return pointFadeThresholdSizeType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointFadeThresholdSizeType1_Param() {
        return (EAttribute)getPointFadeThresholdSizeType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointFadeThresholdSizeType1_Value() {
        return (EAttribute)getPointFadeThresholdSizeType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointSizeMaxType() {
		if (pointSizeMaxTypeEClass == null) {
			pointSizeMaxTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(597);
		}
		return pointSizeMaxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointSizeMaxType_Param() {
        return (EAttribute)getPointSizeMaxType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointSizeMaxType_Value() {
        return (EAttribute)getPointSizeMaxType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointSizeMaxType1() {
		if (pointSizeMaxType1EClass == null) {
			pointSizeMaxType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(598);
		}
		return pointSizeMaxType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointSizeMaxType1_Param() {
        return (EAttribute)getPointSizeMaxType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointSizeMaxType1_Value() {
        return (EAttribute)getPointSizeMaxType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointSizeMinType() {
		if (pointSizeMinTypeEClass == null) {
			pointSizeMinTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(599);
		}
		return pointSizeMinTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointSizeMinType_Param() {
        return (EAttribute)getPointSizeMinType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointSizeMinType_Value() {
        return (EAttribute)getPointSizeMinType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointSizeMinType1() {
		if (pointSizeMinType1EClass == null) {
			pointSizeMinType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(600);
		}
		return pointSizeMinType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointSizeMinType1_Param() {
        return (EAttribute)getPointSizeMinType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointSizeMinType1_Value() {
        return (EAttribute)getPointSizeMinType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointSizeType() {
		if (pointSizeTypeEClass == null) {
			pointSizeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(601);
		}
		return pointSizeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointSizeType_Param() {
        return (EAttribute)getPointSizeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointSizeType_Value() {
        return (EAttribute)getPointSizeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointSizeType1() {
		if (pointSizeType1EClass == null) {
			pointSizeType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(602);
		}
		return pointSizeType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointSizeType1_Param() {
        return (EAttribute)getPointSizeType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointSizeType1_Value() {
        return (EAttribute)getPointSizeType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointSmoothEnableType() {
		if (pointSmoothEnableTypeEClass == null) {
			pointSmoothEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(603);
		}
		return pointSmoothEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointSmoothEnableType_Param() {
        return (EAttribute)getPointSmoothEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointSmoothEnableType_Value() {
        return (EAttribute)getPointSmoothEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointSmoothEnableType1() {
		if (pointSmoothEnableType1EClass == null) {
			pointSmoothEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(604);
		}
		return pointSmoothEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointSmoothEnableType1_Param() {
        return (EAttribute)getPointSmoothEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointSmoothEnableType1_Value() {
        return (EAttribute)getPointSmoothEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointType() {
		if (pointTypeEClass == null) {
			pointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(605);
		}
		return pointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointType_Color() {
        return (EReference)getPointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointType_ConstantAttenuation() {
        return (EReference)getPointType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointType_LinearAttenuation() {
        return (EReference)getPointType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointType_QuadraticAttenuation() {
        return (EReference)getPointType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygonModeType() {
		if (polygonModeTypeEClass == null) {
			polygonModeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(606);
		}
		return polygonModeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygonModeType_Face() {
        return (EReference)getPolygonModeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygonModeType_Mode() {
        return (EReference)getPolygonModeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygonOffsetFillEnableType() {
		if (polygonOffsetFillEnableTypeEClass == null) {
			polygonOffsetFillEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(607);
		}
		return polygonOffsetFillEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonOffsetFillEnableType_Param() {
        return (EAttribute)getPolygonOffsetFillEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonOffsetFillEnableType_Value() {
        return (EAttribute)getPolygonOffsetFillEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygonOffsetFillEnableType1() {
		if (polygonOffsetFillEnableType1EClass == null) {
			polygonOffsetFillEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(608);
		}
		return polygonOffsetFillEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonOffsetFillEnableType1_Param() {
        return (EAttribute)getPolygonOffsetFillEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonOffsetFillEnableType1_Value() {
        return (EAttribute)getPolygonOffsetFillEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygonOffsetLineEnableType() {
		if (polygonOffsetLineEnableTypeEClass == null) {
			polygonOffsetLineEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(609);
		}
		return polygonOffsetLineEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonOffsetLineEnableType_Param() {
        return (EAttribute)getPolygonOffsetLineEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonOffsetLineEnableType_Value() {
        return (EAttribute)getPolygonOffsetLineEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygonOffsetPointEnableType() {
		if (polygonOffsetPointEnableTypeEClass == null) {
			polygonOffsetPointEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(610);
		}
		return polygonOffsetPointEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonOffsetPointEnableType_Param() {
        return (EAttribute)getPolygonOffsetPointEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonOffsetPointEnableType_Value() {
        return (EAttribute)getPolygonOffsetPointEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygonOffsetType() {
		if (polygonOffsetTypeEClass == null) {
			polygonOffsetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(611);
		}
		return polygonOffsetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonOffsetType_Param() {
        return (EAttribute)getPolygonOffsetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonOffsetType_Value() {
        return (EAttribute)getPolygonOffsetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygonOffsetType1() {
		if (polygonOffsetType1EClass == null) {
			polygonOffsetType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(612);
		}
		return polygonOffsetType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonOffsetType1_Param() {
        return (EAttribute)getPolygonOffsetType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonOffsetType1_Value() {
        return (EAttribute)getPolygonOffsetType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygonSmoothEnableType() {
		if (polygonSmoothEnableTypeEClass == null) {
			polygonSmoothEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(613);
		}
		return polygonSmoothEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonSmoothEnableType_Param() {
        return (EAttribute)getPolygonSmoothEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonSmoothEnableType_Value() {
        return (EAttribute)getPolygonSmoothEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygonStippleEnableType() {
		if (polygonStippleEnableTypeEClass == null) {
			polygonStippleEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(614);
		}
		return polygonStippleEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonStippleEnableType_Param() {
        return (EAttribute)getPolygonStippleEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonStippleEnableType_Value() {
        return (EAttribute)getPolygonStippleEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygonsType() {
		if (polygonsTypeEClass == null) {
			polygonsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(615);
		}
		return polygonsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygonsType_Input() {
        return (EReference)getPolygonsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonsType_Group() {
        return (EAttribute)getPolygonsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonsType_P() {
        return (EAttribute)getPolygonsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygonsType_Ph() {
        return (EReference)getPolygonsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygonsType_Extra() {
        return (EReference)getPolygonsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonsType_Count() {
        return (EAttribute)getPolygonsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonsType_Material() {
        return (EAttribute)getPolygonsType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonsType_Name() {
        return (EAttribute)getPolygonsType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolylistType() {
		if (polylistTypeEClass == null) {
			polylistTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(616);
		}
		return polylistTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolylistType_Input() {
        return (EReference)getPolylistType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylistType_Vcount() {
        return (EAttribute)getPolylistType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylistType_P() {
        return (EAttribute)getPolylistType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolylistType_Extra() {
        return (EReference)getPolylistType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylistType_Count() {
        return (EAttribute)getPolylistType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylistType_Material() {
        return (EAttribute)getPolylistType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylistType_Name() {
        return (EAttribute)getPolylistType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimaryType() {
		if (primaryTypeEClass == null) {
			primaryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(617);
		}
		return primaryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimaryType_Ref() {
        return (EAttribute)getPrimaryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimaryType1() {
		if (primaryType1EClass == null) {
			primaryType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(618);
		}
		return primaryType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimaryType1_Order() {
        return (EAttribute)getPrimaryType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimaryType1_Ref() {
        return (EAttribute)getPrimaryType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfileCGType() {
		if (profileCGTypeEClass == null) {
			profileCGTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(619);
		}
		return profileCGTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileCGType_Asset() {
        return (EReference)getProfileCGType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileCGType_Group() {
        return (EAttribute)getProfileCGType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileCGType_Code() {
        return (EReference)getProfileCGType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileCGType_Include() {
        return (EReference)getProfileCGType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileCGType_Group1() {
        return (EAttribute)getProfileCGType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileCGType_Image() {
        return (EReference)getProfileCGType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileCGType_Newparam() {
        return (EReference)getProfileCGType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileCGType_Technique() {
        return (EReference)getProfileCGType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileCGType_Extra() {
        return (EReference)getProfileCGType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileCGType_Id() {
        return (EAttribute)getProfileCGType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileCGType_Platform() {
        return (EAttribute)getProfileCGType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfileCOMMONType() {
		if (profileCOMMONTypeEClass == null) {
			profileCOMMONTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(620);
		}
		return profileCOMMONTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileCOMMONType_Asset() {
        return (EReference)getProfileCOMMONType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileCOMMONType_Group() {
        return (EAttribute)getProfileCOMMONType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileCOMMONType_Image() {
        return (EReference)getProfileCOMMONType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileCOMMONType_Newparam() {
        return (EReference)getProfileCOMMONType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileCOMMONType_Technique() {
        return (EReference)getProfileCOMMONType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileCOMMONType_Extra() {
        return (EReference)getProfileCOMMONType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileCOMMONType_Id() {
        return (EAttribute)getProfileCOMMONType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfileGLESType() {
		if (profileGLESTypeEClass == null) {
			profileGLESTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(621);
		}
		return profileGLESTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileGLESType_Asset() {
        return (EReference)getProfileGLESType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileGLESType_Group() {
        return (EAttribute)getProfileGLESType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileGLESType_Image() {
        return (EReference)getProfileGLESType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileGLESType_Newparam() {
        return (EReference)getProfileGLESType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileGLESType_Technique() {
        return (EReference)getProfileGLESType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileGLESType_Extra() {
        return (EReference)getProfileGLESType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileGLESType_Id() {
        return (EAttribute)getProfileGLESType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileGLESType_Platform() {
        return (EAttribute)getProfileGLESType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfileGLSLType() {
		if (profileGLSLTypeEClass == null) {
			profileGLSLTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(622);
		}
		return profileGLSLTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileGLSLType_Asset() {
        return (EReference)getProfileGLSLType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileGLSLType_Group() {
        return (EAttribute)getProfileGLSLType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileGLSLType_Code() {
        return (EReference)getProfileGLSLType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileGLSLType_Include() {
        return (EReference)getProfileGLSLType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileGLSLType_Group1() {
        return (EAttribute)getProfileGLSLType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileGLSLType_Image() {
        return (EReference)getProfileGLSLType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileGLSLType_Newparam() {
        return (EReference)getProfileGLSLType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileGLSLType_Technique() {
        return (EReference)getProfileGLSLType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileGLSLType_Extra() {
        return (EReference)getProfileGLSLType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileGLSLType_Id() {
        return (EAttribute)getProfileGLSLType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectionMatrixType() {
		if (projectionMatrixTypeEClass == null) {
			projectionMatrixTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(623);
		}
		return projectionMatrixTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectionMatrixType_Param() {
        return (EAttribute)getProjectionMatrixType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectionMatrixType_Value() {
        return (EAttribute)getProjectionMatrixType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectionMatrixType1() {
		if (projectionMatrixType1EClass == null) {
			projectionMatrixType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(624);
		}
		return projectionMatrixType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectionMatrixType1_Param() {
        return (EAttribute)getProjectionMatrixType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectionMatrixType1_Value() {
        return (EAttribute)getProjectionMatrixType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefAttachmentType() {
		if (refAttachmentTypeEClass == null) {
			refAttachmentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(625);
		}
		return refAttachmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefAttachmentType_Group() {
        return (EAttribute)getRefAttachmentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefAttachmentType_Translate() {
        return (EReference)getRefAttachmentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefAttachmentType_Rotate() {
        return (EReference)getRefAttachmentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefAttachmentType_Extra() {
        return (EReference)getRefAttachmentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefAttachmentType_RigidBody() {
        return (EAttribute)getRefAttachmentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefType() {
		if (refTypeEClass == null) {
			refTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(626);
		}
		return refTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefType_Param() {
        return (EAttribute)getRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefType_Value() {
        return (EAttribute)getRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefType1() {
		if (refType1EClass == null) {
			refType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(627);
		}
		return refType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefType1_Param() {
        return (EAttribute)getRefType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefType1_Value() {
        return (EAttribute)getRefType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefType2() {
		if (refType2EClass == null) {
			refType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(628);
		}
		return refType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefType2_Param() {
        return (EAttribute)getRefType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefType2_Value() {
        return (EAttribute)getRefType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenderType() {
		if (renderTypeEClass == null) {
			renderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(629);
		}
		return renderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenderType_Layer() {
        return (EAttribute)getRenderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRenderType_InstanceEffect() {
        return (EReference)getRenderType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenderType_CameraNode() {
        return (EAttribute)getRenderType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRescaleNormalEnableType() {
		if (rescaleNormalEnableTypeEClass == null) {
			rescaleNormalEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(630);
		}
		return rescaleNormalEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRescaleNormalEnableType_Param() {
        return (EAttribute)getRescaleNormalEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRescaleNormalEnableType_Value() {
        return (EAttribute)getRescaleNormalEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRescaleNormalEnableType1() {
		if (rescaleNormalEnableType1EClass == null) {
			rescaleNormalEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(631);
		}
		return rescaleNormalEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRescaleNormalEnableType1_Param() {
        return (EAttribute)getRescaleNormalEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRescaleNormalEnableType1_Value() {
        return (EAttribute)getRescaleNormalEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRgbType() {
		if (rgbTypeEClass == null) {
			rgbTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(632);
		}
		return rgbTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRgbType_Param() {
        return (EAttribute)getRgbType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRgbType_Value() {
        return (EAttribute)getRgbType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRigidBodyType() {
		if (rigidBodyTypeEClass == null) {
			rigidBodyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(633);
		}
		return rigidBodyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRigidBodyType_TechniqueCommon() {
        return (EReference)getRigidBodyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRigidBodyType_Technique() {
        return (EReference)getRigidBodyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRigidBodyType_Extra() {
        return (EReference)getRigidBodyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRigidBodyType_Name() {
        return (EAttribute)getRigidBodyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRigidBodyType_Sid() {
        return (EAttribute)getRigidBodyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRigidConstraintType() {
		if (rigidConstraintTypeEClass == null) {
			rigidConstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(634);
		}
		return rigidConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRigidConstraintType_RefAttachment() {
        return (EReference)getRigidConstraintType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRigidConstraintType_Attachment() {
        return (EReference)getRigidConstraintType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRigidConstraintType_TechniqueCommon() {
        return (EReference)getRigidConstraintType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRigidConstraintType_Technique() {
        return (EReference)getRigidConstraintType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRigidConstraintType_Extra() {
        return (EReference)getRigidConstraintType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRigidConstraintType_Name() {
        return (EAttribute)getRigidConstraintType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRigidConstraintType_Sid() {
        return (EAttribute)getRigidConstraintType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotateType() {
		if (rotateTypeEClass == null) {
			rotateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(635);
		}
		return rotateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotateType_Value() {
        return (EAttribute)getRotateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotateType_Sid() {
        return (EAttribute)getRotateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampleAlphaToCoverageEnableType() {
		if (sampleAlphaToCoverageEnableTypeEClass == null) {
			sampleAlphaToCoverageEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(636);
		}
		return sampleAlphaToCoverageEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleAlphaToCoverageEnableType_Param() {
        return (EAttribute)getSampleAlphaToCoverageEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleAlphaToCoverageEnableType_Value() {
        return (EAttribute)getSampleAlphaToCoverageEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampleAlphaToCoverageEnableType1() {
		if (sampleAlphaToCoverageEnableType1EClass == null) {
			sampleAlphaToCoverageEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(637);
		}
		return sampleAlphaToCoverageEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleAlphaToCoverageEnableType1_Param() {
        return (EAttribute)getSampleAlphaToCoverageEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleAlphaToCoverageEnableType1_Value() {
        return (EAttribute)getSampleAlphaToCoverageEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampleAlphaToOneEnableType() {
		if (sampleAlphaToOneEnableTypeEClass == null) {
			sampleAlphaToOneEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(638);
		}
		return sampleAlphaToOneEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleAlphaToOneEnableType_Param() {
        return (EAttribute)getSampleAlphaToOneEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleAlphaToOneEnableType_Value() {
        return (EAttribute)getSampleAlphaToOneEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampleAlphaToOneEnableType1() {
		if (sampleAlphaToOneEnableType1EClass == null) {
			sampleAlphaToOneEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(639);
		}
		return sampleAlphaToOneEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleAlphaToOneEnableType1_Param() {
        return (EAttribute)getSampleAlphaToOneEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleAlphaToOneEnableType1_Value() {
        return (EAttribute)getSampleAlphaToOneEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampleCoverageEnableType() {
		if (sampleCoverageEnableTypeEClass == null) {
			sampleCoverageEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(640);
		}
		return sampleCoverageEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleCoverageEnableType_Param() {
        return (EAttribute)getSampleCoverageEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleCoverageEnableType_Value() {
        return (EAttribute)getSampleCoverageEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampleCoverageEnableType1() {
		if (sampleCoverageEnableType1EClass == null) {
			sampleCoverageEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(641);
		}
		return sampleCoverageEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleCoverageEnableType1_Param() {
        return (EAttribute)getSampleCoverageEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleCoverageEnableType1_Value() {
        return (EAttribute)getSampleCoverageEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSamplerType() {
		if (samplerTypeEClass == null) {
			samplerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(642);
		}
		return samplerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSamplerType_Input() {
        return (EReference)getSamplerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSamplerType_Id() {
        return (EAttribute)getSamplerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSceneType() {
		if (sceneTypeEClass == null) {
			sceneTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(643);
		}
		return sceneTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSceneType_InstancePhysicsScene() {
        return (EReference)getSceneType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSceneType_InstanceVisualScene() {
        return (EReference)getSceneType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSceneType_Extra() {
        return (EReference)getSceneType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_Name() {
        return (EAttribute)getSceneType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScissorTestEnableType() {
		if (scissorTestEnableTypeEClass == null) {
			scissorTestEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(644);
		}
		return scissorTestEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScissorTestEnableType_Param() {
        return (EAttribute)getScissorTestEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScissorTestEnableType_Value() {
        return (EAttribute)getScissorTestEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScissorTestEnableType1() {
		if (scissorTestEnableType1EClass == null) {
			scissorTestEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(645);
		}
		return scissorTestEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScissorTestEnableType1_Param() {
        return (EAttribute)getScissorTestEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScissorTestEnableType1_Value() {
        return (EAttribute)getScissorTestEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScissorType() {
		if (scissorTypeEClass == null) {
			scissorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(646);
		}
		return scissorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScissorType_Param() {
        return (EAttribute)getScissorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScissorType_Value() {
        return (EAttribute)getScissorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScissorType1() {
		if (scissorType1EClass == null) {
			scissorType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(647);
		}
		return scissorType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScissorType1_Param() {
        return (EAttribute)getScissorType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScissorType1_Value() {
        return (EAttribute)getScissorType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetparamType() {
		if (setparamTypeEClass == null) {
			setparamTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(648);
		}
		return setparamTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetparamType_Annotate() {
        return (EReference)getSetparamType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Bool() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Bool2() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Bool3() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Bool4() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Int() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Int2() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Int3() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Int4() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Float() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Float2() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Float3() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Float4() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Float1x1() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Float1x2() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Float1x3() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Float1x4() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Float2x1() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Float2x2() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Float2x3() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Float2x4() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Float3x1() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Float3x2() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Float3x3() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Float3x4() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Float4x1() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Float4x2() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Float4x3() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Float4x4() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetparamType_Surface() {
        return (EReference)getSetparamType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetparamType_TexturePipeline() {
        return (EReference)getSetparamType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetparamType_SamplerState() {
        return (EReference)getSetparamType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetparamType_TextureUnit() {
        return (EReference)getSetparamType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Enum() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType_Ref() {
        return (EAttribute)getSetparamType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetparamType1() {
		if (setparamType1EClass == null) {
			setparamType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(649);
		}
		return setparamType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Bool() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Bool2() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Bool3() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Bool4() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Int() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Int2() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Int3() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Int4() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Float() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Float2() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Float3() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Float4() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Float1x1() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Float1x2() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Float1x3() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Float1x4() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Float2x1() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Float2x2() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Float2x3() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Float2x4() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Float3x1() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Float3x2() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Float3x3() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Float3x4() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Float4x1() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Float4x2() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Float4x3() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Float4x4() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetparamType1_Surface() {
        return (EReference)getSetparamType1().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetparamType1_Sampler1D() {
        return (EReference)getSetparamType1().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetparamType1_Sampler2D() {
        return (EReference)getSetparamType1().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetparamType1_Sampler3D() {
        return (EReference)getSetparamType1().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetparamType1_SamplerCUBE() {
        return (EReference)getSetparamType1().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetparamType1_SamplerRECT() {
        return (EReference)getSetparamType1().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetparamType1_SamplerDEPTH() {
        return (EReference)getSetparamType1().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Enum() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetparamType1_Ref() {
        return (EAttribute)getSetparamType1().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShadeModelType() {
		if (shadeModelTypeEClass == null) {
			shadeModelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(650);
		}
		return shadeModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShadeModelType_Param() {
        return (EAttribute)getShadeModelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShadeModelType_Value() {
        return (EAttribute)getShadeModelType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShadeModelType1() {
		if (shadeModelType1EClass == null) {
			shadeModelType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(651);
		}
		return shadeModelType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShadeModelType1_Param() {
        return (EAttribute)getShadeModelType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShadeModelType1_Value() {
        return (EAttribute)getShadeModelType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShaderType() {
		if (shaderTypeEClass == null) {
			shaderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(652);
		}
		return shaderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShaderType_Annotate() {
        return (EReference)getShaderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShaderType_CompilerTarget() {
        return (EReference)getShaderType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShaderType_CompilerOptions() {
        return (EAttribute)getShaderType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShaderType_Name() {
        return (EReference)getShaderType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShaderType_Bind() {
        return (EReference)getShaderType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShaderType_Stage() {
        return (EAttribute)getShaderType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShaderType1() {
		if (shaderType1EClass == null) {
			shaderType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(653);
		}
		return shaderType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShaderType1_Annotate() {
        return (EReference)getShaderType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShaderType1_CompilerTarget() {
        return (EReference)getShaderType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShaderType1_CompilerOptions() {
        return (EAttribute)getShaderType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShaderType1_Name() {
        return (EReference)getShaderType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShaderType1_Bind() {
        return (EReference)getShaderType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShaderType1_Stage() {
        return (EAttribute)getShaderType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeType() {
		if (shapeTypeEClass == null) {
			shapeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(654);
		}
		return shapeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType_Hollow() {
        return (EReference)getShapeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType_Mass() {
        return (EReference)getShapeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType_Density() {
        return (EReference)getShapeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType_InstancePhysicsMaterial() {
        return (EReference)getShapeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType_PhysicsMaterial() {
        return (EReference)getShapeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType_InstanceGeometry() {
        return (EReference)getShapeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType_Plane() {
        return (EReference)getShapeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType_Box() {
        return (EReference)getShapeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType_Sphere() {
        return (EReference)getShapeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType_Cylinder() {
        return (EReference)getShapeType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType_TaperedCylinder() {
        return (EReference)getShapeType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType_Capsule() {
        return (EReference)getShapeType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType_TaperedCapsule() {
        return (EReference)getShapeType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeType_Group() {
        return (EAttribute)getShapeType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType_Translate() {
        return (EReference)getShapeType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType_Rotate() {
        return (EReference)getShapeType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType_Extra() {
        return (EReference)getShapeType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeType1() {
		if (shapeType1EClass == null) {
			shapeType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(655);
		}
		return shapeType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType1_Hollow() {
        return (EReference)getShapeType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType1_Mass() {
        return (EReference)getShapeType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType1_Density() {
        return (EReference)getShapeType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType1_InstancePhysicsMaterial() {
        return (EReference)getShapeType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType1_PhysicsMaterial() {
        return (EReference)getShapeType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType1_InstanceGeometry() {
        return (EReference)getShapeType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType1_Plane() {
        return (EReference)getShapeType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType1_Box() {
        return (EReference)getShapeType1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType1_Sphere() {
        return (EReference)getShapeType1().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType1_Cylinder() {
        return (EReference)getShapeType1().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType1_TaperedCylinder() {
        return (EReference)getShapeType1().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType1_Capsule() {
        return (EReference)getShapeType1().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType1_TaperedCapsule() {
        return (EReference)getShapeType1().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeType1_Group() {
        return (EAttribute)getShapeType1().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType1_Translate() {
        return (EReference)getShapeType1().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType1_Rotate() {
        return (EReference)getShapeType1().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeType1_Extra() {
        return (EReference)getShapeType1().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkewType() {
		if (skewTypeEClass == null) {
			skewTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(656);
		}
		return skewTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkewType_Value() {
        return (EAttribute)getSkewType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkewType_Sid() {
        return (EAttribute)getSkewType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkinType() {
		if (skinTypeEClass == null) {
			skinTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(657);
		}
		return skinTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkinType_BindShapeMatrix() {
        return (EAttribute)getSkinType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkinType_Source() {
        return (EReference)getSkinType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkinType_Joints() {
        return (EReference)getSkinType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkinType_VertexWeights() {
        return (EReference)getSkinType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkinType_Extra() {
        return (EReference)getSkinType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkinType_Source1() {
        return (EAttribute)getSkinType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceType() {
		if (sourceTypeEClass == null) {
			sourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(658);
		}
		return sourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceType_Asset() {
        return (EReference)getSourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceType_IDREFArray() {
        return (EReference)getSourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceType_NameArray() {
        return (EReference)getSourceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceType_BoolArray() {
        return (EReference)getSourceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceType_FloatArray() {
        return (EReference)getSourceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceType_IntArray() {
        return (EReference)getSourceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceType_TechniqueCommon() {
        return (EReference)getSourceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceType_Technique() {
        return (EReference)getSourceType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_Id() {
        return (EAttribute)getSourceType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_Name() {
        return (EAttribute)getSourceType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphereType() {
		if (sphereTypeEClass == null) {
			sphereTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(659);
		}
		return sphereTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphereType_Radius() {
        return (EAttribute)getSphereType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSphereType_Extra() {
        return (EReference)getSphereType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplineType() {
		if (splineTypeEClass == null) {
			splineTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(660);
		}
		return splineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplineType_Source() {
        return (EReference)getSplineType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplineType_ControlVertices() {
        return (EReference)getSplineType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplineType_Extra() {
        return (EReference)getSplineType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSplineType_Closed() {
        return (EAttribute)getSplineType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpotType() {
		if (spotTypeEClass == null) {
			spotTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(661);
		}
		return spotTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpotType_Color() {
        return (EReference)getSpotType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpotType_ConstantAttenuation() {
        return (EReference)getSpotType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpotType_LinearAttenuation() {
        return (EReference)getSpotType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpotType_QuadraticAttenuation() {
        return (EReference)getSpotType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpotType_FalloffAngle() {
        return (EReference)getSpotType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpotType_FalloffExponent() {
        return (EReference)getSpotType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpringType1() {
		if (springType1EClass == null) {
			springType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(663);
		}
		return springType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpringType1_Angular() {
        return (EReference)getSpringType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpringType1_Linear() {
        return (EReference)getSpringType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcAlphaType() {
		if (srcAlphaTypeEClass == null) {
			srcAlphaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(665);
		}
		return srcAlphaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcAlphaType_Param() {
        return (EAttribute)getSrcAlphaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcAlphaType_Value() {
        return (EAttribute)getSrcAlphaType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcRgbType() {
		if (srcRgbTypeEClass == null) {
			srcRgbTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(666);
		}
		return srcRgbTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcRgbType_Param() {
        return (EAttribute)getSrcRgbType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcRgbType_Value() {
        return (EAttribute)getSrcRgbType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcType() {
		if (srcTypeEClass == null) {
			srcTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(667);
		}
		return srcTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcType_Param() {
        return (EAttribute)getSrcType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcType_Value() {
        return (EAttribute)getSrcType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcType1() {
		if (srcType1EClass == null) {
			srcType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(668);
		}
		return srcType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcType1_Param() {
        return (EAttribute)getSrcType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSrcType1_Value() {
        return (EAttribute)getSrcType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStencilFuncSeparateType() {
		if (stencilFuncSeparateTypeEClass == null) {
			stencilFuncSeparateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(669);
		}
		return stencilFuncSeparateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilFuncSeparateType_Front() {
        return (EReference)getStencilFuncSeparateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilFuncSeparateType_Back() {
        return (EReference)getStencilFuncSeparateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilFuncSeparateType_Ref() {
        return (EReference)getStencilFuncSeparateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilFuncSeparateType_Mask() {
        return (EReference)getStencilFuncSeparateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStencilFuncType() {
		if (stencilFuncTypeEClass == null) {
			stencilFuncTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(670);
		}
		return stencilFuncTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilFuncType_Func() {
        return (EReference)getStencilFuncType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilFuncType_Ref() {
        return (EReference)getStencilFuncType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilFuncType_Mask() {
        return (EReference)getStencilFuncType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStencilFuncType1() {
		if (stencilFuncType1EClass == null) {
			stencilFuncType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(671);
		}
		return stencilFuncType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilFuncType1_Func() {
        return (EReference)getStencilFuncType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilFuncType1_Ref() {
        return (EReference)getStencilFuncType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilFuncType1_Mask() {
        return (EReference)getStencilFuncType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStencilMaskSeparateType() {
		if (stencilMaskSeparateTypeEClass == null) {
			stencilMaskSeparateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(672);
		}
		return stencilMaskSeparateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilMaskSeparateType_Face() {
        return (EReference)getStencilMaskSeparateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilMaskSeparateType_Mask() {
        return (EReference)getStencilMaskSeparateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStencilMaskType() {
		if (stencilMaskTypeEClass == null) {
			stencilMaskTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(673);
		}
		return stencilMaskTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStencilMaskType_Param() {
        return (EAttribute)getStencilMaskType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStencilMaskType_Value() {
        return (EAttribute)getStencilMaskType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStencilMaskType1() {
		if (stencilMaskType1EClass == null) {
			stencilMaskType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(674);
		}
		return stencilMaskType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStencilMaskType1_Param() {
        return (EAttribute)getStencilMaskType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStencilMaskType1_Value() {
        return (EAttribute)getStencilMaskType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStencilOpSeparateType() {
		if (stencilOpSeparateTypeEClass == null) {
			stencilOpSeparateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(675);
		}
		return stencilOpSeparateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilOpSeparateType_Face() {
        return (EReference)getStencilOpSeparateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilOpSeparateType_Fail() {
        return (EReference)getStencilOpSeparateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilOpSeparateType_Zfail() {
        return (EReference)getStencilOpSeparateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilOpSeparateType_Zpass() {
        return (EReference)getStencilOpSeparateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStencilOpType() {
		if (stencilOpTypeEClass == null) {
			stencilOpTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(676);
		}
		return stencilOpTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilOpType_Fail() {
        return (EReference)getStencilOpType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilOpType_Zfail() {
        return (EReference)getStencilOpType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilOpType_Zpass() {
        return (EReference)getStencilOpType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStencilOpType1() {
		if (stencilOpType1EClass == null) {
			stencilOpType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(677);
		}
		return stencilOpType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilOpType1_Fail() {
        return (EReference)getStencilOpType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilOpType1_Zfail() {
        return (EReference)getStencilOpType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStencilOpType1_Zpass() {
        return (EReference)getStencilOpType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStencilTestEnableType() {
		if (stencilTestEnableTypeEClass == null) {
			stencilTestEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(678);
		}
		return stencilTestEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStencilTestEnableType_Param() {
        return (EAttribute)getStencilTestEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStencilTestEnableType_Value() {
        return (EAttribute)getStencilTestEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStencilTestEnableType1() {
		if (stencilTestEnableType1EClass == null) {
			stencilTestEnableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(679);
		}
		return stencilTestEnableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStencilTestEnableType1_Param() {
        return (EAttribute)getStencilTestEnableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStencilTestEnableType1_Value() {
        return (EAttribute)getStencilTestEnableType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwingConeAndTwistType() {
		if (swingConeAndTwistTypeEClass == null) {
			swingConeAndTwistTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(681);
		}
		return swingConeAndTwistTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwingConeAndTwistType_Min() {
        return (EReference)getSwingConeAndTwistType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwingConeAndTwistType_Max() {
        return (EReference)getSwingConeAndTwistType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaperedCapsuleType() {
		if (taperedCapsuleTypeEClass == null) {
			taperedCapsuleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(682);
		}
		return taperedCapsuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaperedCapsuleType_Height() {
        return (EAttribute)getTaperedCapsuleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaperedCapsuleType_Radius1() {
        return (EAttribute)getTaperedCapsuleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaperedCapsuleType_Radius2() {
        return (EAttribute)getTaperedCapsuleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaperedCapsuleType_Extra() {
        return (EReference)getTaperedCapsuleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaperedCylinderType() {
		if (taperedCylinderTypeEClass == null) {
			taperedCylinderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(683);
		}
		return taperedCylinderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaperedCylinderType_Height() {
        return (EAttribute)getTaperedCylinderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaperedCylinderType_Radius1() {
        return (EAttribute)getTaperedCylinderType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaperedCylinderType_Radius2() {
        return (EAttribute)getTaperedCylinderType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaperedCylinderType_Extra() {
        return (EReference)getTaperedCylinderType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetableFloat() {
		if (targetableFloatEClass == null) {
			targetableFloatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(684);
		}
		return targetableFloatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetableFloat_Value() {
        return (EAttribute)getTargetableFloat().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetableFloat_Sid() {
        return (EAttribute)getTargetableFloat().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetableFloat3() {
		if (targetableFloat3EClass == null) {
			targetableFloat3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(685);
		}
		return targetableFloat3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetableFloat3_Value() {
        return (EAttribute)getTargetableFloat3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetableFloat3_Sid() {
        return (EAttribute)getTargetableFloat3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetsType() {
		if (targetsTypeEClass == null) {
			targetsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(686);
		}
		return targetsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetsType_Input() {
        return (EReference)getTargetsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetsType_Extra() {
        return (EReference)getTargetsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechniqueCommonType() {
		if (techniqueCommonTypeEClass == null) {
			techniqueCommonTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(687);
		}
		return techniqueCommonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType_Enabled() {
        return (EReference)getTechniqueCommonType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType_Interpenetrate() {
        return (EReference)getTechniqueCommonType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType_Limits() {
        return (EReference)getTechniqueCommonType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType_Spring() {
        return (EReference)getTechniqueCommonType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechniqueCommonType1() {
		if (techniqueCommonType1EClass == null) {
			techniqueCommonType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(688);
		}
		return techniqueCommonType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType1_Dynamic() {
        return (EReference)getTechniqueCommonType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType1_Mass() {
        return (EReference)getTechniqueCommonType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType1_MassFrame() {
        return (EReference)getTechniqueCommonType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType1_Inertia() {
        return (EReference)getTechniqueCommonType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType1_InstancePhysicsMaterial() {
        return (EReference)getTechniqueCommonType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType1_PhysicsMaterial() {
        return (EReference)getTechniqueCommonType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType1_Shape() {
        return (EReference)getTechniqueCommonType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechniqueCommonType2() {
		if (techniqueCommonType2EClass == null) {
			techniqueCommonType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(689);
		}
		return techniqueCommonType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType2_Orthographic() {
        return (EReference)getTechniqueCommonType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType2_Perspective() {
        return (EReference)getTechniqueCommonType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechniqueCommonType3() {
		if (techniqueCommonType3EClass == null) {
			techniqueCommonType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(690);
		}
		return techniqueCommonType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType3_Ambient() {
        return (EReference)getTechniqueCommonType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType3_Directional() {
        return (EReference)getTechniqueCommonType3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType3_Point() {
        return (EReference)getTechniqueCommonType3().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType3_Spot() {
        return (EReference)getTechniqueCommonType3().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechniqueCommonType4() {
		if (techniqueCommonType4EClass == null) {
			techniqueCommonType4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(691);
		}
		return techniqueCommonType4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType4_DynamicFriction() {
        return (EReference)getTechniqueCommonType4().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType4_Restitution() {
        return (EReference)getTechniqueCommonType4().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType4_StaticFriction() {
        return (EReference)getTechniqueCommonType4().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechniqueCommonType5() {
		if (techniqueCommonType5EClass == null) {
			techniqueCommonType5EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(692);
		}
		return techniqueCommonType5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType5_InstanceMaterial() {
        return (EReference)getTechniqueCommonType5().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechniqueCommonType6() {
		if (techniqueCommonType6EClass == null) {
			techniqueCommonType6EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(693);
		}
		return techniqueCommonType6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueCommonType6_AngularVelocity() {
        return (EAttribute)getTechniqueCommonType6().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueCommonType6_Velocity() {
        return (EAttribute)getTechniqueCommonType6().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType6_Dynamic() {
        return (EReference)getTechniqueCommonType6().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType6_Mass() {
        return (EReference)getTechniqueCommonType6().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType6_MassFrame() {
        return (EReference)getTechniqueCommonType6().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType6_Inertia() {
        return (EReference)getTechniqueCommonType6().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType6_InstancePhysicsMaterial() {
        return (EReference)getTechniqueCommonType6().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType6_PhysicsMaterial() {
        return (EReference)getTechniqueCommonType6().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType6_Shape() {
        return (EReference)getTechniqueCommonType6().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechniqueCommonType7() {
		if (techniqueCommonType7EClass == null) {
			techniqueCommonType7EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(694);
		}
		return techniqueCommonType7EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType7_Gravity() {
        return (EReference)getTechniqueCommonType7().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType7_TimeStep() {
        return (EReference)getTechniqueCommonType7().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechniqueCommonType8() {
		if (techniqueCommonType8EClass == null) {
			techniqueCommonType8EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(695);
		}
		return techniqueCommonType8EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueCommonType8_Accessor() {
        return (EReference)getTechniqueCommonType8().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechniqueHintType() {
		if (techniqueHintTypeEClass == null) {
			techniqueHintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(696);
		}
		return techniqueHintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueHintType_Platform() {
        return (EAttribute)getTechniqueHintType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueHintType_Profile() {
        return (EAttribute)getTechniqueHintType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueHintType_Ref() {
        return (EAttribute)getTechniqueHintType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechniqueType() {
		if (techniqueTypeEClass == null) {
			techniqueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(697);
		}
		return techniqueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType_Asset() {
        return (EReference)getTechniqueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType_Annotate() {
        return (EReference)getTechniqueType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueType_Group() {
        return (EAttribute)getTechniqueType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType_Code() {
        return (EReference)getTechniqueType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType_Include() {
        return (EReference)getTechniqueType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueType_Group1() {
        return (EAttribute)getTechniqueType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType_Image() {
        return (EReference)getTechniqueType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType_Newparam() {
        return (EReference)getTechniqueType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType_Setparam() {
        return (EReference)getTechniqueType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType_Pass() {
        return (EReference)getTechniqueType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType_Extra() {
        return (EReference)getTechniqueType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueType_Id() {
        return (EAttribute)getTechniqueType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueType_Sid() {
        return (EAttribute)getTechniqueType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechniqueType1() {
		if (techniqueType1EClass == null) {
			techniqueType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(698);
		}
		return techniqueType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType1_Asset() {
        return (EReference)getTechniqueType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType1_Annotate() {
        return (EReference)getTechniqueType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueType1_Group() {
        return (EAttribute)getTechniqueType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType1_Image() {
        return (EReference)getTechniqueType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType1_Newparam() {
        return (EReference)getTechniqueType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType1_Setparam() {
        return (EReference)getTechniqueType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType1_Pass() {
        return (EReference)getTechniqueType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType1_Extra() {
        return (EReference)getTechniqueType1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueType1_Id() {
        return (EAttribute)getTechniqueType1().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueType1_Sid() {
        return (EAttribute)getTechniqueType1().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechniqueType2() {
		if (techniqueType2EClass == null) {
			techniqueType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(699);
		}
		return techniqueType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType2_Asset() {
        return (EReference)getTechniqueType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueType2_Group() {
        return (EAttribute)getTechniqueType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType2_Image() {
        return (EReference)getTechniqueType2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType2_Newparam() {
        return (EReference)getTechniqueType2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType2_Constant() {
        return (EReference)getTechniqueType2().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType2_Lambert() {
        return (EReference)getTechniqueType2().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType2_Phong() {
        return (EReference)getTechniqueType2().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType2_Blinn() {
        return (EReference)getTechniqueType2().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType2_Extra() {
        return (EReference)getTechniqueType2().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueType2_Id() {
        return (EAttribute)getTechniqueType2().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueType2_Sid() {
        return (EAttribute)getTechniqueType2().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechniqueType3() {
		if (techniqueType3EClass == null) {
			techniqueType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(700);
		}
		return techniqueType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType3_Annotate() {
        return (EReference)getTechniqueType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueType3_Group() {
        return (EAttribute)getTechniqueType3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType3_Code() {
        return (EReference)getTechniqueType3().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType3_Include() {
        return (EReference)getTechniqueType3().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueType3_Group1() {
        return (EAttribute)getTechniqueType3().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType3_Image() {
        return (EReference)getTechniqueType3().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType3_Newparam() {
        return (EReference)getTechniqueType3().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType3_Setparam() {
        return (EReference)getTechniqueType3().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType3_Pass() {
        return (EReference)getTechniqueType3().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechniqueType3_Extra() {
        return (EReference)getTechniqueType3().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueType3_Id() {
        return (EAttribute)getTechniqueType3().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueType3_Sid() {
        return (EAttribute)getTechniqueType3().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechniqueType4() {
		if (techniqueType4EClass == null) {
			techniqueType4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(701);
		}
		return techniqueType4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueType4_Any() {
        return (EAttribute)getTechniqueType4().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechniqueType4_Profile() {
        return (EAttribute)getTechniqueType4().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTexcoordType() {
		if (texcoordTypeEClass == null) {
			texcoordTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(702);
		}
		return texcoordTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexcoordType_Semantic() {
        return (EAttribute)getTexcoordType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTexture1DEnableType() {
		if (texture1DEnableTypeEClass == null) {
			texture1DEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(703);
		}
		return texture1DEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexture1DEnableType_Index() {
        return (EAttribute)getTexture1DEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexture1DEnableType_Param() {
        return (EAttribute)getTexture1DEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexture1DEnableType_Value() {
        return (EAttribute)getTexture1DEnableType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTexture1DType() {
		if (texture1DTypeEClass == null) {
			texture1DTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(704);
		}
		return texture1DTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTexture1DType_Value() {
        return (EReference)getTexture1DType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexture1DType_Param() {
        return (EAttribute)getTexture1DType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexture1DType_Index() {
        return (EAttribute)getTexture1DType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTexture2DEnableType() {
		if (texture2DEnableTypeEClass == null) {
			texture2DEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(705);
		}
		return texture2DEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexture2DEnableType_Index() {
        return (EAttribute)getTexture2DEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexture2DEnableType_Param() {
        return (EAttribute)getTexture2DEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexture2DEnableType_Value() {
        return (EAttribute)getTexture2DEnableType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTexture2DType() {
		if (texture2DTypeEClass == null) {
			texture2DTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(706);
		}
		return texture2DTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTexture2DType_Value() {
        return (EReference)getTexture2DType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexture2DType_Param() {
        return (EAttribute)getTexture2DType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexture2DType_Index() {
        return (EAttribute)getTexture2DType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTexture3DEnableType() {
		if (texture3DEnableTypeEClass == null) {
			texture3DEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(707);
		}
		return texture3DEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexture3DEnableType_Index() {
        return (EAttribute)getTexture3DEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexture3DEnableType_Param() {
        return (EAttribute)getTexture3DEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexture3DEnableType_Value() {
        return (EAttribute)getTexture3DEnableType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTexture3DType() {
		if (texture3DTypeEClass == null) {
			texture3DTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(708);
		}
		return texture3DTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTexture3DType_Value() {
        return (EReference)getTexture3DType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexture3DType_Param() {
        return (EAttribute)getTexture3DType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexture3DType_Index() {
        return (EAttribute)getTexture3DType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextureCUBEEnableType() {
		if (textureCUBEEnableTypeEClass == null) {
			textureCUBEEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(709);
		}
		return textureCUBEEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureCUBEEnableType_Index() {
        return (EAttribute)getTextureCUBEEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureCUBEEnableType_Param() {
        return (EAttribute)getTextureCUBEEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureCUBEEnableType_Value() {
        return (EAttribute)getTextureCUBEEnableType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextureCUBEType() {
		if (textureCUBETypeEClass == null) {
			textureCUBETypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(710);
		}
		return textureCUBETypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextureCUBEType_Value() {
        return (EReference)getTextureCUBEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureCUBEType_Param() {
        return (EAttribute)getTextureCUBEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureCUBEType_Index() {
        return (EAttribute)getTextureCUBEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextureDEPTHEnableType() {
		if (textureDEPTHEnableTypeEClass == null) {
			textureDEPTHEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(711);
		}
		return textureDEPTHEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureDEPTHEnableType_Index() {
        return (EAttribute)getTextureDEPTHEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureDEPTHEnableType_Param() {
        return (EAttribute)getTextureDEPTHEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureDEPTHEnableType_Value() {
        return (EAttribute)getTextureDEPTHEnableType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextureDEPTHType() {
		if (textureDEPTHTypeEClass == null) {
			textureDEPTHTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(712);
		}
		return textureDEPTHTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextureDEPTHType_Value() {
        return (EReference)getTextureDEPTHType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureDEPTHType_Param() {
        return (EAttribute)getTextureDEPTHType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureDEPTHType_Index() {
        return (EAttribute)getTextureDEPTHType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextureEnvColorType() {
		if (textureEnvColorTypeEClass == null) {
			textureEnvColorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(713);
		}
		return textureEnvColorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureEnvColorType_Index() {
        return (EAttribute)getTextureEnvColorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureEnvColorType_Param() {
        return (EAttribute)getTextureEnvColorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureEnvColorType_Value() {
        return (EAttribute)getTextureEnvColorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextureEnvModeType() {
		if (textureEnvModeTypeEClass == null) {
			textureEnvModeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(714);
		}
		return textureEnvModeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureEnvModeType_Index() {
        return (EAttribute)getTextureEnvModeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureEnvModeType_Param() {
        return (EAttribute)getTextureEnvModeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureEnvModeType_Value() {
        return (EAttribute)getTextureEnvModeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTexturePipelineEnableType() {
		if (texturePipelineEnableTypeEClass == null) {
			texturePipelineEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(715);
		}
		return texturePipelineEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexturePipelineEnableType_Param() {
        return (EAttribute)getTexturePipelineEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexturePipelineEnableType_Value() {
        return (EAttribute)getTexturePipelineEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTexturePipelineType() {
		if (texturePipelineTypeEClass == null) {
			texturePipelineTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(716);
		}
		return texturePipelineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTexturePipelineType_Value() {
        return (EReference)getTexturePipelineType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexturePipelineType_Param() {
        return (EAttribute)getTexturePipelineType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextureRECTEnableType() {
		if (textureRECTEnableTypeEClass == null) {
			textureRECTEnableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(717);
		}
		return textureRECTEnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureRECTEnableType_Index() {
        return (EAttribute)getTextureRECTEnableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureRECTEnableType_Param() {
        return (EAttribute)getTextureRECTEnableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureRECTEnableType_Value() {
        return (EAttribute)getTextureRECTEnableType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextureRECTType() {
		if (textureRECTTypeEClass == null) {
			textureRECTTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(718);
		}
		return textureRECTTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextureRECTType_Value() {
        return (EReference)getTextureRECTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureRECTType_Param() {
        return (EAttribute)getTextureRECTType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureRECTType_Index() {
        return (EAttribute)getTextureRECTType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextureType() {
		if (textureTypeEClass == null) {
			textureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(719);
		}
		return textureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextureType_Extra() {
        return (EReference)getTextureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureType_Texcoord() {
        return (EAttribute)getTextureType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureType_Texture() {
        return (EAttribute)getTextureType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrianglesType() {
		if (trianglesTypeEClass == null) {
			trianglesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(721);
		}
		return trianglesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrianglesType_Input() {
        return (EReference)getTrianglesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrianglesType_P() {
        return (EAttribute)getTrianglesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrianglesType_Extra() {
        return (EReference)getTrianglesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrianglesType_Count() {
        return (EAttribute)getTrianglesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrianglesType_Material() {
        return (EAttribute)getTrianglesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrianglesType_Name() {
        return (EAttribute)getTrianglesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrifansType() {
		if (trifansTypeEClass == null) {
			trifansTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(722);
		}
		return trifansTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrifansType_Input() {
        return (EReference)getTrifansType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrifansType_P() {
        return (EAttribute)getTrifansType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrifansType_Extra() {
        return (EReference)getTrifansType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrifansType_Count() {
        return (EAttribute)getTrifansType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrifansType_Material() {
        return (EAttribute)getTrifansType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrifansType_Name() {
        return (EAttribute)getTrifansType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTristripsType() {
		if (tristripsTypeEClass == null) {
			tristripsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(723);
		}
		return tristripsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTristripsType_Input() {
        return (EReference)getTristripsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTristripsType_P() {
        return (EAttribute)getTristripsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTristripsType_Extra() {
        return (EReference)getTristripsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTristripsType_Count() {
        return (EAttribute)getTristripsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTristripsType_Material() {
        return (EAttribute)getTristripsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTristripsType_Name() {
        return (EAttribute)getTristripsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitType() {
		if (unitTypeEClass == null) {
			unitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(725);
		}
		return unitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitType_Meter() {
        return (EAttribute)getUnitType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitType_Name() {
        return (EAttribute)getUnitType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType() {
		if (valueTypeEClass == null) {
			valueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(729);
		}
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_Param() {
        return (EAttribute)getValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_Value() {
        return (EAttribute)getValueType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType1() {
		if (valueType1EClass == null) {
			valueType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(730);
		}
		return valueType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType1_Param() {
        return (EAttribute)getValueType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType1_Value() {
        return (EAttribute)getValueType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertexWeightsType() {
		if (vertexWeightsTypeEClass == null) {
			vertexWeightsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(733);
		}
		return vertexWeightsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertexWeightsType_Input() {
        return (EReference)getVertexWeightsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertexWeightsType_Vcount() {
        return (EAttribute)getVertexWeightsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertexWeightsType_V() {
        return (EAttribute)getVertexWeightsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertexWeightsType_Extra() {
        return (EReference)getVertexWeightsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertexWeightsType_Count() {
        return (EAttribute)getVertexWeightsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerticesType() {
		if (verticesTypeEClass == null) {
			verticesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(734);
		}
		return verticesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerticesType_Input() {
        return (EReference)getVerticesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerticesType_Extra() {
        return (EReference)getVerticesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticesType_Id() {
        return (EAttribute)getVerticesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticesType_Name() {
        return (EAttribute)getVerticesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualSceneType() {
		if (visualSceneTypeEClass == null) {
			visualSceneTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(735);
		}
		return visualSceneTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualSceneType_Asset() {
        return (EReference)getVisualSceneType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualSceneType_Node() {
        return (EReference)getVisualSceneType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualSceneType_EvaluateScene() {
        return (EReference)getVisualSceneType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualSceneType_Extra() {
        return (EReference)getVisualSceneType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualSceneType_Id() {
        return (EAttribute)getVisualSceneType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualSceneType_Name() {
        return (EAttribute)getVisualSceneType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZfailType() {
		if (zfailTypeEClass == null) {
			zfailTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(736);
		}
		return zfailTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZfailType_Param() {
        return (EAttribute)getZfailType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZfailType_Value() {
        return (EAttribute)getZfailType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZfailType1() {
		if (zfailType1EClass == null) {
			zfailType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(737);
		}
		return zfailType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZfailType1_Param() {
        return (EAttribute)getZfailType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZfailType1_Value() {
        return (EAttribute)getZfailType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZfailType2() {
		if (zfailType2EClass == null) {
			zfailType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(738);
		}
		return zfailType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZfailType2_Param() {
        return (EAttribute)getZfailType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZfailType2_Value() {
        return (EAttribute)getZfailType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZpassType() {
		if (zpassTypeEClass == null) {
			zpassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(739);
		}
		return zpassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZpassType_Param() {
        return (EAttribute)getZpassType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZpassType_Value() {
        return (EAttribute)getZpassType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZpassType1() {
		if (zpassType1EClass == null) {
			zpassType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(740);
		}
		return zpassType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZpassType1_Param() {
        return (EAttribute)getZpassType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZpassType1_Value() {
        return (EAttribute)getZpassType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZpassType2() {
		if (zpassType2EClass == null) {
			zpassType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(741);
		}
		return zpassType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZpassType2_Param() {
        return (EAttribute)getZpassType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZpassType2_Value() {
        return (EAttribute)getZpassType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCgPipelineStage() {
		if (cgPipelineStageEEnum == null) {
			cgPipelineStageEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(164);
		}
		return cgPipelineStageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommonProfileInput() {
		if (commonProfileInputEEnum == null) {
			commonProfileInputEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(200);
		}
		return commonProfileInputEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommonProfileParam() {
		if (commonProfileParamEEnum == null) {
			commonProfileParamEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(202);
		}
		return commonProfileParamEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFxModifierEnumCommon() {
		if (fxModifierEnumCommonEEnum == null) {
			fxModifierEnumCommonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(300);
		}
		return fxModifierEnumCommonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFxOpaqueEnum() {
		if (fxOpaqueEnumEEnum == null) {
			fxOpaqueEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(303);
		}
		return fxOpaqueEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFxPipelineStageCommon() {
		if (fxPipelineStageCommonEEnum == null) {
			fxPipelineStageCommonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(305);
		}
		return fxPipelineStageCommonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFxSamplerFilterCommon() {
		if (fxSamplerFilterCommonEEnum == null) {
			fxSamplerFilterCommonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(312);
		}
		return fxSamplerFilterCommonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFxSamplerWrapCommon() {
		if (fxSamplerWrapCommonEEnum == null) {
			fxSamplerWrapCommonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(315);
		}
		return fxSamplerWrapCommonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFxSurfaceFaceEnum() {
		if (fxSurfaceFaceEnumEEnum == null) {
			fxSurfaceFaceEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(319);
		}
		return fxSurfaceFaceEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFxSurfaceFormatHintChannelsEnum() {
		if (fxSurfaceFormatHintChannelsEnumEEnum == null) {
			fxSurfaceFormatHintChannelsEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(321);
		}
		return fxSurfaceFormatHintChannelsEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFxSurfaceFormatHintOptionEnum() {
		if (fxSurfaceFormatHintOptionEnumEEnum == null) {
			fxSurfaceFormatHintOptionEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(324);
		}
		return fxSurfaceFormatHintOptionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFxSurfaceFormatHintPrecisionEnum() {
		if (fxSurfaceFormatHintPrecisionEnumEEnum == null) {
			fxSurfaceFormatHintPrecisionEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(326);
		}
		return fxSurfaceFormatHintPrecisionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFxSurfaceFormatHintRangeEnum() {
		if (fxSurfaceFormatHintRangeEnumEEnum == null) {
			fxSurfaceFormatHintRangeEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(328);
		}
		return fxSurfaceFormatHintRangeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFxSurfaceTypeEnum() {
		if (fxSurfaceTypeEnumEEnum == null) {
			fxSurfaceTypeEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(334);
		}
		return fxSurfaceTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlBlendEquationType() {
		if (glBlendEquationTypeEEnum == null) {
			glBlendEquationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(341);
		}
		return glBlendEquationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlBlendType() {
		if (glBlendTypeEEnum == null) {
			glBlendTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(343);
		}
		return glBlendTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlesSamplerWrap() {
		if (glesSamplerWrapEEnum == null) {
			glesSamplerWrapEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(354);
		}
		return glesSamplerWrapEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlesStencilOpType() {
		if (glesStencilOpTypeEEnum == null) {
			glesStencilOpTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(356);
		}
		return glesStencilOpTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlesTexcombinerOperandAlphaEnums() {
		if (glesTexcombinerOperandAlphaEnumsEEnum == null) {
			glesTexcombinerOperandAlphaEnumsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(364);
		}
		return glesTexcombinerOperandAlphaEnumsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlesTexcombinerOperandRGBEnums() {
		if (glesTexcombinerOperandRGBEnumsEEnum == null) {
			glesTexcombinerOperandRGBEnumsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(366);
		}
		return glesTexcombinerOperandRGBEnumsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlesTexcombinerOperatorAlphaEnums() {
		if (glesTexcombinerOperatorAlphaEnumsEEnum == null) {
			glesTexcombinerOperatorAlphaEnumsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(368);
		}
		return glesTexcombinerOperatorAlphaEnumsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlesTexcombinerOperatorRGBEnums() {
		if (glesTexcombinerOperatorRGBEnumsEEnum == null) {
			glesTexcombinerOperatorRGBEnumsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(370);
		}
		return glesTexcombinerOperatorRGBEnumsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlesTexcombinerSourceEnums() {
		if (glesTexcombinerSourceEnumsEEnum == null) {
			glesTexcombinerSourceEnumsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(372);
		}
		return glesTexcombinerSourceEnumsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlesTexenvModeEnums() {
		if (glesTexenvModeEnumsEEnum == null) {
			glesTexenvModeEnumsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(375);
		}
		return glesTexenvModeEnumsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlFaceType() {
		if (glFaceTypeEEnum == null) {
			glFaceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(380);
		}
		return glFaceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlFogCoordSrcType() {
		if (glFogCoordSrcTypeEEnum == null) {
			glFogCoordSrcTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(382);
		}
		return glFogCoordSrcTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlFogType() {
		if (glFogTypeEEnum == null) {
			glFogTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(384);
		}
		return glFogTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlFrontFaceType() {
		if (glFrontFaceTypeEEnum == null) {
			glFrontFaceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(386);
		}
		return glFrontFaceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlFuncType() {
		if (glFuncTypeEEnum == null) {
			glFuncTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(388);
		}
		return glFuncTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlLightModelColorControlType() {
		if (glLightModelColorControlTypeEEnum == null) {
			glLightModelColorControlTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(390);
		}
		return glLightModelColorControlTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlLogicOpType() {
		if (glLogicOpTypeEEnum == null) {
			glLogicOpTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(392);
		}
		return glLogicOpTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlMaterialType() {
		if (glMaterialTypeEEnum == null) {
			glMaterialTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(394);
		}
		return glMaterialTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlPolygonModeType() {
		if (glPolygonModeTypeEEnum == null) {
			glPolygonModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(399);
		}
		return glPolygonModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlShadeModelType() {
		if (glShadeModelTypeEEnum == null) {
			glShadeModelTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(407);
		}
		return glShadeModelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlslPipelineStage() {
		if (glslPipelineStageEEnum == null) {
			glslPipelineStageEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(433);
		}
		return glslPipelineStageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlStencilOpType() {
		if (glStencilOpTypeEEnum == null) {
			glStencilOpTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(439);
		}
		return glStencilOpTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMorphMethodType() {
		if (morphMethodTypeEEnum == null) {
			morphMethodTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(560);
		}
		return morphMethodTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNodeType() {
		if (nodeTypeEEnum == null) {
			nodeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(571);
		}
		return nodeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpringType() {
		if (springTypeEEnum == null) {
			springTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(662);
		}
		return springTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUpAxisType() {
		if (upAxisTypeEEnum == null) {
			upAxisTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(726);
		}
		return upAxisTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVersionType() {
		if (versionTypeEEnum == null) {
			versionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(731);
		}
		return versionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBool() {
		if (boolEDataType == null) {
			boolEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(31);
		}
		return boolEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBool2() {
		if (bool2EDataType == null) {
			bool2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(32);
		}
		return bool2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBool3() {
		if (bool3EDataType == null) {
			bool3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(33);
		}
		return bool3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBool4() {
		if (bool4EDataType == null) {
			bool4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(34);
		}
		return bool4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolObject() {
		if (boolObjectEDataType == null) {
			boolObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(36);
		}
		return boolObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool() {
		if (cgBoolEDataType == null) {
			cgBoolEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(40);
		}
		return cgBoolEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool1() {
		if (cgBool1EDataType == null) {
			cgBool1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(41);
		}
		return cgBool1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool1Object() {
		if (cgBool1ObjectEDataType == null) {
			cgBool1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(42);
		}
		return cgBool1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool1x1() {
		if (cgBool1x1EDataType == null) {
			cgBool1x1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(43);
		}
		return cgBool1x1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool1x2() {
		if (cgBool1x2EDataType == null) {
			cgBool1x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(44);
		}
		return cgBool1x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool1x3() {
		if (cgBool1x3EDataType == null) {
			cgBool1x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(45);
		}
		return cgBool1x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool1x4() {
		if (cgBool1x4EDataType == null) {
			cgBool1x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(46);
		}
		return cgBool1x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool2() {
		if (cgBool2EDataType == null) {
			cgBool2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(47);
		}
		return cgBool2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool2x1() {
		if (cgBool2x1EDataType == null) {
			cgBool2x1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(48);
		}
		return cgBool2x1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool2x2() {
		if (cgBool2x2EDataType == null) {
			cgBool2x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(49);
		}
		return cgBool2x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool2x3() {
		if (cgBool2x3EDataType == null) {
			cgBool2x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(50);
		}
		return cgBool2x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool2x4() {
		if (cgBool2x4EDataType == null) {
			cgBool2x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(51);
		}
		return cgBool2x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool3() {
		if (cgBool3EDataType == null) {
			cgBool3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(52);
		}
		return cgBool3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool3x1() {
		if (cgBool3x1EDataType == null) {
			cgBool3x1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(53);
		}
		return cgBool3x1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool3x2() {
		if (cgBool3x2EDataType == null) {
			cgBool3x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(54);
		}
		return cgBool3x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool3x3() {
		if (cgBool3x3EDataType == null) {
			cgBool3x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(55);
		}
		return cgBool3x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool3x4() {
		if (cgBool3x4EDataType == null) {
			cgBool3x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(56);
		}
		return cgBool3x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool4() {
		if (cgBool4EDataType == null) {
			cgBool4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(57);
		}
		return cgBool4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool4x1() {
		if (cgBool4x1EDataType == null) {
			cgBool4x1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(58);
		}
		return cgBool4x1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool4x2() {
		if (cgBool4x2EDataType == null) {
			cgBool4x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(59);
		}
		return cgBool4x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool4x3() {
		if (cgBool4x3EDataType == null) {
			cgBool4x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(60);
		}
		return cgBool4x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBool4x4() {
		if (cgBool4x4EDataType == null) {
			cgBool4x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(61);
		}
		return cgBool4x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgBoolObject() {
		if (cgBoolObjectEDataType == null) {
			cgBoolObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(62);
		}
		return cgBoolObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed() {
		if (cgFixedEDataType == null) {
			cgFixedEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(64);
		}
		return cgFixedEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed1() {
		if (cgFixed1EDataType == null) {
			cgFixed1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(65);
		}
		return cgFixed1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed1Object() {
		if (cgFixed1ObjectEDataType == null) {
			cgFixed1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(66);
		}
		return cgFixed1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed1x1() {
		if (cgFixed1x1EDataType == null) {
			cgFixed1x1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(67);
		}
		return cgFixed1x1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed1x2() {
		if (cgFixed1x2EDataType == null) {
			cgFixed1x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(68);
		}
		return cgFixed1x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed1x3() {
		if (cgFixed1x3EDataType == null) {
			cgFixed1x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(69);
		}
		return cgFixed1x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed1x4() {
		if (cgFixed1x4EDataType == null) {
			cgFixed1x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(70);
		}
		return cgFixed1x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed2() {
		if (cgFixed2EDataType == null) {
			cgFixed2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(71);
		}
		return cgFixed2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed2x1() {
		if (cgFixed2x1EDataType == null) {
			cgFixed2x1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(72);
		}
		return cgFixed2x1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed2x2() {
		if (cgFixed2x2EDataType == null) {
			cgFixed2x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(73);
		}
		return cgFixed2x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed2x3() {
		if (cgFixed2x3EDataType == null) {
			cgFixed2x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(74);
		}
		return cgFixed2x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed2x4() {
		if (cgFixed2x4EDataType == null) {
			cgFixed2x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(75);
		}
		return cgFixed2x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed3() {
		if (cgFixed3EDataType == null) {
			cgFixed3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(76);
		}
		return cgFixed3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed3x1() {
		if (cgFixed3x1EDataType == null) {
			cgFixed3x1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(77);
		}
		return cgFixed3x1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed3x2() {
		if (cgFixed3x2EDataType == null) {
			cgFixed3x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(78);
		}
		return cgFixed3x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed3x3() {
		if (cgFixed3x3EDataType == null) {
			cgFixed3x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(79);
		}
		return cgFixed3x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed3x4() {
		if (cgFixed3x4EDataType == null) {
			cgFixed3x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(80);
		}
		return cgFixed3x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed4() {
		if (cgFixed4EDataType == null) {
			cgFixed4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(81);
		}
		return cgFixed4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed4x1() {
		if (cgFixed4x1EDataType == null) {
			cgFixed4x1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(82);
		}
		return cgFixed4x1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed4x2() {
		if (cgFixed4x2EDataType == null) {
			cgFixed4x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(83);
		}
		return cgFixed4x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed4x3() {
		if (cgFixed4x3EDataType == null) {
			cgFixed4x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(84);
		}
		return cgFixed4x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixed4x4() {
		if (cgFixed4x4EDataType == null) {
			cgFixed4x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(85);
		}
		return cgFixed4x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFixedObject() {
		if (cgFixedObjectEDataType == null) {
			cgFixedObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(86);
		}
		return cgFixedObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat() {
		if (cgFloatEDataType == null) {
			cgFloatEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(87);
		}
		return cgFloatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat1() {
		if (cgFloat1EDataType == null) {
			cgFloat1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(88);
		}
		return cgFloat1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat1Object() {
		if (cgFloat1ObjectEDataType == null) {
			cgFloat1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(89);
		}
		return cgFloat1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat1x1() {
		if (cgFloat1x1EDataType == null) {
			cgFloat1x1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(90);
		}
		return cgFloat1x1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat1x2() {
		if (cgFloat1x2EDataType == null) {
			cgFloat1x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(91);
		}
		return cgFloat1x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat1x3() {
		if (cgFloat1x3EDataType == null) {
			cgFloat1x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(92);
		}
		return cgFloat1x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat1x4() {
		if (cgFloat1x4EDataType == null) {
			cgFloat1x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(93);
		}
		return cgFloat1x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat2() {
		if (cgFloat2EDataType == null) {
			cgFloat2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(94);
		}
		return cgFloat2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat2x1() {
		if (cgFloat2x1EDataType == null) {
			cgFloat2x1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(95);
		}
		return cgFloat2x1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat2x2() {
		if (cgFloat2x2EDataType == null) {
			cgFloat2x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(96);
		}
		return cgFloat2x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat2x3() {
		if (cgFloat2x3EDataType == null) {
			cgFloat2x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(97);
		}
		return cgFloat2x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat2x4() {
		if (cgFloat2x4EDataType == null) {
			cgFloat2x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(98);
		}
		return cgFloat2x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat3() {
		if (cgFloat3EDataType == null) {
			cgFloat3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(99);
		}
		return cgFloat3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat3x1() {
		if (cgFloat3x1EDataType == null) {
			cgFloat3x1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(100);
		}
		return cgFloat3x1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat3x2() {
		if (cgFloat3x2EDataType == null) {
			cgFloat3x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(101);
		}
		return cgFloat3x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat3x3() {
		if (cgFloat3x3EDataType == null) {
			cgFloat3x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(102);
		}
		return cgFloat3x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat3x4() {
		if (cgFloat3x4EDataType == null) {
			cgFloat3x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(103);
		}
		return cgFloat3x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat4() {
		if (cgFloat4EDataType == null) {
			cgFloat4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(104);
		}
		return cgFloat4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat4x1() {
		if (cgFloat4x1EDataType == null) {
			cgFloat4x1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(105);
		}
		return cgFloat4x1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat4x2() {
		if (cgFloat4x2EDataType == null) {
			cgFloat4x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(106);
		}
		return cgFloat4x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat4x3() {
		if (cgFloat4x3EDataType == null) {
			cgFloat4x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(107);
		}
		return cgFloat4x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloat4x4() {
		if (cgFloat4x4EDataType == null) {
			cgFloat4x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(108);
		}
		return cgFloat4x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgFloatObject() {
		if (cgFloatObjectEDataType == null) {
			cgFloatObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(109);
		}
		return cgFloatObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf() {
		if (cgHalfEDataType == null) {
			cgHalfEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(110);
		}
		return cgHalfEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf1() {
		if (cgHalf1EDataType == null) {
			cgHalf1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(111);
		}
		return cgHalf1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf1Object() {
		if (cgHalf1ObjectEDataType == null) {
			cgHalf1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(112);
		}
		return cgHalf1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf1x1() {
		if (cgHalf1x1EDataType == null) {
			cgHalf1x1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(113);
		}
		return cgHalf1x1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf1x2() {
		if (cgHalf1x2EDataType == null) {
			cgHalf1x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(114);
		}
		return cgHalf1x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf1x3() {
		if (cgHalf1x3EDataType == null) {
			cgHalf1x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(115);
		}
		return cgHalf1x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf1x4() {
		if (cgHalf1x4EDataType == null) {
			cgHalf1x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(116);
		}
		return cgHalf1x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf2() {
		if (cgHalf2EDataType == null) {
			cgHalf2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(117);
		}
		return cgHalf2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf2x1() {
		if (cgHalf2x1EDataType == null) {
			cgHalf2x1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(118);
		}
		return cgHalf2x1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf2x2() {
		if (cgHalf2x2EDataType == null) {
			cgHalf2x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(119);
		}
		return cgHalf2x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf2x3() {
		if (cgHalf2x3EDataType == null) {
			cgHalf2x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(120);
		}
		return cgHalf2x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf2x4() {
		if (cgHalf2x4EDataType == null) {
			cgHalf2x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(121);
		}
		return cgHalf2x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf3() {
		if (cgHalf3EDataType == null) {
			cgHalf3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(122);
		}
		return cgHalf3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf3x1() {
		if (cgHalf3x1EDataType == null) {
			cgHalf3x1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(123);
		}
		return cgHalf3x1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf3x2() {
		if (cgHalf3x2EDataType == null) {
			cgHalf3x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(124);
		}
		return cgHalf3x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf3x3() {
		if (cgHalf3x3EDataType == null) {
			cgHalf3x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(125);
		}
		return cgHalf3x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf3x4() {
		if (cgHalf3x4EDataType == null) {
			cgHalf3x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(126);
		}
		return cgHalf3x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf4() {
		if (cgHalf4EDataType == null) {
			cgHalf4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(127);
		}
		return cgHalf4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf4x1() {
		if (cgHalf4x1EDataType == null) {
			cgHalf4x1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(128);
		}
		return cgHalf4x1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf4x2() {
		if (cgHalf4x2EDataType == null) {
			cgHalf4x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(129);
		}
		return cgHalf4x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf4x3() {
		if (cgHalf4x3EDataType == null) {
			cgHalf4x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(130);
		}
		return cgHalf4x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalf4x4() {
		if (cgHalf4x4EDataType == null) {
			cgHalf4x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(131);
		}
		return cgHalf4x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgHalfObject() {
		if (cgHalfObjectEDataType == null) {
			cgHalfObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(132);
		}
		return cgHalfObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgIdentifier() {
		if (cgIdentifierEDataType == null) {
			cgIdentifierEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(133);
		}
		return cgIdentifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt() {
		if (cgIntEDataType == null) {
			cgIntEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(134);
		}
		return cgIntEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt1() {
		if (cgInt1EDataType == null) {
			cgInt1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(135);
		}
		return cgInt1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt1Object() {
		if (cgInt1ObjectEDataType == null) {
			cgInt1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(136);
		}
		return cgInt1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt1x1() {
		if (cgInt1x1EDataType == null) {
			cgInt1x1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(137);
		}
		return cgInt1x1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt1x2() {
		if (cgInt1x2EDataType == null) {
			cgInt1x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(138);
		}
		return cgInt1x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt1x3() {
		if (cgInt1x3EDataType == null) {
			cgInt1x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(139);
		}
		return cgInt1x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt1x4() {
		if (cgInt1x4EDataType == null) {
			cgInt1x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(140);
		}
		return cgInt1x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt2() {
		if (cgInt2EDataType == null) {
			cgInt2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(141);
		}
		return cgInt2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt2x1() {
		if (cgInt2x1EDataType == null) {
			cgInt2x1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(142);
		}
		return cgInt2x1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt2x2() {
		if (cgInt2x2EDataType == null) {
			cgInt2x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(143);
		}
		return cgInt2x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt2x3() {
		if (cgInt2x3EDataType == null) {
			cgInt2x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(144);
		}
		return cgInt2x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt2x4() {
		if (cgInt2x4EDataType == null) {
			cgInt2x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(145);
		}
		return cgInt2x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt3() {
		if (cgInt3EDataType == null) {
			cgInt3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(146);
		}
		return cgInt3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt3x1() {
		if (cgInt3x1EDataType == null) {
			cgInt3x1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(147);
		}
		return cgInt3x1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt3x2() {
		if (cgInt3x2EDataType == null) {
			cgInt3x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(148);
		}
		return cgInt3x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt3x3() {
		if (cgInt3x3EDataType == null) {
			cgInt3x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(149);
		}
		return cgInt3x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt3x4() {
		if (cgInt3x4EDataType == null) {
			cgInt3x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(150);
		}
		return cgInt3x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt4() {
		if (cgInt4EDataType == null) {
			cgInt4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(151);
		}
		return cgInt4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt4x1() {
		if (cgInt4x1EDataType == null) {
			cgInt4x1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(152);
		}
		return cgInt4x1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt4x2() {
		if (cgInt4x2EDataType == null) {
			cgInt4x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(153);
		}
		return cgInt4x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt4x3() {
		if (cgInt4x3EDataType == null) {
			cgInt4x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(154);
		}
		return cgInt4x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgInt4x4() {
		if (cgInt4x4EDataType == null) {
			cgInt4x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(155);
		}
		return cgInt4x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgIntObject() {
		if (cgIntObjectEDataType == null) {
			cgIntObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(156);
		}
		return cgIntObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgListOfBool() {
		if (cgListOfBoolEDataType == null) {
			cgListOfBoolEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(157);
		}
		return cgListOfBoolEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgListOfFixed() {
		if (cgListOfFixedEDataType == null) {
			cgListOfFixedEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(158);
		}
		return cgListOfFixedEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgListOfFloat() {
		if (cgListOfFloatEDataType == null) {
			cgListOfFloatEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(159);
		}
		return cgListOfFloatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgListOfHalf() {
		if (cgListOfHalfEDataType == null) {
			cgListOfHalfEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(160);
		}
		return cgListOfHalfEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgListOfInt() {
		if (cgListOfIntEDataType == null) {
			cgListOfIntEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(161);
		}
		return cgListOfIntEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCgPipelineStageObject() {
		if (cgPipelineStageObjectEDataType == null) {
			cgPipelineStageObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(165);
		}
		return cgPipelineStageObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCommonProfileInputObject() {
		if (commonProfileInputObjectEDataType == null) {
			commonProfileInputObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(201);
		}
		return commonProfileInputObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCommonProfileParamObject() {
		if (commonProfileParamObjectEDataType == null) {
			commonProfileParamObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(203);
		}
		return commonProfileParamObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateTime() {
		if (dateTimeEDataType == null) {
			dateTimeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(217);
		}
		return dateTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat() {
		if (floatEDataType == null) {
			floatEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(252);
		}
		return floatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat2() {
		if (float2EDataType == null) {
			float2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(253);
		}
		return float2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat2x2() {
		if (float2x2EDataType == null) {
			float2x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(254);
		}
		return float2x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat2x3() {
		if (float2x3EDataType == null) {
			float2x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(255);
		}
		return float2x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat2x4() {
		if (float2x4EDataType == null) {
			float2x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(256);
		}
		return float2x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat3() {
		if (float3EDataType == null) {
			float3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(257);
		}
		return float3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat3x2() {
		if (float3x2EDataType == null) {
			float3x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(258);
		}
		return float3x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat3x3() {
		if (float3x3EDataType == null) {
			float3x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(259);
		}
		return float3x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat3x4() {
		if (float3x4EDataType == null) {
			float3x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(260);
		}
		return float3x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat4() {
		if (float4EDataType == null) {
			float4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(261);
		}
		return float4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat4x2() {
		if (float4x2EDataType == null) {
			float4x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(262);
		}
		return float4x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat4x3() {
		if (float4x3EDataType == null) {
			float4x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(263);
		}
		return float4x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat4x4() {
		if (float4x4EDataType == null) {
			float4x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(264);
		}
		return float4x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat7() {
		if (float7EDataType == null) {
			float7EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(265);
		}
		return float7EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloatObject() {
		if (floatObjectEDataType == null) {
			floatObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(267);
		}
		return floatObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFxColorCommon() {
		if (fxColorCommonEDataType == null) {
			fxColorCommonEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(295);
		}
		return fxColorCommonEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFxDrawCommon() {
		if (fxDrawCommonEDataType == null) {
			fxDrawCommonEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(298);
		}
		return fxDrawCommonEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFxModifierEnumCommonObject() {
		if (fxModifierEnumCommonObjectEDataType == null) {
			fxModifierEnumCommonObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(301);
		}
		return fxModifierEnumCommonObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFxOpaqueEnumObject() {
		if (fxOpaqueEnumObjectEDataType == null) {
			fxOpaqueEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(304);
		}
		return fxOpaqueEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFxPipelineStageCommonObject() {
		if (fxPipelineStageCommonObjectEDataType == null) {
			fxPipelineStageCommonObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(306);
		}
		return fxPipelineStageCommonObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFxSamplerFilterCommonObject() {
		if (fxSamplerFilterCommonObjectEDataType == null) {
			fxSamplerFilterCommonObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(313);
		}
		return fxSamplerFilterCommonObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFxSamplerWrapCommonObject() {
		if (fxSamplerWrapCommonObjectEDataType == null) {
			fxSamplerWrapCommonObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(316);
		}
		return fxSamplerWrapCommonObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFxSurfaceFaceEnumObject() {
		if (fxSurfaceFaceEnumObjectEDataType == null) {
			fxSurfaceFaceEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(320);
		}
		return fxSurfaceFaceEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFxSurfaceFormatHintChannelsEnumObject() {
		if (fxSurfaceFormatHintChannelsEnumObjectEDataType == null) {
			fxSurfaceFormatHintChannelsEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(322);
		}
		return fxSurfaceFormatHintChannelsEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFxSurfaceFormatHintOptionEnumObject() {
		if (fxSurfaceFormatHintOptionEnumObjectEDataType == null) {
			fxSurfaceFormatHintOptionEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(325);
		}
		return fxSurfaceFormatHintOptionEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFxSurfaceFormatHintPrecisionEnumObject() {
		if (fxSurfaceFormatHintPrecisionEnumObjectEDataType == null) {
			fxSurfaceFormatHintPrecisionEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(327);
		}
		return fxSurfaceFormatHintPrecisionEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFxSurfaceFormatHintRangeEnumObject() {
		if (fxSurfaceFormatHintRangeEnumObjectEDataType == null) {
			fxSurfaceFormatHintRangeEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(329);
		}
		return fxSurfaceFormatHintRangeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFxSurfaceTypeEnumObject() {
		if (fxSurfaceTypeEnumObjectEDataType == null) {
			fxSurfaceTypeEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(335);
		}
		return fxSurfaceTypeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlAlphaValueType() {
		if (glAlphaValueTypeEDataType == null) {
			glAlphaValueTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(339);
		}
		return glAlphaValueTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlAlphaValueTypeObject() {
		if (glAlphaValueTypeObjectEDataType == null) {
			glAlphaValueTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(340);
		}
		return glAlphaValueTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlBlendEquationTypeObject() {
		if (glBlendEquationTypeObjectEDataType == null) {
			glBlendEquationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(342);
		}
		return glBlendEquationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlBlendTypeObject() {
		if (glBlendTypeObjectEDataType == null) {
			glBlendTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(344);
		}
		return glBlendTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlEnumeration() {
		if (glEnumerationEDataType == null) {
			glEnumerationEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(345);
		}
		return glEnumerationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlesEnumeration() {
		if (glesEnumerationEDataType == null) {
			glesEnumerationEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(346);
		}
		return glesEnumerationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGLESMAXCLIPPLANESIndex() {
		if (glesmaxclipplanesIndexEDataType == null) {
			glesmaxclipplanesIndexEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(347);
		}
		return glesmaxclipplanesIndexEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGLESMAXLIGHTSIndex() {
		if (glesmaxlightsIndexEDataType == null) {
			glesmaxlightsIndexEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(348);
		}
		return glesmaxlightsIndexEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGLESMAXTEXTURECOORDSIndex() {
		if (glesmaxtexturecoordsIndexEDataType == null) {
			glesmaxtexturecoordsIndexEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(349);
		}
		return glesmaxtexturecoordsIndexEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGLESMAXTEXTUREIMAGEUNITSIndex() {
		if (glesmaxtextureimageunitsIndexEDataType == null) {
			glesmaxtextureimageunitsIndexEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(350);
		}
		return glesmaxtextureimageunitsIndexEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlesRendertargetCommon() {
		if (glesRendertargetCommonEDataType == null) {
			glesRendertargetCommonEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(352);
		}
		return glesRendertargetCommonEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlesSamplerWrapObject() {
		if (glesSamplerWrapObjectEDataType == null) {
			glesSamplerWrapObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(355);
		}
		return glesSamplerWrapObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlesStencilOpTypeObject() {
		if (glesStencilOpTypeObjectEDataType == null) {
			glesStencilOpTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(357);
		}
		return glesStencilOpTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlesTexcombinerArgumentIndexType() {
		if (glesTexcombinerArgumentIndexTypeEDataType == null) {
			glesTexcombinerArgumentIndexTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(359);
		}
		return glesTexcombinerArgumentIndexTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlesTexcombinerOperandAlphaEnumsObject() {
		if (glesTexcombinerOperandAlphaEnumsObjectEDataType == null) {
			glesTexcombinerOperandAlphaEnumsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(365);
		}
		return glesTexcombinerOperandAlphaEnumsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlesTexcombinerOperandRGBEnumsObject() {
		if (glesTexcombinerOperandRGBEnumsObjectEDataType == null) {
			glesTexcombinerOperandRGBEnumsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(367);
		}
		return glesTexcombinerOperandRGBEnumsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlesTexcombinerOperatorAlphaEnumsObject() {
		if (glesTexcombinerOperatorAlphaEnumsObjectEDataType == null) {
			glesTexcombinerOperatorAlphaEnumsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(369);
		}
		return glesTexcombinerOperatorAlphaEnumsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlesTexcombinerOperatorRGBEnumsObject() {
		if (glesTexcombinerOperatorRGBEnumsObjectEDataType == null) {
			glesTexcombinerOperatorRGBEnumsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(371);
		}
		return glesTexcombinerOperatorRGBEnumsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlesTexcombinerSourceEnumsObject() {
		if (glesTexcombinerSourceEnumsObjectEDataType == null) {
			glesTexcombinerSourceEnumsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(373);
		}
		return glesTexcombinerSourceEnumsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlesTexenvModeEnumsObject() {
		if (glesTexenvModeEnumsObjectEDataType == null) {
			glesTexenvModeEnumsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(376);
		}
		return glesTexenvModeEnumsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlFaceTypeObject() {
		if (glFaceTypeObjectEDataType == null) {
			glFaceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(381);
		}
		return glFaceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlFogCoordSrcTypeObject() {
		if (glFogCoordSrcTypeObjectEDataType == null) {
			glFogCoordSrcTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(383);
		}
		return glFogCoordSrcTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlFogTypeObject() {
		if (glFogTypeObjectEDataType == null) {
			glFogTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(385);
		}
		return glFogTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlFrontFaceTypeObject() {
		if (glFrontFaceTypeObjectEDataType == null) {
			glFrontFaceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(387);
		}
		return glFrontFaceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlFuncTypeObject() {
		if (glFuncTypeObjectEDataType == null) {
			glFuncTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(389);
		}
		return glFuncTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlLightModelColorControlTypeObject() {
		if (glLightModelColorControlTypeObjectEDataType == null) {
			glLightModelColorControlTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(391);
		}
		return glLightModelColorControlTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlLogicOpTypeObject() {
		if (glLogicOpTypeObjectEDataType == null) {
			glLogicOpTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(393);
		}
		return glLogicOpTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlMaterialTypeObject() {
		if (glMaterialTypeObjectEDataType == null) {
			glMaterialTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(395);
		}
		return glMaterialTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGLMAXCLIPPLANESIndex() {
		if (glmaxclipplanesIndexEDataType == null) {
			glmaxclipplanesIndexEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(396);
		}
		return glmaxclipplanesIndexEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGLMAXLIGHTSIndex() {
		if (glmaxlightsIndexEDataType == null) {
			glmaxlightsIndexEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(397);
		}
		return glmaxlightsIndexEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGLMAXTEXTUREIMAGEUNITSIndex() {
		if (glmaxtextureimageunitsIndexEDataType == null) {
			glmaxtextureimageunitsIndexEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(398);
		}
		return glmaxtextureimageunitsIndexEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlPolygonModeTypeObject() {
		if (glPolygonModeTypeObjectEDataType == null) {
			glPolygonModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(400);
		}
		return glPolygonModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlShadeModelTypeObject() {
		if (glShadeModelTypeObjectEDataType == null) {
			glShadeModelTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(408);
		}
		return glShadeModelTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslBool() {
		if (glslBoolEDataType == null) {
			glslBoolEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(409);
		}
		return glslBoolEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslBool2() {
		if (glslBool2EDataType == null) {
			glslBool2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(410);
		}
		return glslBool2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslBool3() {
		if (glslBool3EDataType == null) {
			glslBool3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(411);
		}
		return glslBool3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslBool4() {
		if (glslBool4EDataType == null) {
			glslBool4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(412);
		}
		return glslBool4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslBoolObject() {
		if (glslBoolObjectEDataType == null) {
			glslBoolObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(413);
		}
		return glslBoolObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslFloat() {
		if (glslFloatEDataType == null) {
			glslFloatEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(414);
		}
		return glslFloatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslFloat2() {
		if (glslFloat2EDataType == null) {
			glslFloat2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(415);
		}
		return glslFloat2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslFloat2x2() {
		if (glslFloat2x2EDataType == null) {
			glslFloat2x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(416);
		}
		return glslFloat2x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslFloat3() {
		if (glslFloat3EDataType == null) {
			glslFloat3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(417);
		}
		return glslFloat3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslFloat3x3() {
		if (glslFloat3x3EDataType == null) {
			glslFloat3x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(418);
		}
		return glslFloat3x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslFloat4() {
		if (glslFloat4EDataType == null) {
			glslFloat4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(419);
		}
		return glslFloat4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslFloat4x4() {
		if (glslFloat4x4EDataType == null) {
			glslFloat4x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(420);
		}
		return glslFloat4x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslFloatObject() {
		if (glslFloatObjectEDataType == null) {
			glslFloatObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(421);
		}
		return glslFloatObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslIdentifier() {
		if (glslIdentifierEDataType == null) {
			glslIdentifierEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(422);
		}
		return glslIdentifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslInt() {
		if (glslIntEDataType == null) {
			glslIntEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(423);
		}
		return glslIntEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslInt2() {
		if (glslInt2EDataType == null) {
			glslInt2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(424);
		}
		return glslInt2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslInt3() {
		if (glslInt3EDataType == null) {
			glslInt3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(425);
		}
		return glslInt3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslInt4() {
		if (glslInt4EDataType == null) {
			glslInt4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(426);
		}
		return glslInt4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslIntObject() {
		if (glslIntObjectEDataType == null) {
			glslIntObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(427);
		}
		return glslIntObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslListOfBool() {
		if (glslListOfBoolEDataType == null) {
			glslListOfBoolEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(428);
		}
		return glslListOfBoolEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslListOfFloat() {
		if (glslListOfFloatEDataType == null) {
			glslListOfFloatEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(429);
		}
		return glslListOfFloatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslListOfInt() {
		if (glslListOfIntEDataType == null) {
			glslListOfIntEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(430);
		}
		return glslListOfIntEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlslPipelineStageObject() {
		if (glslPipelineStageObjectEDataType == null) {
			glslPipelineStageObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(434);
		}
		return glslPipelineStageObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlStencilOpTypeObject() {
		if (glStencilOpTypeObjectEDataType == null) {
			glStencilOpTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(440);
		}
		return glStencilOpTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInt() {
		if (intEDataType == null) {
			intEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(457);
		}
		return intEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInt2() {
		if (int2EDataType == null) {
			int2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(458);
		}
		return int2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInt2x2() {
		if (int2x2EDataType == null) {
			int2x2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(459);
		}
		return int2x2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInt3() {
		if (int3EDataType == null) {
			int3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(460);
		}
		return int3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInt3x3() {
		if (int3x3EDataType == null) {
			int3x3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(461);
		}
		return int3x3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInt4() {
		if (int4EDataType == null) {
			int4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(462);
		}
		return int4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInt4x4() {
		if (int4x4EDataType == null) {
			int4x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(463);
		}
		return int4x4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntObject() {
		if (intObjectEDataType == null) {
			intObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(466);
		}
		return intObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListOfBools() {
		if (listOfBoolsEDataType == null) {
			listOfBoolsEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(526);
		}
		return listOfBoolsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListOfFloats() {
		if (listOfFloatsEDataType == null) {
			listOfFloatsEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(527);
		}
		return listOfFloatsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListOfHexBinary() {
		if (listOfHexBinaryEDataType == null) {
			listOfHexBinaryEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(528);
		}
		return listOfHexBinaryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListOfInts() {
		if (listOfIntsEDataType == null) {
			listOfIntsEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(529);
		}
		return listOfIntsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListOfNames() {
		if (listOfNamesEDataType == null) {
			listOfNamesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(530);
		}
		return listOfNamesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListOfTokens() {
		if (listOfTokensEDataType == null) {
			listOfTokensEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(531);
		}
		return listOfTokensEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListOfUInts() {
		if (listOfUIntsEDataType == null) {
			listOfUIntsEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(532);
		}
		return listOfUIntsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMorphMethodTypeObject() {
		if (morphMethodTypeObjectEDataType == null) {
			morphMethodTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(561);
		}
		return morphMethodTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getName_() {
		if (nameEDataType == null) {
			nameEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(565);
		}
		return nameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNodeTypeObject() {
		if (nodeTypeObjectEDataType == null) {
			nodeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(573);
		}
		return nodeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSpringTypeObject() {
		if (springTypeObjectEDataType == null) {
			springTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(664);
		}
		return springTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		if (stringEDataType == null) {
			stringEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(680);
		}
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getToken() {
		if (tokenEDataType == null) {
			tokenEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(720);
		}
		return tokenEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUint() {
		if (uintEDataType == null) {
			uintEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(724);
		}
		return uintEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUpAxisTypeObject() {
		if (upAxisTypeObjectEDataType == null) {
			upAxisTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(727);
		}
		return upAxisTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURIFragmentType() {
		if (uriFragmentTypeEDataType == null) {
			uriFragmentTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(728);
		}
		return uriFragmentTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersionTypeObject() {
		if (versionTypeObjectEDataType == null) {
			versionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI).getEClassifiers().get(732);
		}
		return versionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColladaFactory getColladaFactory() {
		return (ColladaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.khronos.collada." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //ColladaPackageImpl
