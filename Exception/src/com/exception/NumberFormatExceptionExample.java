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
		} catch(ArithmeticException | NumberFormatException e) { //��Ƽĳġ
			e.printStackTrace(); //�޼����� ������ �Ϸ��� ���������� ǥ��
			System.out.println(e.getMessage());//�����޽��� ǥ��
			System.out.println("������ 0���� �����ø� �ȵ˴ϴ�.");
			System.out.println("���������� ������ �ƴմϴ�.");
			value2 = 200;
//		} catch(NumberFormatException e) {
//			System.out.println("���������� ������ �ƴմϴ�.");
//			value2 = 200;
		} catch (Exception e) { //���ܰ��� �Ҹ�Ȯ�� ��쿣 � ���ܰ� �߻��ϴ���� �� ���ܸ� ������ ���ִ� ���� �ֻ��� Ÿ���� Exception�� ����Ѵ�.
			System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
		} finally { //�ݵ�� �ѹ� �����Ѵ�.
			System.out.println("����ó���� ���� ������ �Ϸ��մϴ�.");
		}
		int result = value1 + value2;
		System.out.println(value1 + "+" + value2 + "=" + result);		
	}
//	ĳġ���� �ѹ� ����Ǹ� �������� �������� �ʴ´�.
	
}
