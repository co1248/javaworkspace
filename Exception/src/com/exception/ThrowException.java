package com.exception;

public class ThrowException {

	public static void main(String[] args) throws Exception {
		//예외를 강제로 발생시키다.
//		try {
//			throw new Exception("고의로 예외발생");
//		} catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
	    try {
	        method1();
	    } catch(Exception e) {
		    System.out.println(e.getMessage());
	    }
	}
//예외 떠넘기가. 예외 선언하기
	public static void method1() throws Exception {
		method2();
	}
    public static void method2() throws Exception {
		throw new Exception("나는 문제가 있다.");
	}
}
