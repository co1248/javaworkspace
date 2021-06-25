package com.reentrantlock;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Table {
	
	String[] dishNames = {"donut", "donut", "burger"};
	final int MAX_FOOD = 6; //�ִ� ���İ���
	private ArrayList<String> dishes = new ArrayList<>(); //����
	
	private ReentrantLock lock = new ReentrantLock();
	private Condition forCook = lock.newCondition(); //���� �Ҵ�Ǿ��� ����ƮǮ
	private Condition forCust = lock.newCondition(); //���� �Ҵ�Ǿ��� ����ƮǮ
	
	public void add(String dish) {
		lock.lock();
		try {
			while(dishes.size() >= MAX_FOOD) {
				String name = Thread.currentThread().getName();
				System.out.println(name + " is waiting.");
				
				try {
					forCook.await();  //����Ʈ Ǯ�� ���� ���������(wait���� ����
				    Thread.sleep(500);
				} catch(InterruptedException e) { e.printStackTrace(); }
			} 
			dishes.add(dish);
			forCust.signal(); //notify();���ִ� ��Ȱ
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
					forCust.await(); //����ƮǮ�� �־��ִ� �۾�
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
