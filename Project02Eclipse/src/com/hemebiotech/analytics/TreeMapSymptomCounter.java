package com.hemebiotech.analytics;

import java.util.TreeMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.ArrayList;

/**
 * TreeMap implementation
 */
public class TreeMapSymptomCounter implements ISymptomDataCounter {

	private TreeMap<String, Integer> symptomData;

	public TreeMapSymptomCounter() {
		symptomData = new TreeMap<String, Integer>();
	}

	public void countSymptoms(List<String> rawData) {
		for (String symptom : rawData) {
			Integer count = symptomData.get(symptom);
			if (count != null) {
				symptomData.put(symptom, count + 1);
			} else {
				symptomData.put(symptom, 1);
			}
		}
	}

	public List<String> getSymptomsCount() {
		ArrayList<String> result = new ArrayList<String>();
		for (Entry<String, Integer> it : symptomData.entrySet()) {
			result.add(it.getKey() + " : " + it.getValue().toString());
		}
		return result;
	}
}
