/* 
*  FileName: GeometryCalculator.java
*  Purpose:  : This program utilizes static methods to calculate the areas of a Circle, 
*  		       Rectangle, or Triangle based on user choices which are displayed in a menu.   
*/
import java.util.Scanner;

public class GeometryCalculator { 	
    // Begin Geometry class
	public static class Geometry { 
		public static double areaOfCircle(double radius)  { 
		    return Math.PI * radius * radius;  } 	 
		public static double areaOfRectangle(double length, double width)  { 
			return length * width;  } 	 
		public static double areaOfTriangle(double base, double h)  { 
			return base * h * 0.5;  } 
    }
    // Begin main 
    public static void main(String[] args)  { 
	// Define user input variable 
	    int choice; 	
	    do  { 
		    // Get the user's menu choice. 
		    choice = getMenu(); 	 
		    if (choice == 1) { 
			    calculateCircleArea();  } 
		    else if (choice == 2)  { 
			    calculateRectangleArea();  } 
		    else if (choice == 3)  { 
			    calculateTriangleArea();  } 
		    else if (choice == 4)  { 
			System.out.println("     End of Geometry Calculator!");  } 
	    } 	
		    while (choice != 4);		       
    }		    // End main  	 
	// Begin menu method
	public static int getMenu()  { 
	    // Define user choice variable 
		int userChoice;	 
	    // Create Scanner object to get user input 
	    Scanner keyboard = new Scanner(System.in); 	 
	    // Display menu to show user choices  
        System.out.println("        Geometry Calculator\n"); 
        System.out.println("1. Calculate the Area of a Circle"); 
        System.out.println("2. Calculate the Area of a Rectangle"); 
        System.out.println("3. Calculate the Area of a Triangle"); 
        System.out.println("4. Quit\n"); 
        System.out.print("Enter your choice (1-4) : ");	 
	    // Get input from user 
	    userChoice = keyboard.nextInt(); 	 
	    //  User input validation
	    while (userChoice < 1 || userChoice > 4)  { 
	        System.out.print("Error ! Please enter a valid choice of  1, 2, 3, or 4. "); 
	        userChoice = keyboard.nextInt(); 
	    } 	 
	        return userChoice; 
	}       // End Menu	
	// Begin calculation methods  
    public static void calculateCircleArea()  { 
        /* Length, width, and radius variable definitions 
        * appear where appropriate within the calculation 
        * methods
        */
	    double radius; 	 
	    // Get input from user 
	    Scanner keyboard = new Scanner(System.in); 
	    System.out.print("What is the circle's radius? "); 
	    radius = keyboard.nextDouble(); 	 
	    // Display output 
	    System.out.println("The circle's area is " 
	                        + Geometry.areaOfCircle(radius)); 
    } 	 
	public static void calculateRectangleArea()  { 		 
	    double length; 
	    double width; 	 
	    // Get input from user 
	    Scanner keyboard = new Scanner(System.in); 	 
	    // Get length 
	    System.out.print("Enter length? "); 
	    length = keyboard.nextDouble(); 	 
	    // Get width 
	    System.out.print("Enter width? "); 
	    width = keyboard.nextDouble(); 	 
	    // Display output 
	    System.out.println("The rectangle's area is " 
	                        + Geometry.areaOfRectangle(length, width)); 
	} 	 
	public static void calculateTriangleArea()  { 	 
	    double base; 
	    double height; 	 
	    // Get input from user 
	    Scanner keyboard = new Scanner(System.in); 	 
	    // Get the base 
	    System.out.print("Enter length of the triangle's base? "); 
	    base = keyboard.nextDouble(); 	 
	    // Get the height 
	    System.out.print("Enter triangle's height? "); 
	    height = keyboard.nextDouble(); 	 
	    // Display the triangle's area. 
	    System.out.println("The triangle's area is " 
	                        + Geometry.areaOfTriangle(base, height));	  
	} // End calculation methods	 
}	  // End class GeometryCalculator.java