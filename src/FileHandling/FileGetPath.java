//The getPath() method is part of the File class in java
//The function returns the path of the given file object
//The function returns a String object which contains the path of the given file object
//Function signature
//public String getPath()

//Syntax:
//file.getPath

//This function does not accept any parameter
//The function returns a String value which is the path of the given File Object

package FileHandling;
import java.io.*;
public class FileGetPath {
    public static void main(String[]args){
        //try-catch block to handle exceptions
        try {
            //Create a File Object
            File f =new File("C:\\Users\\victo\\Java\\kotlin-reference.pdf");
            //Get the path of the given file
            String path = f.getPath();
            //Display the file path of the file object
            System.out.println("File path: " + path);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }

    }
}
