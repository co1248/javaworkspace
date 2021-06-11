package com.starcraft;

public class Medic extends GroundUnit implements Repairable2 {

	public Medic() {
		super(1000);
		hitpoint = MAX_HP;
	}
	
	void repair(Repairable2 r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitpoint != u.MAX_HP) {
				u.hitpoint++;
			}
			System.out.println(u.toString() + "수리 완료");
			}
			
		} 
}
