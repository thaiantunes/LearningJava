package bytebank_v4;

public class InternalSystems {
	
	private int password = 2222;
	
	public void checkPassword(Checks ec) {
		boolean check = ec.checkPass(password);
		if(check) {
			System.out.println("Allowed");
		} else {
			System.out.println("Now allowed");
		}
	}
}
