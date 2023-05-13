package bytebank_v4;

public class Manager extends Employee { //class Manager heritages from class Employee

	private int password;
	
	public void setPassword(int password){
		this.password = password;
	}
	
	public boolean checkPass(int password) {
		if(this.password == password) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonus() {
		System.out.println("calling manager bonus");
		return super.getBonus() + super.getCompensation();
	}
		
}

