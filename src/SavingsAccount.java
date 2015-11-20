import java.util.Scanner;

/**
 * 
 */

/**
 * @author woytek
 * @author Isabelle Schroeder
 *
 */
public class SavingsAccount {

	private static Double interest;
	private static Double bal;
	private static Double months;
	static Double deposit;
	static Double withdrawal;
	static Double monInt;
	static Scanner keyboard = new Scanner(System.in);

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
	
	public static void setWithdrawal(){
		System.out.println( "Enter the withdrawal from your account this month." );
		withdrawal = keyboard.nextDouble();
		bal = -withdrawal;
	}
	
	public static void setDeposit(){
		System.out.println( "Enter the deposit to your account this month." );
		deposit = keyboard.nextDouble();
		bal = +deposit;
	}
	
	public static void setMonInt(){
		monInt = interest/12;
		bal = +monInt;
	}
	
	
	
}
