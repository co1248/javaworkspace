package com.thread;

import java.awt.Toolkit;

public class BeepPrintEx {

	public static void main(String[] args) {
//		BeepTask beepTask = new BeepTask(); //���� Runnable�� ��ӹ��� Ŭ������ �̿�
//		Thread thread = new Thread(beepTask);
//		thread.start();
		
//		Thread thread = new Thread(new Runnable() { //�͸�ü
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

//		Thread thread = new Thread(() -> { //���ٽ�
//			Toolkit toolkit = Toolkit.getDefaultToolkit();
//			for(int i = 0; i < 5; i++) {
//				toolkit.beep();
//				try { Thread.sleep(500); } catch(Exception e) {}
//			}
//		}); 
//		thread.start();
		
		BeepThread thread = new BeepThread(); //������Ŭ�������������
		thread.start();
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
