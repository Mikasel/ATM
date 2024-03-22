package third_term_project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//a key selector to use the atm with numbers 1 to 8
		Scanner scan=new Scanner(System.in);
		int selector=10000;
		while(selector!=0) {
			System.out.println();
			System.out.println("BALANCE INQUIRY \t CARD INFORMATION");
			System.out.println("(press 1)       \t (press 3)");
			System.out.println("BILL PAYMENT    \t MONEY WITHDRAWAL");
			System.out.println("(press 2)       \t (press 4)");
			System.out.println("TRANSFER MONEY  \t DEPOSIT MONEY");
			System.out.println("(press 5)       \t (press 6)");
			System.out.println("STUDY LOAN      \t CHECK CREDIT CARD DEBT ");
			System.out.println("(press 7)       \t (press 8)");

			selector=scan.nextInt();

			if(selector==0) {
				System.out.println("Exiting..");
			}

			else if(selector==1) {
				Bakiye_Sorgulama balance=new Bakiye_Sorgulama();
				balance.balance(0);
			}
			else if(selector==3) {

				Cards myCard=new Cards();
				myCard.cardInfo();
			}
			else if(selector==2) {
				Bills myBill=new Bills();
				System.out.println("You have three unpaid bill");

				System.out.println("1-EnerjiSA " +myBill.getElectricBill()+ " TRY");
				System.out.println("2-ISKI " +myBill.getWaterBill()+ " TRY");
				System.out.println("3-Igdas " +myBill.getnaturalGasBill()+ " TRY \n");

				System.out.println("Do you want to pay all at once\n For yes 1 \n For no 0");
				int actionSelector=scan.nextInt();

				if(actionSelector==1) {
					System.out.println("In total: " +myBill.getTotalBill()+ " TRY");
				}

				else if(actionSelector==0) {
					System.out.println("Choose your bills to pay");
					int actionSlector_Two=scan.nextInt();

					if(actionSlector_Two==1) {
						System.out.println("EnerjiSA (" +(int)myBill.getElectricBill()+ "TRY) has been paid.");
					}
					else if(actionSlector_Two==2) {
						System.out.println("ISKI (" +(int)myBill.getWaterBill()+ "TRY) has been paid.");
					}
					else if(actionSlector_Two==3) {
						System.out.println("Igdas (" +(int)myBill.getnaturalGasBill()+ "TRY) has been paid.");
					}
				}
			}
			else if(selector==4) {
				System.out.println("Enter your withdrawal amount");

				double withdrawalAmount=scan.nextInt();

				Withdrawal myAccount=new Withdrawal();
				myAccount.withdrawal(withdrawalAmount);
			}
			else if(selector == 5) {
				Transfer_Money.sendMoney();
			}
			else if(selector == 6) {
				Deposit.Deposit();
			}
			else if(selector == 7) {
				Study_Loan.checkLoan();
			}
			else if(selector == 8) {
				Check_Credit_Card_Debt.debtCheck();
			}
		}	

	}

}