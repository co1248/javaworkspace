package com.cooperation;

public class TakeTest {

	public static void main(String[] args) {
		Student james = new Student("james",1,5000);
		Student tomas = new Student("tomas",2,10000);
		
		Bus bus100 = new Bus(100);	
		Subway subway2 = new Subway("2È£¼±");
		
		james.takeBus(bus100);
		bus100.showInfo();
		
		tomas.takeSubway(subway2);
		subway2.showInfo();		
	}
}
