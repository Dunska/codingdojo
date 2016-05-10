package fr.apside.kata.romannumerals;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void zeroShouldReturnEmpty() throws Exception {
		String resultat = RomanNumerals.transform(0);
		assertThat(resultat).isEmpty();
	}

	@Test
	public void oneShouldReturnI() throws Exception {
		String resultat = RomanNumerals.transform(1);
		assertThat(resultat).isEqualTo("I");
	}

	@Test
	public void twoShouldReturnII() throws Exception {
		String resultat = RomanNumerals.transform(2);
		assertThat(resultat).isEqualTo("II");		
	}
	
	@Test
	public void threeShouldReturnIII() throws Exception {
		String resultat = RomanNumerals.transform(3);
		assertThat(resultat).isEqualTo("III");
	}
	
	@Test
	public void fourShouldReturnIV() throws Exception {
		String resultat = RomanNumerals.transform(4);
		assertThat(resultat).isEqualTo("IV");
	}
	
	@Test
	public void fiveShouldReturnV() throws Exception {
		String resultat = RomanNumerals.transform(5);
		assertThat(resultat).isEqualTo("V");
	}
	
	@Test
	public void sixShouldReturnVI() throws Exception {
		String resultat = RomanNumerals.transform(6);
		assertThat(resultat).isEqualTo("VI");
	}
	
	@Test
	public void sevenShouldReturnVII() throws Exception {
		String resultat = RomanNumerals.transform(7);
		assertThat(resultat).isEqualTo("VII");
	}
	
	@Test
	public void eightShouldReturnVIII() throws Exception {
		String resultat = RomanNumerals.transform(8);
		assertThat(resultat).isEqualTo("VIII");
	}
	
	@Test
	public void nineShouldReturnIX() throws Exception {
		String resultat = RomanNumerals.transform(9);
		assertThat(resultat).isEqualTo("IX");
	}
	
	@Test
	public void tenShouldReturnX() throws Exception {
		String resultat = RomanNumerals.transform(10);
		assertThat(resultat).isEqualTo("X");
	}
	
	@Test
	public void twelveShouldReturnXII() throws Exception {
		String resultat = RomanNumerals.transform(12);
		assertThat(resultat).isEqualTo("XII");
	}
	
	@Test
	public void sixteenShouldReturnXVI() throws Exception {
		String resultat = RomanNumerals.transform(16);
		assertThat(resultat).isEqualTo("XVI");
	}
	
	@Test
	public void nineteenShouldReturnXIX() throws Exception {
		String resultat = RomanNumerals.transform(19);
		assertThat(resultat).isEqualTo("XIX");
	}
	
	@Test
	public void twentyShouldReturnXX() throws Exception {
		String resultat = RomanNumerals.transform(20);
		assertThat(resultat).isEqualTo("XX");
	}
	
	@Test
	public void twentyOneShouldReturnXXI() throws Exception {
		String resultat = RomanNumerals.transform(21);
		assertThat(resultat).isEqualTo("XXI");
	}
	
	@Test
	public void twentyfourShouldReturnXXIV() throws Exception {
		String resultat = RomanNumerals.transform(24);
		assertThat(resultat).isEqualTo("XXIV");
	}
	
	@Test
	public void twentysixShouldReturnXXVI() throws Exception {
		String resultat = RomanNumerals.transform(26);
		assertThat(resultat).isEqualTo("XXVI");
	}
	
}
