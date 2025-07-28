//The getAbsolutePath() method is part of the File class
//The function returns the absolute pathname of the given file object.
//if the pathname of the file object is absolute then it simply returns the path of the current file object
//The function getAbsolutePath() will return the absolute(complete) path from the root directories
//If the file object is created with an absolute path, then getPath() and absolutePath()  will give the same results

//Function signature
//public String getAbsolutePath();

//Function Syntax:
//file.getAbsolutePath()

//Parameters: This function does not accept any parameters
//Return value: This function returns a String value which is the absolute path of the given File Object
//Exception: This method throws the following Exception:
//SecurityException: If the required property value cannot be accessed
package FileHandling;
import java.io.*;
public class FileGetAbsolutePath {
 public static void main(String[]args){
     //try-catch block to handle exceptions
     try {
         //Create a File object
         File f = new File("kotlin-reference.pdf");
         //Get the absolute path of file f
         String absolute = f.getAbsolutePath();
         //Display the file path of the File Object
         //The file path of the Absolute file
         System.out.println("Original Path: " + f.getPath());
         System.out.println("Absolute path: " + absolute);
     }
     catch (Exception e){
         System.err.println(e);
     }
 }
}
