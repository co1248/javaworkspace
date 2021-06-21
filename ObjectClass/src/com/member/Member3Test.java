package com.member;

public class Member3Test {

	public static void main(String[] args) {
		Member3 orginal = new Member3("홍길동", 25, new int[] {90,90}, new Car("소나타"));;
		Member3 cloned = orginal.getMember3();
		cloned.scores[0] = 100;
		cloned.car.model = "그랜저";
		System.out.println(orginal.scores[0]);
		System.out.println(orginal.scores[1]);
		System.out.println(orginal.car.model);
		System.out.println(cloned.scores[0]);
		System.out.println(cloned.scores[1]);
		System.out.println(cloned.car.model);
	}
}
