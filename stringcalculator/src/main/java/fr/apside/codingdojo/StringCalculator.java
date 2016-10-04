package fr.apside.codingdojo;

public class StringCalculator {


	public static int add(String string) {
		int result = 0;
		if(!string.isEmpty()) {
			result = Integer.valueOf(string);
		}
		return result;
	}

}
