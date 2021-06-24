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
			table.remove(food); //�߰�
			//if(eatFood()) {
				System.out.println(name + "������ �� �Ծ���.");
			//} else {
			//	System.out.println(name + "������ �� �Ծ���.");
			//}
		}	
	}
	
//	boolean eatFood() {
//		return table.remove(food);
//	}
}
