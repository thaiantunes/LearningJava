package bytebank_v4;

public class ReferenceTest {
	public static void main(String[] args) {
		Employee g1 = new Manager();
		g1.setName("Marcos");
		g1.setCompensation(5000.0);
		
		Designer d = new Designer();
		d.setCompensation(2000.0);
		
		BonusRecords control = new BonusRecords();
		control.record(g1);
		control.record(d);
		
		System.out.println(control.getSum());
	}
}
