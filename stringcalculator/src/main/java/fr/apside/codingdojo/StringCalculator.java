package fr.apside.codingdojo;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringCalculator {

	public static int add(String string) throws NegativeValueException {
		int result = 0;
		if (!string.isEmpty()) {
			result = sumString(string);
		}

		return result;
	}

	private static int sumString(String string) throws NegativeValueException {
		List<Integer> list = Arrays.asList(string.split(getRegex(string))).stream().filter(s -> !s.isEmpty())
				.map(Integer::valueOf).collect(Collectors.toList());
		
		List<Integer> negatives = list.stream().filter(val-> val<0).collect(Collectors.toList());
		
		
		
		if(!negatives.isEmpty()){
			throw new NegativeValueException("Negatives not allowed: "+negatives.toString());//StringJoiner);
		}

		return list.stream().reduce(0, (a, b) -> a + b);
	}

	private static String getRegex(String string) {
		String delimiter = ",|\\n|//";

		if (string.startsWith("//"))
			delimiter += "|" + string.replaceFirst("//", "").split("\\n")[0];

		return delimiter;
	}

}
