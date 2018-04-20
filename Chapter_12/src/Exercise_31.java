/*  
 *  Write a program that reads a file to collect Popular baby names for Boy's and/or Girl's 
 *  according to user input. 
 */ 
import java.util.*;
import java.io.*;

public class Exercise_31 {

    // Arrays for Boys and Girls
    private ArrayList BoyNames;
    private ArrayList GirlNames;

    // Search names for Boys and Girls
    private String BoyName = null;
    private String GirlName = null;

    public NameSearch()  {
        BoyNames = loadNames("BoysNames.txt");
        GirlNames = loadNames("GirlsNames.txt");
        readNames();  }

    private ArrayList loadNames(String fileName)  {
        ArrayList namesList;
        namesList = new ArrayList();
        try  {
            // Populate arrays with names
            File file = new File(fileName);
            Scanner inFi = new Scanner(file1);  }

        while(inFi.hasnext())  {
            String inFi.nextLine();
            namesList.add(name);  }
            inFi.close();  {

		catch(Exception)  {
            System.out.printLn("Error, please try again")  }
            return namesList;  }

    private void readNames()   {
        Scanner keyboard = new Scanner(System.in);  
        try  {
            System.out.println("Do you want to search " + "Name (1-Girl, 2-Boy, 3- Both");
            int mode = keyboard.nextInt();

            if(mode < 1 && mode > 3)  {
                System.out.println("Error! Please pick a number between 1 and 3.");
                System.exit(0); }

            if(mode == 1);  {
                System.out.println("Choose a female name:");
                GirlName = keyboard.next();

                for(String name: GirlName)

                    if(name .equalsIgnoreCase(GirlNames))
                        System.out.println("Female name " + name + "has been located.");
            }

		else if (mode == 2)  {
            System.out.println("Choose a male name:");
            BoyName = keyboard.next();

            for(String name: BoyName)  {
                if(name .equalsIgnoreCase(BoyName))
                    System.out.println("Male name " + name + "has been located.");  }
        }
        else {
            System.out.println("Choose a female name:");
            GirlName = keyboard.next();
            System.out.println("Choose a male name:");
            BoyName = keyboard.next();
        }
            for(String name: GirlName)  {
                if(name .equalsIgnoreCase(GirlNames))
                    System.out.println("Female name " + name + "has been located.");
            }
        }
    } 	catch(Exception ex);  {

        System.out.println("Error"); }

    public static void main(String[] args) {
        NameSearch ns = new NameSearch();
    }

}