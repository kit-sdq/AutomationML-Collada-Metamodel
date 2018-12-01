/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.khronos.collada.ExtraType;
import org.khronos.collada.RotateType;
import org.khronos.collada.TargetableFloat3;

/**
 * A sample validator interface for {@link org.khronos.collada.AttachmentType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AttachmentTypeValidator {
	boolean validate();

	boolean validateGroup(FeatureMap value);
	boolean validateTranslate(EList<TargetableFloat3> value);
	boolean validateRotate(EList<RotateType> value);
	boolean validateExtra(EList<ExtraType> value);
	boolean validateRigidBody(String value);
}