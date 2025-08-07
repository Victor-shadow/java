package RegularExpressions;
import java.util.regex.*;
public class PatternToStringMethod {
    public static void main(String[]args){
        //Create a REGEX String
        String REGEX = "[* &  # $ !] + \\s";
        //Create a pattern using REGEX
        Pattern pattern = Pattern.compile(REGEX);
        //Print Pattern
        System.out.println("Pattern: " + pattern);
    }
}
