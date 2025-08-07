/// The matcher(CharSequence) method of the Pattern class is used to generate a matcher that will be helpful to match the given
/// input as parameter to the method against the pattern
/// The pattern.matcher() method ia helpful when one needs to check a pattern against a text a single time
/// and the default settings of the Pattern class are appropriate
/// Syntax: public Matcher matcher(CharSequence input)
/// Parameters: This method accepts a Single Parameter input which represents the character sequence to be matched
/// Return value: This method returns a new matcher for this pattern

package RegularExpressions;
import java.util.regex.*;
public class PatternMatcherCharSequence {
    public static void main(String[]args){
        //Create a REGX String
        String REGEX = "(.*)(ee)(.*)?";
        //create the String which search is to be performed
        String actualString = "interfaces are blueprint for classes";
        //Create a pattern
        Pattern pattern = Pattern.compile(REGEX);
        //get a matcher object
        Matcher matcher = pattern.matcher(actualString);
        //print values if match is found
         boolean matchFound = false;
         while (matcher.find()){
             System.out.println("found the Regex in text = " + matcher.group());
             System.out.println("found the Regex in starting index: " + matcher.start());
             System.out.println("Found the Regex in end index: " + matcher.end());
             matchFound = true;

         }
         if (!matchFound){
             System.out.println("No match found for Regex");
         }
    }
}
