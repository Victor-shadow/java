//The createNewFile()  function is part of File class in java
//This function creates a new empty file
//The function returns True if the abstract filepath does not exist and a new file is created
//It returns false if a new file already exists
//Function Signature
//public boolean createNewFile()
//syntax
//boolean var = file.createNewFile();
//Parameters: The method does not accept any parameters
//Return value: The function returns boolean data type representing whether the new file is created or not
//Exception: This method throws the following Exception:
//IOException: If input errors occurs
//SecurityException: if the write access to the file is denied
package FileHandling;
import java.io.*;

public class FileCreateFile {
    public static void main(String[]args){
        try {
            //Get the file
            File f = new File("C:\\Users\\victo\\java.txt");
            //Create a new file if it does not exist
            if (f.createNewFile()){
                System.out.println("File created");
            }
                System.out.println("File already exists");
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
}
