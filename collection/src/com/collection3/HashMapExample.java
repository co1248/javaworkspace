package com.collection3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);//키값이 동일해서 후자로 대체
		System.out.println("총 Entry 수: " + map.size());
		
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		Set<String> keySet = map.keySet(); //키값만 받아 올 때
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		map.remove("홍길동"); //키값을 인덱스번호처럼 사용
		System.out.println("총 Entry 수: " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); //키와 벨류값을 모두 가져올수있는 엔트리셋
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		System.out.println("총 Entry 수: " + map.size());
		Collection values = map.values(); //벨류값만 보고 싶을 때
		Iterator<Integer> valueIterator = values.iterator();
		while(valueIterator.hasNext()) {
			int value = valueIterator.next();
			
			System.out.println("\tvalue : " + value);
		}
			
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
	}
}
