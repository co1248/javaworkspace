package com.mycompany;
import com.hankook.*;
//import com.hankook.SnowTire;
//import com.hankook.Tire; //다른패키지의 클래스를 쓸려면 임포트를 해야한다.
//import com.kumho.Tire; 클래스이름이 같으면 안된다.

public class Car {
	Tire t = new Tire(); //생성자를 호출할때도 해당클래스의 생성자는 public해야한다.
	com.kumho.Tire t2 = new com.kumho.Tire();
	SnowTire t3 = new SnowTire();
	
}
