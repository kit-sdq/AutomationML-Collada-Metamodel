/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.khronos.collada.AssetType;
import org.khronos.collada.ExtraType;

/**
 * A sample validator interface for {@link org.khronos.collada.ImageType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ImageTypeValidator {
	boolean validate();

	boolean validateAsset(AssetType value);
	boolean validateData(List<byte[]> value);
	boolean validateInitFrom(String value);
	boolean validateExtra(EList<ExtraType> value);
	boolean validateDepth(BigInteger value);
	boolean validateFormat(String value);
	boolean validateHeight(BigInteger value);
	boolean validateId(String value);
	boolean validateName(String value);
	boolean validateWidth(BigInteger value);
}
