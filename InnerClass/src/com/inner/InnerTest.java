package com.inner;

public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		
		A.B b = a.new B(); //인스턴스한 내부클래스
		b.field = 3;
		
		//---------------------
		
		A.C c = new A.C();//정적 내부 쿨래스
		c.field = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		//-----------------------
		
		a.method();//로컬 내부 클래스

	}
}
