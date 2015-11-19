/**
 * 
 */

/**
 * @author Ryley
 *
 */
public class SavingsAccount {

	private double intrate;
	private double anualIntrate;
	private double money;
	private double intrestBalance;
	private double newMoney;
	
	
	public SavingsAccount(double balance){
		
		money = balance;
		
	}
	
	public void setMonthIntrest(double intrest){
		
		anualIntrate = intrest;
		
		intrate = anualIntrate/12;
		
		intrestBalance = money*intrate;
		
		money = intrestBalance + money;
	}
	
	public double getMonthIntrest(){
		
		return money;
	}
	
	public void setWithdraw(double withdraw){
		
		money = money - withdraw;
	}
	
	public double getWithdraw(){
		
		return newMoney;
	}
	
	public void setDeposite(double deposite){
		
		money = money + deposite;
	}
	
	public double getDeposite(){
		
		return money;
	}
	
}
