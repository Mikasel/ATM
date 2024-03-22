package third_term_project;

import java.util.Scanner;

public class Transfer_Money extends Bakiye_Sorgulama{

	private static double balance = 6000;
	String IBAN;
	static int transferAmount;
	static Scanner scan = new Scanner(System.in);
	static Boolean bool = true;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static void sendMoney() {
		System.out.println("Enter a 24 digit IBAN number: ");
		scan.nextLine();
		
		while(bool != false) {
			System.out.println("Enter the amount you want to send:");
			transferAmount = scan.nextInt();

			if(transferAmount > balance) {
				System.out.println("Please try again.");

			}
			else {
				balance -= transferAmount;
				System.out.println("Transfer completed.\nYour current ballance is: " +(int)balance   +"TRY");
				bool = false;
			}
		}
	}

}