//The setReadOnly() method is part of the file class
//It marks the specified file or directory such that read-only operations are allowed only on the file or directory
//Function Signature
//public boolean setReadOnly()
//Syntax:
//file.setReadOnly()

//Parameter: The function does not require any parameter
//Return value: This function returns a boolean data type. The function returns True if the file object could be set as ReadOnly
//else False
//Exception: SecurityException: If the method does not allow write access to the file

package FileHandling;
import java.io.*;
public class FileSetReadOnly {
    public static void main(String[]args){
      //Create an abstract pathname(File Object)
        File f = new File("C:\\Users\\victo\\Java\\tutorial.pdf");
        //non-existing file to read-only
        //File f = new File("C:\\Users\\victo\\Java\\example.txt")
        //Check if the file object can be set to readOnly
        if (f.setReadOnly()){
            //display that file Object  is set to ReadOnly or not
            System.out.println("File Set to Read Only");
        }
        else{
            //Display the file object cannot be set to ReadOnly
            System.out.println("File cannot be set: " + " as read-only");
        }
    }
}
