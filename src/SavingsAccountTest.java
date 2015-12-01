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
		int ct = 1;
		double  months = 0;
		double balance = 0;
		double deposits = 0;
		double withdrawals = 0;

		SavingsAccount.setInterest();
		SavingsAccount.setStartBal();		
		SavingsAccount.setMonths();
		
		months = SavingsAccount.getMonths();
		
		System.out.println( "The program will now ask you questions "
				+ "regarding each month since you've had your account." );
		
		for( ct = 1; ct <= months; ct++){
			SavingsAccount.setWithdrawal();
			SavingsAccount.setDeposit();
			SavingsAccount.setMonInt();
			
		}
		
		balance = SavingsAccount.getBalance();
		withdrawals = SavingsAccount.getWithdrawals();
		deposits = SavingsAccount.getDeposits();
		
		
		System.out.printf("Total deposits: %,.2f \n", deposits );
		System.out.printf("Toal withdrawals: %,.2f \n", withdrawals);
		System.out.println("Total interest: " + SavingsAccount.getMonInt() );
		System.out.printf("Balance: %,.2f \n", balance );
	}

}
