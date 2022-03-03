package oops;

import java.util.Date;

//Q 1 WAP in java for banking application having interface Account and two concert classes namely
//SavingAccount and CheckingAccount
//Create a file MainRecord having main method .Design a menu driven application
//a) SavingAccount
//b) CheckingAccount
//Based on choice perform necessary action .
public interface Account {
	public int accNo =1223923929;
	public double balance =50000;
	String date = "1/01/2022";
	abstract void MakeDeposite();
	abstract void MakeWithDraw();
}
