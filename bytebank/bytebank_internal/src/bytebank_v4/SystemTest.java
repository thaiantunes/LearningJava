package bytebank_v4;

public class SystemTest {
	
	public static void main(String[] args) {
		Manager g = new Manager();
		g.setPassword(2222);
		
		Admin adm = new Admin();
		adm.setPassword(2232);
		
		InternalSystems si = new InternalSystems();
		si.checkPassword(g);
		si.checkPassword(adm);
	}
	
	
	
}
