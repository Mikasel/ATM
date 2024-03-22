package third_term_project;

public class Withdrawal {
	private double balance=6000;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdrawal(double withdrawalAmount) {
		if(this.balance - withdrawalAmount < 0) {
			System.out.println("Only" + this.balance + "available. Withdrawal not processed");
		}
		else if(withdrawalAmount > 5000) {
			System.out.println("Withdrawal not processed \\nYour daily withdrawal limit is 5000.0 TRY");
		}
		else {
			this.balance -= withdrawalAmount;
			System.out.println("Withdrawal of " + withdrawalAmount + "TRY processed, remaining balance: " + this.balance + "TRY");
		}
	}

}

