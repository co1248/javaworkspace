package com.member;

import java.util.Arrays;

public class Member3 implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member3(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;//오버라이딩 안하면 주소값이 넘어간다.
		this.car = car;//클래스도
	}

	@Override
	protected Object clone() throws CloneNotSupportedException { //깊은 복제는 오버라이딩 해야한다.
		Member3 cloned = (Member3) super.clone();
		
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length); //동일한 객체를 가지는 배열과
		cloned.car = new Car(this.car.model);                           //객체를 복제해서 넘겨준다.
		
		return cloned;
	}
	public Member3 getMember3() {
		Member3 cloned = null;
		try {
			cloned = (Member3) clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cloned;
	}
}
