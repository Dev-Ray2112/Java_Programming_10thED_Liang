/* 
*  FileName: 	DiceSimulation.java
*  Purpose: 	This class simulates rolling a pair of dice 10,000 times and counts the number
*           	of times doubles are rolled.
*  Requirement:	The application must separately demonstrate the use of a While Loop, a do-while loop, and a for loop.  
*/
import java.util.Random;   // Needed for the Random class

public class DiceSimulation  {
	
	public static void main(String[] args)  {
		
	    final int NUMBER = 10000;  // Number of dice rolls
		// Number of dice rolls
		int i=0;		
		Random generator = new Random();
		
        //Provided declarations
		int die1Value;       // Value of the first die
		int die2Value;       // Value of the second die
		int count = 0;       // Total number of dice rolls
		int snakeEyes = 0;   // Number of snake eyes rolls
		int twos = 0;        // Number of double two rolls
		int threes = 0;      // Number of double three rolls
		int fours = 0;       // Number of double four rolls
		int fives = 0;       // Number of double five rolls
		int sixes = 0;       // Number of double six rolls

		// TASK #1 (The While Loop) 
        while(i < NUMBER)  {
		    die1Value=generator.nextInt(6);
            die2Value=generator.nextInt(6);
            
		if(die1Value==die2Value)  {
		    if(die1Value==1)
			    snakeEyes++;
		    else if(die1Value==2)
			    twos++;
		    else if(die1Value==3)
			    threes++;
		    else if(die1Value==4)
			    fours++;
		    else if(die1Value==5)
			    fives++;
		    else
                sixes++;  }
                
                i++;
		        count++;
        }
		    
            // End while loop
            		
	/*	//Task #2 part 1: (The do-While Loop) 
		do {
		    die1Value=generator.nextInt(6);
			die2Value=generator.nextInt(6);
	    if(die1Value==die2Value)  {
	    	if(die1Value==1)
	    	    snakeEyes++;
		    else if(die1Value==2)
                twos++;
            else if(die1Value==3)
	    	    threes++;
	    	else if(die1Value==4)
	    	    fours++;
	    	else if(die1Value==5)
	    	    fives++;
	    	else
                sixes++;  }
                
	            i++;
	            count++;
        }   // End do loop
        
	    while(i < NUMBER);		
		
		//Task #2 part 2: (The for Loop)
		for(i = 0; i < 10000; i++)  {
		    die1Value=generator.nextInt(6);
			die2Value=generator.nextInt(6);
		if(die1Value==die2Value)  {
			if(die1Value==1)
		        snakeEyes++;
		    else if(die1Value==2)
		        twos++;
		    else if(die1Value==3)
		        threes++;
		    else if(die1Value==4)
		        fours++;
		    else if(die1Value==5)
		        fives++;
            else
                sixes++;  }
		  	count++;
		  }
*/
     // Display the results
	    System.out.println ("You rolled snake eyes " +
	                          snakeEyes + " out of " +
	                          count + " rolls.");
	    System.out.println ("You rolled double twos " +
	                          twos + " out of " + count +
	                          " rolls.");
	    System.out.println ("You rolled double threes " +
	                          threes + " out of " + count +
	                          " rolls.");
	    System.out.println ("You rolled double fours " +
	                          fours + " out of " + count +
	                          " rolls.");
	    System.out.println ("You rolled double fives " +
	                          fives + " out of " + count +
	                          " rolls.");
	    System.out.println ("You rolled double sixes " +
	                          sixes + " out of " + count +
	                          " rolls.");		 
     }
}
	

