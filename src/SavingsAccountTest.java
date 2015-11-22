import java.util.Scanner;

/**
 * 
 */

/**
 * @author woytek
 *
 */
public class SavingsAccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ctr;
		int months = 0;
		double balance = 0;
		double totalIntrest = 0;
		double withdraw;
		double totalWithdraw = 0;
		double deposit;
		double totalDeposit = 0;
		double totalBalance = 0;
		final double yourIntrest;
		
		Scanner key = new Scanner(System.in);
		
		SavingsAccount count = new SavingsAccount(balance);
		
		System.out.println("What is you starting balance");
		balance = key.nextDouble();
		
		System.out.println("What is your anual intrest rate");
		yourIntrest = key.nextDouble();
		
		System.out.println("How many months have you had this account?");
		months = key.nextInt();
		
		for(ctr=1; ctr<=months; ctr++){
			
			System.out.println("How much money was deposited during month " + ctr);
			deposit = key.nextDouble();
			count.setDeposite(deposit);
			totalDeposit = totalDeposit + deposit;
			
			System.out.println(totalDeposit);
			
			System.out.println("How much money was withdrawn during month " + ctr);
			withdraw = key.nextDouble();
			count.setWithdraw(withdraw);
			totalWithdraw = totalWithdraw + withdraw;
			
			System.out.println(totalWithdraw);
			
			count.setMonthIntrest(yourIntrest);
			totalIntrest = totalIntrest + count.getIntrest();
			
			System.out.println(totalIntrest);
			
			totalBalance = totalBalance + count.getMonthIntrest();
			
			System.out.println(totalBalance);
		}
		
		System.out.println("\nYour total balance after " + months + " is " 
				           + totalBalance);
		
		System.out.println("You deposited " + totalDeposit + " dolars.");
		System.out.println("You withdrew " + totalWithdraw + " dolars.");
		System.out.println("You collected " + totalIntrest + " dolars.");
		
		
		
		
	
		
		

	}

}
