package com.member;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("123");
		Member m2 = new Member("123");
		
		if(m1 == m2) {//�ּҰ��� �ٸ��Ƿ� �����ʴ�.
			System.out.println("m1�� m2�� �����ϴ�.");
		}
		
		if(m1.equals(m2)) {
			System.out.println("m1�� m2�� �����ϴ�.");
		}
		System.out.println("hashcode������");
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
	}
}
