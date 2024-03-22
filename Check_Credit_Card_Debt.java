package third_term_project;

public class Check_Credit_Card_Debt{
	
	private static double debt = Math.random()*750 + 250;
	
	
	public double getBorclar() {
		return debt;
	}
	public void setBorclar(Integer borclar) {
		this.debt = borclar;
	}
	public static void debtCheck() {
		System.out.println("Your credit card debt is: "+ (int)debt +"TRY");
	}
	

}
