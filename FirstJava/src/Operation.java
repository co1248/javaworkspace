
public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1 = "���ѹα�";
//		String str2 = "������";
//		
//		System.out.println(str1 + str2 + 2021); //�ڵ�����ȯ
//		String str1 = "abc";
//		String str2 = "abc"; //�������̸� ���� �Ҵ�Ǵ°� �ƴϰ� ���� �ּҸ� ������.
//		
//		System.out.println(str1 == str2); //true
//		
//		String str3 = new String("abc");
//		String str4 = new String("abc");
//		
//		System.out.println(str3 == str4); //false �ּҰ��� ���Ѵ�.
		
		// &&, ||, !
		//���մ��Կ����� +=, -=, *=
//	    int x = 10;
//	    x += 20; // x = x + 20
//	    System.out.println(x);
	    
	    //���׿�����
//	    int score = 95;
//	    char grade = (score > 90) ? 'A' : 'B'; //������� ���缭 �־���� �Ѵ�.
//	    System.out.println(grade);
		
		int apple = 123;
		int bucket = 10;
		
//		int numBucket = (int)(Math.ceil((double)apple/bucket));
//		System.out.println(numBucket);
		
		int numBucket = apple/bucket + (apple % bucket > 0 ? 1 : 0);
		System.out.println(numBucket);
		
	}

}
