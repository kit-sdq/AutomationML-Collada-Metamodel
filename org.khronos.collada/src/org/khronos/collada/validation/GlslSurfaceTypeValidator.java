/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.khronos.collada.GeneratorType;

/**
 * A sample validator interface for {@link org.khronos.collada.GlslSurfaceType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GlslSurfaceTypeValidator {
	boolean validate();

	boolean validateGenerator(GeneratorType value);
}
