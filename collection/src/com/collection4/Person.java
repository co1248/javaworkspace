package com.collection4;

public class Person implements Comparable<Person>{
	public String name;
	public int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
//		if(this.age < o.age) return -1; //��������
//		else if(this.age > o.age) return 1; //��������
//		else return 0;
		
//		return age - o.age; //��������
		return (age - o.age) * -1; //��������
	}
}
