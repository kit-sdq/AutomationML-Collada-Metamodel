/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.eclipse.emf.common.util.EList;

import org.khronos.collada.ExtraType;
import org.khronos.collada.InputLocal;

/**
 * A sample validator interface for {@link org.khronos.collada.TargetsType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TargetsTypeValidator {
	boolean validate();

	boolean validateInput(EList<InputLocal> value);
	boolean validateExtra(EList<ExtraType> value);
}
