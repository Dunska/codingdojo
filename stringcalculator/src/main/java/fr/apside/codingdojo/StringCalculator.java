package fr.apside.codingdojo;

import java.util.Arrays;

public class StringCalculator {

	public static int add(String string) {
		int result = 0;
		if (!string.isEmpty()) {
			result = sumString(string);
		}

		return result;
	}

	private static int sumString(String string) {
		return Arrays.asList(string.split(",|\\n")).stream().map(Integer::valueOf).reduce(0, (a, b) -> a + b);
	}

}
