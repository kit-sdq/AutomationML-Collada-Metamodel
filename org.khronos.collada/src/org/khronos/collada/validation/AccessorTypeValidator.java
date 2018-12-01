/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.khronos.collada.ParamType4;

/**
 * A sample validator interface for {@link org.khronos.collada.AccessorType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AccessorTypeValidator {
	boolean validate();

	boolean validateParam(EList<ParamType4> value);
	boolean validateCount(BigInteger value);
	boolean validateOffset(BigInteger value);
	boolean validateSource(String value);
	boolean validateStride(BigInteger value);
}