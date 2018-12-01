/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import java.math.BigInteger;

import org.khronos.collada.GlSamplerRECT;

/**
 * A sample validator interface for {@link org.khronos.collada.TextureRECTType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TextureRECTTypeValidator {
	boolean validate();

	boolean validateValue(GlSamplerRECT value);
	boolean validateParam(String value);
	boolean validateIndex(BigInteger value);
}
