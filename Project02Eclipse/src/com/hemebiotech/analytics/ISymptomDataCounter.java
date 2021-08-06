package com.hemebiotech.analytics;

import java.util.List;

/**
 * Count the occurrence of symptoms and store the result internally.
 * 
 */

public interface ISymptomDataCounter {

	/**
	 * Count the occurrence of symptom in a List and store the result internally.
	 * This method do not erase previously stored results.
	 * 
	 * @param rawData a List of String each containing a single symptom.
	 */
	public void countSymptoms(List<String> rawData);

	/**
	 * If no data is available return an empty list.
	 * 
	 * @return an alphabetically ordered List of String each containing a symptom
	 *         and its count, separated by a delimiter.
	 */
	public List<String> getSymptomsCount();
}
