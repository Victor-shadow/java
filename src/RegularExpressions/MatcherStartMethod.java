/// The start() method of Matcher Class is used to get the start index  of the match result  already done
/// Syntax: public int start()
/// Parameters: this method does not take any parameter
/// Return value: This method returns the index of the first character matched
/// Exception: This method throws IllegalStateException if no match has yet been attempted or if the
/// previous match operation failed


package RegularExpressions;
import java.util.regex.*;
public class MatcherStartMethod {
    public static void main(String[]args){
        //Get the Regex to be checked
        String REGEX = "(G*G)";
        //Create a pattern from the REGEX
        Pattern pattern = Pattern.compile(REGEX);
        //Get the String to be matched
        String stringToBeMatched = "GFG";
        //Create a matcher from the Input String
        Matcher matcher = pattern.matcher(stringToBeMatched);
        //Current MatchResult
        MatchResult matchResult= matcher.toMatchResult();
        System.out.println("Current Matcher: " +matchResult);
        while (matcher.find()){
            //Get the index of the first matcher
            System.out.println(matcher.start());
        }
    }
}
