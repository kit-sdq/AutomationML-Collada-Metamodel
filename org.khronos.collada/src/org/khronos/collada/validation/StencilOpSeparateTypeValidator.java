/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.khronos.collada.FaceType1;
import org.khronos.collada.FailType1;
import org.khronos.collada.ZfailType;
import org.khronos.collada.ZpassType1;

/**
 * A sample validator interface for {@link org.khronos.collada.StencilOpSeparateType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StencilOpSeparateTypeValidator {
	boolean validate();

	boolean validateFace(FaceType1 value);
	boolean validateFail(FailType1 value);
	boolean validateZfail(ZfailType value);
	boolean validateZpass(ZpassType1 value);
}
