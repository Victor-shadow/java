/// quote(String) method of a Pattern Class is used to return a literal pattern String for the Specified
/// String passed as a parameter to a method
/// This method produces String equivalent to s that can be used to create a Pattern
/// Metacharacters or escape sequences in the input sequence will be given no special meaning
/// If one compiles the value returned by the quote method, you'll get a Pattern which matches the literal string
/// that one passed as a parameter to a method
/// \Q and \E mark the beginning and the end of the quoted part of the String
/// Syntax; public static String quote(String s)
/// Parameters: This method accepts a single parameter s which represents the string to be literalized
/// Return value: This method returns a literal String replacement for String s
package RegularExpressions;
import java.util.regex.*;
public class PatternQuote {
    public static void main(String[]args){
        //Create a REGEX string
        String REGEX = "ee";
        //Create the String in which Search is performed
        String actualString = "jeepforjeep";
        //Create Equivalent String for REGEX
        String eqREGEX = Pattern.quote(REGEX);
        //Create Pattern using eqREGEX
        Pattern pattern = Pattern.compile(eqREGEX);
        //get a Matcher Object
        Matcher matcher = pattern.matcher(actualString);
        //print values if match is found
        boolean matchfound = false;
        while (matcher.find()){
            System.out.println("Found the regex in text= " + matcher.group());
            System.out.println("Found the regex in start index= " + matcher.start());
            System.out.println("Found the regex in end index= " + matcher.end());
            matchfound = true;
        }
        if (!matchfound){
            System.out.println("No match found for Regex: ");
        }
    }
}
