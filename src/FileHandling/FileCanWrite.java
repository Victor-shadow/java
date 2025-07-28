//The canWrite() function is part of the File class in java
//This function determines whether a program can write a file denoted by the abstract path name
//The function returns true if the abstract filepath exists and the application is allowed to write the file
//Function signature
//public boolean canWrite();
//Syntax
//file.canWrite();

//Parameters: The function does not accept any parameter
//Return value: The function returns a boolean value representing whether the application is allowed to write the file or not
//Exception: The method throws SecurityException if the write access to the file is denied
package FileHandling;
import java.io.*;
public class FileCanWrite {
    public static void main(String[]args){
   //Get the file
        File f = new File("C:\\Users\\victo\\.gitconfig");
        //This file cannot be written
        File g = new File("C:\\Users\\victo\\example.txt");
        //Check if the specific file can be written
        //or not
        if(f.canWrite()){
            System.out.println("The file can be written");
        } else if (g.canWrite()) {
            System.out.println("The file does not exist");

        } else {
            System.out.println("The file cannot be written");
        }
    }
}
