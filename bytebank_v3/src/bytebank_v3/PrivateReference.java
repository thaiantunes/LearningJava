package bytebank_v3;

public class PrivateReference {
	public static void main(String[] args) {
		Account paulsAccount = new Account(1337, 26445);
		Holder paul = new Holder();
		paul.setName("Paulo");
		
		paulsAccount.setHolder(paul);
		
		System.out.println(paulsAccount.getHolder().getName());
	}
}
