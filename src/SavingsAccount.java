import java.util.Scanner;

/**
 * This class calculates the balance of a savings account at the end of a period of time.
 * @author woytek
 * @author Julianna Nichols
 */
public class SavingsAccount {
	
	//private void setBalance( double balance) {
		
	//}
	//private void setAnnualInterest( double interest ) {
		
	//}

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
	public static double monthlyInterest( double annualInterest ) {
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
	
}