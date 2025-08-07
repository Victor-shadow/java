/// The find() method of Matcher class attempts to find the next subsequence of the input sequence
/// that find the pattern
/// It returns a boolean values showing the name
/// Syntax: public boolean find()
/// Parameters: this method does not take any parameter
/// Return value: This method returns a boolean value showing whether a subsequence of the input sequence
/// find's this matcher pattern
package RegularExpressions;
import java.util.regex.*;
public class MatcherFind {
    public static void main(String[]args){
        //Get the REGEX to be checked
        String regex = "Geeks";
        //create a pattern for the regex
        Pattern pattern = Pattern.compile(regex);
        //Get the String to be matched
        String stringToBeMatched = "GeeksForGeeks";
        //Create a matcher for the input String
        Matcher matcher = pattern.matcher(stringToBeMatched);
        //Get the subsequence using find() method
        System.out.println(matcher.find());



    }
}
