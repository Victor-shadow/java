/// The compile(String) method of the Pattern class in Java is used to create a pattern from a regular expression
/// passed as a parameter to a method
/// Whenever one needs to match a text against a regular expression pattern more than one time
/// create a Pattern instance using Pattern.compile() method
/// Syntax: public static Pattern compile(String regex)
/// Parameters: This method accepts one parameter regex which represents the given regular expression
/// compiled into a pattern
/// Return value: This method returns the pattern compiled from the regex passed to the method as a Parameter
/// The method throws the following Exception:
/// PatternSyntaxException: This exception is thrown if the expression syntax is invalid

package RegularExpressions;
import java.util.regex.*;
public class PatternCompileString {
    public static void main(String[]args){
        //Create a REGX String
        String  REGEX = ".*www.*";
        //Create the string in which search is to be performed
        String stringActual = "www.geeksforgeeks.org";
        //compile the regex to create the pattern
        //using compile() method
        Pattern pattern = Pattern.compile(REGEX);
        //get a matcher object from the pattern
        Matcher matcher = pattern.matcher(stringActual);
        //check whether Regex is found in StringActual or not
        boolean matches = matcher.matches();
        System.out.println("actual String" + " contains REGEX = " + matches);
    }
}
