package com.inner;

public class AnonymousExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous2 anony = new Anonymous2();
		anony.field.run();
		anony.method1();
		anony.method2(
				new Vehicle() {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						System.out.println("트럭이 달립니다.");
					}	
				}
		);
	}
}
