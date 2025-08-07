/// groupCount(): This method specifies the number of capturing groups in the match result pattern
///Syntax int groupCount
/// Return Type: Integer: It represents the number of capturing groups in the matchers pattern

package RegularExpressions;
import java.util.regex.*;
class MatchResultInterfaceGroupCountMethod {
    //regular expression
    private static final String regularExpression = "(.*)(\\d+)(.*)";
    //Input String
    private static final String input = "Hello World!, 41346, these are two numbers";
    public static void main(String[]args){
        //Compile regular expression
        Pattern pattern = Pattern.compile(regularExpression);
        //Create a matcher object
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()){
            //Create a MatchResult Object
            MatchResult matchResult = matcher.toMatchResult();
            //prints the number of capturing groups in this match result
            //pattern
            System.out.println("The number of Capturing groups is equal to: " + matchResult.groupCount());
        }
    }
}
