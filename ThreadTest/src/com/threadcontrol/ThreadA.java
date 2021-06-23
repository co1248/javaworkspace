package com.threadcontrol;

public class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;
	@Override
	public void run() {
		
		try { Thread.sleep(100); } catch (InterruptedException e) {} //A스레드 일시정지 하고 싶으면 에이스레드안에 슬립넣기
		
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업 내용");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료");
	}
}
