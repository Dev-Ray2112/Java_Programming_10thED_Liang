public abstract class BankAccount
{
	// Variables
	private double balance;	
	private int numDeposits;
	private int numWithdrwals;	
	private double annInterest;
	private double servCharge;

	// Two argument constructor
	public BankAccount(double balance, double annInterest)  {
		this.balance = balance;
		this.annInterest = annInterest;
		this.numDeposits = 0;
		this.numWithdrwals = 0;
		this.servCharge = 0;  }
	// Deposit: 
	public void deposit(double amount)  {
		balance += amount;
		numDeposits++; 
	}
	// Withdraw:
	public void withdraw(double amount)  {
		balance -= amount;
		numWithdrwals++;
	}
	// Calculate Interest: 
	public void calcInterest()  {
		double monthlyInterestRate = (annInterest/12);
		double monthlyInterest = this.balance *
		   monthlyInterestRate;
		   balance += monthlyInterest;	
	}
	// MonthlyProcess: 
	public void monthlyProcess()  {
		balance -= servCharge;
		calcInterest();
		numWithdrwals = 0;
		numDeposits = 0;
		servCharge = 0;
	}
	// Get and set methods
	public double getAccountBalance()  {
		return balance;
	}
	public void setAccountBalance(double balance)  {
		this.balance = balance;
	}	
	public int getNumdeposits()  {
		return numDeposits;
	}
	public void setNumdeposits(int numDeposits)  {
		this.numDeposits = numDeposits;
	}
	public int getNumwithdrwals()  {
		return numWithdrwals;
	}
	public void setNumithdrwals(int numWithdrwals)  {
		this.numWithdrwals = numWithdrwals;
	}
	public double getAnnInterest()  {
		return annInterest;
	}
	public void setAnnInterest(double annInterest)  {
		this.annInterest = annInterest;
	}
	// method for calculating service charge
	public double getServCharge(double amount)  {
		return servCharge;
	}
	public void setServCharge(double servCharge)  {
		this.servCharge = servCharge;
	}
}
