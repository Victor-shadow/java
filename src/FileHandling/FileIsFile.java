//The isFile() is part of the Java FileClass
//The function determines whether this is a file or Directory denoted by the abstract filename is File or not
//The function returns true if the abstract file path is File else returns False
//Function Signature
//public boolean isFile()

//Syntax:
//file.isFile()

//This method does not accept any parameters
//The function returns a boolean data type representing whether the abstract file path is file or not
//Exception: This method throws SecurityException if the write access to the file is denied

package FileHandling;
import java.io.*;
public class FileIsFile {
    public static void main(String[]args){
     //Get the file
        File f  =new File("C:\\Users\\victo\\Java\\tutorial.pdf");
        //This is a directory
        //File f = new File("C:\\Users\\victo\\Java");
        //Check if the specified File is File or not
        if (f.isFile()){
            System.out.println("File");
        }
        else {
            System.out.println("It is not a File");
        }
    }
}
