package com.hemebiotech.analytics;

import java.util.TreeMap;

public class AnalyticsCounter {

	static TreeMap<String, Integer> data = new TreeMap<String, Integer>();

	public static void main(String args[]) throws Exception {
		
		new SymptomDataInputRawtxt("symptoms.txt").getInput();
		//new SymptomDataInputOrderedFile("result.out").getInput();
		//new SymptomDataOutputConsole().out();
		new SymptomDataOutputFile().out();
	}
}