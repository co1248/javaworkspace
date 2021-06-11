package com.starcraft;

public class Marine extends GroundUnit implements Repairable2 {

	public Marine() {
		super(40);
		hitpoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Marine";
	}
}
