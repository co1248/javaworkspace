package com.cooperation;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) { //생성자
		super();
		this.lineNumber = lineNumber;
	}
	
	void take(int money) {
		passengerCount++;
		this.money += money;
	}
	
	void showInfo() {
		System.out.print("지하철 " + lineNumber + "의 승객수는 " + passengerCount + "명 ");
		System.out.println("수입은 " + money + "원입니다.");
	}
}
