package com.multhread;

public class Customer implements Runnable {
	private Table table;
	private String food;

	public Customer(Table table, String food) {
		super();
		this.table = table;
		this.food = food;
	}

	@Override
	public void run() {
		while(true) {
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
			
			String name = Thread.currentThread().getName();
			table.remove(food); //추가
			//if(eatFood()) {
				System.out.println(name + "음식을 잘 먹었다.");
			//} else {
			//	System.out.println(name + "음식을 못 먹었다.");
			//}
		}	
	}
	
//	boolean eatFood() {
//		return table.remove(food);
//	}
}
