package com.cooperation;

public class Student {
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int grade, int money) { //������
		super();
		this.studentName = studentName;
		this.grade = grade;
		this.money = money;
	}
	
	void takeBus(Bus bus) { //������ ��ü Ÿ���� ������ �����´�. ���԰���
		bus.take(1500);
		this.money -= 1500;

	}
	
	void takeSubway(Subway subway) {
		subway.take(1250);
		this.money -= 1250;
		
	}
	
	//Ȯ�θ޼ҵ�
	void showInfo() {
		System.out.println(studentName + "���� �ݾ���" + money + "��");
	}
	

}
