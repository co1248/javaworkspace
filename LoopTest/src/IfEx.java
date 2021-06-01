import java.io.IOException;
import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		String hak = ""; //변수는 초기화가 이루어진후 사용하여야 한다
//		String jum = "";
//        Scanner sc = new Scanner(System.in); //라이브러리의 개념이 클래스이다.
        //사용하려면 import를 해야한다.
        
//        int user, com;
//        System.out.println("1.가위 2.바위 3.보 입력");
//        user = sc.nextInt();
//        com = (int)(Math.random() * 3) + 1;
//        System.out.println("나는 " + user + "입니다.");
//        System.out.println("컴퓨터는 " + com + "입니다.");
//        if (user > 3 || user <1) {
//        	System.out.println("값을 잘못 입력하였습니다.");
//        }
//          else if (user - com == -2 || user - com == 1) {
//        	System.out.println("내가 이겼습니다.");  
//        } else if(user - com == -1 || user - com == 2) {
//        	System.out.println("내가 졌습니다.");      
//        } else {
//        	System.out.println("비겼습니다.");  
//        }
//        
       
//        랜덤값
//        Math.random() 0.0 <= r < 1.0
//        int r = (int)(Math.random() * 10 + 1 - 1)+ 1;
//        System.out.println(r);
       
//        System.out.println("첫번째 정수 입력");
//        int num1 = sc.nextInt();
//        System.out.println("두번째 정수 입력");
//        int num2 = sc.nextInt();
//        System.out.println("연산자 입력");
//        sc.nextLine(); //엔터를 받아준다.
//        String op = sc.nextLine(); //문자는 엔터값이 들어간다. 위의 엔터값을 먼저 가져온다.
//        
//        switch(op) {
//        case "+" : System.out.println(num1 + num2);
//        break;
//        case "-" : System.out.println(num1 - num2);
//        break;
//        case "*" : System.out.println(num1 * num2);
//        break;
//        case "/" : System.out.println(num1 / num2);
//        break;
//        default :
//        }
        
//        System.out.println("점수를 입력하세요");
//        int score = sc.nextInt();
//        
//        if(score > 100 || score < 0) { // 다중if문
//        	System.out.println("잘못 입력 하셨습니다.");
//        } else if(score >= 90) {
//        	if(score % 10 >= 8) {
//        		jum = "+";
//        	} else if(score % 10 <= 4) {
//        		jum = "-";
//        	} else {
//        		jum = "0";
//        	}
//        	hak = "A"; 
//
//        } else if(score >= 80) {
//           	if(score % 10 >= 8) {
//        		jum = "+";
//        	} else if(score % 10 <= 4) {
//        		jum = "-";
//        	} else {
//        		jum = "0";
//        	}
//        	hak = "B";
//        } else if(score >= 70) {
//           	if(score % 10 >= 8) {
//        		jum = "+";
//        	} else if(score % 10 <= 4) {
//        		jum = "-";
//        	} else {
//        		jum = "0";
//        	}
//        	hak = "C";
//        } else if(score >= 60) {
//           	if(score % 10 >= 8) {
//        		jum = "+";
//        	} else if(score % 10 <= 4) {
//        		jum = "-";
//        	} else {
//        		jum = "0";
//        	}
//        	hak = "D";
//        } else {
//        	hak = "F";
//        }
//        
//        System.out.println(hak + jum + "학점 입니다.");
        
        
//        if(score > 100 || score < 0) { // 다중if문
//        	System.out.println("잘못 입력 하셨습니다.");
//        } else if(score >= 90) {
//        	System.out.println("A학점 입니다.");
//        } else if(score >= 80) {
//        	System.out.println("B학점 입니다.");
//        } else if(score >= 70) {
//        	System.out.println("C학점 입니다.");
//        } else if(score >= 60) {
//        	System.out.println("D학점 입니다.");
//        } else {
//        	System.out.println("F학점 입니다.");
//        }
        
