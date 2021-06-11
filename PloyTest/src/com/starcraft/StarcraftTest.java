package com.starcraft;

public class StarcraftTest {

	public static void main(String[] args) {
		Tank t = new Tank();
		Dropship d = new Dropship();
		Marine m = new Marine();
		SCV s = new SCV();
		Medic me = new Medic();
		
		s.repair(t);
		s.repair(d);
		me.repair(m);
		
	}
}
