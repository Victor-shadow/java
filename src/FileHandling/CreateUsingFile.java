//It is a class that is just a handle for underlying file system resources
//It is used for those objects which do not have physical existence

//Syntax
//File.createNewFile()
package FileHandling;
import java.io.InputStreamReader;
import java.io.File;
import java.io.BufferedReader;
public class CreateUsingFile {
    //Function to make new File
    public void newFile(){
        String strPath, strName;
        //Try-Catch block
        try {
            //Create BufferedReader object
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the file name : ");
            //Reading the file name
            strName = br.readLine();
            System.out.print("Enter the file path: ");
            //Read file path
            strPath = br.readLine();
            //Create File Object
            File file1 = new File(strPath + "\\" + strName + ".text");
            //Method createNewFile() method creates a blank file
            file1.createNewFile();
        }
        //try-catch block
        catch (Exception ex1){
            System.out.println("Failed to create a new file.");
        }
    }
    public static void main(String[]args){
        //Creating a new File via a function
        CreateUsingFile fl = new CreateUsingFile();
        fl.newFile();
    }
}
//The BufferedReader and InputStreamReader are used to take the file name and path as input from the user
//A File Object is created with the provided name and path
//The createNewFile() method creates a blank file in the specified location
//Exception handled using a try-catch block to manage exceptions like invalid paths and permissions