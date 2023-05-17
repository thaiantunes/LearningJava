package bytebank_v5;

public class SavingsAccount extends Account {

	public SavingsAccount(int branch, int number) {
		super(branch,number);
	}
	
	@Override
	public void deposit(double value) {
		super.balance = super.balance + value;		
	}
	
}
