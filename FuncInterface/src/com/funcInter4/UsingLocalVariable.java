package com.funcInter4;


public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
//		arg = 31;
//		localVar = 41;
		
//		익명객체로 만들어진 람다식은 변수가 상수처리(final) 되서 직접 값을 변경하는 것이 불가능해진다.
		
		MyfunctionalInterface fi = () -> {
			System.out.println("arg" + arg);
			System.out.println("localVar" + localVar + "\n");
		};
		fi.method();
	}
}
