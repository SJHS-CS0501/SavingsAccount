import java.text.DecimalFormat;// Imports decimal formatter
	/**
	 * @author Ryley Danielson
	 * Methods used in test savings account class
	 */
	public class SavingsAccount {

		private double intrate;
		private double anualIntrate;
		private double money;
		private double intrestBalance;
		private double finalBalance;
		
		DecimalFormat  mat = new DecimalFormat( "###.##");
		
		/**
		 * Class constructor
		 * @param balance
		 */
		public SavingsAccount(double balance){
			
			money = balance;
			
		}
		
		/**
		 * Calculates the monthly interest and final balance
		 * @param intrest
		 */
		public void setMonthIntrest(double intrest){
			
			anualIntrate = intrest/100;
			
			intrate = anualIntrate/12;
			
			intrestBalance = getWithdraw()*intrate;
			
			finalBalance = intrestBalance + getWithdraw();
		}
		
		/**
		 * gets the final balance of the program
		 * @return finalBalance
		 */
		public double getMonthIntrest(){
			
			return Double.parseDouble(mat.format(finalBalance));
		}
		
		/**
		 * gets the number used to find the total earnings of all the interest earned
		 * @return
		 */
		public double getIntrest(){
			return intrestBalance;
		}
		
		/**
		 * sets the total after withdraws
		 * @param withdraw
		 */
		public void setWithdraw(double withdraw){
			
			money = getDeposite()- withdraw;
		}
		
		/**
		 * gets the total money after withdraws
		 * @return money
		 */
		public double getWithdraw(){
			
			return money;
		}
		
		/**
		 * sets the total by adding the deposited amount
		 * @param deposite
		 */
		public void setDeposite(double deposite){
			
			money = money+ deposite;
		}
		
		/**
		 * gets the money after deposits are added
		 * @return money
		 */
		public double getDeposite(){
			
			return money;
		}
		
	}

