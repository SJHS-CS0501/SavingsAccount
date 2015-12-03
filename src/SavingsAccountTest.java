/**
 * @author woytek
 * @author Isabelle Schroeder
 * This program will tell you your account balance!
 * 
 */
public class SavingsAccountTest {

	/**
	 * @param args The main arguments for the SavingsAccountTest class
	 */
	public static void main(String[] args) {
		int ct = 1; // used in for loop to continue execution until 

		SavingsAccount.setInterest(); // to methods in SavingAccount class
		SavingsAccount.setStartBal();		
		SavingsAccount.setMonths();
		
		System.out.println( "The program will now ask you questions "
				+ "regarding each month since you've had your account." );
		
		// loop continues to iterate for every month since the account was opened
		for( ct = 1; ct <= SavingsAccount.getMonths(); ct++){
			SavingsAccount.setWithdrawal();
			SavingsAccount.setDeposit();
			SavingsAccount.setMonInt();
			
		}
		
		/*
		 * displaying total deposits, withdrawals, interest, and final balance. Monies displayed 
		 * to two decimal places and interest to five places because it will probably be tiny unless 
		 * the user has gone to a really spiffy bank for a long time (or they're super rich).
		 */
		
		System.out.printf("Total deposits: %,.2f \n", SavingsAccount.getDeposits() );
		System.out.printf("Total withdrawals: %,.2f \n", SavingsAccount.getWithdrawals() );
		System.out.printf("Total interest: %,.5f \n" + SavingsAccount.getMonInt() );
		System.out.printf("Balance: %,.2f \n", SavingsAccount.getBalance() );
	}

}
