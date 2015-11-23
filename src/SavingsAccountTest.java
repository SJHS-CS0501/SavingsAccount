import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Jack Protivnak
 */
public class SavingsAccountTest {

	/**
	 * This program is designed to have a user input their bank account's starting
	 * balance and then ask for their annual interest rate, how many months had passed
	 * since they opened the account, and how much money was put into and removed from 
	 * the account. It will then tell them their ending balance at the end of the period
	 * and tell them their interest earned with how many times they deposited
	 * and withdrew.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in); // Notifying the system that the keyboard will be used as input
		DecimalFormat formatter =  new DecimalFormat( "########.####" ); // Defining format for displayed numbers in program.
		double startingBalance, interest, months, deposit, withdraw; // Declaring double variables
		int depCount = 0, withCount = 0; // Declaring integer variables
	
		// User to enter their starting balance in account
		System.out.println( "Please enter your starting balance: " );
		startingBalance = keyboard.nextDouble();
		SavingsAccount user = new SavingsAccount( startingBalance );
		
		// User to enter their annual interest rate 
		System.out.println( "Please enter your annual interest as a percent: " );
		interest = keyboard.nextDouble();
		
		// User to enter how many months had passed since they opened their account
		System.out.println( "Please enter the number of months that have passed since the account was created: " );
		months = keyboard.nextDouble();
		
		// A for loop for each month to see if any deposits or withdraws
		for (int ctr = 0; ctr < months; ctr++) {
			System.out.println( "Please enter how much money was deposited into the account during month " + (ctr + 1) + ": " );
			deposit = keyboard.nextDouble();			
			user.balanceAdd(deposit);
			if (deposit > 0 ) {
				depCount++;
			}
			
			System.out.println( "Please enter how much money was withdrawn from the account during month " + (ctr + 1) + ": " );
			withdraw = keyboard.nextDouble();
			user.balanceSubtract(withdraw);
			if( withdraw > 0 ) { //Regular Expression
				withCount++;
				}
			user.interest( interest );
			}
		
		
		
			// Telling user their results
			System.out.println( "Your ending balance is: $" + formatter.format(user.getBalance()) );
			System.out.println( "You deposited money " + depCount + " times." );
			System.out.println( "You withdrew money " + withCount + " times." );
			System.out.println( "You earned $" + formatter.format(user.getInterestTotal()) + " in interest.");
	}

}
