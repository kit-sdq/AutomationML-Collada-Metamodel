/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.khronos.collada.GlStencilOpType;

/**
 * A sample validator interface for {@link org.khronos.collada.ZpassType2}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ZpassType2Validator {
	boolean validate();

	boolean validateParam(String value);
	boolean validateValue(GlStencilOpType value);
}
