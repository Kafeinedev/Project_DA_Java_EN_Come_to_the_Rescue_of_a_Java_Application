package com.hemebiotech.analytics;

import java.util.List;

/**
 * Store all symptoms and count their occurrence
 * 
 */

public interface ISymptomDataManager {

	/**
	 * Add a single symptom, and link it to its own count.
	 * 
	 * @param symptom a string containing a single symptom.
	 */
	public void addSingleSymptom(String symptom);

	/**
	 * Add a List of symptoms without removing previously stored data. All symptoms
	 * are linked to their own count.
	 * 
	 * @param rawData a List of String each containing a single symptom.
	 */
	public void addSymptomData(List<String> rawData);

	/**
	 * if no data is available return an empty list.
	 * 
	 * @return an alphabetically ordered List of String containing each a symptom
	 *         and its count, separated by " : ".
	 */
	public List<String> getSymptomData();
}
