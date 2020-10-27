package com.bridgelabz.TestMaximum;

import org.junit.Assert;
import org.junit.Test;


public class TestMaximumTest {
	
	@Test
	//TC 1.1
	public void givenThreeInteger_WhenFirstPositionValueMaximum_ShouldReturnTrue()
	{
		TestMaximum testMaximum =  new TestMaximum();
		boolean result = testMaximum.computeFirtsPositionIntegerMaximum(9,7,4);
		Assert.assertEquals(true, result);
	}
	@Test
	//TC 1.2
	public void givenThreeIntegers_WhenSecondPositionValueMaximum_ShouldReturnTrue()
	{
		TestMaximum testMaximum =  new TestMaximum();
		boolean result = testMaximum.computeSecondPositionIntegerMaximum(9,12,4);
		Assert.assertEquals(true, result);
	}
	@Test
	//TC 1.3
	public void givenThreeIntegers_WhenThirdPositionValueMaximum_ShouldReturnTrue()
	{
		TestMaximum testMaximum =  new TestMaximum();
		boolean result = testMaximum.computeThirdPositionIntegerMaximum(9,7,18);
		Assert.assertEquals(true, result);
	}
	@Test
	//TC 2.1
	public void givenThreeFloat_WhenFirstPositionValueMaximum_ShouldReturnTrue()
	{
		TestMaximum testMaximum =  new TestMaximum();
		boolean result = testMaximum.computeFirstPositionFloatMaximum(27f, 21f, 5f);
		Assert.assertEquals(true, result);
	}
	@Test
	//TC 2.2
	public void givenThreeFloat_WhenSecondPositionValueMaximum_ShouldReturnTrue()
	{
		TestMaximum testMaximum =  new TestMaximum();
		boolean result = testMaximum.computeSecondPositionFloatMaximum(8f, 21f, 3f);
		Assert.assertEquals(true, result);
	}	
	@Test
	//TC 2.3
	public void givenThreeFloat_WhenThirdPositionValueMaximum_ShouldReturnTrue()
	{
		TestMaximum testMaximum =  new TestMaximum();
		boolean result = testMaximum.computeThirdPositionFloatMaximum(52f, 22f, 107f);
		Assert.assertEquals(true, result);
	}
	@Test
	//TC 3.1
	public void givenThreeString_WhenFirtsPositionValueMaximum_ShouldReturnTrue()
	{
		TestMaximum testMaximum =  new TestMaximum();
		boolean result = testMaximum.computeFirstPositionStringMaximum("Life is beautiful", "empathy", "insolency");
		Assert.assertEquals(true, result);
	}
	@Test
	//TC 3.2
	public void givenThreeString_WhenSecondPositionValueMaximum_ShouldReturnTrue()
	{
		TestMaximum testMaximum =  new TestMaximum();
		boolean result = testMaximum.computeSecondPositionStringMaximum("sympathy", "Everything happens is a part of life", "species");
		Assert.assertEquals(true, result);
	}
	@Test
	//TC 3.3
	public void givenThreeString_WhenThirdPositionValueMaximum_ShouldReturnTrue()
	{
		TestMaximum testMaximum =  new TestMaximum();
		boolean result = testMaximum.computeThirdPositionStringMaximum("water", "origin", "floccinaucinihilipilification");
		Assert.assertEquals(true, result);
	}
	
}
