package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.MathTools;

public class MathToolsTest {
	private int numbers[] = { 5, 3, 1, 8, 9, 1, 5 };

	@Test
	public void averageTest() {
		int expected = 4;
		int actual = MathTools.average(numbers);
		assertEquals(expected, actual);
	}

	@Test
	public void greatestTest() {
		int expected = 9;
		int actual = MathTools.greatest(numbers);
		assertEquals(expected, actual);
	}

	@Test
	public void lowestTest() {
		int expected = 1;
		int actual = MathTools.lowest(numbers);
		assertEquals(expected, actual);
	}
}
