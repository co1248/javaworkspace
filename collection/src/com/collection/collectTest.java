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
//		list.add("4"); //중복허용
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
//		list2.add(new Integer(10)); //오토박싱되서 아래같이만 써도 된다.
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
//		set.add("6"); //중복안됨
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
////			String s = it.next(); //값이 랜덤하게 나온다.
////			it.remove(); //무조건 next와 같이 써야한다.
////			System.out.println(s);
////		}
////		System.out.println("--------------------");
////		it = set.iterator();
////		while(it.hasNext()) {
////			String s = it.next(); //값이 랜덤하게 나온다.
////			System.out.println(s);
////			
////		}
//		
//		//로또 번호 출력 (중복됨)
//		for(int i = 0; i <6 ; i++) {
//			int lotto = (int)(Math.random() * 45) + 1;
//			System.out.println(lotto);
//		}
		//로또 번호 출력 (set을 이용해서 중복안됨)	
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
