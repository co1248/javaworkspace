package com.multhread;

import java.util.ArrayList;

public class Table {
	String[] disNames = {"donut", "donut", "burger"};
	
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<>(); //배열을 객체 형태로
	//dishes.size() 배열의 크기
	public synchronized void add(String dish) {
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is watting.");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		dishes.add(dish);
		notify();
		System.out.println("Dishes : " + dishes.toString());
//		if(dishes.size() >= MAX_FOOD) {
//			return;
//		}
//		dishes.add(dish);
//		System.out.println("Dishes : " + dishes.toString());
	}
	public void remove(String dishName) {
		synchronized(this) {
			
			String name = Thread.currentThread().getName();
			
			while(dishes.size() == 0) {
				System.out.println(name + " is watting.");
				try {
					wait();
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			while(true) {
				for(int i = 0; i < dishes.size(); i++) {
					if(dishName.equals(dishes.get(i))) {
							dishes.remove(i);
							notify();
							return;
					}
				}
				
				try {
					System.out.println(name + " is watting.");
				    wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
//	public boolean remove(String dishName) {
//		synchronized(this) {
//			for(int i = 0; i < dishes.size(); i++) {
//				if(dishName.equals(dishes.get(i))) {
//					dishes.remove(i);
//					return true;
//				}
//			 }
//			 return false;	
//		}
//	}
	public int disNum() {
		return disNames.length;
		}
}
