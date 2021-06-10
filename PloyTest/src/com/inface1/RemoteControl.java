package com.inface1;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10; //����� �ݵ�� ���� �ʱ�ȭ �ϰ� ����.
	int MIN_VOLUME = 0; //�պκл�������
	
	public abstract void turnOn();
	void turnOff(); //�պκл�������
	void setVolume(int volume);
	
	default void setMute(boolean mute) { //�������� �Ǹռ� �߰���
		if(mute) {
			System.out.println("����ó��");
		} else {
			System.out.println("��������");
		}
	}
	
	static void ChangeBattery() { //�������� �Ǹռ� �߰���
		System.out.println("������ ��ü");
	}
}
