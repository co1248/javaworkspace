package com.inner;

public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		
		A.B b = a.new B(); //�ν��Ͻ��� ����Ŭ����
		b.field = 3;
		
		//---------------------
		
		A.C c = new A.C();//���� ���� �𷡽�
		c.field = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		//-----------------------
		
		a.method();//���� ���� Ŭ����

	}
}
