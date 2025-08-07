package RegularExpressions;
import java.util.regex.*;
public class MatcherPattern {
    public static void main(String[]args){
        //Create a pattern from regex
        Pattern pattern = Pattern.compile("GFG");
        //Get the String to be matched
        String stringMatch = "GFGGFGGFGGFGGFGGFGGFGGFGGFGGFG";
        //Create a Matcher from the input string
        Matcher matcher= pattern.matcher(stringMatch);
        //Get the pattern using pattern() method
        System.out.println("Pattern: "+ matcher.pattern());

    }
}
