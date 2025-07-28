//The getParentFile() method is part of the File class
//The function returns the Parent file of the given file object
//The function returns a file object which contains the Parent file of the given file object
//If the abstract path does not contain any Parent file then a null value is returned

//Function Signature
//public File getParentFile()

//Function Syntax:
//file.getParentFile()

//Parameters: The function does not accept any parameters
//Return value: The function returns a File Object which is the parent file of the given File Object
package FileHandling;
import java.io.*;
public class FileGetParentFile {
    public static void main(String[]args){
      //try-catch block to handle exceptions
        try {
            File f = new File("C:\\Users\\victo\\Java\\tutorial.pdf");
            //Get the parent of the given file
            File parent = f.getParentFile();
            //Display the file parent file of the file object
            System.out.println("File Parent: " + parent.getPath());
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
