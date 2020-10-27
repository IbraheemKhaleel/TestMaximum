package com.bridgelabz.TestMaximum;

import org.junit.Assert;
import org.junit.Test;


public class TestMaximumTest {
	
	@Test
	//TC 1.1
	public void givenThreeInteger_WhenFirstPositionValueMaximum_ShouldReturnMaximum()
	{
		TestMaximum testMaximum =  new TestMaximum();
		int result = testMaximum.computeIntegerMaximum(9,7,4);
		Assert.assertEquals(9, result);
	}
	@Test
	//TC 1.2
	public void givenThreeIntegers_WhenSecondPositionValueMaximum_ShouldReturnMaximum()
	{
		TestMaximum testMaximum =  new TestMaximum();
		int result = testMaximum.computeIntegerMaximum(9,12,4);
		Assert.assertEquals(12, result);
	}
	@Test
	//TC 1.3
	public void givenThreeIntegers_WhenThirdPositionValueMaximum_ShouldReturnMaximum()
	{
		TestMaximum testMaximum =  new TestMaximum();
		int result = testMaximum.computeIntegerMaximum(9,7,18);
		Assert.assertEquals(18, result);
	}
	@Test
	//TC 2.1
	public void givenThreeFloat_WhenFirstPositionValueMaximum_ShouldReturnMaximum()
	{
		TestMaximum testMaximum =  new TestMaximum();
		float result = testMaximum.computeFloatMaximum(27f, 21f, 5f);
		Assert.assertEquals(27f , result);
	}
	@Test
	//TC 2.2
	public void givenThreeFloat_WhenSecondPositionValueMaximum_ShouldReturnMaximum()
	{
		TestMaximum testMaximum =  new TestMaximum();
		float result = testMaximum.computeFloatMaximum(8f, 21f, 3f);
		Assert.assertEquals(21f , result);
	}	
	@Test
	//TC 2.3
	public void givenThreeFloat_WhenThirdPositionValueMaximum_ShouldReturnMaximum()
	{
		TestMaximum testMaximum =  new TestMaximum();
		float result = testMaximum.computeFloatMaximum(52f, 22f, 107f);
		Assert.assertEquals(107f , result);
	}
	@Test
	//TC 3.1
	public void givenThreeString_WhenFirtsPositionValueMaximum_ShouldReturnMaximum()
	{
		TestMaximum testMaximum =  new TestMaximum();
		String result = testMaximum.computeStringMaximum("zeal", "empathy", "insolency");
		Assert.assertEquals("zeal", result);
	}
	@Test
	//TC 3.2
	public void givenThreeString_WhenSecondPositionValueMaximum_ShouldReturnMaximum()
	{
		TestMaximum testMaximum =  new TestMaximum();
		String result = testMaximum.computeStringMaximum("sympathy", "zeal", "species");
		Assert.assertEquals("zeal", result);
	}
	@Test
	//TC 3.3
	public void givenThreeString_WhenThirdPositionValueMaximum_ShouldReturnMaximum()
	{
		TestMaximum testMaximum =  new TestMaximum();
		String result = testMaximum.computeStringMaximum("water", "origin", "zeal");
		Assert.assertEquals("zeal", result);
	}
	
}
