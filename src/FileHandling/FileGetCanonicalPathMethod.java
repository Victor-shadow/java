//The getCanonicalPath() method is part of the Path class
//This function returns the canonical pathname of the given File object
//If the path name of the file object is Canonical, then it simply returns the path of the current file object
//The Canonical path is always absolute and unique, the function removes the '.', '..' from the path
//if present
//The function getCanonicalPath() will return a path that will be absolute and unique path from the root directories
//The canonical form of an existing file may be different from the canonical form of the same non-existing file
//The canonical form of an existing file may be different from the canonical form of the same file when it is deleted

//Function Signature
//public String getCanonicalPath()

//Function Syntax
//file.getCanonicalPath()

//Parameters: The function does not accept any parameters
//Return value: The function returns a String value if the Canonical Path of the given File object
//Exception: This method throws the following Exceptions:
//SecurityException: if the required property value cannot be accessed
//I/O Exception: if I/O exception occurs


package FileHandling;
import java.io.*;
public class FileGetCanonicalPathMethod {
    public static void main(String[]args){
        //try-catch block to handle exceptions
        try {
            //Create a File Object
            File f = new File("C:\\Users\\victo\\Java\\tutorial.pdf");
            //Get the Canonical path of the file
            String canonical = f.getCanonicalPath();
            //Display the file path of the File Object
            //and also the file path of the Canonical file
            System.out.println("Original File path: " + f.getPath());
            System.out.println("Canonical File path: " + canonical);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }

    }
}
