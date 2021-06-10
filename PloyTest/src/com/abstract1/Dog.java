package com.abstract1;

public class Dog extends Animal {

	public Dog(String kind) {
		this.kind = kind;
	}

	@Override
	public void sound() { //(추상클래스의 추상메소드를)반드시 재정의 
		System.out.println("멍멍");
	}
}
