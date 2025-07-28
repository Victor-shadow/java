//The isHidden() is a function of the Java FileClass
//The function determines whether there is a file or Directory denoted by the abstract filename is Hidden or not
//The function returns true if the abstract file path is Hidden else returns false
//Function Signature
//public boolean isHidden();

//Syntax:
//file.isHidden();

//This method does not accept any kind of parameter
//The function returns boolean data type representing whether a file is hidden or not
//Exception: The method throws a SecurityException if the write access to the file is denied
package FileHandling;
import java.io.*;
public class FileIsHidden {
    public static void main(String[]args){
     //Get the file
        File f  = new File("C:\\Users\\victo\\Java\\tutorial.pdf");
        //Check if the specified file is hidden
        if (f.isHidden()){
            System.out.println("File Hidden");
        }
        else{
            System.out.println("File not hidden");
        }
    }
}
