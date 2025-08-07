package RegularExpressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
public class PatternSyntaxExceptionClass {
    private static String REGEX = "?[^a-zA-Z0-9]";
    private static String MSG = "Learn/ Java? in Oracle!!";
    private static String REPLACE = " ";

    public static void main(String[]args){
        try {
            //get Pattern class object to compile the
            //Regular Expressions
            Pattern pattern = Pattern.compile(REGEX);
            //Get a matcher Object
            Matcher matcher = pattern.matcher(MSG);
            //Using matcher object , replace the string
            MSG = matcher.replaceAll(REPLACE);
        }
        //catch block to handle PatternSyntaxException
        catch (PatternSyntaxException patternSyntaxException){
            System.out.println("PatternSyntaxException: ");
            System.out.println("Description: " + patternSyntaxException.getDescription());
            System.out.println("Index: " + patternSyntaxException.getIndex());
            System.out.println("Message: " + patternSyntaxException.getMessage());
            System.out.println("Pattern: " + patternSyntaxException.getPattern());
            System.exit(0);

        }
        System.out.println("Output: " + MSG);
    }

}
//We are trying to replace all non-alphanumeric characters with a space
//But in regex there is a '?' which is causing the error. Whenever we work with meta characters like '+', '?', '*'
//we need to be careful and should use the escape characters
//