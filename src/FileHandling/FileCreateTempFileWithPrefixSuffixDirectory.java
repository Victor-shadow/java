package FileHandling;
import java.io.*;
public class FileCreateTempFileWithPrefixSuffixDirectory {
    public static void main(String[]args){
        try {
            //Create a temp file
            File f = File.createTempFile("pycharm", ".SVP",new File("C:"));
            //check if file is created
            if (f.exists()){
                //the file is created
                //thus the function returns true
                System.out.println("Temp File Created: " +f.getAbsolutePath());
            }
            else {
                //display the file cannot be created as the function returned false
                System.out.println("The Temp file cannot be created: " + f.getAbsolutePath());
            }
        }
        catch (Exception e){
            System.err.println(e);
        }
    }

}
