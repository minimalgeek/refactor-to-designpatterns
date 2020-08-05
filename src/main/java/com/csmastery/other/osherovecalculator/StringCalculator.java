package com.csmastery.other.osherovecalculator;

import java.util.Arrays;

public class StringCalculator {

	private NegativeExtractor extractor;

	public StringCalculator() {
		this.extractor = new DashDashExtractor();
		this.extractor.setNext(new DashExtractor());
	}

	public int calculate(String nums) throws Exception {
		if (!this.extractor.extract(nums).isEmpty()) {
			throw new Exception("negatives not allowed: " + String.join(", ", this.extractor.extract(nums)));
		}
		return Arrays.stream(nums.split("\\D+")).filter(c -> c.length() > 0).mapToInt(Integer::parseInt).sum();
	}

}
