import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Lab013 - StringSet Class
 * REVISITED - Rewrite to extend ArrayList
 * 
 * @author Anthony Epps
 */

public class StringSet extends ArrayList<String>{

    //String[] StringSet;
    ArrayList<String> StringSet;

    StringSet(){
        this.StringSet = new ArrayList<>();
    }

    /**
     * Removes last added element of StringSet (like List.pop() in Python)
     */
    void pop(){
        StringSet.remove(StringSet.size() -1);
        
    }

    /**
     * Accessor that returns the sum of the number of elements that are valid integers
     * 
     * @return sum of valid integers within the StringSet 
     **/
    
    int sumValidIntegers(){
        int sum = 0;
        for (String s : this.StringSet) {
            //Because Integer.parseInt throws a NumberFormat Error if it fails, treat as an if else, Try to do add current string to sum, if it fails, throw message!
            try {
                sum += Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println("Not a valid number");
            }
        }
        return sum;
    }

    /**
     * Accessor that returns the total number of characters in all of the Strings that have been added to this StringSet object
     * 
     * @return the number of characters among all strings in StringSet
     */
    int numChars(){
        int chars = 0;
        for (String s : StringSet) {
            System.out.println(s);
            chars += 1;
        }
        return chars;
    }
    /**
     * Search StringSet for specific string value
     * 
     * @param stringToLookFor : the string that is being searched in the StringSet
     * @return the number of times @param stringToLookFor appears in the StringSet
     */
    int countStrings(String stringToLookFor){
        int count = 0;
        
        for (String s : StringSet) {
            if (s.contains(stringToLookFor.trim())) {
               System.out.println(s);
               count += 1;
            }
        }
        return count;
    }
}