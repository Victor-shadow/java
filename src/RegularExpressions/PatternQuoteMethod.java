package RegularExpressions;
import java.util.regex.*;
public class PatternQuoteMethod {
    public static void main(String[]args){
        //Create a REGEX String
        String REGEX = "java";
        //Create the String in which Search is to be performed
        String actualString = "kotlin is interoperable with java";
        //Create an Equivalent String for Regex
        String  eqREGEX = Pattern.quote(REGEX);
        //Create a pattern using eqREGEX
        Pattern pattern = Pattern.compile(eqREGEX);
        //get a matcher object
        Matcher matcher = pattern.matcher(actualString);
        //print values if match is found
        boolean matchFound = false;
        while (matcher.find()){
            System.out.println("match found");
            matchFound=true;
        }
        if (!matchFound){
            System.out.println("No match found");
        }

    }
}
