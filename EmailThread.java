package assignment5;

public class EmailThread extends Thread{
	Account acc;
	double amount;
	
	public EmailThread(Account acc, double amount, String name) {
		super(name + " EMAIL");
		this.acc = acc;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		System.out.println(this.getName() + ": Emailing " + this.acc.email);
		LogThread lt = new LogThread(this.getName() + ": Email sent[Account Holder: " + acc.name + "]", this.getName());
		lt.start();
				
	}
}
