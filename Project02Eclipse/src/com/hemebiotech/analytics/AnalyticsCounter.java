package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		int headCount = 0;
		int rashCount = 0;
		int dilatedPupilCount = 0;

		try {
			BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
			String line = reader.readLine();

			while (line != null) {
				System.out.println("symptom from file: " + line);
				if (line.equals("headache")) {
					headCount++;
				} else if (line.equals("rash")) {
					rashCount++;
				} else if (line.equals("dialated pupils")) {
					dilatedPupilCount++;
				}

				line = reader.readLine();
			}
			reader.close();

			FileWriter writer = new FileWriter("result.out");
			writer.write("headache: " + headCount + "\n");
			writer.write("rash: " + rashCount + "\n");
			writer.write("dialated pupils: " + dilatedPupilCount + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}