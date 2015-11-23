import java.text.DecimalFormat; // needed DecimalFormat class
import java.util.Scanner; // needed Scanner class

/**
 * 
 */

/**
 * @author David Herr
 * This program tests the SavingsAccount class and calculates the value of a users savings account
 */
public class SavingsAccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat decimalFormat = new DecimalFormat("#,##0.00"); // creates a DecimalFormatter object to format numbers
		Scanner keyboard = new Scanner(System.in); // creates a scanner object to get user input
		double saveAcntStrt = 0; // variable for the initial value of the savings account
		double annualIntRate = 0; // variable for the annual interest rate 
		int months = 0; // variable for the number of months the account has opened for
		int ctr = 1; // a counter variable so do while loop runs for the proper number of times
		double withdrawalTotal = 0; // variable for the total amount of withdrawals
		double depositsTotal = 0; // variable for the total amount of withdrawals
		double withdrawal = 0; // variable for the value of the withdrawals made during one month
		double deposit = 0; // variable for the value of the deposits made during one month
		double monIntRate = 0; // variable for the monthly interest rate
		double intRateTotal = 0; // variable for the total amount of interest made during the months the account has been opened
		
		System.out.println( " Welcome to the saving account tester! " );
		
		System.out.print( " Please enter your annual interest rate: " );
		annualIntRate = keyboard.nextDouble(); // asks user the annual interest rate of their account 
		
		System.out.print( " Please enter your savings account's starting value: " );
		saveAcntStrt = keyboard.nextDouble(); // asks user the starting value of their savings account
		
		System.out.print( " Please enter the number of months the savings account has been opened: " );
		months = keyboard.nextInt(); // asks user for the number of months the account has been opened for
		
		do{
			System.out.print( " Please enter the amount of money deposited in your account this month. " );
			deposit = keyboard.nextDouble(); // asks user for the amount of money deposited in their account during one month
			
			saveAcntStrt = SavingsAccount.addition( saveAcntStrt, deposit ); // calls the addition method in the SavingsAccount 
			//class to add the deposits to the initial value of the savings account
			
			depositsTotal += deposit; // adds the value of the deposits to the total of the deposits
			
			System.out.print( " Please enter the amount of money withdrawed from your account this month. " );
			withdrawal = keyboard.nextDouble(); // asks the user for the value of the withdrawals from their account during one month
			
			saveAcntStrt = SavingsAccount.subtraction( saveAcntStrt, withdrawal ); // calls subtraction method in the SavingsAccount
			//class to subtract the withdrawals from the total value of the savings account
			
			withdrawalTotal += withdrawal; // adds the value of the withdrawals to the total of the withdrawals
			
			intRateTotal = SavingsAccount.intRate2(annualIntRate, monIntRate, saveAcntStrt, intRateTotal);
			
			saveAcntStrt = SavingsAccount.intRate( annualIntRate, monIntRate, saveAcntStrt, intRateTotal ); //calls the intRate class from the SavingsAccount
			//class to calculate the monthly interest rate and add the monthly interest to the total value of the savings account
			
			ctr++; // increments the counter variable
		}while( ctr <= months );
		
		
		System.out.println( "The total value of your acount after " + months + " months is: " + decimalFormat.format( saveAcntStrt ) );
		System.out.println( "The total amount of withdrawals is: " + decimalFormat.format( withdrawalTotal));
		System.out.println( "The total amount of deposits is: " + decimalFormat.format( depositsTotal ));
		System.out.println( "The total amount of interest made is: " + decimalFormat.format( intRateTotal ));
		
	}

}
