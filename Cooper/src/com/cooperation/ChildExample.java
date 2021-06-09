package com.cooperation;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		com.cooperation.parent parent = child;
		parent.method1();
		parent.method2();
//		parent.method3();
	}
}
