//The renameTo() method is part of the java FileClass
//The renameTo() function is used to rename the abstract pathname of a File to a given pathname
//The function returns true if the file is renamed else it returns false
//Function signature
//public boolean renameTo(File destination)
//syntax
//file.renameTo(File destination)

//Parameters: The function requires FileObject destination as parameter, the new Abstract pathname of the present file
//Return value: The function returns boolean data type.It returns true if the file is renamed else it returns false
//Exception: This method throws the following Exceptions:
//SecurityException: If the method does not allow the write operation of the abstract pathname
//NullPointerException: If the destination filename is null
package FileHandling;
import java.io.*;
public class FileRenameToMethod {
   public static void main(String[]args){
       //Create a file object(abstract pathname)
       File f = new File("C:\\Users\\victo\\Java\\tutorial.pdf");
       //Create the destination file object
       File destination = new File("C:\\Users\\victo\\Java\\java.pdf");
       //This file cannot be renamed
       //File f = new File("C:\\Users\\victo\\Java\\tutorial.pdf");
       //check if the file can be renamed
       //to the abstract pathname
       if (f.renameTo(destination)){
           //display that the file has been renamed to the abstract pathname
           System.out.println("File is renamed");
       }
       else{
           //display that the file cannot be renamed
           //to the abstract pathname
           System.out.println("The file cannot be renamed");
       }
   }
}
