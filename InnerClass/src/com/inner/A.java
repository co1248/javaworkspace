package com.inner;

public class A {
	A() {
		System.out.println("A��ü ����");
	}
	
	class B {
		B() {
			System.out.println("B��ü ����");
		}
		
		int field;
		void method1() {
			
		}
	}
	
	static class C {
		C() {
			System.out.println("C��ü ����");
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
				System.out.println("D��ü ����");
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
