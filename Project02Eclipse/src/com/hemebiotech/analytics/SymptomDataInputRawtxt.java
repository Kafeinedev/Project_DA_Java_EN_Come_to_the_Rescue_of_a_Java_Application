package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

final class SymptomDataInputRawtxt implements SymptomDataInput {

	private String filePath;

	SymptomDataInputRawtxt(String path) {
		this.filePath = path;
	}

	@Override
	public void getInput() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line = reader.readLine();

			while (line != null) {
				Integer count = AnalyticsCounter.data.get(line);
				if (count != null) {
					AnalyticsCounter.data.put(line, count + 1);
				} else {
					AnalyticsCounter.data.put(line, 1);
				}
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
