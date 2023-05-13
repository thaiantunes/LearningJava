package bytebank_v3;

public class GetterSetter {
	public static void main(String[] args) {
		Account account = new Account(1337, 26645);
		System.out.println(account.getNumber());
		
		Account account2 = new Account(1338, 26936);
		Account account3 = new Account(1339, 24531);
		Account.getTotal();
	}
}
