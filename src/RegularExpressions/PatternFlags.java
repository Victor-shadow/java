///The flags() method of the Pattern class in Java is used to return the pattern match flag
/// The match flags are a bit mask that may include: CASE_INSENSITIVE, MULTILINE, DOTALL, UNICODE_CASE, CANON_EQ
/// UNIX_LINES, LITERAL, UNICODE_CHARACTER_CLASS, COMMENTS
/// Syntax: public int flags()
/// Parameters: This method does not accept any parameters
/// Return value: This method returns the pattern's match flag

package RegularExpressions;
import java.util.regex.*;
public class PatternFlags {
    public static void main(String[]args){
        //create a REGEX String
        String REGEX = "(.*)(for)(.*)?";
        //create a String in which search is to be performed
        String actualString = "Code for Machine";
        //compile the regex to create the pattern
        //using compile() method
        Pattern pattern = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);
        //find the flag of the pattern
        int flag = pattern.flags();
        System.out.println("Pattern match flag: " + flag);

    }
}
