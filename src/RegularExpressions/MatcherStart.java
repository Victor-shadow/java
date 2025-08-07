package RegularExpressions;
import java.util.regex.*;
public class MatcherStart {
    public static void main(String[]args){
        //Get the REGEX to be checked
        String REGEX = "(G*k)";
        //Create a Pattern from regex
        Pattern pattern = Pattern.compile(REGEX);
        //Get the String to be matched
        String stringToBeMatched = "Geeks";
        //Create a matcher from the input String
        Matcher matcher = pattern.matcher(stringToBeMatched);
        //get the current Matcher state
        MatchResult matchResult = matcher.toMatchResult();
        System.out.println("Current Matcher: " + matchResult);
        while (matcher.find()){
            //get the first index of the Match result
            System.out.println(matcher.start());
        }

    }
}
