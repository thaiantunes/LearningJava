package bytebank_v5;

public class CheckingAccount extends Account { //classes dont heritage contructors from their super classes

	public CheckingAccount(int branch, int number) {
		super(branch,number);
	}
	
	@Override
		public boolean withdraw(double value) {
			double withdrawValue = value + 0.2;
			return super.withdraw(withdrawValue);
		}
	
	@Override
		public void deposit(double value) {
			super.balance = super.balance + value;
		}
}
