package RegularExpressions;
import java.util.regex.*;
public class PatternSyntaxExceptionMethods {
    private static String REGEX = "[Regex";
    private static String MESSAGE = "Regular Expressions are used for finding patterns in Strings text";

    public static void main(String[]args){
        Pattern pattern = null;
        Matcher matcher = null;
        try {
            pattern = Pattern.compile(REGEX);
            matcher = pattern.matcher(MESSAGE);
        }
        catch (PatternSyntaxException patternSyntaxException){
            System.out.println("PatternSyntaxException: ");
            System.out.println("Pattern: " + patternSyntaxException.getPattern());
            System.out.println("Message: " + patternSyntaxException.getMessage());
            System.out.println("Description: " + patternSyntaxException.getDescription());
            System.out.println("Index: " + patternSyntaxException.getIndex());
            System.exit(0);
        }
        boolean found = false;
        while(matcher.find()){
            System.out.println(" Found the text at " + matcher.start());
            found = true;
        }
        if (!found){
            System.out.println("No match found!");
        }
    }
}
