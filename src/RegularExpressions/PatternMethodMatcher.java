package RegularExpressions;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PatternMethodMatcher {
    public static void main(String[]args){
        //Input Strings to match the regex against
        String input1 = "The quick brown fox jumps over the lazy dog";
        String input2 = "The quick red fox jumps over the lazy dog";
        //Regex pattern to match case-insensitive  'the'
        String regex = "(?i)the";
        //compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        //Create matchers for both input Strings
        Matcher matcher = pattern.matcher(input1);
        Matcher matcher1 = pattern.matcher(input2);
        //find and print all matches of input1
        while (matcher.find()){
            System.out.println("Match 1: " +matcher.group());
        }
        //find and print all matches in input2
        while (matcher1.find()){
            System.out.println("Match 2: " + matcher1.group());
        }
    }

}
