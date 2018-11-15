/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.khronos.collada.AlphaFuncType;
import org.khronos.collada.AlphaTestEnableType;
import org.khronos.collada.BlendEnableType;
import org.khronos.collada.BlendFuncType;
import org.khronos.collada.ClearColorType;
import org.khronos.collada.ClearDepthType;
import org.khronos.collada.ClearStencilType;
import org.khronos.collada.ClipPlaneEnableType;
import org.khronos.collada.ClipPlaneType;
import org.khronos.collada.ColorLogicOpEnableType;
import org.khronos.collada.ColorMaskType;
import org.khronos.collada.ColorMaterialEnableType;
import org.khronos.collada.CullFaceEnableType;
import org.khronos.collada.CullFaceType;
import org.khronos.collada.DepthFuncType;
import org.khronos.collada.DepthMaskType;
import org.khronos.collada.DepthRangeType;
import org.khronos.collada.DepthTestEnableType;
import org.khronos.collada.DitherEnableType;
import org.khronos.collada.ExtraType;
import org.khronos.collada.FogColorType;
import org.khronos.collada.FogDensityType;
import org.khronos.collada.FogEnableType;
import org.khronos.collada.FogEndType;
import org.khronos.collada.FogModeType;
import org.khronos.collada.FogStartType;
import org.khronos.collada.FrontFaceType;
import org.khronos.collada.FxAnnotateCommon;
import org.khronos.collada.LightAmbientType;
import org.khronos.collada.LightConstantAttenuationType;
import org.khronos.collada.LightDiffuseType;
import org.khronos.collada.LightEnableType;
import org.khronos.collada.LightLinearAttenutationType;
import org.khronos.collada.LightModelAmbientType;
import org.khronos.collada.LightModelTwoSideEnableType;
import org.khronos.collada.LightPositionType;
import org.khronos.collada.LightQuadraticAttenuationType;
import org.khronos.collada.LightSpecularType;
import org.khronos.collada.LightSpotCutoffType;
import org.khronos.collada.LightSpotDirectionType;
import org.khronos.collada.LightSpotExponentType;
import org.khronos.collada.LightingEnableType;
import org.khronos.collada.LineSmoothEnableType;
import org.khronos.collada.LineWidthType;
import org.khronos.collada.LogicOpType;
import org.khronos.collada.MaterialAmbientType;
import org.khronos.collada.MaterialDiffuseType;
import org.khronos.collada.MaterialEmissionType;
import org.khronos.collada.MaterialShininessType;
import org.khronos.collada.MaterialSpecularType;
import org.khronos.collada.ModelViewMatrixType;
import org.khronos.collada.MultisampleEnableType;
import org.khronos.collada.NormalizeEnableType;
import org.khronos.collada.PointDistanceAttenuationType;
import org.khronos.collada.PointFadeThresholdSizeType;
import org.khronos.collada.PointSizeMaxType;
import org.khronos.collada.PointSizeMinType;
import org.khronos.collada.PointSizeType;
import org.khronos.collada.PointSmoothEnableType;
import org.khronos.collada.PolygonOffsetFillEnableType;
import org.khronos.collada.PolygonOffsetType;
import org.khronos.collada.ProjectionMatrixType;
import org.khronos.collada.RescaleNormalEnableType;
import org.khronos.collada.SampleAlphaToCoverageEnableType;
import org.khronos.collada.SampleAlphaToOneEnableType;
import org.khronos.collada.SampleCoverageEnableType;
import org.khronos.collada.ScissorTestEnableType;
import org.khronos.collada.ScissorType;
import org.khronos.collada.ShadeModelType;
import org.khronos.collada.StencilFuncType;
import org.khronos.collada.StencilMaskType;
import org.khronos.collada.StencilOpType;
import org.khronos.collada.StencilTestEnableType;
import org.khronos.collada.TexturePipelineEnableType;
import org.khronos.collada.TexturePipelineType;

