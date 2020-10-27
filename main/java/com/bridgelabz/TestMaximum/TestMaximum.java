package com.bridgelabz.TestMaximum;

public class TestMaximum {
	
	public int computeIntegerMaximum(Integer firstValue, Integer secondValue, Integer thirdValue) {
		Integer maximum = firstValue;
		if(secondValue.compareTo(maximum) > 0 ) {
			maximum = secondValue;
		}
		if(thirdValue.compareTo(maximum) > 0 ) {
			maximum = thirdValue;
		}
		return maximum ;	
	}	
	
	public float computeFloatMaximum(Float firstValue, Float secondValue, Float thirdValue) {
		float maximum = firstValue;
		if(secondValue.compareTo(maximum) > 0 ) {
			maximum = secondValue;
		}
		if(thirdValue.compareTo(maximum) > 0 ) {
			maximum = thirdValue;
		}
		return maximum ;	
	}	
	public String computeStringMaximum(String firstValue, String secondValue, String thirdValue) {
		String maximum = firstValue;
		if(secondValue.compareTo(maximum) > 0 ) {
			maximum = secondValue;
		}
		if(thirdValue.compareTo(maximum) > 0 ) {
			maximum = thirdValue;
		}
		return maximum ;	
	}	
	
}
