package com.cooperation;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;		
		// TODO Auto-generated method stub
//		return super.areaCircle(r); //super 부모의 메소드를 사용할 수 있다.
	}
//	double areaCircle(double r) {
//		System.out.println("Computer 객체의 areaCircle() 실행");
//		return Math.PI * r * r;
//	}	
}
