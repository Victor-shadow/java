package RegularExpressions;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Quantifiers {
    public static void main(String[] args) {
        //Create a pattern with a Greedy Quantifier
        Pattern pattern = Pattern.compile("r+r");
        //Create the same pattern with a possessive quantifier
        Pattern pattern1 = Pattern.compile("r++r");
        System.out.println("Using greedy quantifier");
        Matcher matcher = pattern.matcher("rrr");

        while (matcher.find()) {
            System.out.println("Pattern found from " + matcher.start() + " to " + (matcher.end() - 1));
        }
        System.out.println("\nUsing possessive Quantifier");
        Matcher matcher1 = pattern1.matcher("rrr");
        while (matcher1.find()) {
            System.out.println("Pattern found from " + matcher1.start() + " to " + (matcher1.end() - 1));
        }
    }

}
//Since the first quantifier is greedy, r+ matches the whole string
//If we match r+ with whole string, r + r doesn't match
//the greedy quantifier removes the last character, matches rr with r+ and finds a match
//In the Possessive Quantifier we start like Greedy
//r+ matches the whole string, but matching r+ with the whole string does not match
//r+r with rrr
//Unlike greedy since quantifier is possessive , we stop at this point
