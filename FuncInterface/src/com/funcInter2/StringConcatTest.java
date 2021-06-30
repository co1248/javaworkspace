package com.funcInter2;

public class StringConcatTest {

	public static void main(String[] args) {
		String s1 = "java ";
		String s2 = "version 10";
		
		StringConcat concat = (a, b) ->  System.out.println(a + b);
		concat.makeString(s1, s2);
		
//		StringConcatImpl sc = new StringConcatImpl();
//		sc.makeString(s1, s2);
	
	}
}
