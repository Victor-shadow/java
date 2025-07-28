//the mkdir() method is part of the File Class
//The mkdir() function is used to create a new Directory denoted by the abstract pathname
//The function returns true if the directory is created or else it returns false

//Function signature
//public boolean mkdir()
//Syntax
//file.mkdir()

//Parameter: This method does not accept any parameter
//Return value: This function returns boolean data type, it returns true if the directory is created or else false\
//Exception: This method throws SecurityException if the method does not allow directory to be created
package FileHandling;
import java.io.*;
public class FileMkdirMethod {
    public static void main(String[]args){
        //Create an Abstract pathname(File Object)
        File f = new File("C:\\Users\\victo\\OneDrive\\Documents\\flask");
        //check if the directory can be created
        //using abstract path name
        if (f.mkdir()){
            //display that the directory is created as the function returns true
            System.out.println("Directory is created");
        }
        else{
            //Display that the directory cannot be created
            System.out.println("Directory cannot be created");
        }

    }

}
