package bytebank_v5;

public class AccountTesting {
	public static void main(String[] args) {
		CheckingAccount cc = new CheckingAccount(111,111);
		cc.deposit(100.0);
		
		SavingsAccount cp = new SavingsAccount(222,222);
		cp.deposit(200.0);
		
		cc.transfer(10.0, cp);
		
		System.out.println(cc.getBalance());
		System.out.println(cp.getBalance());
	}
}
