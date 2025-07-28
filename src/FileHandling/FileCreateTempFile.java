//The createTempFile() function creates a temporary file in a given directory(if a directory is not mentioned then a default directory is selected)
//the function generates a filename by using the prefix and suffix passed as parameters
//If the suffix is null, then the function uses .tmp as suffix
//The function then returns the created file
//Function Signature
//public static File createTempFile(String PREFIX, String SUFFIX);
//public static File createTempFile(String PREFIX, String SUFFIX, File DIR)

//Syntax
//File.createTempFile(String, String, File)
//File.createTempFile(String, String)

//Parameters: The function is overloaded, so one function takes Suffix, Prefix and a File Object,
//whereas the other function takes only suffix and prefix
//The prefix must not be less than 3 characters but the suffix might be null and if the directory is not specified
//or a null value is passed then the function uses a default directory

//Return Type: The function returns the abstract filename denoting the newly created temporary file
//Exception: The method throws:
//IllegalArgumentException = if the prefix argument contains less than 3 characters
//IOException = If there is only IO Error(File could not be created)
//SecurityException = If the method does not allow the file to be created
package FileHandling;
import java.io.*;
public class FileCreateTempFile {
    public static void main(String[]args){
        try{
            //Create a temporary file
            File f = File.createTempFile("kotlin", null);
            //Check if the file is created
            if (f.exists()){
                //the file is created and the function returns true
                System.out.println("Temp File created: " + f.getName());
            }
            else{
                //display the file cannot be created as the function
                //returned false
                System.out.println("Temp file cannot be created: "+ f.getName());
            }
        }
        catch (Exception e){
            //display the error message
            System.err.println(e);
        }
    }
}
