/* 
 *  The Colorable Interface
*/
    // Begin interface 
interface Colorable  {
    // Begin method howToColor
    public void howToColor();  }
    // End Interface Colorable
      
    /* Class Square Implements Colorable 
     * (Would also extend to GeometricObject class) but design 
     * specifications did not clearly specify as such
     */ 
public class Square implements Colorable  {
    // Declare Side Variable 
    private double side;
    public Square (double side)  {
            this.side=side;
    }
    // Accessor method for Side Variable
    public double getArea ()  {
        return side*side;
    }
    public double getPerimeter()  {
        return 4*side;
    }
    // Mutator method for Side Variable
    public void setSide (int side)  {
        this.side=side;
    }
    // Implementation of howToColor with print statement
    public void howToColor()  {
        System.out.println("Color all four sides.");
    }
}   // End Class Square