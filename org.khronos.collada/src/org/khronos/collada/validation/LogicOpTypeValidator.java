/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.khronos.collada.GlLogicOpType;

/**
 * A sample validator interface for {@link org.khronos.collada.LogicOpType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LogicOpTypeValidator {
	boolean validate();

	boolean validateParam(String value);
	boolean validateValue(GlLogicOpType value);
}
