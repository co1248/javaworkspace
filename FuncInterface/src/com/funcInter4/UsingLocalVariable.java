package com.funcInter4;


public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
//		arg = 31;
//		localVar = 41;
		
//		�͸�ü�� ������� ���ٽ��� ������ ���ó��(final) �Ǽ� ���� ���� �����ϴ� ���� �Ұ���������.
		
		MyfunctionalInterface fi = () -> {
			System.out.println("arg" + arg);
			System.out.println("localVar" + localVar + "\n");
		};
		fi.method();
	}
}
