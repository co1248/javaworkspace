package com.cooperation;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;		
		// TODO Auto-generated method stub
//		return super.areaCircle(r); //super �θ��� �޼ҵ带 ����� �� �ִ�.
	}
//	double areaCircle(double r) {
//		System.out.println("Computer ��ü�� areaCircle() ����");
//		return Math.PI * r * r;
//	}	
}
