package bytebank_v4;
public class BonusRecords {
	
	private double sum;
	
	public void record(Employee f) {
		double bonu = f.getBonus();
		this.sum = this.sum + bonu;
	}
	
	public double getSum() {
		return sum;
	}
}
