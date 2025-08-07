/// Pattern compile(String int) method
/// The compile(String int) method of the Pattern class is used to create a pattern from the regular expression
/// with the help of flags where both expressions and flags are passed as parameters to the method
/// The Pattern class contains a list of flags(int constants) that can be helpful to make the patter matching
/// behave in certain ways
/// The flag name CASE_INSENSITIVE is used to ignore the case of the text at the time of matching
/// SYNTAX: public static Pattern compile(String regex, int flags)
/// Parameters: The method accepts two parameters:
///I)regex: This parameter represents the given regular expression compiled into a pattern
/// II)flag: This parameter is an integer representing Match flags: a bit mask that may include
/// CASE_INSENSITIVE, MULTILINE, DOTALL, UNICODE_CASE, CANON_EQ, UNIX_LINES, LITERAL
/// UNICODE_CHARACTER_CLASS, COMMENTS
/// Return Value: This method returns the pattern compiled  from passed regex and flags
/// EXCEPTIONS: This method throws the following Exceptions
/// PatternSyntaxException: This exception is raised if the expression syntax is invalid
/// IllegalArgumentException: This exception is raised if bit values other than  those corresponding
/// to the defined match flags are set in flags
package RegularExpressions;
import java.util.regex.*;
public class PatternCompileStringRegex {
    public static void main(String[]args){
        //Create a REGEX string
        String REGEX = "(.*)(for)(.*)?";
        //Create the String used for Search
        String actualString = "Code for machine";
        //compile the regex to create the pattern
        //using compile() method
        Pattern pattern = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE );
        //CHECK WHETHER THE REGEX STRING IS FOUND IN ACTUAL STRING OR NOT
        boolean matches = pattern.matcher(actualString).matches();
        System.out.println("actual String "+ "contains REGEX = " + matches);
    }
}
