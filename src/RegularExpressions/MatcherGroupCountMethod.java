/// The groupCount() method of Matcher class is used to get the number of capturing groups
/// in the matchers pattern
/// Syntax: public int groupCount()
/// Parameters: This method does not take any parameter
/// Return Value: This method returns the number of capturing groups in the matchers pattern


package RegularExpressions;
import java.util.regex.*;
public class MatcherGroupCountMethod {
    public static void main(String[]args){
        //Get the REGEX to be checked
        String regex = "GFG";
        //Create a pattern from the REGEX
        Pattern pattern = Pattern.compile(regex);
        //Get the String to be matched
        String stringToBeMatched =  "GFGGFGGFGGFGGFGGFGGFGGFGGFGGFGGFG";
        //Create a matcher for the input String
        Matcher matcher = pattern.matcher(stringToBeMatched);
        //Get the number of capturing groups using groupCount()method
        System.out.println(matcher.groupCount());
    }
}
