package com.access.package3;

public class Car {
	private int speed;// ĸ��ȭ �Ӽ��� �����ϴ� ���
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
//	public int getSpeed() { //get�޼ҵ� ���ǵǾ��ִ� �ɹ������� ������ Ÿ�Ի��, �Ű����� �Ⱦ���.
//		return speed;
//	}
//	
//	public void setStop(int speed) { //set�޼ҵ� �Ű������� ���´�.
//		if(speed < 0) {
//			return; //void�Լ����� return�� ���ǹ��� ���� ��� �� �Լ��� ������ �����Ѵ�.
//		} else {
//			this.speed = speed;
//		}
//	}
//	
//	public boolean isStop() { //is���¸� ǥ���ϴ� �޼ҵ�
//		return stop;
//	}
//	
//	public void setStop(boolean stop) {
//		this.stop = stop;
//	}
	

}
