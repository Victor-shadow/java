package RegularExpressions;
import java.util.regex.*;
public class PatternClassSplitMethod {
    public static void main(String[]args){
        //Create a REGEX String
        String REGEX = "java";
        //Create the String to perform the search
        String actualString = "kotlin and java  are object oriented programming languages";
        //Create a Pattern using Regex
        Pattern pattern = Pattern.compile(REGEX);
        //split the text
        String []array = pattern.split(actualString);
        //print the array
        for (int i = 0; i < array.length; i++){
            System.out.println("array[" + i + "]=" + array[i]);
        }

    }
}
