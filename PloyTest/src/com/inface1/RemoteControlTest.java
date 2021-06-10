package com.inface1;

public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl t = new Television();
		RemoteControl a = new Audio();
		
		t.turnOn();
		a.turnOn();
		t.turnOff();
		a.turnOff();
		
		//익명객체형태로 생성하면 인터페이스 바로 생성 가능
		//이벤트 구현할 때 많이 쓴다. 핸들러용으로
		//인터페이스 - 타입을 묶어주는 용도
		RemoteControl rc = new RemoteControl() { //인터페이스의 이름을 빌려 객체를 생성
			private int volume;

			@Override
			public void turnOn() {
				System.out.println("익명객체 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("익명객체 끕니다.");
			}
			
			@Override
			public void setVolume(int volume) {
				if(volume > RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				} else if(volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else {
					this.volume = volume;
				}
				System.out.println("현재 볼륨 : " + this.volume);
			}
		};
		rc.turnOn();
		
		Searchable sa = new SmartTelevision();
		sa.search("동물");
		
		a.setMute(true);
		
		RemoteControl.ChangeBattery();
		//a.ChangeBattery();는 안된다.
	}
}
