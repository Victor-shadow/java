//The isDirectory() function is part of the file class in Java
//This function determines whether this file is a Directory denoted by the abstract filename is Directory or not
//The function returns true if the abstract file pathname is a Directory else it returns false

//Function Signature
//public boolean isDirectory();
//Syntax:
//file.isDirectory()

//The method does not accept any parameter
//The function returns a boolean value representing whether the abstract file pathname is a directory or not
//Exception: The method throws SecurityException if the real access to the file is denied


package FileHandling;
import java.io.*;
public class FileIsDirectory {
    public static void main(String[]args){
        //Get the file
        File f = new File("C:\\Users");
        //Not a Directory
        //File f = new File("C:\\drive");
        //Check if the specified path is a directory or not
        if (f.isDirectory()){
            System.out.println("Directory: ");
        }
        else{
            System.out.println("Not a Directory");
        }

    }
}
