package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SymptomDataFileWriter {
	public static void createOutputFile(List<String> dataToWrite, String filePath) {
		try {
			FileWriter writer = new FileWriter(filePath);
			for (String line : dataToWrite) {
				writer.write(line + '\n');
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
