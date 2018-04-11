/* Design an interface “Colorable” with a void method named “howToColor()” 
 * Every class of a Colorable object must implement the colorable interface.
 * Design a class named “Square” that extends GeometricObject and implements Colorable.          
 * Implement howToColor to display the message “Color all four sides.” 
*/

public class Exercise_7
{
		    
    // Begin interface 
    interface Colorable
    {  
    // Begin method howToColor
    public void howToColor();  
    }      // End Interface Colorable
      
    //* Class Square Implements Colorable             
    public class Square implements Colorable 
    {
        // Declare Side Variable 
        private double side;
        public Square (double side)
        {
            this.side = side;
        }
        // Accessor method for Side Variable
        public double getArea ()
        {
            return side * side;
        }
        public double getPerimeter()
        {
            return 4 * side;
        }
        // Mutator method for Side Variable
        public void setSide (int side)
        {
            this.side = side;
        }
        // Implementation of howToColor with print statement
        public void howToColor() 
        {
            System.out.println("Color all four sides.");
        }
    }   // End Class Square
}       // End class Exercise_7

	
	
	
