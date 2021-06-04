package com.access.package3;

public class Car {
	private int speed;// 캡슐화 속성을 은닉하는 방법
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
//	public int getSpeed() { //get메소드 정의되어있는 맴버변수의 동일한 타입사용, 매개변수 안쓴다.
//		return speed;
//	}
//	
//	public void setStop(int speed) { //set메소드 매개변수를 갖는다.
//		if(speed < 0) {
//			return; //void함수에서 return을 조건문에 쓰면 즉시 이 함수의 실행을 종료한다.
//		} else {
//			this.speed = speed;
//		}
//	}
//	
//	public boolean isStop() { //is상태를 표현하는 메소드
//		return stop;
//	}
//	
//	public void setStop(boolean stop) {
//		this.stop = stop;
//	}
	

}
