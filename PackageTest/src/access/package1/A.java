package access.package1;

public class A {
	
//	A a1 = new A(true);
//	A a2 = new A(1);
//	A a3 = new A("a");
	
//	public A(boolean b) {
//		
//	}
//	A(int b) {
//		
//	}
//	private A(String s) {
//		
//	}
	//필드(속성)
	public int field1;
	int field2;
	private int field3; //
	
	//생성자(거의 외부에서 쓰기 때문에 대부분 public으로)
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
		
	}
	//메소드
	public void method1() {}
	void method2() {}
	private void method3() {}

}
