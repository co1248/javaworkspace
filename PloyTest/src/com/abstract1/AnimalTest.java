package com.abstract1;

public class AnimalTest {

	public static void main(String[] args) {
		Dog dog = new Dog("강아지");
		Cat cat = new Cat("고양이");
		
		dog.sound();
		cat.sound();
		
		Animal an1 = new Dog("강아지");
		an1.sound(); //오버라이딩되어진 메소드호출
		
		animalSound(dog);
		animalSound(cat);
	}
	
	public static void animalSound(Animal animal) { 
		animal.sound();//오버라이딩된 메소드를 호출하는 거라 부모타입을 가져오는거라도 타입확인을 안해도 된다.
	}
}
