package com.synchronized0;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
//	public synchronized void setMemory(int memory) {//�޼ҵ忡 ���ɱ�
//		this.memory = memory;
//		try {
//			Thread.sleep(200); //2�ʰ����
//		} catch (InterruptedException e) {}
//		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
//	}
	public void setMemory(int memory) { //�ڵ� ��ü�� ������� ���� �ɱ�
		synchronized(this) {
			this.memory = memory;
			try {
				Thread.sleep(200); //2�ʰ����
			} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}
}
