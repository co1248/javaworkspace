import java.io.IOException;
import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		String hak = ""; //������ �ʱ�ȭ�� �̷������ ����Ͽ��� �Ѵ�
//		String jum = "";
//        Scanner sc = new Scanner(System.in); //���̺귯���� ������ Ŭ�����̴�.
        //����Ϸ��� import�� �ؾ��Ѵ�.
        
//        int user, com;
//        System.out.println("1.���� 2.���� 3.�� �Է�");
//        user = sc.nextInt();
//        com = (int)(Math.random() * 3) + 1;
//        System.out.println("���� " + user + "�Դϴ�.");
//        System.out.println("��ǻ�ʹ� " + com + "�Դϴ�.");
//        if (user > 3 || user <1) {
//        	System.out.println("���� �߸� �Է��Ͽ����ϴ�.");
//        }
//          else if (user - com == -2 || user - com == 1) {
//        	System.out.println("���� �̰���ϴ�.");  
//        } else if(user - com == -1 || user - com == 2) {
//        	System.out.println("���� �����ϴ�.");      
//        } else {
//        	System.out.println("�����ϴ�.");  
//        }
//        
       
//        ������
//        Math.random() 0.0 <= r < 1.0
//        int r = (int)(Math.random() * 10 + 1 - 1)+ 1;
//        System.out.println(r);
       
//        System.out.println("ù��° ���� �Է�");
//        int num1 = sc.nextInt();
//        System.out.println("�ι�° ���� �Է�");
//        int num2 = sc.nextInt();
//        System.out.println("������ �Է�");
//        sc.nextLine(); //���͸� �޾��ش�.
//        String op = sc.nextLine(); //���ڴ� ���Ͱ��� ����. ���� ���Ͱ��� ���� �����´�.
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
        
//        System.out.println("������ �Է��ϼ���");
//        int score = sc.nextInt();
//        
//        if(score > 100 || score < 0) { // ����if��
//        	System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
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
//        System.out.println(hak + jum + "���� �Դϴ�.");
        
        
//        if(score > 100 || score < 0) { // ����if��
//        	System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
//        } else if(score >= 90) {
//        	System.out.println("A���� �Դϴ�.");
//        } else if(score >= 80) {
//        	System.out.println("B���� �Դϴ�.");
//        } else if(score >= 70) {
//        	System.out.println("C���� �Դϴ�.");
//        } else if(score >= 60) {
//        	System.out.println("D���� �Դϴ�.");
//        } else {
//        	System.out.println("F���� �Դϴ�.");
//        }
        
//        sc.nextLine(); //���ڿ��� �Է¹޴´�.
//        System.out.println("�̸��� �Է��ϼ���");
//        String name = sc.nextLine();
//        System.out.println(name);
        
//        System.out.print("������ �Է��ϼ���:");
//        int num = sc.nextInt(); //���ڷ� �޾Ƶ鿩 ������
//        System.out.println(num);    
        
//        if(num > 100) {
//        	System.out.println("100���� Ů�ϴ�.");
//        } else {
//        	System.out.println("100���� �۽��ϴ�.");
//        }
        //for, while, do~while
//		int i; //��������
//        for(i = 0; i < 10; i++) { //�ȿ��� �ʱ�ȭ�Ŀ� int i = 0���� ��������
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

		//���ǹ��� ����� �� ����.
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
//			System.out.println("������ �Է�");
//			int num = sc.nextInt();
//			if(num == 1) {
//				System.out.println("1�� �Է�");
//			} else if(num == 2) {
//				System.out.println("2�� �Է�");
//			} else {
//				System.out.println("�߸� �Է�");
//				flag = false;
//			}
//		}
//		
//		System.out.println("���α׷� ����");
		
		
//		13:\r linefeed
//		10:\n newline
		
//		boolean run = true;
//		int speed = 0;
//		int keyCode = 0;
//		
//		while(run) {
//			if(keyCode != 13 && keyCode != 10) {
//				System.out.println("---------------------");
//				System.out.println("1. ���� | 2. ���� | 3. ����");
//				System.out.println("---------------------");
//				System.out.print("���� : ");
//			}
//			
//			keyCode = System.in.read();
//			
//			if(keyCode == 49) {
//				speed++;
//				System.out.println("���� �ӵ� = " + speed);
//			} else if(keyCode == 50) {
//				speed--;
//				System.out.println("���� �ӵ� = " + speed);
//			} else if(keyCode == 51) {
//				run = false;
//			}
//		}
//		System.out.println("���α׷� ����");
//		
		
//		Scanner sc = new Scanner(System.in);
//		String input;
//		do {
//			System.out.println("�ҹ����Է�");
//			input = sc.nextLine();
//			System.out.println(input);
//		} while(!input.equals("q")); //������������
//		System.out.println("���α׷� ����");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������·� ���ڸ� �Է�");
		String input = sc.nextLine();
		int num = Integer.parseInt(input); //���ڿ��� ���ڷ�
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