package com.collection4;

import java.util.Iterator;
import java.util.TreeSet;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> treeSet = new TreeSet<>();
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("감자바", 25));
		treeSet.add(new Person("박지원", 31));//treeSet넣으려면 기본정렬의 기준을 정의해줘야한다.
		
		Iterator<Person> it = treeSet.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.name + " " + p.age);
		}
	}
}
