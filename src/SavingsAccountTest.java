/**
 * A program that allows the management of a savings account
 * @author Ryan Luchs
 * 
 */

import java.util.Scanner;

/**
 * Main class for SavingsAccountTest
 * @author Ryan Luchs
 *
 */
public class SavingsAccountTest {

	/**
	 * Main method for SavingsAccountTest
	 * @param args
	 */
	public static void main(String[] args) {
		
		double initialBalance = 0;
		double interestRate = 0;
		int months = 0;
		
		double withdrawalTotal = 0;
		double depositTotal = 0;
		double interestTotal = 0;
		
		double ipt = 0; // used to get input on deposits and withdrawals abbv. of input
		
		// Scanner to read user input
		Scanner input = new Scanner(System.in);
		
		// A savings account for the user
		SavingsAccount user;
		
		System.out.println("Welcome.");
		
		do { // Get initial balance + input verification
			System.out.print("Initial Balance of Account: ");
			
			while (!input.hasNextDouble()) {
				input.next();
				System.out.printf("Error: Initial Balance must be at least 1 cent.\n\n");
				System.out.print("Initial Balance of Account: ");
			}
			
			initialBalance = input.nextDouble();
			
			if (initialBalance < 0.01) {
				System.out.printf("Error: Initial Balance must be at least 1 cent.\n\n");
			}
			
		} while (initialBalance < 0.01);
		
		do { // Get annual interest rate + input verification
			System.out.print("Annual Interest Rate %: ");
			
			while (!input.hasNextDouble()) {
				input.next();
				System.out.printf("Error: Interest must be a non-negative number.\n\n");
				System.out.print("Annual Interest Rate: ");
			}
			
			interestRate = (input.nextDouble()/100);
			
			if (interestRate < 0) {
				System.out.printf("Error: Interest must be a non-negative number.\n\n");
			}
			
		} while (interestRate < 0);
		
		do { // Get months since account was made + input verification
			System.out.print("Months since account was opened: ");
			
			while (!input.hasNextInt()) {
				input.next();
				System.out.printf("Error: Interest must be a non-negative integer.\n\n");
				System.out.print("Months since account was opened: ");
			}
			
			months = input.nextInt();
			
			if (months < 0) {
				System.out.printf("Error: Interest must be a non-negative integer.\n\n");
			}
			
		} while (months < 0);
		
		// Construct the savings account for the user setting the balance and interest rate
		user = new SavingsAccount(initialBalance, interestRate);
		
		// Gets the amount deposited and withdraw for each month, 
		// and calculates the new account balance factoring in the monthly interest rate
		for (int ctr = 0; ctr < months; ctr++){
			
			//System.out.println("#" + user.balance);
			
			ipt = 0;
			do{ // get amount deposited this month + input verification
				System.out.print("Amount deposited this month: ");
				
				while (!input.hasNextDouble()) {
					input.next();
					System.out.printf("Error: Interest must be a non-negative number.\n\n");
					System.out.print("Amount deposited this month: ");
				}
				
				ipt = input.nextDouble();
				
				if (ipt < 0){
					System.out.printf("Error: Interest must be a non-negative number.\n\n");
				}
				
			} while(ipt < 0);
			
			user.deposit(ipt); // deposit amount in account
			depositTotal += ipt; // increase deposit total by deposit amount
			
			ipt = 0;
			do{ // get amount withdrawn this month + input verification
				System.out.print("Amount withdrawn this month: ");
				
				while (!input.hasNextDouble()) {
					input.next();
					System.out.printf("Error: Interest must be a non-negative number.\n\n");
					System.out.print("Amount withdrawn this month: ");
				}
				
				ipt = input.nextDouble();
				
				if (ipt < 0){
					System.out.printf("Error: Interest must be a non-negative number.\n\n");
				}
				
			} while(ipt < 0);
			
			user.withdraw(ipt); // withdraw amount in account
			withdrawalTotal += ipt; // increase withdrawal total by deposit amount
			
			// Calculate monthly interest increase and return increase to increase interest total
			interestTotal += user.addMonthlyInterest();
			
			ipt = 0;
		}
		
		System.out.printf("Final Balance: $%.2f\n", user.balance);
		System.out.printf("Total Amount of Deposits: $%.2f\n", depositTotal);
		System.out.printf("Total Amount of Withdrawals: $%.2f\n", withdrawalTotal);
		System.out.printf("Total Interest Earned: $%.2f\n", interestTotal);
		
	}

}
