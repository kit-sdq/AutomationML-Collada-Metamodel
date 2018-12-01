/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.khronos.collada.FuncType;
import org.khronos.collada.MaskType1;
import org.khronos.collada.RefType1;

/**
 * A sample validator interface for {@link org.khronos.collada.StencilFuncType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StencilFuncTypeValidator {
	boolean validate();

	boolean validateFunc(FuncType value);
	boolean validateRef(RefType1 value);
	boolean validateMask(MaskType1 value);
}