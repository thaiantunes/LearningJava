package bytebank_v5;

public class CheckingAccount extends Account implements Taxable { //classes dont heritage contructors from their super classes

	public CheckingAccount(int branch, int number) {
		super(branch,number);
	}
	
	@Override
		public void withdraw(double value) throws InsufficientFundsException {
			double withdrawValue = value + 0.2;
			super.withdraw(withdrawValue);
		}
	
	@Override
		public void deposit(double value) {
			super.balance = super.balance + value;
		}
	
	@Override
		public double getTaxValue() {
			return super.balance * 0.01;
		}
}

