/// group() method This method returns the input sequence that was matched with the previous match
/// Syntax: String group()
/// Return Type
/// String: A sequence that was matched by the previous match

package RegularExpressions;
import java.util.regex.*;
class MatchResultInterfaceGroupMethod {
    //initializing regular expression String
    private static final String regularExpression = "(.*)(\\d+)(.*)";
    //initialize input String
    private static final String input = "Hello world!, 41346, these are the numbers";
    //Main Method
    public static void main(String[]args){
        //Compile regular Expression
        Pattern pattern = Pattern.compile(regularExpression);
        //Initialize matcher object
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()){
            //Initialize MatchResult Object
            MatchResult matchResult = matcher.toMatchResult();
           //Prints the Input Sequence matched by the previous match
            System.out.println("First Capturing Group: " + matchResult.group());
        }
    }
}
