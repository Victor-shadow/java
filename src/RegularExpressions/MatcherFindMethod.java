package RegularExpressions;
import java.util.regex.*;
public class MatcherFindMethod {
    public static void main(String[]args){
        //Get the REGEX to be checked
        String REGEX = "GFG";
        //Create a pattern for the regex
        Pattern pattern =Pattern.compile(REGEX);
        //Get the String to be matched
        String string = "GFGFGFGFGFGFGFGFGFGFGFGF";
        //Create a matcher for the input String
        Matcher matcher = pattern.matcher(string);
        //Get the subsequence using the find() method
        System.out.println(matcher.find());
    }
}
