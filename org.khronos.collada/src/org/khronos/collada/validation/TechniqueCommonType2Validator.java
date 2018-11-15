/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.khronos.collada.OrthographicType;
import org.khronos.collada.PerspectiveType;

/**
 * A sample validator interface for {@link org.khronos.collada.TechniqueCommonType2}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TechniqueCommonType2Validator {
	boolean validate();

	boolean validateOrthographic(OrthographicType value);
	boolean validatePerspective(PerspectiveType value);
}
