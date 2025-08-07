package RegularExpressions;
import java.util.regex.*;
public class MatcherFindIntMethod {
    public static void main(String[]args){
        //Get the REGEX to be checked
        String REGEX = "GFG";
        //Create a Pattern from the REGEX
        Pattern pattern = Pattern.compile(REGEX);
        //Get the String to be matched
        String stringToBeMatched = "GFGFGFGFGFGFGFGGFGGFGFGF";
        //Create a matcher from the input String
        Matcher matcher = pattern.matcher(stringToBeMatched);
        //Get the subsequence using find() method
        System.out.println(matcher.find(0));
        }
}
