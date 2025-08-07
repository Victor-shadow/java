/// The find(int start) method of Matcher Class attempts to find the next subsequence after the specified subsequence
/// number, passed as a parameter of the input stream to find the pattern
/// It returns a boolean value showing the same
/// Syntax: public boolean find(int start)
/// Parameter: This method takes a parameter start which is the subsequence number after which
/// the next subsequence is to be found
/// Return Value: this method returns a boolean value showing whether a subsequence of the input sequence
/// finds this matcher's pattern
/// Exception: This method throws IndexOutOfBoundsException  if start is less than zero or greater than the length
/// of the input sequence


package RegularExpressions;
import java.util.regex.*;
public class MatcherFindInt {
    public static void main(String[]args){
        //Get the REGEX to be checked
        String regex = "Geeks";
        //Create a Pattern from the REGEX
        Pattern pattern =Pattern.compile(regex);
        //Get the String to be matched
        String string = "GeeksForGeeks";
        //Create a matcher for the input String
        Matcher matcher = pattern.matcher(string);
        //Get the subsequence using find() method
        System.out.println(matcher.find(1));

    }
}
