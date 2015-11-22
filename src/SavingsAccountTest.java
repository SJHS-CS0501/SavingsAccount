import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Ryley Danielson
 *Uses the SavingsAccount class to calculate someone's banking account balance
 */
public class SavingsAccountTest {

	/**
	 * @param args
	 * Tests all methods in the SavingsAccount class you calculating somone's balance.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		int ctr;// counter variable in for loop
		int months = 0;// number of times for loop will loop
		double balance = 0;// Starting balance + argument for Savings account class
		double totalIntrest = 0;// Total amount earned from interest
		double withdraw;// single amount for one withdraw subtracted from the total balance
		double totalWithdraw = 0;// Total amount withdrawn
		double deposit;// single amount added to total
		double totalDeposit = 0;// amount of all deposits
		double totalBalance = 0;// final account balance
		final double yourIntrest;// Interest rate used as an argument for setMonthIntrest
		
		DecimalFormat  mat = new DecimalFormat( "##.##");// Instantiate decimal format
		Scanner key = new Scanner(System.in);// Instantiate Scanner
		
		// get starting balance
		System.out.println("What is you starting balance");
		balance = Double.parseDouble(mat.format(key.nextDouble()));
		
		if(balance < 0 ) {
			System.out.println("Invalid Input");
			System.exit(0);// end program
		}
		
		SavingsAccount count = new SavingsAccount(balance);// Instantiate SavingsAccount class
		
		// get interest rate
		System.out.println("What is your anual intrest rate");
		yourIntrest = Double.parseDouble(mat.format(key.nextDouble()));
		if(yourIntrest < 0 ) {
			System.out.println("Invalid Input");
			System.exit(0);// end program
		}
		
		// get number of months
		System.out.println("How many months have you had this account?");
		months = key.nextInt();
		if(months < 0 ) {
			System.out.println("Invalid Input");
			System.exit(0);// end program
		} else {
			
			// loop that calculates the total balance
			for(ctr=1; ctr<=months; ctr++){
			
				System.out.println("How much money was deposited during month " + ctr);
				deposit = Double.parseDouble(mat.format(key.nextDouble()));
				
				if(deposit < 0 ) {
					System.out.println("Invalid Input");
					System.exit(0);// end program
				}
				
				count.setDeposite(deposit);
				totalDeposit = totalDeposit + deposit;
				
			
				System.out.println("How much money was withdrawn during month " + ctr);
				withdraw = Double.parseDouble(mat.format(key.nextDouble()));
				
				if(withdraw < 0 ) {
					System.out.println("Invalid Input");
					System.exit(0);// end program
				}
				
				count.setWithdraw(withdraw);
				totalWithdraw = totalWithdraw + withdraw;
			
				count.setMonthIntrest(yourIntrest);
				totalIntrest = totalIntrest + count.getIntrest();
				totalBalance = count.getMonthIntrest();
		}
		
	}
		if(totalBalance <= 0){
			
			System.out.println("You have no money left in your account.");
			System.exit(0);// end program
		} else {
		
			// Account information
			System.out.println("\nYour total balance after " + months + " months is " 
				           + totalBalance);
		
			System.out.println("You deposited " + totalDeposit + " dolars.");
			System.out.println("You withdrew " + totalWithdraw + " dolars.");
			System.out.println("You collected " + Double.parseDouble(mat.format(totalIntrest)) + " dolars in intrest.");
			System.exit(0);// end program
		}		

	}
		
}