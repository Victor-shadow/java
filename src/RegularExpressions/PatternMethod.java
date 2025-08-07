/// pattern() method of the pattern class in Java is used to get the regular expression
/// which is compiled to create the pattern
/// We use a regular expression to create a pattern and this method is used to get the same source
/// expression
/// syntax: public String pattern()
/// Parameter: This method does not accept anything as a parameter
/// The method returns the pattern's source regular expression

package RegularExpressions;
import java.util.regex.*;
public class PatternMethod {
    public static void main(String[]args){
        //create a regex
        String REGEX = "(.*)(for)(.*)?";
        // create the string one wants to search
        String actualString = "code of Machine";
        //Create pattern
        Pattern pattern = Pattern.compile(REGEX);
        //find the regular expression of the pattern
        String regularExpression  = pattern.pattern();
        System.out.println("Pattern's regular Expression = " + regularExpression);

    }

}
