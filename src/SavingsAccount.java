import java.util.Scanner;

/**
 * This program will store a savings account's annual interest rate and balance.
 * @author woytek
 * @author Julianna Nichols
 */
public class SavingsAccount {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner( System.in );
		double balance = 0;
		int choice;
		
		System.out.print( "What is the amount of money currently in your savings account?" );
		balance = keyboard.nextDouble();
		
		System.out.print( "Do you want to:\n1. make a withdrawal.\n2. make a deposit.\n3. calculate balance including "
						+ "monthly interest.\nType in the number corresponding to your choice" );
		choice = keyboard.nextInt();
		
		switch( choice ) {
			case 1:
				withdrawal(balance);
				break;
			case 2:
				deposit(balance);
				break;
			case 3:
				monthlyInterest(balance);
				break;
		}
	}
	
	/**
	 * Making a withdrawal
	 * @param balance before withdrawal
	 * @return balance after withdrawal
	 */
	public static double withdrawal( double balance ) {
		double withdrawal = 0;
		Scanner keyboard = new Scanner( System.in );
		
		System.out.print( "How much would you like to take out?" );
		withdrawal = keyboard.nextDouble();
		
		balance -= withdrawal;
		
		return balance;
	}
	
	/**
	 * Making a deposit
	 * @param balance before deposit
	 * @return balance after deposit
	 */
	public static double deposit( double balance ) {
		double deposit = 0;
		Scanner keyboard = new Scanner( System.in );
		
		System.out.print( "How much would you like to deposit?" );
		deposit = keyboard.nextDouble();
		
		balance += deposit;
		
		return balance;
	}
	
	public static double monthlyInterest( double balance ) {
		
		monthlyInterest = //monthly interest rate
				* balance;
		
		balance += monthlyInterest;
		return balance;
	}

}
