package RegularExpressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class PossessiveQuantifier {
    public static void main(String[]args){
        //Making an Instance of Pattern class
        //Here "+" is a possessive quantifier because
        //a "+" is appended after it
        Pattern p = Pattern.compile("r++");
        //Making an instance of Matcher class
        Matcher m = p.matcher("rrr");

        while (m.find()){
            System.out.println("Pattern found from: " + m.start() + " to " + (m.end()-1));
        }
    }

}
