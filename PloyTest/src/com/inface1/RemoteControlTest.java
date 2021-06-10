package com.inface1;

public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl t = new Television();
		RemoteControl a = new Audio();
		
		t.turnOn();
		a.turnOn();
		t.turnOff();
		a.turnOff();
		
		//�͸�ü���·� �����ϸ� �������̽� �ٷ� ���� ����
		//�̺�Ʈ ������ �� ���� ����. �ڵ鷯������
		//�������̽� - Ÿ���� �����ִ� �뵵
		RemoteControl rc = new RemoteControl() { //�������̽��� �̸��� ���� ��ü�� ����
			private int volume;

			@Override
			public void turnOn() {
				System.out.println("�͸�ü �մϴ�.");
			}

			@Override
			public void turnOff() {
				System.out.println("�͸�ü ���ϴ�.");
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
				System.out.println("���� ���� : " + this.volume);
			}
		};
		rc.turnOn();
		
		Searchable sa = new SmartTelevision();
		sa.search("����");
		
		a.setMute(true);
		
		RemoteControl.ChangeBattery();
		//a.ChangeBattery();�� �ȵȴ�.
	}
}
