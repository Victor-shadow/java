package RegularExpressions;
import java.util.regex.*;
public class PatternMatchesMethod {
    public static void main(String[]args){
        //Create a REGEX String
        String REGEX = "(.*)(java)(.*)?";
        //Create the string in which search is to be done
        String actualString = "Kotlin is interoperable with Java;";
        //use matches() method to check the match
        boolean matches = Pattern.matches(REGEX, actualString);
        //print values if match is found
        if (matches){
            System.out.println("Match found for regex");
        }
        else{
            System.out.println("No match found for regex");
        }
    }
}
