/* 
*   Filename: KittenWriter.java
*   Purpose: Create, write, and read three kitten objects to kittens.dat file
*   utilizing java I/O resources. Chapter_21
*/

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) throws IOException  {
        System.out.println("Enter file name: ");
        File file = new File(new Scanner(System.in).next());

        if (!file.isFile())
            throw new FileNotFoundException(file + " is not a file");

            int vowelCount = 0;
            int consonantCount = 0;
            try (BufferedReader in = new BufferedReader(new FileReader(file))) {        
                HashSet<Character> vowels = new HashSet<>(Arrays.asList(new Character[]{'A', 'E', 'I', 'O', 'U'}));         
                String s;
                while ((s = in.readLine()) != null)  {           
                    for (char ch : s.toCharArray())  {
                        if (Character.isAlphabetic(ch))  {
                            ch = Character.toUpperCase(ch);
                        if (vowels.contains(ch))
                            vowelCount++;
                        else
                            consonantCount++;  
                        }
                    }
                }
            }   catch (IOException ex)   {
        }
            System.out.println("Total vowels = " + vowelCount);
            System.out.println("Total consonants = " + consonantCount);
    }
}   