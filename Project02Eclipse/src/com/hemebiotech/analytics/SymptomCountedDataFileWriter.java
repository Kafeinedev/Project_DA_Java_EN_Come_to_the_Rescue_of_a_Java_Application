package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Symptom counted data file writer.
 * 
 */
public class SymptomCountedDataFileWriter implements ISymptomCountedDataOutput {

	private String filePath;

	/**
	 * @param filePath a full or partial path to the file to create, if a file
	 *                 already exist it will be overwritten.
	 * 
	 */
	SymptomCountedDataFileWriter(String filePath) {
		this.filePath = filePath;
	}

	public void generateOutput(List<String> countedData) {
		try {
			FileWriter writer = new FileWriter(filePath);
			for (String line : countedData) {
				writer.write(line + '\n');
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
