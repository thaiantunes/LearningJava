package bytebank;

public class Testing {
	public static void main(String[] args) {
		Holder paul = new Holder();
		paul.name = "Paul Johnson";
		paul.cpf = "222.222.222-22";
		paul.profession = "teacher";
		
		Account paulsAccount = new Account();
		paulsAccount.deposit(100);
		
		paulsAccount.holder = paul;
		System.out.println(paulsAccount.holder.name);
	}
	
}