/**
 * @author Jack Protivnak
 *
 */
public class SavingsAccount{
	private double startBal;
	private double interest;
	
	public SavingsAccount( double bal ) {
		startBal = bal;
	}
	
	public void Interest() {
		System.out;println( "Please enter your annual interest as a percent: " );
		interest = nextDouble();
	}
}

