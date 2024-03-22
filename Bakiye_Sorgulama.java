package third_term_project; 

public class Bakiye_Sorgulama {
	
	private double balance=6000.0;

	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return this.balance;
	}
	public void balance(double balance) {
		balance=this.balance;
		System.out.println("Your balance is "+balance+ " TRY");
	}


}