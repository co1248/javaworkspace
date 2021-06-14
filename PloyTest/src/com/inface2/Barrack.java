package com.inface2;

public class Barrack extends Building implements Liftable {
	
	LiftableImpl lf = new LiftableImpl(); //생성을 통해서 포함관계를 만든다.

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
