package bytebank_v4;

public class Manager extends Employee implements Checks { //class Manager heritages from class Employee

	private ChecksUtil util;
	
	public Manager() {
		this.util = new ChecksUtil();
	}
	
	@Override
		public double getBonus() {
			return super.getCompensation();
		}
	
	@Override
		public void setPassword(int password) {
			this.util.setPassword(password);
		}
	
	@Override
		public boolean checkPass(int password) {
			return this.util.checkPass(password);
	}
}

