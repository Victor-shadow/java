package RegularExpressions;
import java.util.regex.*;
public class MatcherEndMethod {
    public static void main(String[]args){
        //get the regex to be checked
        String REGEX = "(G*G)";
        //Create a pattern from REGEX
        Pattern pattern = Pattern.compile(REGEX);
        //Get the String to be matched
        String stringToBeMatched = "GFG FGF GFG";
        //Create a Matcher from Input String
        Matcher matcher = pattern.matcher(stringToBeMatched);
        //Get the current matcher State
        MatchResult matchResult = matcher.toMatchResult();
        System.out.println("Current Match: " + matchResult);
        while (matcher.find()){
            //get the last index of the match result
            System.out.println(matcher.end());
        }
    }


}
