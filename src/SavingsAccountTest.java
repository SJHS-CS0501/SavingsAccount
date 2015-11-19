import java.util.Scanner;

/**
 * 
 */

/**
 * @author David Herr
 *
 */
public class SavingsAccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		double saveAcntStrt = 0;
		double annualIntRate = 0;
		int months = 0;
		int ctr = 0;
		double withdrawal = 0;
		double deposit = 0;
		
		System.out.println( " Welcome to the saving account tester! " );
		
		System.out.print( " Please enter your annual interest rate: " );
		annualIntRate = keyboard.nextDouble();
		
		System.out.print( " Please enter your savings account's starting value: " );
		saveAcntStrt = keyboard.nextDouble();
		
		System.out.print( " Please enter the number of months the savings account has been opened: " );
		months = keyboard.nextInt();
		
		
	}

}
