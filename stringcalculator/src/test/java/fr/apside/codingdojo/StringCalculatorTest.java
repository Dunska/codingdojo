package fr.apside.codingdojo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

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
	}

	@Test
	public void stringWithNegativeShouldThrowException() throws Exception {
		try {
			StringCalculator.add("1,2,3,-4,5,-6,-7");
			fail("Fail !");
		} catch (NegativeValueException e) {
			assertThat(e).hasMessage("Negatives not allowed: [-4, -6, -7]");
		}
	}

	@Test
	public void stringWithBigNumberShallBeIgnored() throws Exception {
		assertThat(StringCalculator.add("2,6,1001,7")).isEqualTo(15);
	}
}
