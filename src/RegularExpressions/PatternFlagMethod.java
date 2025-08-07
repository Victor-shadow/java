package RegularExpressions;
import java.util.regex.*;
public class PatternFlagMethod {
    public static void main(String[]args){
        //Create a REGEX String
        String REGEX = "(.*)(ee)(.*)?";
        //string in which the search is performed
        String actualString =  "geeks";
        //compile the regex to create the pattern
        Pattern pattern = Pattern.compile(REGEX, Pattern.MULTILINE);
        //FIND THE FLAG OF THE PATTERN
        int flag = pattern.flags();
        System.out.print("Pattern match flag = " + flag );





    }
}
