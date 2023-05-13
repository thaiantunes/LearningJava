package bytebank;

public class CreateAccount {
	public static void main(String[] args) {
		Account firstAccount = new Account();
//		firstAccount.balance = 200; not gonna work since balance is private
		firstAccount.deposit(100);
//		System.out.println(firstAccount.balance); not gonna work since balance is private
		System.out.println(firstAccount.getBalance());
		
		boolean worked = firstAccount.withdraw(101);
		System.out.println(firstAccount.getBalance());
		System.out.println(worked);

		Account secondAccount = new Account();
		secondAccount.deposit(1000);
		secondAccount.transfer(200, firstAccount);
		System.out.println(firstAccount.getBalance());
		System.out.println(secondAccount.getBalance());
		
	}
}
