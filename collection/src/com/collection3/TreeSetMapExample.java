package com.collection3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetMapExample {
	public static void main(String[] args) {
	
//	Set<Integer> set = new TreeSet<>();
//	
//	for(int i = 0; set.size() < 6; i++) { //compareTo라는 추상메소드를 오버라이딩 해야만 정렬에 대한 기준을 정해줘서 add된다.
//		int num = (int)(Math.random() * 45) + 1;
//		set.add(num);
//	}
//	System.out.println(set);
//	}
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer> (new ValueComparator());
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		Iterator it = map.entrySet().iterator();
		
		System.out.println("=====기본정렬=====");
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey() + ": " + value + " ");
		}
		System.out.println();
		System.out.println(map);//키값오름차순으로 정렬되어 출력
//		
//		Set<String> keySet = map.keySet(); //키값만 받아 올 때
//		Iterator<String> keyIterator = keySet.iterator();
//		while(keyIterator.hasNext()) {
//			String key = keyIterator.next();
//			Integer value = map.get(key);
//			System.out.println("\t" + key + " : " + value);
//		}
	}
	
	static class ValueComparator implements Comparator {//나만의 방식으로 정렬기준만드는 클래스를 정의

		@Override
		public int compare(Object o1, Object o2) {
			return ((String)o2).compareTo((String)o1); //오름차순
		} 
	}
}
