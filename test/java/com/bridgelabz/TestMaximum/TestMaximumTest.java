package com.bridgelabz.TestMaximum;

import org.junit.Assert;
import org.junit.Test;


public class TestMaximumTest {
	
	@Test
	//TC 1.1
	public void givenThreeInteger_WhenCompared_FirstPositionNumberShouldReturnMaximum()
	{
		TestMaximum testMaximum =  new TestMaximum();
		boolean result = testMaximum.computeFirtsPositionIntegerMaximum(9,7,4);
		Assert.assertEquals(true, result);
	}
	
	@Test
	//TC 1.2
	public void givenThreeInteger_WhenCompared_SecondNumberPositionShouldReturnMaximum()
	{
		TestMaximum testMaximum =  new TestMaximum();
		boolean result = testMaximum.computeSecondPositionIntegerMaximum(9,12,4);
		Assert.assertEquals(true, result);
	}
	
	@Test
	//TC 1.3
	public void givenThreeInteger_WhenCompared_ThirdNumberPositionShouldReturnMaximum()
	{
		TestMaximum testMaximum =  new TestMaximum();
		boolean result = testMaximum.computeThirdPositionIntegerMaximum(9,7,18);
		Assert.assertEquals(true, result);
	}
	
	@Test
	//TC 2.1
	public void givenThreeFloat_WhenCompared_FirstNumberPositionShouldReturnMaximum()
	{
		TestMaximum testMaximum =  new TestMaximum();
		boolean result = testMaximum.computeFirstPositionFloatMaximum(27f, 21f, 5f);
		Assert.assertEquals(true, result);
	}
	
	@Test
	//TC 2.2
	public void givenThreeFloat_WhenCompared_SecondNumberPositionShouldReturnMaximum()
	{
		TestMaximum testMaximum =  new TestMaximum();
		boolean result = testMaximum.computeSecondPositionFloatMaximum(8f, 21f, 3f);
		Assert.assertEquals(true, result);
	}
	
	@Test
	//TC 2.3
	public void givenThreeFloat_WhenCompared_ThirdNumberPositionShouldReturnMaximum()
	{
		TestMaximum testMaximum =  new TestMaximum();
		boolean result = testMaximum.computeThirdPositionFloatMaximum(52f, 22f, 107f);
		Assert.assertEquals(true, result);
	}
	
	

}
