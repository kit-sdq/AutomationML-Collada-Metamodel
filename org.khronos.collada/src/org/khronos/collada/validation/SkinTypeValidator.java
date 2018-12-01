/**
 *
 * $Id$
 */
package org.khronos.collada.validation;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.khronos.collada.ExtraType;
import org.khronos.collada.JointsType;
import org.khronos.collada.SourceType;
import org.khronos.collada.VertexWeightsType;

/**
 * A sample validator interface for {@link org.khronos.collada.SkinType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SkinTypeValidator {
	boolean validate();

	boolean validateBindShapeMatrix(List<Double> value);
	boolean validateSource(EList<SourceType> value);
	boolean validateJoints(JointsType value);
	boolean validateVertexWeights(VertexWeightsType value);
	boolean validateExtra(EList<ExtraType> value);
	boolean validateSource1(String value);
}
