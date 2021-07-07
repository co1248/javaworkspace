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
//	for(int i = 0; set.size() < 6; i++) { //compareTo��� �߻�޼ҵ带 �������̵� �ؾ߸� ���Ŀ� ���� ������ �����༭ add�ȴ�.
//		int num = (int)(Math.random() * 45) + 1;
//		set.add(num);
//	}
//	System.out.println(set);
//	}
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer> (new ValueComparator());
		
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);
		
		Iterator it = map.entrySet().iterator();
		
		System.out.println("=====�⺻����=====");
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey() + ": " + value + " ");
		}
		System.out.println();
		System.out.println(map);//Ű�������������� ���ĵǾ� ���
//		
//		Set<String> keySet = map.keySet(); //Ű���� �޾� �� ��
//		Iterator<String> keyIterator = keySet.iterator();
//		while(keyIterator.hasNext()) {
//			String key = keyIterator.next();
//			Integer value = map.get(key);
//			System.out.println("\t" + key + " : " + value);
//		}
	}
	
	static class ValueComparator implements Comparator {//������ ������� ���ı��ظ���� Ŭ������ ����

		@Override
		public int compare(Object o1, Object o2) {
			return ((String)o2).compareTo((String)o1); //��������
		} 
	}
}
