import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ryan Smith
 *
 */
public class SavingsAccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    Scanner keyboard = new Scanner(System.in);//This allows the user to input info

	    System.out.print("How much money is in the account?: ");
	    double startingBalance = keyboard.nextDouble();

	    System.out.print("Enter the annual interest rate:");
	    double annualInterestRate = keyboard.nextDouble();

	    // Create class
	    SavingsAccountTest savingAccountTest = new SavingsAccountTest();
	    SavingsAccount savingsAccount = savingAccountTest.new SavingsAccount(startingBalance, annualInterestRate);

	    System.out.print("How long has the account been opened? ");
	    double months = keyboard.nextInt();

	    double montlyDeposit;
	    double monthlyWithdrawl;
	    double interestEarned = 0.0;
	    double totalDeposits = 0;
	    double totalWithdrawn = 0;

	    for (int i = 1; i <= months; i++) { //for loop

	        System.out.print("Enter amount deposited for month: " + i + ": ");
	        montlyDeposit = keyboard.nextDouble();
	        totalDeposits += montlyDeposit;

	        savingsAccount.deposit(montlyDeposit);

	        System.out.print("Enter amount withdrawn for " + i + ": ");
	        monthlyWithdrawl = keyboard.nextDouble();
	        totalWithdrawn += monthlyWithdrawl;

	        savingsAccount.withdraw(monthlyWithdrawl);

	        savingsAccount.addInterest();

	        interestEarned += savingsAccount.getLastAmountOfInterestEarned();
	    }

	    DecimalFormat formatter = new DecimalFormat("#,##0.00");//Decimal Format

	    System.out.println("Total deposited: $" + formatter.format(totalDeposits));
	    System.out.println("Total withdrawn: $" + formatter.format(totalWithdrawn));
	    System.out.println("Interest earned: $" + formatter.format(interestEarned));
	    System.out.println("Ending balance: $" + formatter.format(savingsAccount.getAccountBalance()));
	}

	}


