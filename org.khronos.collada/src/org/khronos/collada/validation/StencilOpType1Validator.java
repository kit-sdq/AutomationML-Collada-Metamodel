/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.khronos.collada.FailType2;
import org.khronos.collada.ZfailType2;
import org.khronos.collada.ZpassType2;

/**
 * A sample validator interface for {@link org.khronos.collada.StencilOpType1}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StencilOpType1Validator {
	boolean validate();

	boolean validateFail(FailType2 value);
	boolean validateZfail(ZfailType2 value);
	boolean validateZpass(ZpassType2 value);
}