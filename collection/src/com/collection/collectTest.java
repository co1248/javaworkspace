package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class collectTest {

	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList();
//		
//		list.add("1");
//		list.add("3");
//		list.add("5");
//		list.add("2");
//		list.add("4");
//		list.add("4"); //�ߺ����
//		
////		System.out.println(list.get(0));
////		System.out.println(list.get(1));
//		int sum = 0;
//		for(int i = 0; i < list.size(); i++) {
//			sum += Integer.parseInt(list.get(i));
////			System.out.println(list.get(i));
//		}
//		System.out.println("sum : " + sum);
//		List<Integer> list2 = new ArrayList();
//		list2.add(new Integer(10)); //����ڽ̵Ǽ� �Ʒ����̸� �ᵵ �ȴ�.
//		list2.add(20);
//		list2.add(30);
//		list2.add(40);
//		list2.add(50);
//		sum = 0;
//		for(int i = 0; i < list2.size(); i++) {
//			sum += list2.get(i);
////			sum2 += Integer.valueOf(list2.get(i));
////			System.out.println(list2.get(i));
//		}
//		System.out.println("sum : " + sum);
//		
//		
//		Set<String> set = new HashSet();
//		
//		set.add("1");
//		set.add("2");
//		set.add("3");
//		set.add("4");
//		set.add("5");
//		set.add("6"); //�ߺ��ȵ�
//		set.add("7");
//		set.add("8");
//		set.add("9");
//		set.add("10");
//		
//		Iterator<String> it = set.iterator();
//		
//		while(it.hasNext()) {
//			String s = it.next();
//			int x = Integer.parseInt(s);
//			if(x % 2 == 0) {
//				it.remove();
//			}
//			System.out.println(s);
//		}
//		System.out.println("--------------------");
//		it = set.iterator();
//		while(it.hasNext()) {
//			String s = it.next();
//		    System.out.println(s);
//		}
////		Iterator<String> it = set.iterator();
////		while(it.hasNext()) {
////			String s = it.next(); //���� �����ϰ� ���´�.
////			it.remove(); //������ next�� ���� ����Ѵ�.
////			System.out.println(s);
////		}
////		System.out.println("--------------------");
////		it = set.iterator();
////		while(it.hasNext()) {
////			String s = it.next(); //���� �����ϰ� ���´�.
////			System.out.println(s);
////			
////		}
//		
//		//�ζ� ��ȣ ��� (�ߺ���)
//		for(int i = 0; i <6 ; i++) {
//			int lotto = (int)(Math.random() * 45) + 1;
//			System.out.println(lotto);
//		}
		//�ζ� ��ȣ ��� (set�� �̿��ؼ� �ߺ��ȵ�)	
		Set<Integer> set = new HashSet();
		for(int i = 0; set.size() < 6; i++) {
			int lotto = (int)(Math.random() * 45) + 1;
			set.add(lotto);
		}
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int lotto = it.next();
			System.out.println(lotto);
		}
	}
}
