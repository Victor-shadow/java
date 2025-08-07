///The matches() method of Matcher Class is used to get the result whether this pattern matches
/// with this matcher or not
/// It returns a boolean value showing the same
/// Syntax: public boolean matches()
/// Parameters: This method  does not accept any parameter
/// This method returns a boolean value showing whether this pattern matches with this matcher or not


package RegularExpressions;
import java.util.regex.*;
public class MatcherMatches {
    public static void main(String[]args){
        //Get the Regex to be checked
        String REGEX = "Java";
        //create a pattern from regex
        Pattern pattern = Pattern.compile(REGEX);
        //Get the String to be matched
        String stringMatch = "JavaForJava";
        //create a Matcher for Input String
        Matcher matcher = pattern.matcher(stringMatch);
        //Get the result state
        //using matches() method
        System.out.println("Result: "+matcher.matches());
    }
}
