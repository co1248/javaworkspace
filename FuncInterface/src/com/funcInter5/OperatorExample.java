package com.funcInter5;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };
	
	public static int maxOriMin( IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		int max = maxOriMin(
				(a, b) -> {
					if(a >= b) return a;
					else return b;
				}
		);
		System.out.println("최대값: " + max);
		int min = maxOriMin(
				(a, b) -> {
					if(a <= b) return a;
					else return b;
				}
		);
		System.out.println("최소값: " + min);
		
	}
}
