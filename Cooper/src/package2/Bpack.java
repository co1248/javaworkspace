package package2;

import package1.Apack;

public class Bpack extends Apack {
	
//	Apack ap = new Apack();
//	ap.y = 100; 직접생성할때는 쓸수없다.
	
	void printTest() {
		//x = 10;
		y = 20; //protacted 패키지가 다르지만 상속해서 쓸 수 있다.
		z = 30;
		
		//System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
