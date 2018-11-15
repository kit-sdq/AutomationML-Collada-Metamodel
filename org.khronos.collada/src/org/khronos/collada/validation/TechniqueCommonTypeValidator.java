/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.khronos.collada.EnabledType;
import org.khronos.collada.InterpenetrateType;
import org.khronos.collada.LimitsType;
import org.khronos.collada.SpringType1;

/**
 * A sample validator interface for {@link org.khronos.collada.TechniqueCommonType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TechniqueCommonTypeValidator {
	boolean validate();

	boolean validateEnabled(EnabledType value);
	boolean validateInterpenetrate(InterpenetrateType value);
	boolean validateLimits(LimitsType value);
	boolean validateSpring(SpringType1 value);
}
