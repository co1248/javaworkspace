package verify.exam19;

public class AccountExample {

	public static void main(String[] args) {
        Account acc = new Account();
		
		acc.setBalance(10000);
		System.out.println("���� �ܰ�: " + acc.getBalance());
		
		acc.setBalance(-100);
		System.out.println("���� �ܰ�: " + acc.getBalance());
		
		acc.setBalance(2000000);
		System.out.println("���� �ܰ�: " + acc.getBalance());
		
		acc.setBalance(300000);
		System.out.println("���� �ܰ�: " + acc.getBalance());

	}

}
