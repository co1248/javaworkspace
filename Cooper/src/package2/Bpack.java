package package2;

import package1.Apack;

public class Bpack extends Apack {
	
//	Apack ap = new Apack();
//	ap.y = 100; ���������Ҷ��� ��������.
	
	void printTest() {
		//x = 10;
		y = 20; //protacted ��Ű���� �ٸ����� ����ؼ� �� �� �ִ�.
		z = 30;
		
		//System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
