package third_term_project;

public class Bills {
	
	private double electricBill=(Math.random()*1000);
	private double waterBill=(Math.random()*500);
	private double naturalGasBill=(Math.random()*10000);
	private double totalBill=electricBill+waterBill+naturalGasBill;
	
	public void setElectricBill(double electricBill) {
		this.electricBill=electricBill;
	}
	public double getElectricBill() {
		return this.electricBill;
	}
	
	public void setWaterBill(double waterBill) {
		this.waterBill=waterBill;
	}
	public double getWaterBill() {
		return this.waterBill;
	}
	
	public void setnaturalGasBill(double naturalGasBill) {
		this.naturalGasBill=naturalGasBill;
	}
	public double getnaturalGasBill() {
		return this.naturalGasBill;
	}
	
	public void setTotalBill(double totalBill) {
		this.totalBill=totalBill;
	}
	public double getTotalBill() {
		return this.totalBill;
	}


}
