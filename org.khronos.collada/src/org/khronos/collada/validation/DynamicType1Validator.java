/**
 *
 * $Id$
 */
package org.khronos.collada.validation;


/**
 * A sample validator interface for {@link org.khronos.collada.DynamicType1}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DynamicType1Validator {
	boolean validate();

	boolean validateValue(boolean value);
	boolean validateSid(String value);
}
