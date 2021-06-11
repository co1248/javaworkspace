package com.ploy2;

public class KumhoTire extends TireInfo{

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire ¼ö¸í :" + (maxRotation - accumulatedRotation) + "È¸");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire ÆãÅ© ***");
			return false;
	    }
	}
}
