package com.ploy2;

public class Car {
//	Tire frontLeftTire = new Tire("�տ���", 6);
//	Tire frontRightTire = new Tire("�տ�����", 2);
//	Tire backLeftTire = new Tire("�ڿ���", 3);
//	Tire backRightTire = new Tire("�ڿ�����", 4);
	
	Tire[] tires = { //�迭�� ��ü ����, �ڵ�����ȯ
			new HankookTire("�տ���", 6),
			new HankookTire("�տ�����", 2),
			new HankookTire("�ڿ���", 3),
			new HankookTire("�ڿ�����", 4)
	};

	
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		int i = 0;
		for(Tire t : tires) {
			++i;
			if(t.roll() == false) { stop(); return i; }
		}
		return 0;
	}	

	 void stop() {
		 System.out.println("[�ڵ����� ����ϴ�.]");
	 }
}
