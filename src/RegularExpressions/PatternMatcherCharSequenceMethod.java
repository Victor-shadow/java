package RegularExpressions;
import java.util.regex.*;
public class PatternMatcherCharSequenceMethod {
    public static void main(String[]args){
        //Create a Regex String
        String REGEX = "(.*)(ee)(.*)?";
        //create the String to perform Search operations
        String actualString = "fleetforfleet";
        //Create a Pattern
        Pattern pattern = Pattern.compile(REGEX);
        //get a matcher Object
        Matcher matcher = pattern.matcher(actualString);
        //print values if match is found
        boolean matchFound = false;
        while (matcher.find()){
            System.out.println("Match found at = ");
        }
        if (!matchFound){
            System.out.println("No match found");
        }

    }
}
