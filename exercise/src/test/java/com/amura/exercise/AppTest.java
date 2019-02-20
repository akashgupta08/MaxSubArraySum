package com.amura.exercise;

import com.amura.exercise.utils.Util;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	String testArr;
	String result;

	protected void setUp() {
		testArr = "-2 1 -3 4 -1 2 1 -5 4";
		result = "Largest SubArray\n" + "Start Index: 3\n" + "Length: 4\n" + "Sum: 6\n" + "Elements: 4 -1 2 1";
	}

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {

		assertEquals(result, Util.printMaxSubArraySum(testArr));
	}
}
