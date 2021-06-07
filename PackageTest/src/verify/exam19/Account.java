package verify.exam19;

public class Account {

	private int balance;
	final int MIN_BAL = 0;
	final int MAX_BAL = 1000000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance < MIN_BAL || balance> MAX_BAL) {
			return;
		}
		this.balance = balance;
	}
}
