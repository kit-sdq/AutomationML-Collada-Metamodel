/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import java.math.BigInteger;

/**
 * A sample validator interface for {@link org.khronos.collada.LightConstantAttenuationType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LightConstantAttenuationTypeValidator {
	boolean validate();

	boolean validateIndex(BigInteger value);
	boolean validateParam(String value);
	boolean validateValue(double value);
}
