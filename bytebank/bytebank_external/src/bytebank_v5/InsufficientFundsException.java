package bytebank_v5;

public class InsufficientFundsException extends Exception {
	
	public InsufficientFundsException(String msg) {
		super(msg);
	}

}
