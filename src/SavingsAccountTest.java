import java.util.Scanner;

/**
 * This program will store a savings account's annual interest rate and balance.
 * @author woytek
 * @author Julianna Nichols
 */
public class SavingsAccountTest {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner( System.in ); //creates Scanner object
		SavingsAccount test = new SavingsAccount(); //creates new SavingsAccountTest
		double deposit; //amount deposited
		double withdrawal;
		int ctr; //counter
		
		SavingsAccount.setBalance(); //setting balance
		SavingsAccount.setAnnualInterest(); //setting annual interest
		SavingsAccount.setEst(); //setting how many months have passed since the account was established
		
		for( ctr = 1; ctr <= SavingsAccount.getEst(); ctr++ ) {
			System.out.print( "How much was deposited into the account during month " + ctr + "? " );
			deposit = keyboard.nextDouble();
			SavingsAccount.deposit(deposit); //adding deposit to balance
			
			System.out.print( "How much was withdrawn from the account during month " + ctr + "? " );
			withdrawal = keyboard.nextDouble();
			SavingsAccount.withdrawal(withdrawal); //subtracting withdrawal from balance
			
			SavingsAccount.monthlyInterest(); //calculating and adding monthly interest to balance
			
		}
		
		System.out.printf( "There is currently $%.2f in your account!" , SavingsAccount.getBalance() );
	}
}