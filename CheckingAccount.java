package oops;

import java.util.Scanner;

public class CheckingAccount implements Account {
	String CheckStyle;
	double minBalance=balance;
	
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void MakeDeposite() {
		System.out.println("Enter amount to deposite :");
		double am = sc.nextDouble();
		minBalance = minBalance+am;
	}

	@Override
	public void MakeWithDraw() {
		System.out.println("Enter amount to Withdraw :");
		double wd = sc.nextDouble();
		minBalance =minBalance-wd;
	}
	void accountDetails() {
		System.out.println("Account number : "+accNo);
		System.out.println("Date Opened : "+date);
	}
}
