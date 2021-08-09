package com.hemebiotech.analytics;

public class AnalyticsCounter {
	public static void main(String args[]) {
		ISymptomReader input = new ReadSymptomDataFromFile("symptoms.txt");

		ISymptomDataCounter symptomCounter = new SymptomDataCounter();

		symptomCounter.countSymptoms(input.getSymptoms());

		ISymptomCountedDataOutput output = new SymptomCountedDataFileWriter("result.out");

		output.generateOutput(symptomCounter.getSymptomsCount());
	}
}