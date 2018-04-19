class SavingsAccount extends BankAccount
{
    private boolean active;

	public SavingsAccount(double balance, double annInterest)  {

		// super class constructor
	    super(balance, annInterest);
		if (balance >= 25)  {
            active = true;  }

		// if not, set the active Status to false
		else {
			active = false; }
    }   
        // withdraw: 
	public void withdraw(double amount)  {
	    if (active) {
            super.withdraw(amount);
            
		if(super.getAccountBalance()<25)
            active = false;  }

        else {
			System.out.println("Amount cannot be"
                                      + " withdrawn."); }                                      
    }  
        // deposit: 
	public void deposit(double amount)	{
	    if (!active) {
		    double avail = super.getAccountBalance() 
				                + amount;
		if(avail >= 25) {
			active = true; } 			
	        super.deposit(amount); }  }
	
	    // monthlyProcess:
	public void monthlyProcess()   {
        int countWithdrwals = super.getNumwithdrwals();
            
		if(countWithdrwals > 4)	{
		    super.setServCharge(countWithdrwals - 4);
            super.monthlyProcess();
                
		if (super.getAccountBalance() < 25)				
			active = false;  }
	}	
		
	public boolean isActive()  {
	    return active;
	}
	public void setActive(boolean active)  {
	    this.active = active;
	}
}
