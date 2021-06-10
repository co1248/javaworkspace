package com.instance;

public class CarTest {

	public static void main(String[] args) {
		FireCar fc = new FireCar();
		Ambulance ab = new Ambulance();
		
		work(fc); //Car타입으로 자동형변환
		work(ab);
	}
	public static void work(Car c) {
		if(c instanceof FireCar) {
			FireCar fc = (FireCar) c;//강제형변환
			fc.fire();
		} else if(c instanceof Ambulance) {
			Ambulance ab = (Ambulance) c;
			ab.siren();
		}
	}
}
