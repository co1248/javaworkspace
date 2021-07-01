package com.funcInter5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class FunctionExample {
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿", 90, 96),
			new Student("�ſ��", 95, 93)
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
		System.out.println("[�л� �̸�]");
		printString( t -> t.getName() );
		
		System.out.println("[���� ����]");
		printInt( t -> t.getEnglishScore() );
		
		System.out.println("[���� ����]");
		printInt( t -> t.getMathScore() );
		
		System.out.println("[���� ���]");	
		double engAvg = avg( t -> t.getEnglishScore() );
		System.out.println(engAvg);
		
		System.out.println("[���� ���]");
		double mathAvg = avg( t -> t.getMathScore() );
		System.out.println(mathAvg);
		
		System.out.println("[��ü ����]");
		int subjectTotal = subTotal( t -> t.getSubjectTotal() );
		System.out.println(subjectTotal);
	}
}
