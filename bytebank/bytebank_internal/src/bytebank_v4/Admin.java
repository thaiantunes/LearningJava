package bytebank_v4;

public class Admin extends Employee implements Checks {
	
	private int password;
	
	@Override
		public double getBonus() {
			return 50;
		}
	
	@Override
		public void setPassword(int password) {
			this.password = password;
		}
	
	
	@Override
		public boolean checkPass(int password) {
			if(this.password == password) {
				return true;
			} else {
			return false;
			}
		}
}
