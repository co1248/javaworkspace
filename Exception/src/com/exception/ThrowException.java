package com.exception;

public class ThrowException {

	public static void main(String[] args) throws Exception {
		//���ܸ� ������ �߻���Ű��.
//		try {
//			throw new Exception("���Ƿ� ���ܹ߻�");
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
//���� ���ѱⰡ. ���� �����ϱ�
	public static void method1() throws Exception {
		method2();
	}
    public static void method2() throws Exception {
		throw new Exception("���� ������ �ִ�.");
	}
}
