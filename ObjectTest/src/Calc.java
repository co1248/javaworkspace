
public class Calc {
	//메소드(기능)
	//리턴타입 메소드명([매개변수1,....]-생략가능) {
	//    [return 리턴값;]-생략가능
	//}
	//리턴타입(void, 기본형타입, 참조형-클래스타입)
	
//	public void add() {
//		System.out.println(3 + 5);
//	}
//	
//	public void add2(int x, int y) {
//		System.out.println(x + y);
//	}
//	
//	public int add3(int x, int y) {
//		int sum = x + y;
//		return sum;
//	}
//	
//	public double add4(double x, double y) { //형변환가능
//		return x + y;
//	}
	
//	public int minus(int x, int y) {
//		return x - y;
//	}
//	public int multiply(int x, int y) {
//		return x * y;
//	}
//	public double divide(int x, int y) {
//		return (double)x / y;
//	}
//	
//	public int sum(int ... values) { //가변형 메소드, 가변형함수
//		//값이 배열구조로 넘어온다.
//		int sum = 0;
//		for(int num : values) {
//			sum += num;			
//		}
//		return sum;
//	}
	
	//오버로딩
	//1. 메소드의 이름이 같아야 한다.
	//2. 단 매개변수의 타입 또는 갯수가 달라야 한다.
	
//	void add() {
//		System.out.println(5 + 7);
//	}
//	
//	void add(int x) {
//		System.out.println(x);
//	}
	
//	int add(int x) { --리턴값이 다른건 오버로딩에 조건이 아니다.
//		System.out.println(x);
//	}
	
//	void add(double x) {
//		System.out.println(x);
//	}
//	
//	void add(int x, int y) {
//		System.out.println(x + y);
//	}
//	
//	void add(int x, long y) {
//		System.out.println(x + y);
//	}
//	
//	void add(long x, int y) {
//		System.out.println(x + y);
//	}
	
//	add(10L,20)
	
	//변수 - 인스턴스 변수 (int iv) 생산자에 의한 초기화 가능, 생성할 때 마다 할당되어 짐
	//    - 클래스(static정적)변수 (static int cv) 생산자에 의한 초기화 불가, 한번만 할당 되어짐(모든 객체가 공유한다.), 객체의 생성없이 사용가능 (클래스이름.변수명)
	//상수 - 변경이 불가한 변수 (final double PI), 반드시 초기화 해서 선언한다. 생성자를 사용한 초기화가 가능하다.
	//생성자
	//메소드 - 인스턴스 메소드 (void add() {})
	//     - 클래스(static) 메소드 (static void add() {}), 객체의 생성없이 사용가능(클래스이름.메소드명())
    int iv;
    final double Gravity;
    
//	final static double PI = 3.14;
    
    Calc() {
    	this(123.4);
    }
    
    Calc(double Gravity) {
    	this.Gravity = Gravity;
    } //딱 한번 생성자로 상수 초기화 가능
    
    
    
    static int plus(int a, int b) {
    	return a + b;
    }
    static int min(int a, int b) {
    	return a - b;
    }
}
