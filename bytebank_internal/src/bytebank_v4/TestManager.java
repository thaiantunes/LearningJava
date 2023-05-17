package bytebank_v4;

public class TestManager {
	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.setName("Marco");
		m1.setCompensation(5000.0);
//		m1.setPassword(2222);
//		
//		boolean checks = m1.checkPass(2222);
		
		System.out.println(m1.getName());
		//System.out.println(checks);
		System.out.println(m1.getBonus());
	}
}
