/// The group() method of Matcher class is used to get the input subsequence matched by the previous
/// match result
/// Syntax: public String Group()
/// Parameters: This method does not take any parameters
/// Return Value: this method returns the String which is the input Subsequence matched by the previous match
/// Exception: This method throws IllegalStateException if no match yet has been attempted0, or the previous match attempt failed
package RegularExpressions;
import java.util.regex.*;
public class MatcherGroup {
    public static void main(String[]args){
        //Get the regex to be checked
        String regex = "(K*s)";
        //Create a pattern from the REGEX
        Pattern pattern = Pattern.compile(regex);
        //Get the String to be checked
        String actualString = "Kubernetes and Docker are used by DevOps Engineers";
        //Create a matcher for the input String
        Matcher matcher = pattern.matcher(actualString);
        //Get the current Matcher State
        MatchResult matchResult = matcher.toMatchResult();
        System.out.println("Current Matcher: " + matchResult);
        while (matcher.find()){
            //Get the Group matched using group method
            System.out.println(matcher.group());
        }
    }
}
