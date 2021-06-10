package com.abstract1;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	
	public abstract void sound();//상속받는 자식에게 반드시 추상메소드를 반드시 구현해라!

}
