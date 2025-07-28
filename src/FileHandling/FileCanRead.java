//The canRead( function is part of the File class in java
//The function determines whether the program can read the file denoted by the abstract pathname
//The function returns true if the abstract file path does exist and the application is allowed to read the file
//Function Signature:
//public boolean canRead();
//Syntax:
//file.canRead()
//Parameters: The method does not accept any parameter
//Return Value: The function returns a boolean value representing whether the application is allowed
//to read the file or not
//Exception: This method throws security exception if the read access to the file is denied
package FileHandling;
import java.io.*;
public class FileCanRead {
    public static void main(String[]args){
        //Get the file
        File f = new File("C:\\Users\\victo\\.lesshst");
        //This file is not readable
        //File f = new File("C:\\Users\\victo\\example.txt")
        //Check if the specified file can be read or not
        if (f.canRead()){
            System.out.println("Readable");
        }
        else{
            System.out.println("The file is non-readable");
        }

    }
}
