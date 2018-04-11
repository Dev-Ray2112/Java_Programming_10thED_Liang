/*
 * Write a method that returns a new array by eliminating 
 * duplicate values in the array using the following method: 
 * 
 *  public static int[] eliminateDuplicates(int[] list)
*/

import java.util.Scanner;

public class Exercise_15
{
    public static void main(String[] args)
    {
    int[] list1 = new int[10];
    Scanner input = new Scanner(System.in);

    System.out.print("Enter ten numbers: ");
    for (int i = 0; i < list1.length; i++) 
        list1[i] = input.nextInt();
        eliminateDuplicates(list1);
}   //End Main Method

    public static int[] eliminateDuplicates(int[] list)
    {
    int[] tempArray = new int[list.length];
    int numIndex = 0;
    for (int i = 0; i < list.length; i++)
    {
    boolean distinct = false;
    for (int j = 0; j < list.length; j++) 
    {
        if (tempArray[j] == list[i])
        
        {  distinct = true;  }

    }
        if (!distinct)
        {
            tempArray[numIndex++] = list[i];
        }  
    }    
    int[] newArray = new int[numIndex];
    for (int i = 0; i < numIndex; i++) 
    {
        newArray[i] = tempArray[i];
        System.out.print(newArray[i] + " ");
    }
        return newArray;
   }    //End Method eliminateDuplicates
}       //End Class EliminateDuplicateVals
