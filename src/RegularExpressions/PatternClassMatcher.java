package RegularExpressions;
import java.util.regex.*;
public class PatternClassMatcher {
    public static void main(String[]args){
        //Creating a pattern
        Pattern p = Pattern.compile("JavaUtilRegex");
        //create a matcher for input
        Matcher m = p.matcher("JavaUtilRegex");
        //check if the pattern matches
        boolean b = m.matches();
        //condition to check whether the pattern is matched
        if (b){
            System.out.println("Pattern Matched");
        }
        else{
            System.out.println("Pattern does not match");
        }
    }
}
//Pattern.compile() method compiles the String "JavaUtilRegex" into  a pattern
//m.matches() checks if the entire input string exactly matches the pattern