package com.abstract1;

public class AnimalTest {

	public static void main(String[] args) {
		Dog dog = new Dog("������");
		Cat cat = new Cat("�����");
		
		dog.sound();
		cat.sound();
		
		Animal an1 = new Dog("������");
		an1.sound(); //�������̵��Ǿ��� �޼ҵ�ȣ��
		
		animalSound(dog);
		animalSound(cat);
	}
	
	public static void animalSound(Animal animal) { 
		animal.sound();//�������̵��� �޼ҵ带 ȣ���ϴ� �Ŷ� �θ�Ÿ���� �������°Ŷ� Ÿ��Ȯ���� ���ص� �ȴ�.
	}
}
