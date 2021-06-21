package com.member;

import java.text.SimpleDateFormat;
import java.util.*;

public class ByteToStringTest {

	public static void main(String[] args) {
//		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
//		String str1 = new String(bytes);
//		System.out.println(str1);
//		String str2 = new String(bytes, 6, 4);
//		System.out.println(str2);
		
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch (sex) {
			case '1' :
			case '3' :
				System.out.println("남자 입니다.");
				break;
			case '2' :
			case '4' :
				System.out.println("여자 입니다.");
				break;
		}
		
//		Integer  i = new Integer(100); //참조형으로 사용가능
//		Double d = new Double(20.3);
//		System.out.println(i.toString());
//		System.out.println(d.toString());
		
		int x = 10;
		Integer i = x;//오토박싱(원래 캐스팅 해야 한다.) Integer i = (Integer)x;
		Integer i2 = 30;
		int y = i2;
		System.out.println(i);
		System.out.println(i2);
		
		Object obj = y; //new Integer(y); 
		System.out.println(y);
		System.out.println(i + i2);	
		
		int i3 = Integer.parseInt("100");
		double d = Double.parseDouble("23.1");
		
		Date d2 = new Date(); //오늘날짜
		System.out.println(d2);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시");
		System.out.println(sdf.format(d2));
		System.out.println(d2.getYear());
		System.out.println(d2.getMonth() + 1);
		
		Calendar now = Calendar.getInstance();//캘린더 클래스는 직접생성이 불가능해서 메소드를 이용해서 생성
		System.out.println(now);
		System.out.println(now.get(Calendar.YEAR));
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1 ;
		int day = now.get(Calendar.DAY_OF_MONTH);

		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		    case Calendar.MONDAY:
				strWeek = "월";
			    break;
		    case Calendar.TUESDAY :
			    strWeek = "화"; 
			    break;
			case Calendar.WEDNESDAY:
		    	strWeek = "수";
		    	break;
			case Calendar.THURSDAY :
			    strWeek = "목";
			    break;
			case Calendar.FRIDAY:
			    strWeek = "금";
			    break;
			case Calendar.SATURDAY:
			    strWeek = "토";
			    break;
			default:
			    strWeek = "일";
		    } 
			
			int amPm = now.get(Calendar.AM_PM);
			String strAmPm = null;
			if(amPm == Calendar.AM) {
		     	strAmPm = "오전";
			} else {
		    	strAmPm = "오후";
			}
		
			int hour = now.get(Calendar.HOUR);
			int minute = now.get(Calendar.MINUTE);
			int second = now .get(Calendar.SECOND);
		
			System.out.print(year + "년 " );
			System.out.print(month + "월 ");
			System.out.println(day + "일 ");
			System.out.print(strWeek + "요일 ");
			System.out.println(strAmPm + " ");
			System.out.print(hour + "시 ");
			System.out.print(minute + "분 " );
			System.out.println(second + "초 ");	
	}
}
