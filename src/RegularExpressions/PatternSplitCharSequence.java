package RegularExpressions;
import java.util.regex.*;
public class PatternSplitCharSequence {
    public static void main(String[]args){
        //Create a regex String
        String REGEX = "ee";
        //Create the string where search takes place
        String actualString = "aaeebbeecceeddee";
        //Create a patter using Regex
        Pattern pattern =Pattern.compile(REGEX);
        //Create limit to 2
        int limit = 2;
        //split the text
        String[]array = pattern.split(actualString, limit);
        //print array
        for (int i = 0; i < array.length; i++){
            System.out.println("array[" + i + "]=" + array[i]);
        }

    }
}
