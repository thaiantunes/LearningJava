package bytebank_v3;

public class AccountMovement {
	public static void main(String[] args) {
		Account account = new Account(1337, 24226);
		System.out.println(account.getBranch());
	}
}
