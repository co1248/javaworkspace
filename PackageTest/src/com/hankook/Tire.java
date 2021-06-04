package com.hankook;

public class Tire {

	private Tire() { //기본생성자, private외부에서 객채셍성 못하게 막기
		//접근제어자 public
		//protected,default는 같은 패키지안에 있으면 제한을 두지 않는다. 외부는 못쓰게 막는다.
		//protected는 상속이 전재되면 패키지가 다르더라고 사용할 수 있다.
		//private은 같은 패키지 안이라도 못쓰게 막는다.

	}
}
