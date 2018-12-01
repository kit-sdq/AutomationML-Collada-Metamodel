/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.khronos.collada.LinearType1;
import org.khronos.collada.SwingConeAndTwistType;

/**
 * A sample validator interface for {@link org.khronos.collada.LimitsType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LimitsTypeValidator {
	boolean validate();

	boolean validateSwingConeAndTwist(SwingConeAndTwistType value);
	boolean validateLinear(LinearType1 value);
}