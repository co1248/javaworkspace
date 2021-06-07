package verify.exam20;
import java.util.Scanner;
public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;		
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.���� | 6.��ü");
			System.out.println("----------------------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			} else if(selectNo == 6) {
				transfer();
		}
		System.out.println("���α׷� ����");
		}
	}
	
	//���»����ϱ�
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("���»���");
		System.out.println("--------------");
		
		System.out.print("���¹�ȣ: "); 
		String ano = scanner.next();
		
		System.out.print("������: "); 
		String owner = scanner.next();
		
		System.out.print("�ʱ��Աݾ�: ");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}
	
	//���¸�Ϻ���
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("���¸��");
		System.out.println("--------------");
		
		for(Account acc : accountArray) {
			if(acc != null) {
				System.out.println(acc.getAno() + "  " + acc.getOwner() + "  " + acc.getBalance());
			}
		}
//		for(int i=0; i<accountArray.length; i++) {
//			Account account = accountArray[i];
//			if(account != null) {
//				System.out.print(account.getAno());
//				System.out.print("     ");
//				System.out.print(account.getOwner());
//				System.out.print("     ");
//				System.out.print(account.getBalance());
//				System.out.println();
//			}
//		}
	}
	
	//�����ϱ�
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("����");
		System.out.println("--------------");
		System.out.print("���¹�ȣ: "); 
		String ano = scanner.next();
		System.out.print("���ݾ�: ");
		int money = scanner.nextInt();
		Account[] account = findAccount(ano);
		if(account == null) {
			System.out.println("���: ���°� �����ϴ�.");
//			return;
		} else {
		account[0].setBalance(account[0].getBalance() + money);
		System.out.println("���: ������ �����Ǿ����ϴ�.");
		}
	}
	
	//����ϱ�
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("���");
		System.out.println("--------------");
		System.out.print("���¹�ȣ: "); 
		String ano = scanner.next();
		System.out.print("��ݾ�: ");
		int money = scanner.nextInt();
		Account[] account = findAccount(ano);
		if(account == null) {
			System.out.println("���: ���°� �����ϴ�.");
			return;
		}
		account[0].setBalance(account[0].getBalance() - money);
		System.out.println("���: ����� �����Ǿ����ϴ�.");
	}	
	
	//Account �迭���� ano�� ������ Account ��ü ã��
//	private static Account findAccount(String ano) { 
//		Account account = null;
//		for(Account acc : accountArray) {
//			if(acc != null) {
//				String dbAno = acc.getAno();
//				if(dbAno.equals(ano)) {
//					account = acc;
//			}
//		}
//	}	
//		for(int i = 0; i < accountArray.length; i++) {
//			if(accountArray[i] != null) {
//				String dbAno = accountArray[i].getAno();
//				if(ano == dbAno) {
//					account = accountArray[i];
//					break;
//				}
//			}
//		}
//		return account;
//	
//}
	//���������� �ٲٱ�
		private static Account[] findAccount(String ... ano) {
			Account[]  account = new Account[ano.length];
			
			for(int i = 0; accountArray[i] != null; i++) {
				String dbAno = accountArray[i].getAno();
				for(int j = 0; j < ano.length; j++) {
					if(dbAno.equals(ano[j])) {
						account[j] = accountArray[i];
						break;
					}
				}
			}
			return account;
		}
	
	//��ü�ϱ�
		private static void transfer() {
			System.out.println("--------------");
			System.out.println("������ü");
			System.out.println("--------------");
			System.out.print("�� ���¹�ȣ: "); 
			String ano = scanner.next();
			System.out.print("��ü�� ���¹�ȣ: "); 
			String ano2 = scanner.next();
		
			System.out.print("��ü��: ");
			int money = scanner.nextInt();
			Account[] acc = findAccount(ano,ano2);
//			Account account = findAccount(ano);
//			Account account2 = findAccount(ano2);
			if(acc[0] == null || acc[1] == null) {
				System.out.println("���¸� Ȯ�����ּ���.");
				return;
			} 
//			else {
//				account.setBalance(account.getBalance() - money);
//				account2.setBalance(account2.getBalance() + money);
//				System.out.println("���: ��ü�� �����Ǿ����ϴ�.");
			
			if(money <= acc[0].getBalance()) {
				acc[0].setBalance(acc[0].getBalance() - money);
				acc[1].setBalance(acc[1].getBalance() + money);
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
			}
		}
}