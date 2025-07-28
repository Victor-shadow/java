//The delete() method of java.nio.file
//Files help one to delete a file located at the path passed as a parameter
//This method may not be atomic with respect to other file system operations
//If the file is a symbolic link then the symbolic link itself, not the final target of the link
//is deleted
//If the file is a directory, then this method will delete the file only when the directory is empty
//In some implementations, a directory has entries for specific files or links that are created when the directory is created
//In such implementations, the directory is considered empty when only the special entries exists
//In such cases, the Directories can be deleted using this method
//On some operating systems it may not be possible to remove the file when it is open and  in use by the JavaVirtualMachine

//syntax
//public static void delete(Path path) throws IOException
//Parameters: This method accepts a parameter path which is the path to the file to delete
//Return value: This method returns nothing
//Exception: The method throws the following exception:
//i. NoSuchFileException = If the file does not exist(optional specific exception)
//ii. DirectoryNotEmptyException = If the file is a directory, and could not otherwise be deleted, because the directory is not empty
//iii. IOException = if an IO error occurs
//iv. SecurityException = In the case of the default provider, and a security manager is installed, the SecurityManager.checkDelete(String) method is invoked
//to check delete access to the file
package FileHandling;
import java.io.*;
import java.nio.file.*;
public class FileDeleteMethod {
    public static void main(String[]args){
        //Create object of path
        Path path = Paths.get("C:\\Users\\victo\\Java\\kotlin.txt");
        //delete the file
        try {
            Files.delete(path);
        }
        catch (IOException e){
            //AUTO-GENERATED CATCH BLOCK
            e.printStackTrace();
        }
    }
}
