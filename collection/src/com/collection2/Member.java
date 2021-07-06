package com.collection2;

public class Member {
	
	public String name;
	public int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//중복된 값의 데이터를 막기 위해 아래 2 메소드를 오버라이딩 해야한다.

	@Override
	public int hashCode() { //이름과 나이가 똑같은 상태라면(같은 문자열이라면) 동일한 코드가 만들어진다.
		// TODO Auto-generated method stub
		return (name + age).hashCode();//"홍길동10".hashCode(); - 스트링타입
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Member m = (Member) obj;
		
		boolean result = (this.name == m.name) && (this.age == m.age);
		return result;
	}
}
