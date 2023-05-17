package bytebank_v5;

public class TaxCalculator {

	private double totalTaxes;
	
	public void register(Taxable t) {
		double value = t.getTaxValue();
		this.totalTaxes += value;
	}
	
	public double getTotalTaxes() {
		return totalTaxes;
	}
}
