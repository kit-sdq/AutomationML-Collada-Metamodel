/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.khronos.collada.GlSampler1D;
import org.khronos.collada.GlSampler2D;
import org.khronos.collada.GlSampler3D;
import org.khronos.collada.GlSamplerCUBE;
import org.khronos.collada.GlSamplerDEPTH;
import org.khronos.collada.GlSamplerRECT;
import org.khronos.collada.GlslSetarrayType;
import org.khronos.collada.GlslSurfaceType;

/**
 * A sample validator interface for {@link org.khronos.collada.GlslSetarrayType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GlslSetarrayTypeValidator {
	boolean validate();

	boolean validateGroup(FeatureMap value);
	boolean validateBool(EList<Boolean> value);
	boolean validateBool2(EList<List> value);
	boolean validateBool3(EList<List> value);
	boolean validateBool4(EList<List> value);
	boolean validateFloat(EList<Float> value);
	boolean validateFloat2(EList<List> value);
	boolean validateFloat3(EList<List> value);
	boolean validateFloat4(EList<List> value);
	boolean validateFloat2x2(EList<List> value);
	boolean validateFloat3x3(EList<List> value);
	boolean validateFloat4x4(EList<List> value);
	boolean validateInt(EList<Integer> value);
	boolean validateInt2(EList<List> value);
	boolean validateInt3(EList<List> value);
	boolean validateInt4(EList<List> value);
	boolean validateSurface(EList<GlslSurfaceType> value);
	boolean validateSampler1D(EList<GlSampler1D> value);
	boolean validateSampler2D(EList<GlSampler2D> value);
	boolean validateSampler3D(EList<GlSampler3D> value);
	boolean validateSamplerCUBE(EList<GlSamplerCUBE> value);
	boolean validateSamplerRECT(EList<GlSamplerRECT> value);
	boolean validateSamplerDEPTH(EList<GlSamplerDEPTH> value);
	boolean validateEnum(EList<Enumerator> value);
	boolean validateArray(EList<GlslSetarrayType> value);
	boolean validateLength(BigInteger value);
}