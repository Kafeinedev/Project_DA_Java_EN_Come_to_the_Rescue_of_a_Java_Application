package com.hemebiotech.analytics;

import java.util.Map;

final class SymptomDataOutputConsole implements SymptomDataOutput {
	@Override
	public void out() {
		for (Map.Entry<String, Integer> traverse : AnalyticsCounter.data.entrySet()) {
			System.out.println(traverse.getKey() + " : " + traverse.getValue());
		}
	}
}
