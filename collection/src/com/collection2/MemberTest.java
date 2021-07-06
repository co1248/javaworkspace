package com.collection2;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Member> set = new HashSet<>();
		
		Member m1 = new Member("홍길동", 10);
		Member m2 = new Member("홍길동", 10);
		
		set.add(m1);
		set.add(m2);
		
		Iterator<Member> it = set.iterator();
		
		while(it.hasNext()) {
			Member m = it.next(); //set컬렉션에 있는 정보를 읽어 올 수 있다.
			System.out.println(m.name);
			System.out.println(m.age);
		}
	}
}
