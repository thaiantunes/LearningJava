package bytebank_v4;

public abstract class Employee { //abstract = disable the ability to create an Employee object

	private String name;
	private String cpf;
	private double compensation; //protected = private to everyone but child classes
	
	public abstract double getBonus(); //method not implemented on super class, only on child classes
	
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

