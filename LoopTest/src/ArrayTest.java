import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a, b, c;
//		a = 10;
//		b = 20;
//		c = 30;
		
		//배욜
		//1차원배열, 2차원배열
		
//		int[] arr; //배열의 선언
//		arr = new int[10]; //배열의 생성. 변수의 갯수를 넣어줘야 한다. 연속된 공간에 할당되어진다. 0으로 자동 초기화
		//index 0,1,2,3,4,5,6,7,8,9
		
//		int[] arr = new int[10]; //생성과 선언을 동시에
//		arr[0] = 10; //배열의 초기화. 변수처럼 사용 변수명대신 인덱스 사용
//		arr[9] = 100;
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[9]);
		
//		int[] arr = {1,2,3,4,5}; //생성과 선언과 초기화를 동시에
//		int[] score = new int[8];
//		score[0] = 10;
//		score[1] = 20;
//		score[2] = 30;
//		score[3] = 40;
//		score[4] = 50;
		
		
		
//		int sum = score[0] + score[1] + score[2] + score[3] + score[4];
//		System.out.println(sum);
		
		//배열의 활용 반복문
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
//		System.out.println("총점은 " + total + "입니다.");
//		avg = (double)total / score.length;
//		avg = (int)(avg * 100) / 100.0; //버림
//		avg = (int)(avg * 100 + 0.5) / 100.0; //반올림
//		avg = (int)(avg * 100 + 0.9) / 100.0; //올림
//		System.out.println("평균은 " + avg + "입니다.");
		
//		int[] score = {1,2,3,4,5}; //1과 4 위치 바꾸기
//		System.out.println("swap이전");
//		for(int i = 0; i < score.length; i++) {
//			System.out.print(score[i] + "   ");
//		}
//		int temp;//임시저장공간
//		temp = score[0];
//		score[0] = score[3];
//		score[3] = temp;
//		System.out.println("swap이후");
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
//				if(score[i] < score[j]) { //내림차순
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
//		score = new int[5][3]; //앞에 행의크기(줄의갯수) 뒤에 열의 크기(칸의 갯수)라고 한다.
		
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
//		}; //세미콜론 붙여야 한다. 비워둘 순 없다.
		
		
//		System.out.println(score[0][0]);
//		System.out.println(score[0][1]);
//		System.out.println(score[4][2]);
		
//		for(int i = 0; i < score.length; i++) { //행의 크기를 가져온다.
//			for(int j = 0; j < score[i].length; j++) { //score[i].length 행의 위치값을 말하는 i를 넣어서 열을 표시
//				System.out.print(score[i][j] + " ");
//			}
//		    System.out.println();
//		}
		
//		int[] score = {1,2,3,4,5};
		
//		for(변수의 선언 : 배열의 이름) { //향상된 for문
//			실행문
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
//		for(int[] temp : score) { //일차원 배열 타입의 변수를 정의 : 배열의 이름
//			for(int num : temp) { // 배열값의 타입과 동일한 변수 : 일차원 배열 타입의 변수
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
	    int[] scores = null; //배열의 초기값 null
		Scanner scan = new Scanner(System.in);
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("--------------------------");
			System.out.println("선택> ");
			
			int selectNo = scan.nextInt();
			
			if(selectNo == 1) {
				System.out.println("학생수>");
				studentNum = scan.nextInt();
				scores = new int [studentNum];
			} else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("학생" + i + ">");
					scores[i] = scan.nextInt();
				}
			} else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("학생" + i + "의 점수 :" + scores[i]);
				}
			} else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				for(int i = 0; i < scores.length; i++) {
					if(max < scores[i]) { //최댓값,가장큰값
						max = scores[i];
					}
					sum += scores[i];
				}
				System.out.println("최고점수: " +  max);
				System.out.println("평균점수: " +  (double)sum/studentNum); //평균을 실수화 시키는 것을 잊지 말자.
			} else {
				run = false;
			}
	     }
		 System.out.println("프로그램 종료");	
		
		
	}
}
