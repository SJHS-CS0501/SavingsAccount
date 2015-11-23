/**
 * 
 */

/**
 * @author David Herr
 */
public class SavingsAccount {

	/**
	 * This method is a constructor for the SavingsAccount class
	 * @param saveAcntStrt
	 */
		public SavingsAccount( double saveAcntStrt ){
			
		}
	/**
	* This method calculates the withdrawals to a savings account
    * @param saveAcntStrt
    * @param withdrawal
    * @return
    */
		public static double subtraction( double saveAcntStrt, double withdrawal ){
			
			saveAcntStrt = saveAcntStrt - withdrawal; // subtracts the value of the withdrawals from the value of savings account 
			return saveAcntStrt;
		}
		/**
		 * This method calculates the deposits to a savings account
		 * @param saveAcntStrt
		 * @param deposit
		 * @return
		 */
		public static double addition( double saveAcntStrt, double deposit ){
			
			saveAcntStrt = saveAcntStrt + deposit; // adds the value of the savings account to the value of the deposits
			return saveAcntStrt;
			
		}
		/**
		 * This program calculates the total amount of interest earned  
		 * @param annualIntRate
		 * @param monIntRate
		 * @param saveAcntStrt
		 * @param intRateTotal
		 * @return
		 */
		public static double intRate2( double annualIntRate, double monIntRate, double saveAcntStrt, double intRateTotal ){
			monIntRate = annualIntRate / 12; // converts annual interest to monthly interest
			monIntRate = monIntRate / 100; // convert the monthly interest in percent to decimal
			intRateTotal += ( saveAcntStrt * monIntRate); // keeps tract of the total interest earned
			return intRateTotal;
		}
		/**
		 * This method calculates the interest earned and adds it to value of the savings account
		 * @param annualIntRate
		 * @param monIntRate
		 * @param saveAcntStrt
		 * @param intRateTotal
		 * @return
		 */
		public static double intRate( double annualIntRate, double monIntRate, double saveAcntStrt, double intRateTotal ){
			monIntRate = annualIntRate / 12;// converts annual interest to monthly interest
			monIntRate = monIntRate / 100;// convert the monthly interest in percent to decimal
			saveAcntStrt = saveAcntStrt + ( saveAcntStrt * monIntRate ); // adds the value of the interest to the value of the savings account
			return saveAcntStrt;
			
		}

}



	