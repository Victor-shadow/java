///-Interface in java is used to achieve abstraction
///-It is also considered as the blueprint of the class
///-An interface can contain abstract methods only but, it might or not contain variables. An Interface can contain abstract methods and variables only
///
///
///public interface MatchResult
///
///MatchResult Interface
///The MatchResult Interface in Java signifies the result or conclusion of a match operation
///-It contains the definition of certain query methods  that can be used to determine the result of
///the match with a regular expression
///NOTE:We cannot alter the group/group boundaries  and match Boundaries using the MatchResult Interface
///but one can see them easily through  the interface
///
///Syntax:
/// start() method: This method is used to return the start index of the match
/// Syntax: int start()
/// Return value: integer: represents the index of the first character that has a match



package RegularExpressions;
import java.util.regex.*;
 class MatchResultInterfaceStartMethod {
     //initializing regular expression String
     private static final String regularExpression = "(.*)(\\d+)(.*)";
     //Initializing input String
     private static final String input =  "Java ! , 12345, is a high level object oriented programming language.";
     //Main method
     public static void main(String[]args){
         //Compile the given regular expression String
         Pattern pattern = Pattern.compile(regularExpression);
         //Apply matcher Operation
         Matcher matcher = pattern.matcher(input);
         if (matcher.find()){
             //Retrieve the MatchResult Object
             MatchResult matchResult = matcher.toMatchResult();
             //print the starting index of the match
             System.out.println("Starting index of the match: " + matchResult.start());
         }
     }


}
