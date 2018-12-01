/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.eclipse.emf.common.util.EList;

import org.khronos.collada.InputLocal;

/**
 * A sample validator interface for {@link org.khronos.collada.SamplerType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SamplerTypeValidator {
	boolean validate();

	boolean validateInput(EList<InputLocal> value);
	boolean validateId(String value);
}