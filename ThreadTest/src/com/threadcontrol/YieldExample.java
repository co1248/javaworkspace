package com.threadcontrol;

public class YieldExample {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadB.start();
		threadA.start();
		
		
		try { Thread.sleep(100); } catch (InterruptedException e) {} //ThreadA.sleep(3000)라고 해도 슬립되지 않는다.
		threadA.work = false;
		
		try { Thread.sleep(100); } catch (InterruptedException e) {}
		threadA.work = true;
		
		try { Thread.sleep(100); } catch (InterruptedException e) {}
		threadA.stop = true;
		threadB.stop = true;
	}
}
