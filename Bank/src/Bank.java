/* 
*  FileName: Bank.java(Class Driver) BankAccount.java, and SavingsAccount.Java
*  Purpose:  Bank.java is a class driver which test the BankAccount and SavingsAccount classes.
*  
*     BankAccount.java is an abstract class which holds	methods for Balance, Number of deposits this month, Number of withdrawals, Annual interest rate,
*     and Monthly service charges.
*       
*     SavingsAccount.java extends BankAccount and contains boolean variables for activity or inactivity 
*     dependent upon account balance falling below $25 or including a service charge if frequency of use
*     is more than 4 withdrawals. 
*/
public class Bank
{
	//main method
    public static void main(String args[])  {
       
    SavingsAccount sa = new SavingsAccount(40, 1.5);

    // Display the initial amounts and its status
    System.out.println("Initial account balance is:"
                        + " $"+sa.getAccountBalance());
        printActive(sa.isActive());

    // withdraw an amount of $20 and display    
    System.out.println("\nWithdraw an amount of "
                        + "$20");
        sa.withdraw(20.00);
    System.out.println("Balance after withdraw: "+
        sa.getAccountBalance());
        printActive(sa.isActive());

    // deposit an amount of $3 and display    
    System.out.println("\nDeposit an amount of $3");
        sa.deposit(3.00);
    System.out.println("Balance after deposit: "+
                        sa.getAccountBalance());
        printActive(sa.isActive());

    //withdraw an amount of $10 and display
    System.out.println("\nWithdraw an amount of "
                        + "$10");
        sa.withdraw(10.00);
    System.out.println("Balance after withdraw: "+
                        sa.getAccountBalance());
        printActive(sa.isActive());

    //deposit an amount of $25 and display
    System.out.println("\nDeposit an amount of"
                        + " $25");
        sa.deposit(25.00);
    System.out.println("Balance after deposit: "+
                        sa.getAccountBalance());
        printActive(sa.isActive());

    //call the monthly process        
    sa.monthlyProcess();
    System.out.println("\nBalance at end of the"
                         + " month: ");
    System.out.println("Balance in the account: "+
                        sa.getAccountBalance());
        printActive(sa.isActive());
    System.out.println("Number of deposits made" + ": "+
                        sa.getNumdeposits());
    System.out.println("Number of withdrawals" +" made: "+
                        sa.getNumwithdrwals());           
    }
    // printActive() that accepts a boolean argument      
    public static void printActive(boolean active)  {
        if(active)
            System.out.println("Status of the "
                                + "account is: ACTIVE");
        else
            System.out.println("Status of the "
                                + "account is: INACTIVE");
    }
}