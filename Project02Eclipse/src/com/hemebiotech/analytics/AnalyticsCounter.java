package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;
import java.util.Map;

public class AnalyticsCounter {

	static TreeMap<String, Integer> data = new TreeMap<String, Integer>();

	public static void main(String args[]) throws Exception {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
			String line = reader.readLine();

			while (line != null) {
				Integer count = data.get(line);
				if (count != null) {
					data.put(line, count + 1);
				} else {
					data.put(line, 1);
				}
				line = reader.readLine();
			}
			reader.close();

			FileWriter writer = new FileWriter("result.out");
			for (Map.Entry<String, Integer> traverse : data.entrySet()) {
				writer.write(traverse.getKey() + ' ' + traverse.getValue() + '\n');
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}