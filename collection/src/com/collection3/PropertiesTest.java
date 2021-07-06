package com.collection3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("src/com/collection3/Input.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("data"));
		
		String[] data = prop.getProperty("data").split(","); //쪼개서 1차원 배열로
		
		int max = Integer.parseInt(data[0]);
		int min = Integer.parseInt(data[0]);
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < data.length; i++) {
			int intValue = Integer.parseInt(data[i]);
			
			if(max < intValue) {
				max = intValue;
			} else if(min > intValue) {
				min = intValue;
			}
			sum += intValue;
		}
		avg = (double) sum/data.length;
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
//		Properties prop = new Properties();
//		
//		prop.setProperty("timeout", "30");
//		prop.setProperty("language", "kr");
//		prop.setProperty("size", "10");
//		prop.setProperty("capacity", "10");
//		
//		Enumeration e = prop.propertyNames();
//		
//		while(e.hasMoreElements()) {
//			String key = (String)e.nextElement();
//			System.out.println(key + ": " + prop.getProperty(key));
//		}
	}
}
