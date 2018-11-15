/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.khronos.collada.ExtraType;
import org.khronos.collada.FxSamplerFilterCommon;
import org.khronos.collada.FxSamplerWrapCommon;

/**
 * A sample validator interface for {@link org.khronos.collada.FxSampler3DCommon}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FxSampler3DCommonValidator {
	boolean validate();

	boolean validateSource(String value);
	boolean validateWrapS(FxSamplerWrapCommon value);
	boolean validateWrapT(FxSamplerWrapCommon value);
	boolean validateWrapP(FxSamplerWrapCommon value);
	boolean validateMinfilter(FxSamplerFilterCommon value);
	boolean validateMagfilter(FxSamplerFilterCommon value);
	boolean validateMipfilter(FxSamplerFilterCommon value);
	boolean validateBorderColor(List<Double> value);
	boolean validateMipmapMaxlevel(short value);
	boolean validateMipmapBias(float value);
	boolean validateExtra(EList<ExtraType> value);
}
