/// The end() method of Matcher class is used to get the offset after the last character matched of the match result
/// already done
/// Syntax: public int end()
/// Parameter: This method does not take any parameters
/// Return value: This method returns the offset after the last character matched
/// Exception: This method throws IllegalStateException if no match has yet been attempted
/// or the previous match operation failed

package RegularExpressions;
import java.util.regex.*;
public class MatcherEnd {
    public static void main(String[]args){
        //Get the regex to be checked
        String regex = "(G*s)";
        //create a pattern from regex
        Pattern pattern = Pattern.compile(regex);
        //Get the String to be matched
        String stringToBeMatched = "GeeksForGeeks";
        //Create a matcher from the input string
        Matcher matcher = pattern.matcher(stringToBeMatched);
        //Get the current matcher state
        MatchResult matchResult = matcher.toMatchResult();
        System.out.println("Current Matcher: " + matchResult);
        while (matcher.find()){
            //get the last index of the match result
            System.out.println(matcher.end());
        }
    }
}
