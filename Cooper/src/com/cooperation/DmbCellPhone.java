package com.cooperation;

public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone(String model, String color, int channel) { //자식클래스는 의무적으로 부모클래스를 호출해야한다.
		super(); //부모생성자를 호출 (부모의 생성자가 기본생성자밖에 없을 경우 생략가능)
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 "+ channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
