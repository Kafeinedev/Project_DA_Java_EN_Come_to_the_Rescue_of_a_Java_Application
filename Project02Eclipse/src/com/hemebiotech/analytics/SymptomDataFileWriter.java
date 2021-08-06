package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Symptom data file writer.
 * 
 */
public class SymptomDataFileWriter {

	/**
	 * @param dataToWrite List of string containing a symptom and its count
	 *                    separated by a delimiter. The list must be alphabetically
	 *                    ordered by the symptoms.
	 * 
	 * @param filePath    Path of the file to create if a file already exist it will
	 *                    be overwritten
	 */
	public static void createOutputFile(List<String> dataToWrite, String filePath) {
		try {
			FileWriter writer = new FileWriter(filePath);
			for (String line : dataToWrite) {
				writer.write(line + '\n');
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
}
