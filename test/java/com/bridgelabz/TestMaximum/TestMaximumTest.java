package com.bridgelabz.TestMaximum;

import org.junit.Assert;
import org.junit.Test;


public class TestMaximumTest {
	
	@Test
	public void givenThreeInteger_WhenCompared_FirstPositionNumberShouldReturnMaximum()
	{
		TestMaximum testMaximum =  new TestMaximum();
		boolean result = testMaximum.computeFirtsPositionMaximum(9,7,4);
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenThreeInteger_WhenCompared_SecondNumberPositionShouldReturnMaximum()
	{
		TestMaximum testMaximum =  new TestMaximum();
		boolean result = testMaximum.computeSecondPositionMaximum(9,12,4);
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenThreeInteger_WhenCompared_ThirdNumberPositionShouldReturnMaximum()
	{
		TestMaximum testMaximum =  new TestMaximum();
		boolean result = testMaximum.computeThirdPositionMaximum(9,7,18);
		Assert.assertEquals(true, result);
	}

}
