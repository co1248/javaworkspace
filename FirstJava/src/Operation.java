
public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1 = "대한민국";
//		String str2 = "만만세";
//		
//		System.out.println(str1 + str2 + 2021); //자동형변환
//		String str1 = "abc";
//		String str2 = "abc"; //같은값이면 새로 할당되는게 아니고 같은 주소를 가진다.
//		
//		System.out.println(str1 == str2); //true
//		
//		String str3 = new String("abc");
//		String str4 = new String("abc");
//		
//		System.out.println(str3 == str4); //false 주소값을 비교한다.
		
		// &&, ||, !
		//복합대입연산자 +=, -=, *=
//	    int x = 10;
//	    x += 20; // x = x + 20
//	    System.out.println(x);
	    
	    //삼항연산자
//	    int score = 95;
//	    char grade = (score > 90) ? 'A' : 'B'; //결과값에 맞춰서 넣어줘야 한다.
//	    System.out.println(grade);
		
		int apple = 123;
		int bucket = 10;
		
//		int numBucket = (int)(Math.ceil((double)apple/bucket));
//		System.out.println(numBucket);
		
		int numBucket = apple/bucket + (apple % bucket > 0 ? 1 : 0);
		System.out.println(numBucket);
		
	}

}
