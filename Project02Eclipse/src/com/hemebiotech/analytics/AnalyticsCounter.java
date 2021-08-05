package com.hemebiotech.analytics;

public class AnalyticsCounter {
	public static void main(String args[]) {
		ISymptomDataManager dataManager = new TreeMapSymptomManager();
		
		dataManager.addSymptomData(new ReadSymptomDataFromFile("symptoms.txt").getSymptoms());
		
		SymptomDataFileWriter.createOutputFile(dataManager.getSymptomData(),"result.out");
	}
}