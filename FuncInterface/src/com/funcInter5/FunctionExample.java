package com.funcInter5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class FunctionExample {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
			);
	
	public static void printString( Function<Student, String> function ) {
		for(Student student : list) {
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static void printInt( ToIntFunction<Student> function ) {
		for(Student student : list) {
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}
	
	public static double avg( ToIntFunction<Student> function ) {
		int sum = 0;
		for(Student student : list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / list.size();
		return avg;
	}
	
	private static int subTotal( ToIntFunction<Student> function ) {
		int total = 0;
		for(Student student : list) {
			total += function.applyAsInt(student);
		}
		return total;
	}
	
	
	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		printString( t -> t.getName() );
		
		System.out.println("[영어 점수]");
		printInt( t -> t.getEnglishScore() );
		
		System.out.println("[수학 점수]");
		printInt( t -> t.getMathScore() );
		
		System.out.println("[영어 평균]");	
		double engAvg = avg( t -> t.getEnglishScore() );
		System.out.println(engAvg);
		
		System.out.println("[수학 평균]");
		double mathAvg = avg( t -> t.getMathScore() );
		System.out.println(mathAvg);
		
		System.out.println("[전체 점수]");
		int subjectTotal = subTotal( t -> t.getSubjectTotal() );
		System.out.println(subjectTotal);
	}
}
