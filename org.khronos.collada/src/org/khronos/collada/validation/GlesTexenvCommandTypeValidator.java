/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.khronos.collada.GlesTexenvModeEnums;
import org.khronos.collada.GlesTextureConstantType;

/**
 * A sample validator interface for {@link org.khronos.collada.GlesTexenvCommandType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GlesTexenvCommandTypeValidator {
	boolean validate();

	boolean validateConstant(GlesTextureConstantType value);
	boolean validateOperator(GlesTexenvModeEnums value);
	boolean validateUnit(String value);
}