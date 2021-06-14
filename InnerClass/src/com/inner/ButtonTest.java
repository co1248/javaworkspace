package com.inner;

public class ButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b = new Button();
		CallListener c = new CallListener();
		MessageListener m = new MessageListener();
		
		b.setOnClickListener(c);
		b.touch();
		b.setOnClickListener(m);
		b.touch();

	}

}
