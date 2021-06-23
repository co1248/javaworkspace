package com.wait;

public class Account {//ÅëÀå
	private int balance = 1000;//ÀÜ°í
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			balance -= money;
		}
	}
}
