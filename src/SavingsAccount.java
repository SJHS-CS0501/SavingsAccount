/**
 * Class to allow creation of savings accounts
 * @ author Ryan Luchs
 * 
 */

// Just adding this comment to make a little change to test something

/**
 * This is a class for savings accounts
 * @author Ryan Luchs
 *
 */
public class SavingsAccount {
	double balance = 0;
	private double annualInterest = 0;
	
	/**
     * Create an account with balance m
     * @param m The initial balance
     * @param r The annual interest rate
     */
	SavingsAccount(double m, double r){
		balance = m;
		annualInterest = r;
	}
	
	/**
     * Deposit $m into the account
     * @param m $s to deposit
     */
	public void deposit(double m){
		balance += m;
	}
	
	/**
     * Withdraw $m from the account
     * @param m $s to withdraw
     */
	public void withdraw(double m){
		balance -= m;
	}
	
	/**
     * Add monthly interest to the account's balance
     * @return Interest made
     */
	public double addMonthlyInterest(){
		double oldBalance = balance; // store old balance value
		balance *= 1 + (annualInterest/12); // calculate new balance after interest
		return balance - oldBalance; // return amount of interest made
	}
}


