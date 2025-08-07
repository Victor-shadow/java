package RegularExpressions;
import java.util.regex.*;
public class MatcherMatchesMethod {
    public static void main(String []args){
        //Get the REGEX to be checked
        String regex = "GFG";
        //Create a pattern from regex
        Pattern pattern = Pattern.compile(regex);
        //Get the String to be Matched
        String stringToBeMatched = "GFGGFGGFGGFGGFGGFGGFGGFG";
        //CREATE A MATCHER FOR THE INPUT STRING
        Matcher matcher = pattern.matcher(stringToBeMatched);
        //get the result state using matches() method
        System.out.println("Result: " + matcher.matches());
    }
}
