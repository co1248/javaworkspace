package com.stop;

public class PrintThread2 extends Thread {
	@Override
	public void run() {
		
		try {
			while(true) {
			System.out.println("실행 중");
			Thread.sleep(1); //이 상태에서는 스레드 종료가 안된다.
			}
		} catch (InterruptedException e) {//일시정지상태가 되면 발생
		}
		
//		while(true) {
//			System.out.println("실행 중");
//			if(Thread.interrupted()) {
//				break;
//			}
//		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
