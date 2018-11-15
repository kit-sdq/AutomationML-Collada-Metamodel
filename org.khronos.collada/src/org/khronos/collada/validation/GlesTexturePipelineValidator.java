/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.khronos.collada.ExtraType;
import org.khronos.collada.GlesTexcombinerCommandType;
import org.khronos.collada.GlesTexenvCommandType;

/**
 * A sample validator interface for {@link org.khronos.collada.GlesTexturePipeline}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GlesTexturePipelineValidator {
	boolean validate();

	boolean validateGroup(FeatureMap value);
	boolean validateTexcombiner(EList<GlesTexcombinerCommandType> value);
	boolean validateTexenv(EList<GlesTexenvCommandType> value);
	boolean validateExtra(EList<ExtraType> value);
	boolean validateSid(String value);
}
