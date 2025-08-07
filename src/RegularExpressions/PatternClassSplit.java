/// split(CharSequence) method of Pattern class is used to split the given char sequence passed
/// as a parameter to method around matches of this pattern
///This method can split CharSequence into an array of String using the regular expression used to compile the pattern
/// as a delimiter
/// The method returns an array of Strings computed by splitting the input around matches of this pattern
/// Syntax: public String[] split(CharSequence input)
/// Parameter: This method accepts a single parameter input which represents character sequence to be split
/// This method returns an array of strings computed by splitting the input around matches of this pattern


package RegularExpressions;
import java.util.regex.*;
public class PatternClassSplit {
    public static void main(String[]args){
        //Create a REGEX String
        String REGEX = "ee";
        //Create the String to perform search operation
        String actualString = "geeksforgeeks";
        //Create a Pattern using REGEX
        Pattern pattern =Pattern.compile(REGEX);
        //split the text
        String[]array = pattern.split(actualString);
        //print the array
        for (int i = 0; i < array.length; i++){
            System.out.println("array[" + i + "]=" + array[i]);
        }
    }
}
