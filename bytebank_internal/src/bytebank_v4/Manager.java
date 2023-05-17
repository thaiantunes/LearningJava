package bytebank_v4;

public class Manager extends Employee implements Checks { //class Manager heritages from class Employee

	private int password;
	
	@Override
		public double getBonus() {
			return super.getCompensation();
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

