package RegularExpressions;
import java.util.regex.*;
public class PatternCompileStringMethodRegex {
    public static void main(String[]args){
        //Create a REGEX string
        String REGEX = ".*org.*";
        //create the string in which search is done
        String actualString = "java.org";
        //compile the regex to create the pattern
        //using compile() method
        Pattern pattern = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);
        //check whether REGEX is found in actual String or not
        boolean matches = pattern.matcher(actualString).matches();
        System.out.println("actualString " + "contains REGEX = " + matches);
    }
}
