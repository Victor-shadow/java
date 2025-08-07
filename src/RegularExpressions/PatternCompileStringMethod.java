package RegularExpressions;
import java.util.regex.*;
public class PatternCompileStringMethod {
    public static void main(String[]args){
        //Create a REGEX String
        String REGEX = "https";
        //Create the String to perform a Search Operation
        String actualString = "ftp is a protocol which is used for making requests";
        //Compile the REGEX to create pattern using Pattern.compile method
        Pattern pattern =Pattern.compile(REGEX);
        //Check whether REGEX String  is found in actualString or not
        boolean matches = pattern.matcher(actualString).matches();
        System.out.print("actualString " + " contains REGEX = " + matches);

    }

}
