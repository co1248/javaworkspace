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
				System.out.println("���� �Դϴ�.");
				break;
			case '2' :
			case '4' :
				System.out.println("���� �Դϴ�.");
				break;
		}
		
//		Integer  i = new Integer(100); //���������� ��밡��
//		Double d = new Double(20.3);
//		System.out.println(i.toString());
//		System.out.println(d.toString());
		
		int x = 10;
		Integer i = x;//����ڽ�(���� ĳ���� �ؾ� �Ѵ�.) Integer i = (Integer)x;
		Integer i2 = 30;
		int y = i2;
		System.out.println(i);
		System.out.println(i2);
		
		Object obj = y; //new Integer(y); 
		System.out.println(y);
		System.out.println(i + i2);	
		
		int i3 = Integer.parseInt("100");
		double d = Double.parseDouble("23.1");
		
		Date d2 = new Date(); //���ó�¥
		System.out.println(d2);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh��");
		System.out.println(sdf.format(d2));
		System.out.println(d2.getYear());
		System.out.println(d2.getMonth() + 1);
		
		Calendar now = Calendar.getInstance();//Ķ���� Ŭ������ ���������� �Ұ����ؼ� �޼ҵ带 �̿��ؼ� ����
		System.out.println(now);
		System.out.println(now.get(Calendar.YEAR));
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1 ;
		int day = now.get(Calendar.DAY_OF_MONTH);

		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		    case Calendar.MONDAY:
				strWeek = "��";
			    break;
		    case Calendar.TUESDAY :
			    strWeek = "ȭ"; 
			    break;
			case Calendar.WEDNESDAY:
		    	strWeek = "��";
		    	break;
			case Calendar.THURSDAY :
			    strWeek = "��";
			    break;
			case Calendar.FRIDAY:
			    strWeek = "��";
			    break;
			case Calendar.SATURDAY:
			    strWeek = "��";
			    break;
			default:
			    strWeek = "��";
		    } 
			
			int amPm = now.get(Calendar.AM_PM);
			String strAmPm = null;
			if(amPm == Calendar.AM) {
		     	strAmPm = "����";
			} else {
		    	strAmPm = "����";
			}
		
			int hour = now.get(Calendar.HOUR);
			int minute = now.get(Calendar.MINUTE);
			int second = now .get(Calendar.SECOND);
		
			System.out.print(year + "�� " );
			System.out.print(month + "�� ");
			System.out.println(day + "�� ");
			System.out.print(strWeek + "���� ");
			System.out.println(strAmPm + " ");
			System.out.print(hour + "�� ");
			System.out.print(minute + "�� " );
			System.out.println(second + "�� ");	
	}
}
