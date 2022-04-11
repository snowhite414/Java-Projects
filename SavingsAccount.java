/*********************************************************************************************************
 * SavingsAccount.java
 * Hazel Cruz
 * 
 * This is a program that establishes two savings accounts with 0.05 annual interest rate.
 *  At the end of each month, update the balance by adding one month’s interest to the balance,
 ********************************************************************************************************/
public class SavingsAccount {

	private static double annualInterestRate;    // class variable
	private final int ACCOUNT_NUMBER;            // instance constant
	private double balance;                      // instance variable, initial balance
	
	public SavingsAccount(int ACCOUNT_NUMBER, double balance) {
		 
		this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
		this.balance = balance;
	}  // end constructor

	public int getACCOUNT_NUMBER() {
		return this.ACCOUNT_NUMBER;
	} // end getACCOUNT_NUMBER
	
	public double getBalance() {
		return this.balance;
	} // getBalance
	
	public double addMonthlyInterest() {
		return this.balance += ((balance * annualInterestRate )/ 12);
	} // end addMonthlyInterest

	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	} // end of class method setAnnualInterestRate
	
} // end class SavingsAccount
