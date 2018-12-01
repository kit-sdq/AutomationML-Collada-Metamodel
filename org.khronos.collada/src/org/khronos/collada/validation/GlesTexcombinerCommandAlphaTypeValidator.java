/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.eclipse.emf.common.util.EList;

import org.khronos.collada.GlesTexcombinerArgumentAlphaType;
import org.khronos.collada.GlesTexcombinerOperatorAlphaEnums;

/**
 * A sample validator interface for {@link org.khronos.collada.GlesTexcombinerCommandAlphaType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GlesTexcombinerCommandAlphaTypeValidator {
	boolean validate();

	boolean validateArgument(EList<GlesTexcombinerArgumentAlphaType> value);
	boolean validateOperator(GlesTexcombinerOperatorAlphaEnums value);
	boolean validateScale(float value);
}