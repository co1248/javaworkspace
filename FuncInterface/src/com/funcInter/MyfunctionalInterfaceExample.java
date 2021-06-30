package com.funcInter;

public class MyfunctionalInterfaceExample {

	public static void main(String[] args) {
		MyfunctionalInterface fi;
		
		fi = (x, y) -> x + y;//{
//			String str = "method call1";
//			System.out.println(str);
//			System.out.println(x);
//		};
		System.out.println(fi.method(10,20));
//		fi.method(10);
		
//		fi = (x, y) -> { System.out.println(x); }; //{ System.out.println("method call2"); };
//		fi.method(20);
//		
//		fi = (x, y) -> System.out.println(x); //System.out.println("method call3")
//		fi.method(30);
		
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(100,200));
	}
	public static int sum(int x, int y) {
			return x + y;
		}
}
