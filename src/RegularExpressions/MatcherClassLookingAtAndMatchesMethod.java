package RegularExpressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MatcherClassLookingAtAndMatchesMethod {
    private static final String REGEX = "regex";
    private static final String INPUT = "regular expressions for regex";
    private static Pattern pattern;
    private static Matcher matcher;
    public static void main(String[]args){
        //initialization for pattern and matcher
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);

        System.out.println("Current REGEX: " + REGEX);
        System.out.println("Current INPUT: " + INPUT);
        System.out.println("lookingAt(): " + matcher.lookingAt());
        System.out.println("matches(): " + matcher.matches());
    }
}
