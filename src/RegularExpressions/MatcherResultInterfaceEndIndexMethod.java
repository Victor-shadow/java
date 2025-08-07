/// end(int index): This method returns the offset which the last character is matched
/// Syntax: int end(int index)
/// Parameter: index - It represents the index of the capturing group in the matcher pattern
/// Return Type: It returns the offset after the last character matched

package RegularExpressions;
import java.util.regex.*;
class MatcherResultInterfaceEndIndexMethod {
    private static final  String regularExpression = "(.*)(\\d+)(.*)";
    private static final String input = "Hello World!, 1234, these are numbers";
    public static void main(String[]args){
        //Compile regular expression string
        Pattern pattern =Pattern.compile(regularExpression);
        //apply matcher operation
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()){
            //Get the MatchResult Object
            MatchResult matchResult = matcher.toMatchResult();
            //prints the offset after the last character
            //of the sequence held by
            //the given group at the time of match
            System.out.println("Second Capturing Group: " + matchResult.end(1));
        }
    }

}
