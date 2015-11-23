import java.util.Scanner;

/**
 * @author Jack Protivnak
 */
public class SavingsAccount{
	static Scanner keyboard = new Scanner(System.in); // Notifying the system that the keyboard will be used as input
	private static double interest = 0, startBalance = 0, balance = 0, months = 0, deposit = 0, withdraw = 0, interestTotal = 0, methodInterest = 0; // Declaring double private variables
	private static int depCount = 0, withCount = 0; // Declaring private integer variables
	
	/**
	 * Constructor and setting startBalance and balance
	 * @param bal
	 */
	public SavingsAccount( double bal ) {
		startBalance = bal;
		balance = bal;
	}
	
	/**
	 * Adding deposits to balance
	 * @param dep
	 * @return
	 */
	public static double balanceAdd( double dep ) {
		balance += dep;
		return balance;
	}
	
	/**
	 * Subtracting withdraws from balance
	 * @param with
	 * @return
	 */
	public static double balanceSubtract( double with ) {
		balance -= with;
		return balance;
	}
	
	/**
	 * Interest function to determine the interest on the balance per month
	 * @param inter
	 * @return
	 */
	public static double interest( double inter) {
		methodInterest = ((inter/12)/100);
		interestTotal += (balance*methodInterest);
		balance += interestTotal;
		return balance;
	}
	
	/**
	 * Fetches balance
	 * @return
	 */
	public static double getBalance() {
		return balance;
	}
	
	/**
	 * Fetches total interest earned
	 * @return
	 */
	public static double getInterestTotal() {
		return interestTotal;
	}
}