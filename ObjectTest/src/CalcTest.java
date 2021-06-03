
public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calc c = new Calc();
//		c.add(); //함수의 호출
//		c.add2(10, 20);
//		System.out.println(c.add3(30, 40));
//		int sum = c.add3(70, 80);
//		System.out.println(sum);
//		c.add4(100, 200);
//		c.minus(10, 10);
//		c.multiply(10, 10);
//		c.divide(10, 7);
//		System.out.println(c.minus(10, 10));
//		System.out.println(c.multiply(10, 10));
//		System.out.println(c.divide(10, 7));
//		int s1 = c.sum(1,2,3); //c.sum(null)매개변수가 객채다.
//		System.out.println(s1);
//		int s2 = c.sum(1,2,3,4,5,6,7); 
//		System.out.println(s2);
		
//		double result = Calc.pi * 10 * 10;
//		System.out.println(result);
//		int sum = Calc.plus(10, 20);
//		System.out.println(sum);
//		
//		Calc c1 = new Calc();
//		Calc c2 = new Calc();
//		
//		c1.iv = 100;
//		System.out.println(c1.iv);
//		System.out.println(c2.iv);
//		
//		c1.pi = 123.456; //하나의 메모리 영역을 똑같이 사용한다.(공유한다)
//		System.out.println(c1.pi);
//		System.out.println(c2.pi);
		
//		System.out.println(c.PI);
//		c.PI = 123.456; 상수라 불가
		
		Calc c = new Calc(); //기본생성자는 생성자가 아무것도 없을 때 가능
		//기본생성자를 쓰고싶으면 따로 정의를 해줘야 한다.
		
		Calc c2 = new Calc(0.98);
		System.out.println(c2.Gravity);
		

	}

}
