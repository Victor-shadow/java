package RegularExpressions;
import java.util.regex.*;
public class MatchResultInterfaceStartIndexMethod {
    //Initialize the regular expression string
    private static final String regularExpression = "(.*)(\\d+)(.*)";
    //initialize the input Strig
    private static final String  input = "Java, 123 is a high level object oriented programming language!!!";
    //main method
    public static void main(String[]args){
        //Compile the regular expression String
        Pattern pattern = Pattern.compile(regularExpression);
        //Apply matcher operation
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()){
            //Retrieve the MatchResult Object
            MatchResult matchResult = matcher.toMatchResult();
            //prints the start index of the sequence
            //that was held by the given group
            //during the match
            System.out.println("Second Capturing Group: " + matchResult.start(1));
        }
    }
}
