/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.eclipse.emf.common.util.EList;

import org.khronos.collada.ExtraType;

/**
 * A sample validator interface for {@link org.khronos.collada.InstanceRigidConstraintType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InstanceRigidConstraintTypeValidator {
	boolean validate();

	boolean validateExtra(EList<ExtraType> value);
	boolean validateConstraint(String value);
	boolean validateName(String value);
	boolean validateSid(String value);
}
