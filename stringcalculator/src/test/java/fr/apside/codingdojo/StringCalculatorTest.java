package fr.apside.codingdojo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void emptyStringShouldReturnZero() throws Exception {
		
		assertThat(StringCalculator.add("")).isEqualTo(0);
		
	}
	
	@Test
	public void stringWithOneValueShouldReturnThisValue() throws Exception {
		
		assertThat(StringCalculator.add("5")).isEqualTo(5);
		
	}
	
	@Test
	public void stringWithTwoValuesShouldReturnTheSum() throws Exception {
				
		assertThat(StringCalculator.add("2,6")).isEqualTo(8);
		assertThat(StringCalculator.add("2,2")).isEqualTo(4);
	}
	

	@Test
	public void stringWithMultiValuesShouldReturnTheSum() throws Exception {
				
		assertThat(StringCalculator.add("2,6,0")).isEqualTo(8);
		assertThat(StringCalculator.add("2,2,8,10")).isEqualTo(22);
	}

	@Test
	public void stringWithMultiValuesMultiSepShouldReturnTheSum() throws Exception {
				
		assertThat(StringCalculator.add("2,6\n0")).isEqualTo(8);
		assertThat(StringCalculator.add("2\n2,8,10")).isEqualTo(22);
		assertThat(StringCalculator.add("2\n2\n8")).isEqualTo(12);
	}
	
	@Test
	public void stringWithDefineDelimiterShouldReturnTheSum() throws Exception {
				
		assertThat(StringCalculator.add("//;\n2,6;0")).isEqualTo(8);
		assertThat(StringCalculator.add("//apside\n2\n2,8apside10")).isEqualTo(22);
		assertThat(StringCalculator.add("//|\n2|2|8")).isEqualTo(12);
	}
}
