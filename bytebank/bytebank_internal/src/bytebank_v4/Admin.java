package bytebank_v4;

public class Admin extends Employee implements Checks {
	
	private ChecksUtil util;
	
	public Admin() {
		this.util = new ChecksUtil();
	}
	
	@Override
		public double getBonus() {
			return 50;
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
