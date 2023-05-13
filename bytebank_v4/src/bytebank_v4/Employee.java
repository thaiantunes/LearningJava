package bytebank_v4;

public class Employee {

	private String name;
	private String cpf;
	private double compensation; //protected = private to everyone but child classes
	
	public double getBonus() {
		return this.compensation * 0.05;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getCompensation() {
		return compensation;
	}
	public void setCompensation(double compensation) {
		this.compensation = compensation;
	}

		
}

