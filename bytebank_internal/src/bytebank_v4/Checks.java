package bytebank_v4;

public abstract interface Checks { //everything inside an interface has to be abstract

	public abstract void setPassword(int password);
	
	public abstract boolean checkPass(int password);
	
}
