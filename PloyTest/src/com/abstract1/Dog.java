package com.abstract1;

public class Dog extends Animal {

	public Dog(String kind) {
		this.kind = kind;
	}

	@Override
	public void sound() { //(�߻�Ŭ������ �߻�޼ҵ带)�ݵ�� ������ 
		System.out.println("�۸�");
	}
}
