package fr.apside.codingdojo;

public class StringCalculator {


	public static int add(String string) {
		int result = 0;
		if(!string.isEmpty()) {
			result = sumString(string);
		}
		
		return result;
	}

	private static int sumString(String string) {
		int result;
		result = Integer.valueOf(string);
		return result;
	}

}
