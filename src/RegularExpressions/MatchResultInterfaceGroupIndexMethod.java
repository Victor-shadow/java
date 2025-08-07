/// group(int index): This method is used to return the input sequence that was help by the specified group
/// at the time of the previous match operation
/// Syntax: int group(int index)
/// Parameter: index: The index of the group  that is being captured in this matcher's pattern
/// Return Type: A string; It represents a sequence that has been captured by the group at the time of the previous match
/// null: if the group cannot match any part of the input



package RegularExpressions;
import java.util.regex.*;
class MatchResultInterfaceGroupIndexMethod {
    //initialize RegularExpression String
    private static final String regularExpression = "(.*)(\\d+)(.*)";
    //initialize Input String
    private static final String input = "Hello World!, 41346, these are the numbers";
    //Main Method
    public static void main(String[]args){
        //Compiling regular Expression
        Pattern pattern = Pattern.compile(regularExpression);
        //Create a matcher object
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()){
            //Create MatchResult Object
            MatchResult matchResult = matcher.toMatchResult();
            //prints the input subsequence that was held by the given group
            //during the last match
            //occurred
            System.out.println("Second Capturing Group - Match String: " + matchResult.group(1));
        }

    }
}
