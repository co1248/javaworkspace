package com.thread;

import java.awt.Toolkit;

public class BeepPrintEx {

	public static void main(String[] args) {
//		BeepTask beepTask = new BeepTask(); //직접 Runnable을 상속받은 클래스를 이용
//		Thread thread = new Thread(beepTask);
//		thread.start();
		
//		Thread thread = new Thread(new Runnable() { //익명객체
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i = 0; i < 5; i++) {
//					toolkit.beep();
//					try { Thread.sleep(500); } catch(Exception e) {}
//				}
//			}
//		});
//		thread.start();

//		Thread thread = new Thread(() -> { //람다식
//			Toolkit toolkit = Toolkit.getDefaultToolkit();
//			for(int i = 0; i < 5; i++) {
//				toolkit.beep();
//				try { Thread.sleep(500); } catch(Exception e) {}
//			}
//		}); 
//		thread.start();
		
		BeepThread thread = new BeepThread(); //스레드클래스를직접상속
		thread.start();
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
