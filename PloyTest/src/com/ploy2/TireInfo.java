package com.ploy2;

public abstract class TireInfo implements Tire{//어뎁터패턴일때 오버라이드가 필요없다면 abstract로 만들면 오버라이드안해도 된다.
	//필드
		public int maxRotation;     			//최대 회전수(최대 수명)
		public int accumulatedRotation;		//누적 회전수
		public String location;       			//타이어의 위치

		//생성자
		public TireInfo(String location, int maxRotation) {
			this.location = location;
			this.maxRotation = maxRotation;
		}

//		@Override
//		public boolean roll() {
//			return false;
//		}
}