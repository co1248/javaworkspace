package com.member;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		int endDay;
		int startWeek;

		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력 : ");
		int year = sc.nextInt();
		System.out.println("월 입력 : ");
		int month = sc.nextInt();
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();

		
		sDay.set(year, month - 1, 1); //이번달1일
		eDay.set(year, month, 1); //다음달1일
		
		eDay.add(Calendar.DATE, -1);//이번달 마지막날
		
		
		startWeek = sDay.get(Calendar.DAY_OF_WEEK);//1일의 시작요일
		endDay = eDay.get(Calendar.DAY_OF_MONTH);//이번달 마지막날이 며칠인지
		int nextStartWeek = (eDay).get(Calendar.DAY_OF_WEEK);//1일의 시작요일
		
		System.out.println("          " + year + "년 " + month + "월");
		System.out.println(" SU MO TU WE TH FR SA");
//		for(int i = 1; i < startWeek; i++) {
//				System.out.print("   ");
//			}
//		for(int i = 1, s = startWeek; i <= endDay; i++, s++) {
//			System.out.print(i < 10 ? "  " + i : " " + i);
//			if(s % 7 == 0) {
//				System.out.println();
//			}
//		}
		
		for(int i = 1; i < startWeek; i++) {
			System.out.print("   ");
		}
		
		for(int i = 1, s = startWeek; i <= endDay; i++, s++) {
			System.out.print(i < 10 ? "  " + i : " " + i);
			if(s % 7 == 0) {
				System.out.println();
			}
		}
		for(int j = 1; j <= nextStartWeek + 6; j++) {
			System.out.print(j < 10 ? "  " + j : " " + j);
			if(j == (nextStartWeek-1)) {
				System.out.println();
		}
}
}
}
