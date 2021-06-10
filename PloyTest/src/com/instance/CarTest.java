package com.instance;

public class CarTest {

	public static void main(String[] args) {
		FireCar fc = new FireCar();
		Ambulance ab = new Ambulance();
		
		work(fc); //CarŸ������ �ڵ�����ȯ
		work(ab);
	}
	public static void work(Car c) {
		if(c instanceof FireCar) {
			FireCar fc = (FireCar) c;//��������ȯ
			fc.fire();
		} else if(c instanceof Ambulance) {
			Ambulance ab = (Ambulance) c;
			ab.siren();
		}
	}
}
