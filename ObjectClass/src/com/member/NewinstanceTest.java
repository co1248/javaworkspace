package com.member;

public class NewinstanceTest {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("com.number.SendAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
		    } catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
	    	} catch (ClassNotFoundException e) {
			    e.printStackTrace();
	    	}

		try {
			Class clazz2 = Class.forName("com.number.ReceiveAction");
			Action action2 = (Action) clazz2.newInstance();
			action2.execute();
	   	} catch (InstantiationException e) {
				e.printStackTrace();
		} catch (IllegalAccessException e) {
				e.printStackTrace();
		} catch (ClassNotFoundException e) {
			    e.printStackTrace();
		}
	}
}
