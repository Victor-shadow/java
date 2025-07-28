//The list() method  is part of File class
//The function returns an array of string denoting the files in a given abstract pathname
//if the pathname is a directory or else it returns null
//The function is an overloaded function
//One of the function does not have a parameter and the other function takes FilenameFilter object as parameter

//Function Signature
//public String[] list()
//public String[] list(FilenameFilter f)

//Function Syntax
//file.list()
//file.list(filter)

//Parameter: The function is an overloaded function
//One of the function does not have a parameter and the other function has a FilenameFilter object as a parameter
//Return value: The function returns a String array, or null value if the file object is a file
//Exception: The method throws SecurityException if the function is not allowed write access to the file

package FileHandling;
import java.io.*;
public class FileListMethod {
    public static void main(String[]args){
        //try-catch block to handle exceptions
        try {
            //Create file object
            File f = new File("C:\\Users");
            //Get all names of the files present in the directory
            String [] files = f.list();

            System.out.println("Files are: ");
            //Display the names of the files
            for (int i = 0; i < files.length; i++){
                System.out.println(files[i]);
            }
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

}
