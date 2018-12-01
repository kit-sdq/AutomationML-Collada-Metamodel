/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.khronos.collada.AssetType;
import org.khronos.collada.ExtraType;
import org.khronos.collada.FxCodeProfile;
import org.khronos.collada.FxIncludeCommon;
import org.khronos.collada.GlslNewparam;
import org.khronos.collada.ImageType;
import org.khronos.collada.TechniqueType3;

/**
 * A sample validator interface for {@link org.khronos.collada.ProfileGLSLType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ProfileGLSLTypeValidator {
	boolean validate();

	boolean validateAsset(AssetType value);
	boolean validateGroup(FeatureMap value);
	boolean validateCode(EList<FxCodeProfile> value);
	boolean validateInclude(EList<FxIncludeCommon> value);
	boolean validateGroup1(FeatureMap value);
	boolean validateImage(EList<ImageType> value);
	boolean validateNewparam(EList<GlslNewparam> value);
	boolean validateTechnique(EList<TechniqueType3> value);
	boolean validateExtra(EList<ExtraType> value);
	boolean validateId(String value);
}
