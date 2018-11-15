/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.eclipse.emf.common.util.EList;

import org.khronos.collada.ExtraType;
import org.khronos.collada.SetparamType1;
import org.khronos.collada.TechniqueHintType;

/**
 * A sample validator interface for {@link org.khronos.collada.InstanceEffectType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InstanceEffectTypeValidator {
	boolean validate();

	boolean validateTechniqueHint(EList<TechniqueHintType> value);
	boolean validateSetparam(EList<SetparamType1> value);
	boolean validateExtra(EList<ExtraType> value);
	boolean validateName(String value);
	boolean validateSid(String value);
	boolean validateUrl(String value);
}
