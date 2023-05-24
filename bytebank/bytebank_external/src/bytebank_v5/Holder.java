package bytebank_v5;

/**
 * This class represents a Bytebank account holder.
 * 
 * @author Thainara Antunes
 * @version 0.1
 *
 */

public class Holder {
	private String name;
	private String cpf;
	private String profession;
	
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
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
}
