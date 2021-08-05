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
	 * @param dataToWrite List of string to write on a file each string will be
	 *                    written on a new line, the list must be ordered
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
		}
	}
}
