/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.khronos.collada.ExtraType;
import org.khronos.collada.InputLocalOffset;

/**
 * A sample validator interface for {@link org.khronos.collada.PolylistType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PolylistTypeValidator {
	boolean validate();

	boolean validateInput(EList<InputLocalOffset> value);
	boolean validateVcount(List<BigInteger> value);
	boolean validateP(List<BigInteger> value);
	boolean validateExtra(EList<ExtraType> value);
	boolean validateCount(BigInteger value);
	boolean validateMaterial(String value);
	boolean validateName(String value);
}
