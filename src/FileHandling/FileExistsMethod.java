//The exists() function is part of the FileClass in Java
//The function determines whether there is a file or directory denoted by the abstract filename exists or not
//The function returns true if the abstract filepath exists or else returns false

//Syntax
//public boolean exists();
//file.exists()
//Parameters: This method does not accept any parameter
//Return value: This function returns the boolean value if the file is denoted by the abstract filename exists or not
//Exception: This method throws SecurityException if the write access to the file is denied
package FileHandling;
import java.io.*;
public class FileExistsMethod {
    //Main driver method
    public static void main(String[]args){
        //Get the file by creating object of File class
        File f = new File("C:\\Users\\victo\\Java\\kotlin-reference.pdf");
        //This file does not exist
        //File f = new File("C:\\Users\\victo\\Java\\java.pdf");
        //Checking if the specified file exists or not
        if (f.exists()){
            System.out.println("The File exists");
        }
        else {
            //show if the file does not exist
            System.out.println("The file does not exist");
        }
    }

}
