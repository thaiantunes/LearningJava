package bytebank;

public class Account {
	private double balance; //it is possible to declare a default value for this attributes. if not declared, it will be 0
	int branch;
	int number;
	Holder holder;
	
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
	
}