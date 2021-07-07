package com.stack;

import java.util.Stack;

public class StackTest {
	
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stack st = new Stack();
//		st.push("0");
//		st.push("1");
//		st.push("2");
//		while(!st.empty()) { //��� ���� ������ �о�Ͷ�
//			System.out.println(st.pop()); //������ ���� ���߿� �� ���� �����о�´�.
//		}
		goURL("1.���̹�");
		goURL("2.����");
		goURL("3.����Ʈ");
		goURL("4.����");
		
		printURL();
		
		goBack();
		System.out.println("�ڷΰ��� Ŭ��");
		printURL();
		
		goBack();
		System.out.println("�ڷΰ��� Ŭ��");
		printURL();
		
		goForward();
		System.out.println("�����ΰ��� Ŭ��");
		printURL();
		
		goURL("�޸ձ�������");
		printURL();
	}
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty()) {
			forward.clear();
		}
	}
	public static void goForward() {
		if(!forward.empty()) {
			back.push(forward.pop());
		}
	}
	public static void goBack() {
		if(!back.empty()) {
			forward.push(back.pop());
		}
	}
	public static void printURL() {
		System.out.println("back" + back);
		System.out.println("forward" + forward);
		System.out.println("���� ����Ʈ: " + back.peek());
	}
}
