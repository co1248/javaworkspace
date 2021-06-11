package com.starcraft;

public class Dropship extends AirUnit implements Repairable {

	public Dropship() {
		super(125);
		hitpoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Dropship";
	}
}
