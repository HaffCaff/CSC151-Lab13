/**
 * Lab012 - StringSetTester Class
 * 
 * @author Anthony Epps
 */
import java.util.Scanner;

public class StringSetTester {
    public static void main (String[] args){
        Scanner kybd = new Scanner(System.in);
        System.out.print("How many strings will you enter? ");
        int numStr = kybd.nextInt();  // stops after the number, leaves end of line or other whitespace
        kybd.nextLine();              // "eats" everything up to and including the next newline
        // the next kybd.nextLine() will read user input
        
        //Create new StringSet
        StringSet S1 = new StringSet();

        //Create a loop to add x strings, where x is the value of numStr
        for (int i = 0; i<numStr; i++) {
            System.out.println ("Enter a string to add to StringSet: ");
            String string = kybd.next();
            S1.add(string); //call the Add String method
        }

        //Required Sanity Tests
        System.out.println( 2 + S1.get(0).length());

        System.out.println("StringSet contains: " + S1.size() + " strings"); // StringSet.size()
        System.out.println("StringSet contains: " + S1.numChars() + " characters"); // StringSet.numChars()
        System.out.println("Enter the string you want to search the StringSet for: "); //StringSet.countStrings()
        String search = kybd.next();
        System.out.println(search + " was found in the StringSet " + S1.countStrings(search) + " time(s)");



        kybd.close(); // Close scanner
        }
}