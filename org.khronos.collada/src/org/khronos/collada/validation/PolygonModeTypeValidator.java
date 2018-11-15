/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.khronos.collada.FaceType;
import org.khronos.collada.ModeType;

/**
 * A sample validator interface for {@link org.khronos.collada.PolygonModeType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PolygonModeTypeValidator {
	boolean validate();

	boolean validateFace(FaceType value);
	boolean validateMode(ModeType value);
}
