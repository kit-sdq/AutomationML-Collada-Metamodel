/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import java.util.List;

/**
 * A sample validator interface for {@link org.khronos.collada.MatrixType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MatrixTypeValidator {
	boolean validate();

	boolean validateValue(List<Double> value);
	boolean validateSid(String value);
}
