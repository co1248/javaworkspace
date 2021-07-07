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
//		while(!st.empty()) { //비어 있지 않으면 읽어와라
//			System.out.println(st.pop()); //스텍은 가장 나중에 들어간 값을 먼저읽어온다.
//		}
		goURL("1.네이버");
		goURL("2.다음");
		goURL("3.네이트");
		goURL("4.구글");
		
		printURL();
		
		goBack();
		System.out.println("뒤로가기 클릭");
		printURL();
		
		goBack();
		System.out.println("뒤로가기 클릭");
		printURL();
		
		goForward();
		System.out.println("앞으로가기 클릭");
		printURL();
		
		goURL("휴먼교육센터");
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
		System.out.println("현재 사이트: " + back.peek());
	}
}
