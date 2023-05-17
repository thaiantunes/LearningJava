package bytebank_v5;

public class TestingTaxable {
	public static void main(String[] args) {
		CheckingAccount cc = new CheckingAccount(222,333);
		cc.deposit(100.0);
		
		LifeInsurance insurance = new LifeInsurance();
		
		TaxCalculator calc = new TaxCalculator();
		
		calc.register(cc);
		calc.register(insurance);
		
		System.out.println(calc.getTotalTaxes());
	}
}
