package com.bridgelabz.TestMaximum;

public class TestMaximum {
	
	public boolean computeFirtsPositionIntegerMaximum(Integer firstValue, Integer secondValue, Integer thirdValue) {
		if(firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0)
			return true;
		else
			return false;
	}
	public boolean computeSecondPositionIntegerMaximum(Integer firstValue, Integer secondValue, Integer thirdValue) {
		if(secondValue.compareTo(firstValue) > 0 &&  secondValue.compareTo(thirdValue) > 0)
			return true;
		else
			return false;
	}
	public boolean computeThirdPositionIntegerMaximum(Integer firstValue, Integer secondValue, Integer thirdValue) {		
		if( thirdValue.compareTo(secondValue) > 0 &&  thirdValue.compareTo(firstValue) > 0)
			return true;
		else
			return false;
	}
	public boolean computeFirstPositionFloatMaximum(Float firstValue, Float secondValue, Float thirdValue) {
		if(firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0)
			return true;
		else
			return false;
	}
	public boolean computeSecondPositionFloatMaximum(Float firstValue, Float secondValue, Float thirdValue) {
		if(secondValue.compareTo(firstValue) > 0 &&  secondValue.compareTo(thirdValue) > 0)
			return true;
		else
			return false;
	}
	public boolean computeThirdPositionFloatMaximum(Float firstValue, Float secondValue, Float thirdValue) {
		if( thirdValue.compareTo(secondValue) > 0 &&  thirdValue.compareTo(firstValue) > 0)
			return true;
		else
			return false;
	}
	public boolean computeFirstPositionStringMaximum(String firstValue, String secondValue, String thirdValue) {	
		if( firstValue.length() > secondValue.length() && firstValue.length() > thirdValue.length())
			return true;
		else
			return false;	
	}
	public boolean computeSecondPositionStringMaximum(String firstValue, String secondValue, String thirdValue) {
		if(secondValue.length() > firstValue.length() &&  secondValue.length() > thirdValue.length())
			return true;
		else
			return false;
	}
	public boolean computeThirdPositionStringMaximum(String firstValue, String secondValue, String thirdValue) {
		if( thirdValue.length() > secondValue.length() &&  thirdValue.length() > firstValue.length())
			return true;
		else
			return false;
	}	
}
