package assignment5;

public class SMSThread extends Thread {
	Account acc;
	double amount;
	
	public SMSThread(Account acc, double amount, String name) {
		super(name + " TEXT");
		this.acc = acc;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		System.out.println(this.getName()+ ": Texting " + this.acc.phone);
		LogThread lt = new LogThread(this.getName()+ ": Text sent[Account Holder: " + acc.name + "]", this.getName());
		lt.start();
	}
}
