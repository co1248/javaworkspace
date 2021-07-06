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
		
		TreeMap<String, Integer> map = new TreeMap<> (new ValueComparator());
		
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
			// TODO Auto-generated method stub
			if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
				Map.Entry e1 = (Map.Entry)o1;
				Map.Entry e2 = (Map.Entry)o2;
				int v1 = ((Integer)e1.getValue()).intValue();//Ű������ �ٲٰ� ������ getKey�� ���� �ȴ�.
				int v2 = ((Integer)e2.getValue()).intValue();
				return v2 - v1; //��������
			}
			return -1;
		} 
	}
}
