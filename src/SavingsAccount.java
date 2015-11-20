import java.util.Scanner;

/**
 * This class calculates the balance of a savings account at the end of a period of time.
 * @author woytek
 * @author Julianna Nichols
 */
public class SavingsAccount {
	
	//set private so no one can fool with them
	private static double balance;
	private static double annualInterest;
	private static int est;
	
	
	/**
	 * Setting balance
	 * @author Julianna Nichols
	 */
	public static void setBalance() {
		Scanner keyboard = new Scanner( System.in );
		
		System.out.println( "What is the amount of money currently in your savings account?" );
		balance = keyboard.nextDouble();
	}
	
	/**
	 * Setting annual interest
	 * @author Julianna Nichols
	 */
	public static void setAnnualInterest() {
		Scanner keyboard = new Scanner( System.in );
		
		System.out.println( "What is the savings account's annual interest rate? (decimal percentage)" );
		annualInterest = keyboard.nextDouble();
	}
	
	/**
	 * Setting how many months since the account has been established
	 * @author Julianna Nichols
	 */
	public static void setEst() {
		Scanner keyboard = new Scanner( System.in );
		
		System.out.println( "How many months have passed since this account has been established? " );
		est = keyboard.nextInt();
	}

	/**
 	* Making a withdrawal
 	* @param balance before withdrawal
 	* @return balance after withdrawal
 	*/
	public static double withdrawal( double withdrawal ) {
		Scanner keyboard = new Scanner( System.in );
		
		balance -= withdrawal;
	
		return balance;
	}

	/**
 	* Making a deposit
 	* @param balance before deposit
 	* @return balance after deposit
 	*/
	public static double deposit( double deposit ) {
		balance += deposit;
		
		return balance;
	}

	/**
 	* Calculating monthly interest and new balance after addition of monthly interest
 	* @param balance before monthly interest is added
 	* @return balance after monthly interest is added
 	*/
	public static double monthlyInterest() {
		double monthlyInterest;
	
		monthlyInterest =  annualInterest / 12;
	
		balance += monthlyInterest;
		return balance;
	}
	
	/**
	 * Get balance
	 * @return balance
	 */
	public static double getBalance() {
		return balance;
	}
	
	/**
	 * Get how many months ago the account was established
	 * @return established (number of months ago)
	 */
	public static int getEst() {
		return est;
	}
}