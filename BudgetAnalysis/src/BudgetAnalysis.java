/* 
*  FileName: BudgetAnalysis.java
*  Purpose: This program prompts the user for monthly budget
*  and provides a comparative analysis verses monthly expenses.  
*/
import java.util.Scanner;

public class BudgetAnalysis  {
	public static void main(String[] args)  {
		// Create Scanner object
        Scanner keyboard = new Scanner(System.in);
        // Declare variables 
        int budget;
        int costs = 0; 
        int totalCosts = 0;
        char ch; 
       
        // Prompt user for monthly budget | Prompt for entry from user
        System.out.print("Enter this months budget: $");
        budget = keyboard.nextInt();
        
        // Prompt user for monthly expense | Prompt for entry from user
        System.out.println("Please enter money spent this month.");
        System.out.println("");
        
        // Run loop to count expenses
        do  {
        	// Prompt user for additional entries | Collect additional entries
            System.out.print("Enter an additional expense: ");
            costs = keyboard.nextInt();
            
            // Calculate expenses 
            totalCosts += costs;
            
            // Prompt user for the desire to continue | collect if necessary 
            System.out.println("Do you wish to enter and additional expense? (y/n)");
            ch = keyboard.next().charAt(0);             
        }	
        	// Run loop to determine if expense is over/under budget
        while (ch == 'y');  {
        	if (costs <= budget)  {
        		// Display under budget message 
        		System.out.println("Total expense is $"+ totalCosts);	            
        		System.out.println("You are $"+(budget-totalCosts)+" under budget.");   
            }
            else   {
            	// Display under budget message
            	System.out.println("Total expense is $"+ totalCosts);
            	System.out.println("You are $"+(budget-totalCosts)+" over your budget.");
            }
          }
	 }
}