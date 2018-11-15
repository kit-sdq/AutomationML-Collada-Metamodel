/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.khronos.collada.GlesTexcombinerCommandAlphaType;
import org.khronos.collada.GlesTexcombinerCommandRGBType;
import org.khronos.collada.GlesTextureConstantType;

/**
 * A sample validator interface for {@link org.khronos.collada.GlesTexcombinerCommandType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GlesTexcombinerCommandTypeValidator {
	boolean validate();

	boolean validateConstant(GlesTextureConstantType value);
	boolean validateRGB(GlesTexcombinerCommandRGBType value);
	boolean validateAlpha(GlesTexcombinerCommandAlphaType value);
}
