package access.package2;
import access.package1.A;

public class C {
	
//	A a1 = new A(true);
//	A a2 = new A(1);
//	A a3 = new A("a");
	
	public C() {
		A a= new A();
		a.field1 = 1;
		a.field2 = 1;
		a.field3 = 1;
		
		a.method1();
		a.method2();
		a.method3();
	}

}
