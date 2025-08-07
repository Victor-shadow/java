/// toString() method of a Pattern class is used to return the String representation
/// of this pattern
/// This returns the regular expression from which this pattern was compiled
/// Syntax: public String toString()
/// Parameters: this method accepts nothing as a parameter
/// Return value: This method returns the String representation of this pattern
package RegularExpressions;
import java.util.regex.*;
public class PatternToString {
    public static void main(String[]args){
        //Create a regex string
        String REGEX = "Regular Expression";
        //Create a pattern using Regex
        Pattern pattern =Pattern.compile(REGEX);
        //print pattern
        System.out.println("Pattern: " + pattern);
    }
}
