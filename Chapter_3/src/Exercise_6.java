/* 
*  FileName: BodyMass.java  
*  Purpose: Write a program that calculates and displays a person’s body mass index (BMI) and print 
*  the results based on percentile according to their weight and height. 
*/
        
import java.util.Scanner;
        // Create class
public class Exercise_6  {
	    // Begin main
	public static void main(String[] args)  {
        // Initialize Scanner input | Declare Variable
	    Scanner input = new Scanner(System.in);
		String value = null; 
		
		// Prompt for user input (weight)
		System.out.println("Please enter your weight in pounds.");
		// Read in user input (weight)
		double weight = input.nextDouble();
		
		// Prompt for user input (height)
		System.out.println("Enter your exact height in inches.");
		// Read in user input (height) 
		double height = input.nextDouble();
		
		// Calculate BMI
		double BMI = weight * 703/(height*height);
		
		// Test data to generate appropriate output
		if (BMI < 18.5)  {
			value = "underweight";			
		}
		    else if (BMI >= 18.5 && BMI <= 25) {
			    value = "optimal";		
		    }
		        else if (BMI > 25)  {
			        value = "overweight";
		        }		
		// Display results 
		System.out.printf("Your body Mass Index is: %2f, which is considered %s.", BMI, value);
		System.out.println();
		
	}   // End main
}       // End class BodyMass.java