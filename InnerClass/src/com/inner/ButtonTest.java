package com.inner;

public class ButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b = new Button();
		CallListener c = new CallListener();
		MessageListener m = new MessageListener();
		ChatingListener ch = new ChatingListener();
		
		b.setOnClickListener(c);
		b.touch();
		b.setOnClickListener(m);
		b.touch();
		b.setOnClickListener(ch);
		b.touch();
	}
}
