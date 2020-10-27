package com.bridgelabz.TestMaximum;

public class TestMaximum<E extends Comparable<E>> {
	
	E firstValue , secondValue , thirdValue ;
	
	
	
	public TestMaximum(E firstValue, E secondValue, E thirdValue) {
		super();
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
	}
	 public E computeMaximum()
	 {
		 return (E) TestMaximum.computeMaximum(firstValue, secondValue, thirdValue);
	 }


	public static <E extends Comparable<E>> E computeMaximum (E firstValue, E secondValue, E thirdValue) {
		E maximum = firstValue;
		if((secondValue).compareTo(maximum) > 0 ) {
			maximum = secondValue;
		}
		if(thirdValue.compareTo(maximum) > 0 ) {
			maximum = thirdValue;
		}
		return maximum ;	
	}	
	
}
	
