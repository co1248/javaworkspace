package com.inface2;

public class LiftableImpl implements Liftable {

	@Override
	public void liftOff() {
		// TODO Auto-generated method stub
		System.out.println("turbo������� �̷��Ѵ�.");
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("�����δ�.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("�����.");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("�����Ѵ�.");
	}

}
