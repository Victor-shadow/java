package FileHandling;
import java.io.*;
public class FileCreateTempFileWithPrefixAndSuffix {
    public static void main(String[]args){
        try {
            //Create a temp file
            File f = File.createTempFile("python", ".SVP");
            //Check if the file is created
            if (f.exists()){
                //The file is created as function returned true
                System.out.println("Temp file created: " + f.getName());
            }
            else {
                //Display the file cannot be created
                //as the function returns false
                System.out.println("Temp File cannot be created: " + f.getName());
            }
        }
        catch (Exception e){
            //display the error message
            System.err.println(e);
        }
    }

}
