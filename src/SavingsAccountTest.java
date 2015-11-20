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
		
		for( ctr = 0; ctr > est; ctr++ ) {
			System.out.print( "How much was deposited into the account during month " + ctr + "?" );
			deposit = keyboard.nextDouble();
			SavingsAccount.deposit(deposit);
			
			System.out.print( "How much was withdrawn from the account during month " + ctr + "?" );
			withdrawal = keyboard.nextDouble();
			SavingsAccount.withdrawal(withdrawal);
			
			SavingsAccount.monthlyInterest();
			
			
		}
	}
}
