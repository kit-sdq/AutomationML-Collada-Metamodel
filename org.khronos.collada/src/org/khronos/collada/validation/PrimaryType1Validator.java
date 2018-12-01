/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.eclipse.emf.common.util.EList;

import org.khronos.collada.FxSurfaceFaceEnum;

/**
 * A sample validator interface for {@link org.khronos.collada.PrimaryType1}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PrimaryType1Validator {
	boolean validate();

	boolean validateOrder(EList<FxSurfaceFaceEnum> value);
	boolean validateRef(String value);
}