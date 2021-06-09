package com.cooperation;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) { //������
		super();
		this.lineNumber = lineNumber;
	}
	
	void take(int money) {
		passengerCount++;
		this.money += money;
	}
	
	void showInfo() {
		System.out.print("����ö " + lineNumber + "�� �°����� " + passengerCount + "�� ");
		System.out.println("������ " + money + "���Դϴ�.");
	}
}
