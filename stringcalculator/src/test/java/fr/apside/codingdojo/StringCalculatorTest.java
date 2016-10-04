package fr.apside.codingdojo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;

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
		
		
	}
	
	
}
