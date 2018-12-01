/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.eclipse.emf.common.util.EList;

import org.khronos.collada.ExtraType;
import org.khronos.collada.TechniqueType4;

/**
 * A sample validator interface for {@link org.khronos.collada.ImagerType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ImagerTypeValidator {
	boolean validate();

	boolean validateTechnique(EList<TechniqueType4> value);
	boolean validateExtra(EList<ExtraType> value);
}