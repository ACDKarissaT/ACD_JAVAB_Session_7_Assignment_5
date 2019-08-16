package assignment5;

class Account{
	int accID;
	String name;
	String email;
	int phone;
	double balance;
	
	public Account(int accID, String name, String email, int phone, double balance) {
		super();
		this.accID = accID;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.balance = balance;
	}
	
	
}

public class AccountWithdrawalMain {
	public static void main(String[] args) {
		Account acc = new Account(1, "Bob", "Bob@email.com", 1234567890, 10000);
		WithdrawalThread wt = new WithdrawalThread(acc, 300, "Transaction 1");
		WithdrawalThread wt2 = new WithdrawalThread(acc, 400, "Transaction 2");
		wt.start();
		wt2.start();
	}
}
