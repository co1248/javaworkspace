package com.ploy2;

public class Car {
//	Tire frontLeftTire = new Tire("앞왼쪽", 6);
//	Tire frontRightTire = new Tire("앞오른쪽", 2);
//	Tire backLeftTire = new Tire("뒤왼쪽", 3);
//	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	Tire[] tires = { //배열로 객체 관리, 자동형변환
			new HankookTire("앞왼쪽", 6),
			new HankookTire("앞오른쪽", 2),
			new HankookTire("뒤왼쪽", 3),
			new HankookTire("뒤오른쪽", 4)
	};

	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		int i = 0;
		for(Tire t : tires) {
			++i;
			if(t.roll() == false) { stop(); return i; }
		}
		return 0;
	}	

	 void stop() {
		 System.out.println("[자동차가 멈춥니다.]");
	 }
}
