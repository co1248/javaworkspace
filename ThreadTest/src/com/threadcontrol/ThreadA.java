package com.threadcontrol;

public class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;
	@Override
	public void run() {
		
		try { Thread.sleep(100); } catch (InterruptedException e) {} //A������ �Ͻ����� �ϰ� ������ ���̽�����ȿ� �����ֱ�
		
		while(!stop) {
			if(work) {
				System.out.println("ThreadA �۾� ����");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA ����");
	}
}
