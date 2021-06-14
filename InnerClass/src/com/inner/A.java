package com.inner;

public class A {
	A() {
		System.out.println("A梓端 持失");
	}
	
	class B {
		B() {
			System.out.println("B梓端 持失");
		}
		
		int field;
		void method1() {
			
		}
	}
	
	static class C {
		C() {
			System.out.println("C梓端 持失");
		}
		
		int field;
		static int field2;
		void method1() {
			
		}
		static void method2() {
			
		}
		
		
	}
	void method() {
		class D{
			D() {
				System.out.println("D梓端 持失");
			}
			int field;
			void method() {
				
			}
		}
		D d = new D();
		d.field = 3;
		d.method();
	}
}
