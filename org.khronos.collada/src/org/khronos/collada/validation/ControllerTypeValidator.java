/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.eclipse.emf.common.util.EList;

import org.khronos.collada.AssetType;
import org.khronos.collada.ExtraType;
import org.khronos.collada.MorphType;
import org.khronos.collada.SkinType;

/**
 * A sample validator interface for {@link org.khronos.collada.ControllerType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ControllerTypeValidator {
	boolean validate();

	boolean validateAsset(AssetType value);
	boolean validateSkin(SkinType value);
	boolean validateMorph(MorphType value);
	boolean validateExtra(EList<ExtraType> value);
	boolean validateId(String value);
	boolean validateName(String value);
}
