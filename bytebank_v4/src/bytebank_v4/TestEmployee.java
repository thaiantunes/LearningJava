package bytebank_v4;

public class TestEmployee {
	public static void main(String[] args) {
	
		Employee nico = new Employee();
		nico.setName("Nico Steppat");
		nico.setCpf("223355646-9");
		nico.setCompensation(2600.00);
		
		System.out.println(nico.getName());
		System.out.println(nico.getBonus());
		
	}
}
