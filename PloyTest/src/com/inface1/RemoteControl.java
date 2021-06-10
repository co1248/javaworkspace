package com.inface1;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10; //상수는 반드시 값을 초기화 하고 쓴다.
	int MIN_VOLUME = 0; //앞부분생략가능
	
	public abstract void turnOn();
	void turnOff(); //앞부분생략가능
	void setVolume(int volume);
	
	default void setMute(boolean mute) { //버전업이 되먼서 추가됨
		if(mute) {
			System.out.println("무음처리");
		} else {
			System.out.println("무음해제");
		}
	}
	
	static void ChangeBattery() { //버전업이 되먼서 추가됨
		System.out.println("건전지 교체");
	}
}
