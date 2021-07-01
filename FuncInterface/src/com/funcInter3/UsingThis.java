package com.funcInter3;


public class UsingThis {
	public int outterfield = 10;
	
	class Inner {
		int innerfield = 20;
		
		void method() {
			//¶÷´Ù½Ä
			MyfunctionalInterface fi = () -> {
				System.out.println("outterfield" + outterfield);
				System.out.println("outterfield" + UsingThis.this.outterfield + "\n");
				
				System.out.println("innerfield" + innerfield);
				System.out.println("innerfield" + this.innerfield + "\n");
			};
			fi.method();
		}
	}
}
