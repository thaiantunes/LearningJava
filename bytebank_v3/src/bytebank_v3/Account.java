package bytebank_v3;

public class Account {
	private double balance; //it is possible to declare a default value for this attributes. if not declared, it will be 0
	private int branch;
	private int number;
	private Holder holder;
	private static int total; // static attributes are related to the class not to the object!
	
	public Account(int branch, int number) {
		Account.total++;
		System.out.println("Total number of accounts: " + Account.total);
		this.branch = branch;
		this.number = number;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}
	
	public boolean withdraw(double value) {
		if(this.balance >= value) {
			this.balance -= value;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfer(double value, Account destination) {
		if(this.balance >= value) {
			this.balance -= value;
			destination.deposit(value);
			return true;
		} 
		return false;
	}

	public double getBalance() { //getter method
		return this.balance;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int number) {
		if(number <= 0) {
			System.out.println("Invalid account number");
			return;
		}
		this.number = number;
	}
	
	public int getBranch() {
		return this.branch;
	}
	
	public void setBranch(int branch) {
		if(branch <= 0) {
			System.out.println("Invalid branch");
			return;
		}
		this.branch = branch;
	}
	
	public void setHolder(Holder holder) {
		this.holder = holder;
	}
	
	public Holder getHolder() {
		return holder;
	}
	
	public static int getTotal() {
		return total;
	}
	
}