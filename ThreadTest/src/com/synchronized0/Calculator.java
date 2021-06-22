package com.synchronized0;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
//	public synchronized void setMemory(int memory) {//메소드에 락걸기
//		this.memory = memory;
//		try {
//			Thread.sleep(200); //2초간대기
//		} catch (InterruptedException e) {}
//		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
//	}
	public void setMemory(int memory) { //코드 자체에 블록으로 락을 걸기
		synchronized(this) {
			this.memory = memory;
			try {
				Thread.sleep(200); //2초간대기
			} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}
}
