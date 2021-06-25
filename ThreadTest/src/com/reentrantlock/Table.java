package com.reentrantlock;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Table {
	
	String[] dishNames = {"donut", "donut", "burger"};
	final int MAX_FOOD = 6; //최대 음식갯수
	private ArrayList<String> dishes = new ArrayList<>(); //접시
	
	private ReentrantLock lock = new ReentrantLock();
	private Condition forCook = lock.newCondition(); //각각 할당되어진 웨이트풀
	private Condition forCust = lock.newCondition(); //각각 할당되어진 웨이트풀
	
	public void add(String dish) {
		lock.lock();
		try {
			while(dishes.size() >= MAX_FOOD) {
				String name = Thread.currentThread().getName();
				System.out.println(name + " is waiting.");
				
				try {
					forCook.await();  //웨이트 풀이 따로 만들어진다(wait와의 차이
				    Thread.sleep(500);
				} catch(InterruptedException e) { e.printStackTrace(); }
			} 
			dishes.add(dish);
			forCust.signal(); //notify();해주는 역활
			System.out.println("Dishes : " + dishes.toString());
		} catch(Exception e) {
			
		} finally {
			lock.unlock();
		}
	}
	public void remove(String dishName) {
		lock.lock();
		String name = Thread.currentThread().getName();
		
		try {
			while(dishes.size() == 0) {
				System.out.println(name + " is waiting.");
				try {
					forCust.await();
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
				}
			}
			while(true) {
				for(int i = 0; i < dishes.size(); i++) {
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						forCook.signal();
						return;
					}
				}
				
				try {
					System.out.println(name + " is waiting.");
					forCust.await(); //웨이트풀에 넣어주는 작업
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
				}
			}
			
		} catch(Exception e) {
			
		} finally {
			lock.unlock();
		}
	}
	
	public int dishNum() {
		return dishNames.length;
	}

}
