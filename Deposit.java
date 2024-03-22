package third_term_project;

import java.util.Scanner;

public class Deposit {
	
	private static double balance = 6000;
	static Scanner scan = new Scanner(System.in);
	static public double deposit;

	
	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public static void Deposit() {
		System.out.println("Enter deposit amount:");
		deposit = scan.nextDouble();
		balance += deposit;
		System.out.println("You deposited: " +deposit+ "TRY, remaining balance is: " + (int)balance + "TRY");
		
	}




}
