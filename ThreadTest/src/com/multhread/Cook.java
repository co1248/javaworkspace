package com.multhread;

public class Cook implements Runnable {
	
	private Table table;

	public Cook(Table table) {
		super();
		this.table = table;
	}

	@Override
	public void run() {
		
		while(true) {
			
			int idx = (int)(Math.random() * table.disNum());
			table.add(table.disNames[idx]);//음식을 만든다.
			
			try {
				Thread.sleep(10);
			} catch(InterruptedException e) {}
		
		}	
	}
}
