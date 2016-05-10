package fr.apside.kata.romannumerals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class RomanNumerals {

	private static final int FIFTEEN = 50;
	private static final int ONE = 1;
	private static final int FIVE = 5;
	private static final int TEN = 10;
	private static Map<Integer, String> aMap;
    static {
    	aMap = new HashMap<>();
        aMap.put(ONE, "I");
        aMap.put(FIVE, "V");
        aMap.put(TEN, "X");
        aMap.put(FIFTEEN, "L");
    }
/*
 * 1 : I	5 : V	10 : X	50 : L	100 : C	500 : D	1000 : M
 */
	public static String transform(int valeur) {
		if (valeur <= 3) {
			return generateIs(valeur);
		} else if (valeur < FIVE) {
			return transform(FIVE-valeur) + aMap.get(FIVE);
		} else if (valeur < TEN - ONE ) {
			return aMap.get(FIVE) + transform(valeur - FIVE);
		} else if (valeur < TEN) {
			return transform(TEN-valeur) + aMap.get(TEN);
		} else if (valeur < FIFTEEN - TEN - ONE) {
			return aMap.get(TEN) + transform(valeur - TEN);			
		}
		return null;
	}

	private static String generateIs(int valeur) {
		String result = "";
		for (int i = 0; i < valeur; i++) {
			result += aMap.get(ONE);
		}
		return result;
	}
}