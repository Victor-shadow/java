package RegularExpressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MatcherClassStartAndEndMethods {
   private static final String REGEX = "\\bregex\\b";
   private static final String INPUT = "regex regex regex regular regex's";
   public static void main(String[]args){
       Pattern pattern = Pattern.compile(REGEX);
       //GET A MATCHER OBJECT
       Matcher matcher = pattern.matcher(INPUT);
       //Initialize a counter variable to count
       int count = 0;
       //try to match the entire input sequence  against
       //the pattern using a loop
       while (matcher.find()){
           count++;
           System.out.println("Match Number: " + count);
           System.out.println("Start(): " + matcher.start());
           System.out.println("end(): " + matcher.end());
       }
   }



}
