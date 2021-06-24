package com.multhread;

public class CookTest {

	public static void main(String[] args) throws Exception {
		Table table = new Table();
		
		Cook cook = new Cook(table);
		Customer cus1 = new Customer(table, "donut");
		Customer cus2 = new Customer(table, "burger");
		
		Thread c1 = new Thread(cook, "COOK1");	
		Thread c2 = new Thread(cus1, "CUS1");		
		Thread c3 = new Thread(cus2, "CUS2");
		
		c1.start();
		c2.start();
		c3.start();
		
		Thread.sleep(2000);
		System.exit(0); //강제로 메인스레드를 종료할때 쓰는 명령어
	}
}
