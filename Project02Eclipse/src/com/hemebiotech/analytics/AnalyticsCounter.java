package com.hemebiotech.analytics;

public class AnalyticsCounter {
	public static void main(String args[]) {
		ISymptomReader input = new ReadSymptomDataFromFile("symptoms.txt");

		ISymptomDataCounter symptomCounter = new TreeMapSymptomCounter();

		symptomCounter.countSymptoms(input.getSymptoms());

		input = null;

		SymptomDataFileWriter.createOutputFile(symptomCounter.getSymptomsCount(), "result.out");
	}
}