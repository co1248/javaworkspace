package com.inface2;

public class Barrack extends Building implements Liftable {
	
	LiftableImpl lf = new LiftableImpl(); //������ ���ؼ� ���԰��踦 �����.

	@Override
	public void liftOff() {
		// TODO Auto-generated method stub
		lf.liftOff();	
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		lf.move(x, y);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		lf.stop();
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		lf.land();
	}

}
