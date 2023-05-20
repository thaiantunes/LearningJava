package bytebank_v5;

public class AccountTesting {
	public static void main(String[] args) {
		CheckingAccount cc = new CheckingAccount(111,111);
		cc.deposit(200.0);
		try {
			cc.withdraw(210.0);
		} catch(InsufficientFundsException ex) {
			System.out.println("ERRO: " + ex.getMessage());
		}
		System.out.println(cc.getBalance());
		

	}
}
