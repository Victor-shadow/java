package RegularExpressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class GreedyQuantifier {
    public static void main(String[]args){
        //Make an Instance of Pattern class
        //by default, quantifier '+' is greedy
        Pattern pattern = Pattern.compile("r+");
        //Create an instance of matcher class
        Matcher matcher = pattern.matcher("rrr");
        while (matcher.find()){
            System.out.println("Pattern found from " + matcher.start() + " to " + (matcher.end()-1));
        }
    }

}
//the pattern r+ means one or more occurrences of r
//Text is rrr
//The greedy matcher would match the longest  text even if parts of the matching text also match
//In the code, r and rr also match, but the greedy matcher produces rrr
