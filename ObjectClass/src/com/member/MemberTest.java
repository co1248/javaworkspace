package com.member;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("123");
		Member m2 = new Member("123");
		
		if(m1 == m2) {//주소값이 다르므로 같지않다.
			System.out.println("m1과 m2가 같습니다.");
		}
		
		if(m1.equals(m2)) {
			System.out.println("m1과 m2가 같습니다.");
		}
		System.out.println("hashcode변경전");
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
	}
}
