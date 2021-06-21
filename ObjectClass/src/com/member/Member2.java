package com.member;

public class Member2 implements Cloneable {//Cloneable을 상속받아야 복제가능하다. 오버라이딩 하지 않는다.이 클래스를 복제하고 싶다할때
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public Member2(String id, String name, String password, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member2 getMember() {
		Member2 cloned = null;
		
		try {
			cloned = (Member2) clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cloned;
	}
}
