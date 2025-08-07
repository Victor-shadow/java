/// The matches(String CharSequence) method of the Pattern classin Java is used to answer whether
/// the regular Expression  matches on the input
/// The given regular expression is compiled and attempts to match the given input against it
/// where both regular expressions and input passed as a parameter to the methods
/// If a pattern is to be used multiple times, compiling it once and reusing it will be more efficient
/// than invoking the method each time
/// Syntax: public static boolean matches(String regex, CharSequence input)
/// Parameters: This method accepts two input:
/// i)regex: This represents the expression to be compiled
/// ii)input: the character sequence to be matched
/// Return value: This method returns a boolean value, answering whether or not the regular expression matches the input

package RegularExpressions;
import java.util.regex.*;
public class PatternMatches {
    public static void main(String[]args){
        //Create a Regex String
        String REGEX = "(.*)(ee)(.*)?";
        //Create the String in which search is to be done
        String  actualString = "geeksforgeeks";
        //uses match() method to check the match
        boolean matcher = Pattern.matches(REGEX, actualString);
        //print values if match is found
        if (matcher){
            System.out.println("Match found at regex");
        }
        else{
            System.out.println("No match found");
        }
    }
}
