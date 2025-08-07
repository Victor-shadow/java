/// The pattern() method  of the Matcher class is used to get the pattern to be matched
/// by this matcher
///Syntax: public Pattern  pattern();
/// parameter: This method does not accept any parameters
/// This method returns a Pattern which is the pattern to be matched with the Matcher

package RegularExpressions;
import java.util.regex.*;
public class MatcherPatternMethod {
    public static void main(String[]args){
        //Create a pattern from regex
        Pattern pattern = Pattern.compile("G.*S$");
        //Get the String to be matched
        String stringToBeMatched = "GeeksForGeeks";
        //Create a matcher for the input String
        Matcher matcher = pattern.matcher(stringToBeMatched);
        //get the pattern using pattern() method
        System.out.println("Pattern used: " + matcher.pattern());
    }
}
