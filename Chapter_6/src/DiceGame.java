/*   
*  FileName: DiceGame.java   
*  Purpose:  Write a program that plays a simple dice game
*            between AI and user using a counter 
*            loop and random number generation.     
*/

import java.io.*;
import java.util.Random;

public class DiceGame  {
    public static void main(String[] args)  {
	    // Declare variables 
		int user = 0;
		int computer = 0;
		int count = 10; // Set the iteration of loop 10 times
		int cdie = 0;
		int udie=0;
		Random ran = new Random(); // Needed for random number generation 
		
		// Display game beginning message
		System.out.println("Let the dice game begin!: ");
		System.out.println();
			  
		// Begin loop and iterate 10 times
		for(int i = 0; i < count; i++)  {
		    cdie = ran.nextInt(6) + 1;
			udie = ran.nextInt(6) + 1;
			  
		    if(cdie > udie)  {
                computer++;
            			  
			// Display when/if computer wins the match 
            System.out.println((i + 1) + " "+ cdie +" "+ udie +" Computer");  }
             
		    else if(cdie < udie)  {
		        user++;
			  
			// Display when/if user wins the match 
            System.out.println((i + 1) +" " + cdie +" "+ udie +" User");  }
            
		    else  {
		    // Display when/if match ends in a tie
            System.out.println((i + 1) +" "+ cdie + " " + udie +" Tie");  }
            
        }   // End for loop
        
			// Display the winner of each match 
			System.out.println("Total Rounds won by Computer:"+ computer);
			System.out.println("Total Rounds won by User:" + user);
			  
		// Determine the Grand Winner
		if(computer > user)
			
			// Display if the computer is the grand winner
			System.out.println("Grand Winner is: Computer");
		
		else if(computer < user)
			
			// Display if the user is the grand winner
			System.out.println("Grand Winner is: User");
		
		else
			// Display if the game ends in a tie
			System.out.println("Draw: Game has ended in a tie");
		 	System.out.println();
		 	// Display end game message
		 	System.out.println("Game end!");
		 	  
	}   // End main method
}		// End class DiceGame.java