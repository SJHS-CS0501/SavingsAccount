import java.util.Scanner;

/**
 * @author woytek
 * @author Isabelle Schroeder
 * This class holds all the methods for the SavingsAccount program.
 */
 public class SavingsAccount {
 
	private static Double interest = 0.0;
	private static Double bal = 0.0;
	private static Double months = 0.0;
	static Double deposit = 0.0;
	static Double withdrawal = 0.0;
	static Double monInt = 0.0;
	static Scanner keyboard = new Scanner(System.in); // so user can type stuff
	static Double outMoney = 0.0; // for total withdrawals
	static Double inMoney = 0.0; // for total deposits

	// getting user's annual interest rate
	public static void setInterest(){
		System.out.println( "Hello! Please enter your annual interest rate." );
		interest = keyboard.nextDouble();
	}
	
	// getting user's starting balance
	public static void setStartBal(){
		System.out.println( "Now enter your account's starting balance." );
		bal = keyboard.nextDouble();
	}
	
	// getting months since the user opened their account
	public static void setMonths(){
		System.out.println( "Please enter the number of months since your account was opened." );
		months = keyboard.nextDouble();
	}
	
	// returning months to SavingsAccountTest class for the for loop
	public static double getMonths(){
		return months;
	}
	
	// subtracting withdrawal from account total (per month)
	public static void setWithdrawal(){
			System.out.println( "Enter the withdrawal from your account this month." );
			withdrawal = keyboard.nextDouble();
			bal -= withdrawal;
			outMoney += withdrawal;
			}
	
	// adding deposit to account total (per month)
	public static void setDeposit(){
		System.out.println( "Enter the deposit to your account this month." );
		deposit = keyboard.nextDouble();
		bal += deposit;
		inMoney += deposit;
	}
	
	// calculating monthly interest using annual interest
	public static void setMonInt(){
		monInt = interest/12;
		bal += bal*monInt;
	}
	
	// returning total withdrawals for display
	public static double getWithdrawals(){
		return outMoney;
	}
	
	// returning total deposits for display
	public static double getDeposits(){
		return inMoney;
	}
	
	// returning monthly interest earned for display
	public static double getMonInt(){
		return monInt;
	}
	
	// returning final balance for display
	public static double getBalance(){
		 return bal;
	 }
	
 }