package com.cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) { //������
		super();
		this.busNumber = busNumber;
	}
	
	void take(int money) {
		passengerCount++;
		this.money += money;
	}
	void showInfo() {
		System.out.print("����" + busNumber + "���� �°����� " + passengerCount + "�� ");
		System.out.println("������ " + money + "���Դϴ�.");
	}
}