/**
 * A sample validator interface for {@link org.khronos.collada.PassType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PassTypeValidator {
	boolean validate();

	boolean validateAnnotate(EList<FxAnnotateCommon> value);
	boolean validateColorTarget(String value);
	boolean validateDepthTarget(String value);
	boolean validateStencilTarget(String value);
	boolean validateColorClear(List<Double> value);
	boolean validateDepthClear(double value);
	boolean validateStencilClear(byte value);
	boolean validateDraw(String value);
	boolean validateGlesPipelineSettings(FeatureMap value);
	boolean validateAlphaFunc(EList<AlphaFuncType> value);
	boolean validateBlendFunc(EList<BlendFuncType> value);
	boolean validateClearColor(EList<ClearColorType> value);
	boolean validateClearStencil(EList<ClearStencilType> value);
	boolean validateClearDepth(EList<ClearDepthType> value);
	boolean validateClipPlane(EList<ClipPlaneType> value);
	boolean validateColorMask(EList<ColorMaskType> value);
	boolean validateCullFace(EList<CullFaceType> value);
	boolean validateDepthFunc(EList<DepthFuncType> value);
	boolean validateDepthMask(EList<DepthMaskType> value);
	boolean validateDepthRange(EList<DepthRangeType> value);
	boolean validateFogColor(EList<FogColorType> value);
	boolean validateFogDensity(EList<FogDensityType> value);
	boolean validateFogMode(EList<FogModeType> value);
	boolean validateFogStart(EList<FogStartType> value);
	boolean validateFogEnd(EList<FogEndType> value);
	boolean validateFrontFace(EList<FrontFaceType> value);
	boolean validateTexturePipeline(EList<TexturePipelineType> value);
	boolean validateLogicOp(EList<LogicOpType> value);
	boolean validateLightAmbient(EList<LightAmbientType> value);
	boolean validateLightDiffuse(EList<LightDiffuseType> value);
	boolean validateLightSpecular(EList<LightSpecularType> value);
	boolean validateLightPosition(EList<LightPositionType> value);
	boolean validateLightConstantAttenuation(EList<LightConstantAttenuationType> value);
	boolean validateLightLinearAttenutation(EList<LightLinearAttenutationType> value);
	boolean validateLightQuadraticAttenuation(EList<LightQuadraticAttenuationType> value);
	boolean validateLightSpotCutoff(EList<LightSpotCutoffType> value);
	boolean validateLightSpotDirection(EList<LightSpotDirectionType> value);
	boolean validateLightSpotExponent(EList<LightSpotExponentType> value);
	boolean validateLightModelAmbient(EList<LightModelAmbientType> value);
	boolean validateLineWidth(EList<LineWidthType> value);
	boolean validateMaterialAmbient(EList<MaterialAmbientType> value);
	boolean validateMaterialDiffuse(EList<MaterialDiffuseType> value);
	boolean validateMaterialEmission(EList<MaterialEmissionType> value);
	boolean validateMaterialShininess(EList<MaterialShininessType> value);
	boolean validateMaterialSpecular(EList<MaterialSpecularType> value);
	boolean validateModelViewMatrix(EList<ModelViewMatrixType> value);
	boolean validatePointDistanceAttenuation(EList<PointDistanceAttenuationType> value);
	boolean validatePointFadeThresholdSize(EList<PointFadeThresholdSizeType> value);
	boolean validatePointSize(EList<PointSizeType> value);
	boolean validatePointSizeMin(EList<PointSizeMinType> value);
	boolean validatePointSizeMax(EList<PointSizeMaxType> value);
	boolean validatePolygonOffset(EList<PolygonOffsetType> value);
	boolean validateProjectionMatrix(EList<ProjectionMatrixType> value);
	boolean validateScissor(EList<ScissorType> value);
	boolean validateShadeModel(EList<ShadeModelType> value);
	boolean validateStencilFunc(EList<StencilFuncType> value);
	boolean validateStencilMask(EList<StencilMaskType> value);
	boolean validateStencilOp(EList<StencilOpType> value);
	boolean validateAlphaTestEnable(EList<AlphaTestEnableType> value);
	boolean validateBlendEnable(EList<BlendEnableType> value);
	boolean validateClipPlaneEnable(EList<ClipPlaneEnableType> value);
	boolean validateColorLogicOpEnable(EList<ColorLogicOpEnableType> value);
	boolean validateColorMaterialEnable(EList<ColorMaterialEnableType> value);
	boolean validateCullFaceEnable(EList<CullFaceEnableType> value);
	boolean validateDepthTestEnable(EList<DepthTestEnableType> value);
	boolean validateDitherEnable(EList<DitherEnableType> value);
	boolean validateFogEnable(EList<FogEnableType> value);
	boolean validateTexturePipelineEnable(EList<TexturePipelineEnableType> value);
	boolean validateLightEnable(EList<LightEnableType> value);
	boolean validateLightingEnable(EList<LightingEnableType> value);
	boolean validateLightModelTwoSideEnable(EList<LightModelTwoSideEnableType> value);
	boolean validateLineSmoothEnable(EList<LineSmoothEnableType> value);
	boolean validateMultisampleEnable(EList<MultisampleEnableType> value);
	boolean validateNormalizeEnable(EList<NormalizeEnableType> value);
	boolean validatePointSmoothEnable(EList<PointSmoothEnableType> value);
	boolean validatePolygonOffsetFillEnable(EList<PolygonOffsetFillEnableType> value);
	boolean validateRescaleNormalEnable(EList<RescaleNormalEnableType> value);
	boolean validateSampleAlphaToCoverageEnable(EList<SampleAlphaToCoverageEnableType> value);
	boolean validateSampleAlphaToOneEnable(EList<SampleAlphaToOneEnableType> value);
	boolean validateSampleCoverageEnable(EList<SampleCoverageEnableType> value);
	boolean validateScissorTestEnable(EList<ScissorTestEnableType> value);
	boolean validateStencilTestEnable(EList<StencilTestEnableType> value);
	boolean validateExtra(EList<ExtraType> value);
	boolean validateSid(String value);
}
