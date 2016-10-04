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
		return Arrays.asList(string.split(getRegex(string))).stream().filter(s -> !s.isEmpty()).map(Integer::valueOf).reduce(0, (a, b) -> a + b);
	}

	private static String getRegex(String string) {
		String delimiter = ",|\\n|//";
		
		if(string.startsWith("//")) 
			delimiter += "|" + string.replaceFirst("//", "").split("\\n")[0];
		
		return delimiter;
	}

}
