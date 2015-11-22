import java.util.Scanner;

/**
 * This program will store a savings account's annual interest rate and balance
 * @author woytek
 * @author Julianna Nichols
 */
public class SavingsAccountTest {

	/**
	 * This is the main method in the SavingsAccountTest program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner( System.in ); //creates Scanner object
		SavingsAccount test = new SavingsAccount(); //creates new SavingsAccountTest
		double deposit; //amount deposited
		double withdrawal; //amount withdrawn
		double totalD = 0; //total amount of deposits
		double totalW = 0; //total amount of withdrawals
		int ctr; //counter
		
		SavingsAccount.setBalance(); //setting balance
		SavingsAccount.setAnnualInterest(); //setting annual interest
		SavingsAccount.setEst(); //setting how many months have passed since the account was established
		
		for( ctr = 1; ctr <= SavingsAccount.getEst(); ctr++ ) {
			System.out.print( "How much was deposited into the account during month " + ctr + "? " );
			deposit = keyboard.nextDouble();
			totalD += deposit; //totaling deposits
			SavingsAccount.deposit(deposit); //adding deposit to balance
			
			System.out.print( "How much was withdrawn from the account during month " + ctr + "? " );
			withdrawal = keyboard.nextDouble();
			totalW += withdrawal; //totaling withdrawals
			SavingsAccount.withdrawal(withdrawal); //subtracting withdrawal from balance
			
			SavingsAccount.monthlyInterest(); //calculating and adding monthly interest to balance
		}
		
		/*
		 * only difference is grammar
		 * if.."last month"
		 * else.."last # months"
		 */
		if(SavingsAccount.getEst() == 1) {
			System.out.printf( "There is currently $%.2f in your account!\nOver the last month"
					+ " you have:\n-deposited $%.2f!\n-withdrawn $%.2f!\n-generated $%.2f in interest!" 
					, SavingsAccount.getBalance() , totalD , totalW , SavingsAccount.getMonInt() );
		} else {
		System.out.printf( "There is currently $%.2f in your account!\nOver the last " +
							+ SavingsAccount.getEst() + " months you have:\n-deposited $%.2f!\n"
							+ "-withdrawn $%.2f!\n-generated $%.2f in interest!" 
							, SavingsAccount.getBalance() , totalD , totalW , SavingsAccount.getMonInt() );
		}
	}
}