package com.cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) { //생성자
		super();
		this.busNumber = busNumber;
	}
	
	void take(int money) {
		passengerCount++;
		this.money += money;
	}
	void showInfo() {
		System.out.print("버스" + busNumber + "번의 승객수는 " + passengerCount + "명 ");
		System.out.println("수입은 " + money + "원입니다.");
	}
}
