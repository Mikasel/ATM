package third_term_project;

public class Cards {
	private String cardName="MORIO CARD";
	private String cardNumber="5170 7432 9694 4710";
	private double dailyWithdrawalLimit=5000.0;
	
	public void setCard(String cardName) {
		this.cardName=cardName;
	}
	public String getCard() {
		return this.cardName;
	}
	
	public void setDailyWithdrawalLimit(double dailyWithdrawalLimit) {
		this.dailyWithdrawalLimit=dailyWithdrawalLimit;
	}
	public double getDailyWithdrawalLimit() {
		return this.dailyWithdrawalLimit;
	}
	
	public void cardInfo() {
		System.out.println("Your card details");
		System.out.println(cardName+ "\n" + cardNumber + "\n\nDaily Withdrawal Limit " + dailyWithdrawalLimit + " TRY");
	}

}
