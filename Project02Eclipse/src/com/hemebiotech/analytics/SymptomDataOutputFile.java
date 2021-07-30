package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;
import java.io.FileWriter;

final class SymptomDataOutputFile implements SymptomDataOutput {
	@Override
	public void out() {
		try {
			FileWriter writer = new FileWriter("result.out");
			for (Map.Entry<String, Integer> traverse : AnalyticsCounter.data.entrySet()) {
				writer.write(traverse.getKey() + " : " + traverse.getValue() + '\n');
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
