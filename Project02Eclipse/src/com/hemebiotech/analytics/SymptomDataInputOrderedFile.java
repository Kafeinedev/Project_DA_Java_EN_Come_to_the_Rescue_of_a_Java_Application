package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

final class SymptomDataInputOrderedFile implements SymptomDataInput {

	private String filePath;

	SymptomDataInputOrderedFile(String path) {
		this.filePath = path;
	}

	@Override
	public void getInput() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line = reader.readLine();

			while (line != null) {
				String[] inputData = line.split(" : ");
				Integer count = AnalyticsCounter.data.get(inputData[0]);
				Integer dataCount;
				if (inputData.length != 2) {
					reader.close();
					throw new IOException("File do not conform formatting\n");
				}
				try {
					dataCount = Integer.parseInt(inputData[1]);
				} catch (NumberFormatException e) {
					dataCount = 0;
					System.err.println("Wrong file format\n");
					e.printStackTrace();
				}

				if (count != null) {
					AnalyticsCounter.data.put(inputData[0], count + dataCount);
				} else {
					AnalyticsCounter.data.put(inputData[0], dataCount);
				}
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
