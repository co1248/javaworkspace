package com.collection4;

import java.util.Iterator;
import java.util.TreeSet;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> treeSet = new TreeSet<>();
		treeSet.add(new Person("ȫ�浿", 45));
		treeSet.add(new Person("���ڹ�", 25));
		treeSet.add(new Person("������", 31));//treeSet�������� �⺻������ ������ ����������Ѵ�.
		
		Iterator<Person> it = treeSet.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.name + " " + p.age);
		}
	}
}
