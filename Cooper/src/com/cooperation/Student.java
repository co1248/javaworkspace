package com.cooperation;

public class Student {
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int grade, int money) { //생성자
		super();
		this.studentName = studentName;
		this.grade = grade;
		this.money = money;
	}
	
	void takeBus(Bus bus) { //참조형 객체 타입의 정보를 가져온다. 포함관계
		bus.take(1500);
		this.money -= 1500;

	}
	
	void takeSubway(Subway subway) {
		subway.take(1250);
		this.money -= 1250;
		
	}
	
	//확인메소드
	void showInfo() {
		System.out.println(studentName + "남은 금액은" + money + "원");
	}
	

}
