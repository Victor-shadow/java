package RegularExpressions;
import java.util.regex.*;
public class MatcherGroupCount {
    public static void main(String[]args){
        //Get the Regex to be checked
        String regex = "Geeks";
        //Create a pattern from the REGEX
        Pattern pattern = Pattern.compile(regex);
        //Get the String to be checked
        String stringToBeMatched = "GeeksForGeeks";
        //Create a matcher from the input String
        Matcher matcher = pattern.matcher(stringToBeMatched);
        //Get the number of capturing Groups
        //using groupCount() method
        System.out.println(matcher.groupCount());

    }
}
