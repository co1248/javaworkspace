import java.util.Scanner;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null; //weekŸ���� enum�� ���� �� �ִ� ����
		System.out.println("1 or 2 �Է�");
		Scanner sc = new Scanner(System.in);
		
		int week = sc.nextInt();
		if(week == 1) {
			today = Week.MONDAY;
		} else if(week == 2) {
			today = Week.TUESDAY;
		}
		
		System.out.println(today);

	}

}