//        sc.nextLine(); //문자열을 입력받는다.
//        System.out.println("이름을 입력하세요");
//        String name = sc.nextLine();
//        System.out.println(name);
        
//        System.out.print("정수를 입력하세요:");
//        int num = sc.nextInt(); //숫자로 받아들여 지도록
//        System.out.println(num);    
        
//        if(num > 100) {
//        	System.out.println("100보다 큽니다.");
//        } else {
//        	System.out.println("100보다 작습니다.");
//        }
        //for, while, do~while
//		int i; //전역변수
//        for(i = 0; i < 10; i++) { //안에서 초기화식에 int i = 0쓰면 지역변수
//        	System.out.println(i);
//        }
//        
//        System.out.println(i);

//		for(int i = 1; i <= 6; i += 5) {
//			for(int j = 1; j < 10; j++) {
//				for(int k = i; k < i + 5; k++) {
//				       	String s = k + " X " + j + " = " + (k*j) + "\t";
//				        System.out.print(s);
//				}
//				System.out.println("");
//			}
//			System.out.println("");
//		}

		//조건문은 사용할 수 없다.
		//1x1=1 2x1=2 ..5X1=5
		//.
		//1X9=9        ..5x9=45
		//6x1=6
		//6x9=54         10x9
		
//		int i = 1;
//		while(i <= 6) {
//			int j = 1;
//			while(j < 10) {
//				int k = i;
//				while(k < i + 5) {
//						   String s = k + " X " + j + " = " + (k*j) + "\t";
//						System.out.print(s);
//						k++;
//				}
//				System.out.println("");
//				j++;
//			}
//			System.out.println("");
//			i += 5;
//		}
		
//		while(true) {
//			
//		}
		
//		boolean flag = true;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(flag) {
//			
//			System.out.println("정수를 입력");
//			int num = sc.nextInt();
//			if(num == 1) {
//				System.out.println("1번 입력");
//			} else if(num == 2) {
//				System.out.println("2번 입력");
//			} else {
//				System.out.println("잘못 입력");
//				flag = false;
//			}
//		}
//		
//		System.out.println("프로그램 종료");
		
		
//		13:\r linefeed
//		10:\n newline
		
//		boolean run = true;
//		int speed = 0;
//		int keyCode = 0;
//		
//		while(run) {
//			if(keyCode != 13 && keyCode != 10) {
//				System.out.println("---------------------");
//				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
//				System.out.println("---------------------");
//				System.out.print("선택 : ");
//			}
//			
//			keyCode = System.in.read();
//			
//			if(keyCode == 49) {
//				speed++;
//				System.out.println("현재 속도 = " + speed);
//			} else if(keyCode == 50) {
//				speed--;
//				System.out.println("현재 속도 = " + speed);
//			} else if(keyCode == 51) {
//				run = false;
//			}
//		}
//		System.out.println("프로그램 종료");
//		
		
//		Scanner sc = new Scanner(System.in);
//		String input;
//		do {
//			System.out.println("소문자입력");
//			input = sc.nextLine();
//			System.out.println(input);
//		} while(!input.equals("q")); //논리부정연산자
//		System.out.println("프로그램 종료");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자형태로 문자를 입력");
		String input = sc.nextLine();
		int num = Integer.parseInt(input); //문자열을 숫자로
		int revers = 0;
		
//		int result = num % 10;
//	    int i = 10;
//        while((num / i) >= 1) {
//			    result += (( num / i ) % 10);
//				i *= 10;
//			}
//        System.out.println(result);
//			(num % 10) + ((num / 10) % 10) + ((num / 100) % 10)... 
		
		
//		int sum = 0;
//		while(num != 0) {
//			sum += num % 10;
//			num /= 10;
//		}
//		System.out.println(sum);
		
		int sum = 0;
		while(num != 0) {
			revers += num % 10;
			num /= 10;
			revers *= 10;
		}
		revers /= 10;
		System.out.println(revers);
	}
}