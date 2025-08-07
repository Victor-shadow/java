/// end() this method returns the offset when the last character is matched
/// Syntax: int end()
/// It returns the offset after the last character matched


package RegularExpressions;
import java.util.regex.*;
public class MatcherResultInterfaceEndMethod {
    //initializing the regular expression String
    private static final String regularExpression = "(.*)(\\d+)(.*)";
    //Initialize the input String
    private static final String input = "Hello World!, 4567, these are numbers.";
    //Main method
    public static void main(String[]args){
        //Compiling the regular expression String
        Pattern pattern = Pattern.compile(regularExpression);
        //apply the matcher operation
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()){
            //Retrieve the MatchResult Object
            MatchResult matchResult = matcher.toMatchResult();
            //Prints the offset followed by the last character matched
            System.out.println("First Capturing Group: " + matchResult.end());

        }
    }

}
