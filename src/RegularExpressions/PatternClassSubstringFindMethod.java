package RegularExpressions;
import java.util.regex.*;
public class PatternClassSubstringFindMethod {
    public static void main(String[]args){
        //Create a Pattern
        Pattern p = Pattern.compile("JustInTimeCompiler");
        //create a matcher for input
        Matcher m = p.matcher("JIC stands for JustInTimeCompiler");
        //Determining if the input sequence contains the
        //subsequence that matches the pattern
        if (m.find()){
            System.out.println("Subsequence JIC found");
        } else {
            System.out.println("Subsequence not found");
        }
    }
}
//Pattern.compile() method creates a pattern to search for "JustInTimeCompiler"
//The matcher.find() searches for the occurrence of the pattern in the input string
//and returns true if found otherwise false
