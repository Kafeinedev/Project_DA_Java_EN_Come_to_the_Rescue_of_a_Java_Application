package com.hemebiotech.analytics;

import java.util.List;

/**
 * Anything that will give an output of a List of symptoms with their counts the
 * List must already be sorted alphabetically.
 * 
 */

public interface ISymptomCountedDataOutput {

	/**
	 * @param countedData List of string containing a symptom and its count
	 *                    separated by a delimiter. The list must be alphabetically
	 *                    ordered by the symptoms.
	 * 
	 */

	public void generateOutput(List<String> countedData);
}
