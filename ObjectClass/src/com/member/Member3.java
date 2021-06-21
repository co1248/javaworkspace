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
		this.scores = scores;//�������̵� ���ϸ� �ּҰ��� �Ѿ��.
		this.car = car;//Ŭ������
	}

	@Override
	protected Object clone() throws CloneNotSupportedException { //���� ������ �������̵� �ؾ��Ѵ�.
		Member3 cloned = (Member3) super.clone();
		
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length); //������ ��ü�� ������ �迭��
		cloned.car = new Car(this.car.model);                           //��ü�� �����ؼ� �Ѱ��ش�.
		
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
