package com.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		System.out.println("[�۾� ó�� ��û]");
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				int sum = 0;
				
				System.out.println(100/sum);//�����߰�
				
				for(int i = 0; i <= 10; i++) { sum += i; }
				System.out.println("[ó�� ���] " + sum);
					
			}
		};
		Future future = executorService.submit(runnable);
		
		try {
			future.get();
			System.out.println("[�۾� ó�� �Ϸ�]");
			
		} catch (Exception e) {
			System.out.println("[���� ���� �߻���] " + e.getMessage());
		}
		executorService.shutdown();
	}
}