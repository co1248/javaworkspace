package com.exception;

public class NumberFormatExceptionExample {

//	public static void main(String[] args) {
//		String data1 = "100";
//		String data2 = "a100";
//		
//		int value1 = Integer.parseInt(data1);
//		int value2 = Integer.parseInt(data2);
//		
//		int result = value1 + value2;
//		System.out.println(data1 + "+" + data2 + "=" + result);
//	}
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		String str = null;
		
		int value1 = Integer.parseInt(data1);
//		int value2;
		int value2 = 0;
		
		try {
			//System.out.println(str.toString());
			System.out.println(value1 / 0);
			value2 = Integer.parseInt(data2);
		} catch(ArithmeticException | NumberFormatException e) { //멀티캐치
			e.printStackTrace(); //메세지를 포함한 일련은 에러과정을 표시
			System.out.println(e.getMessage());//에러메시지 표시
			System.out.println("정수를 0으로 나누시면 안됩니다.");
			System.out.println("숫자형태의 구성이 아닙니다.");
			value2 = 200;
//		} catch(NumberFormatException e) {
//			System.out.println("숫자형태의 구성이 아닙니다.");
//			value2 = 200;
		} catch (Exception e) { //예외값이 불명확한 경우엔 어떤 예외가 발생하더라고 그 예외를 실행할 수있는 가장 최상위 타입인 Exception을 사용한다.
			System.out.println("예외가 발생하였습니다.");
		} finally { //반드시 한번 실행한다.
			System.out.println("예외처리에 대한 실행을 완료합니다.");
		}
		int result = value1 + value2;
		System.out.println(value1 + "+" + value2 + "=" + result);		
	}
//	캐치문은 한번 실행되면 나머지를 실행하지 않는다.
	
}
