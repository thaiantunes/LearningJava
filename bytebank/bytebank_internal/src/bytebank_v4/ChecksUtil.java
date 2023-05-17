package bytebank_v4;

public class ChecksUtil {

	private int password;
	
	public void setPassword(int password) {
		this.password = password;
	}

	public boolean checkPass(int password) {
		if(this.password == password) {
			return true;
		} else {
		return false;
		}
	}
	
}
