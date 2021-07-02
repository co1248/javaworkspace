package com.funcInter5;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;

public class PredicateExample2 {
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿",  "����", 90),
			new Student("�����",  "����", 90),
			new Student("���ڹ�",  "����", 95),
			new Student("���ѳ�",  "����", 92)
			);
	
//	private static int max(IntBinaryOperator function) {
//		int max = 0;
//		for(Student student: list) {
//			max = function.applyAsInt(max, student.getScore());
//		}
//
//		return max;
//	}
	private static int max(ToIntFunction<Student> function) {
		int max = 0;
		int score = 0;
		for(Student s: list) {
			score = function.applyAsInt(s);
			if(max < score) {
				max = score;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int max = max(
				s -> s.getScore()
				);
		
//		int max = max(
//				(a, b) -> {
//					if(a >= b) return a;
//					else return b;
//				}
//				);
		System.out.println("�ְ�����:" + max);
	}
}
