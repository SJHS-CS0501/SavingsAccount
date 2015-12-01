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
	static Scanner keyboard = new Scanner(System.in);
	static Double outMoney = 0.0;
	static Double inMoney = 0.0;

	public static void setInterest(){
		System.out.println( "Hello! Please enter your annual interest rate." );
		interest = keyboard.nextDouble();
	}
	
	public static void setStartBal(){
		System.out.println( "Now enter your account's starting balance." );
		bal = keyboard.nextDouble();
	}
	
	public static void setMonths(){
		System.out.println( "Please enter the number of months since your account was opened." );
		months = keyboard.nextDouble();
	}
	
	public static double getMonths(){
		return months;
	}
	
	public static void setWithdrawal(){
			System.out.println( "Enter the withdrawal from your account this month." );
			withdrawal = keyboard.nextDouble();
			bal -= withdrawal;
			outMoney += withdrawal;
			}
	
	public static void setDeposit(){
		System.out.println( "Enter the deposit to your account this month." );
		deposit = keyboard.nextDouble();
		bal += deposit;
		inMoney += deposit;
	}
	
	public static void setMonInt(){
		monInt = interest/12;
		bal += bal*monInt;
	}
	
	public static double getWithdrawals(){
		return outMoney;
	}
	
	public static double getDeposits(){
		return inMoney;
	}
	
	public static double getMonInt(){
		return monInt;
	}
	
	public static double getBalance(){
		 return bal;
	 }
	
 }