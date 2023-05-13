package bytebank_v4;

public class ReferenceTest {
	public static void main(String[] args) {
		Employee g1 = new Manager();
		g1.setName("Marcos");
		g1.setCompensation(5000.0);
		
		Employee f = new Employee();
		f.setCompensation(2000.0);
		
		BonusRecords control = new BonusRecords();
		control.record(g1);
		control.record(f);
		
		System.out.println(control.getSum());
	}
}
