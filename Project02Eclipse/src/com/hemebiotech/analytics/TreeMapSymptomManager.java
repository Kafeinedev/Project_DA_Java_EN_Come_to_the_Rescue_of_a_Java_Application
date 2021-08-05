package com.hemebiotech.analytics;

import java.util.TreeMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.ArrayList;

/**
 * TreeMap implementation
 */
public class TreeMapSymptomManager implements ISymptomDataManager {

	private TreeMap<String, Integer> symptomData;

	public TreeMapSymptomManager() {
		symptomData = new TreeMap<String, Integer>();
	}

	public void addSingleSymptom(String symptom) {
		Integer count = symptomData.get(symptom);
		if (count != null) {
			symptomData.put(symptom, count + 1);
		} else {
			symptomData.put(symptom, 1);
		}
	}

	public void addSymptomData(List<String> rawData) {
		for (String symptom : rawData) {
			addSingleSymptom(symptom);
		}
	}

	public List<String> getSymptomData() {
		ArrayList<String> result = new ArrayList<String>();
		for (Entry<String, Integer> it : symptomData.entrySet()) {
			result.add(it.getKey() + " : " + it.getValue().toString());
		}
		return result;
	}
}
