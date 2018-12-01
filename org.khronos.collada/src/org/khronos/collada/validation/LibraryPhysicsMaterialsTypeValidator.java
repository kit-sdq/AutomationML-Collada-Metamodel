/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.eclipse.emf.common.util.EList;

import org.khronos.collada.AssetType;
import org.khronos.collada.ExtraType;
import org.khronos.collada.PhysicsMaterialType;

/**
 * A sample validator interface for {@link org.khronos.collada.LibraryPhysicsMaterialsType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LibraryPhysicsMaterialsTypeValidator {
	boolean validate();

	boolean validateAsset(AssetType value);
	boolean validatePhysicsMaterial(EList<PhysicsMaterialType> value);
	boolean validateExtra(EList<ExtraType> value);
	boolean validateId(String value);
	boolean validateName(String value);
}