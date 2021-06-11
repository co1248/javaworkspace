package com.starcraft;

public class Tank extends GroundUnit implements Repairable {

	public Tank() {
		super(150);
		hitpoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Tank";
	}
}
