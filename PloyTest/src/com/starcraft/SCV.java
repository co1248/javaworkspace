package com.starcraft;

public class SCV extends GroundUnit implements Repairable {

	public SCV() {
		super(60);
		hitpoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitpoint != u.MAX_HP) {
				u.hitpoint++;
			}
			System.out.println(u.toString() + "수리 완료");
			}		
	} 
}


