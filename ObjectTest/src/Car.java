
public class Car {
	//변수(속성)
	String company = "현대자동차"; //멤버들 멤버변수
//	String model = "그랜져";
//	String color = "검정";
//	int maxSpeed = 350;
//	int speed; //기본값이 초기화 되었다. 0
	
//	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
//	//생성자(멤버변수를 초기화)
//	Car() {
//		this("한성자동차", "BMW"); //나 아닌 나랑 같은 클래스안에 정의 되어있는 다른 생성자를 호출함
//		company = "현대자동차";
//		model = "그랜져";
//	}
//	Car(변수가 몇개있냐로 정의) {}
//	Car(String c, String m) { //매개변수를 받아옴
//		company = c;
//		model = m;
//	}

	//생성자 오버로딩 여러개(갯수 제한 X, 매개변수의 갯수는 달라야 한다.)
	//생성자를 적으면 기본으로 자동생성자가 생성된다. 자바는 기본으로 자동으로 생성되게 만들어져있다.
	Car() {
		
	}
	Car(String model) {
		this(model, "은색", 250);
	}
	Car(String model, String color) {
		this(model, color, 250);
	}
	Car(String model, String color, int maxSpeed) {
		this.model = model; //this.클래스의 매개변수 = 생성자의 매개변수 (두 변수의 이름이 같을 때)
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//메소드(기능)
    void keyTurnOn() {
    	System.out.println("시동을 걸다.");
    }
    void keyTurnOff() {
    	System.out.println("시동을 끄다.");
    }
    void accel() {
    	for(int i = 0; i < 200; i++) {
    		speed = i;
    		System.out.println(speed);
    	}
    	
    }
}
