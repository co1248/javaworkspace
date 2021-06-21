package com.member;

public class ClassTest {

	public static void main(String[] args) {
		Car car = new Car("마티즈");
		
		Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
		
		try { //생성하지 않더라도 해당 클래스가 있는지 확인하고 싶을 때
			Class clazz2 = Class.forName("com.member.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
