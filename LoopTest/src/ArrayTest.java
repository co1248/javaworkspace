import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a, b, c;
//		a = 10;
//		b = 20;
//		c = 30;
		
		//���
		//1�����迭, 2�����迭
		
//		int[] arr; //�迭�� ����
//		arr = new int[10]; //�迭�� ����. ������ ������ �־���� �Ѵ�. ���ӵ� ������ �Ҵ�Ǿ�����. 0���� �ڵ� �ʱ�ȭ
		//index 0,1,2,3,4,5,6,7,8,9
		
//		int[] arr = new int[10]; //������ ������ ���ÿ�
//		arr[0] = 10; //�迭�� �ʱ�ȭ. ����ó�� ��� �������� �ε��� ���
//		arr[9] = 100;
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[9]);
		
//		int[] arr = {1,2,3,4,5}; //������ ����� �ʱ�ȭ�� ���ÿ�
//		int[] score = new int[8];
//		score[0] = 10;
//		score[1] = 20;
//		score[2] = 30;
//		score[3] = 40;
//		score[4] = 50;
		
		
		
//		int sum = score[0] + score[1] + score[2] + score[3] + score[4];
//		System.out.println(sum);
		
		//�迭�� Ȱ�� �ݺ���
//		int sum = 0;
//		for(int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
//		System.out.println(sum);
//		
//		String[] strArr = new String[3];
//		strArr[0] = "a";
//		strArr[1] = "b";
//		strArr[2] = "c";
//		for(int i = 0; i < strArr.length; i++) {
//			System.out.println(strArr[i]);
//		}
//		
//		int[] score = {98,78,87};
//		int total = 0;
//		double avg = 0.0;
//		for(int i = 0; i < score.length; i++) {
//			total += score[i];
//		}
//		System.out.println("������ " + total + "�Դϴ�.");
//		avg = (double)total / score.length;
//		avg = (int)(avg * 100) / 100.0; //����
//		avg = (int)(avg * 100 + 0.5) / 100.0; //�ݿø�
//		avg = (int)(avg * 100 + 0.9) / 100.0; //�ø�
//		System.out.println("����� " + avg + "�Դϴ�.");
		
//		int[] score = {1,2,3,4,5}; //1�� 4 ��ġ �ٲٱ�
//		System.out.println("swap����");
//		for(int i = 0; i < score.length; i++) {
//			System.out.print(score[i] + "   ");
//		}
//		int temp;//�ӽ��������
//		temp = score[0];
//		score[0] = score[3];
//		score[3] = temp;
//		System.out.println("swap����");
//		for(int i = 0; i < score.length; i++) {
//			System.out.print(score[i] + " ");
//		}
		
//		int[] lotto = new int[45];
//		for(int i = 0; i < lotto.length; i++) {
//			lotto[i] = i + 1;
////			System.out.print(lotto[i] + " ");
//		}
//		int r1 = 0;
//		int r2 = 0;
//		
//		for(int i = 0; i < lotto.length * 2; i++) {
//			int temp;
//			r1 = (int)(Math.random() * 45);
//			r2 = (int)(Math.random() * 45);
//			
//			temp = lotto[r1];
//			lotto[r1] = lotto[r2];
//			lotto[r2] = temp;
//		}
//		for(int i = 0; i < 6; i++) {
//			System.out.println(lotto[i]);
//		}
		
//		int[] score = {36,65,3,12,78};
//		int[] score2 = new int[score.length];
//		for(int i = 0; i < score.length; i++) {
//			for(int j = i + 1; j < score.length; j++) {
//				if(score[i] < score[j]) { //��������
//					int temp;
//					temp = score[i];
//					score[i] = score[j];
//					score[j] = temp;
//				}
//			}
//		}
//		for(int i = 0; i < score.length; i++) {
//			System.out.print(score[i] + " ");
//		
//		}
		
//		int[][] score;
//		score = new int[5][3]; //�տ� ����ũ��(���ǰ���) �ڿ� ���� ũ��(ĭ�� ����)��� �Ѵ�.
		
//		int[][] score = new int[5][3];
//		score[0][0] = 1;
//		score[0][1] = 2;
//		score[4][2] = 15;
		
//		int[][] score = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9},
//				{10,11,12},
//				{13,14,15}
//		}; //�����ݷ� �ٿ��� �Ѵ�. ����� �� ����.
		
		
//		System.out.println(score[0][0]);
//		System.out.println(score[0][1]);
//		System.out.println(score[4][2]);
		
//		for(int i = 0; i < score.length; i++) { //���� ũ�⸦ �����´�.
//			for(int j = 0; j < score[i].length; j++) { //score[i].length ���� ��ġ���� ���ϴ� i�� �־ ���� ǥ��
//				System.out.print(score[i][j] + " ");
//			}
//		    System.out.println();
//		}
		
//		int[] score = {1,2,3,4,5};
		
//		for(������ ���� : �迭�� �̸�) { //���� for��
//			���๮
//		}
		
//		for(int num : score) {
//			System.out.println(num);
//		}
		
//		int[][] score = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9},
//				{10,11,12},
//				{13,14,15}
//		}; 
//				
//		for(int[] temp : score) { //������ �迭 Ÿ���� ������ ���� : �迭�� �̸�
//			for(int num : temp) { // �迭���� Ÿ�԰� ������ ���� : ������ �迭 Ÿ���� ����
//				System.out.print(num + " ");
//			}
//			System.out.println();
//		}
		
//		int[][] score = new int[5][3];
//		int sum = 0;
//		for(int i = 0; i < score.length; i++) {
//		   for(int j = 0; j < score[i].length; j++) {
//			   score[i][j] = (i*score[i].length) + j + 1;
//			   sum += score[i][j];
//		   }
//		}
//		System.out.println(sum);
//		
		boolean run = true;
	    int studentNum  = 0;
	    int[] scores = null; //�迭�� �ʱⰪ null
		Scanner scan = new Scanner(System.in);
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
			System.out.println("--------------------------");
			System.out.println("����> ");
			
			int selectNo = scan.nextInt();
			
			if(selectNo == 1) {
				System.out.println("�л���>");
				studentNum = scan.nextInt();
				scores = new int [studentNum];
			} else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("�л�" + i + ">");
					scores[i] = scan.nextInt();
				}
			} else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("�л�" + i + "�� ���� :" + scores[i]);
				}
			} else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				for(int i = 0; i < scores.length; i++) {
					if(max < scores[i]) { //�ִ�,����ū��
						max = scores[i];
					}
					sum += scores[i];
				}
				System.out.println("�ְ�����: " +  max);
				System.out.println("�������: " +  (double)sum/studentNum); //����� �Ǽ�ȭ ��Ű�� ���� ���� ����.
			} else {
				run = false;
			}
	     }
		 System.out.println("���α׷� ����");	
		
		
	}
}
