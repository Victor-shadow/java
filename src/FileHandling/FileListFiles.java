//The listFiles() method is part of the FileClass
//The function returns an array of Files denoting the files in a given abstract pathname if the pathname is a directory
//else returns null
//The function is an overloaded function
//One of the function does not have a parameter while the other function takes Filename Filter object as paramater
//The third function takes FileFilter object as parameter
//Function Signature
//public file[] listFiles()
//public file[] listFiles(FilenameFilter f)
//public file[] listFiles(FileFilter f)

//syntax:
//file.listFiles()
//file.listFiles(filter)

//Parameter: The function is an overloaded function
//One of the functions does not take a parameter
//The second function takes FilenameFilter object as a parameter
//The third function takes FileFilter object as a parameter

//Return value: The function returns a file array, or a null value if the file object is a file
//Exception: The method throws SecurityException if the function is not allowed read access to the file
package FileHandling;
import java.io.*;
public class FileListFiles {
   public static void main(String[]args){
       //try-catch block to handle exceptions
       try {
           //Create a file object
           File f = new File("C:\\Users\\victo\\Java");
           //Get the names of all the files present in the given directory
           File[] files = f.listFiles();
           System.out.println("Files are: ");

           //Display the names of the files
           for (int i = 0; i < files.length; i++){
               System.out.println(files[i].getName());
           }
       }
       catch (Exception e){
           System.err.println(e.getMessage());
       }
   }
}
