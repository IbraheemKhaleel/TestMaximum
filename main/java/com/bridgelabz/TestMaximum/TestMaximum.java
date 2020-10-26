package com.bridgelabz.TestMaximum;

public class TestMaximum {
	

	public boolean computeFirtsPositionMaximum(Integer i, Integer j, Integer k) {
	
		if(i.compareTo(j) > 0 && i.compareTo(k) > 0)
			return true;
		else
			return false;
	}
	
	public boolean computeSecondPositionMaximum(Integer i, Integer j, Integer k) {
		
		if(j.compareTo(i) > 0 &&  j.compareTo(k) > 0)
			return true;
		else
			return false;
	}

		public boolean computeThirdPositionMaximum(Integer i, Integer j, Integer k) {
			
			if(k.compareTo(j) > 0 && k.compareTo(i) > 0)
				return true;
			else
				return false;
	}

}
