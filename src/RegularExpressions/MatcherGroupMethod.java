package RegularExpressions;
import java.util.regex.*;
public class MatcherGroupMethod {
    public static void main(String[]args){
        //Get the regex to be checked
        String REGEX = "(G*G)";
        //Create a pattern from REGEX
        Pattern pattern = Pattern.compile(REGEX);
        //Get the String to be matched
        String actualString = "GFG FGF GFG";
        //Create a matcher for the input String
        Matcher matcher = pattern.matcher(actualString);
        //get the current matcher state
        MatchResult matchResult = matcher.toMatchResult();
        System.out.println("Current Matcher: " + matchResult);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
