/* Write a program that prompts the user to enter a text file name
 * and displays the number of vowels and consonants in the file. 
 * Use a set to store the vowels A,E,I,O, and U.  
*/
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set; 
import java.util.Arrays;    

        
public class Exercise_4
{
    public static void main(String[] args) 
    {
        // Create hashset (Mapinstance) to retain a list of vowels    
        Set<Character> set = new HashSet<Character>(Arrays.asList(
        new Character[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}));
        // Initialize variables
        int countVowels = 0;
        int countConsonants = 0;
        // Prompt for user input.
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        // Create for loop to count vowels and consonants   
        for (int i = 0; i < s.length(); i++) 
        {
            if (set.contains(s.charAt(i))) 
                countVowels++; 
            else if (s == "  ")
                continue;
                else if (Character.isLetter(s.charAt(i)))
                    countConsonants++;
        }  // End for
        // Print results     
        System.out.println("The number of vowels is " + countVowels);
        System.out.println("The number of consonants is " + countConsonants);
    }   // End Main
  }     // End class Exercise_4
