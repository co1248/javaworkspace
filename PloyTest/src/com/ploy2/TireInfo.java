package com.ploy2;

public abstract class TireInfo implements Tire{//��������϶� �������̵尡 �ʿ���ٸ� abstract�� ����� �������̵���ص� �ȴ�.
	//�ʵ�
		public int maxRotation;     			//�ִ� ȸ����(�ִ� ����)
		public int accumulatedRotation;		//���� ȸ����
		public String location;       			//Ÿ�̾��� ��ġ

		//������
		public TireInfo(String location, int maxRotation) {
			this.location = location;
			this.maxRotation = maxRotation;
		}

//		@Override
//		public boolean roll() {
//			return false;
//		}
}