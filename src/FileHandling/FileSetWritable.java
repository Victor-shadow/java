//The setWritable() method is part of the File class
//The function sets the owner's or everybody's permission to write the abstract pathname
//The function is an overloaded function
//One function requires two parameters and the other only one
//Function Signature
//public boolean setWritable(boolean a, boolean b);
//public boolean setWritable(boolean a);
//Function Syntax
//file.setWritable(boolean a, boolean b)
//file.setWritable(boolean a);

//parameters: The function is an overloaded function
//First Overload:
//If a true value is  passed as the first parameter, then it is allowed to write the abstract pathname, else it is not allowed to write the file
//if a true value is passed as the second parameter, then the Write permission applies to the owner only, else it applies to everyone

//Return value: This function returns a boolean value whether the operation was successful or not
//This method Throws SecurityException if the function is not allowed write access to a file






package FileHandling;
import java.io.*;
public class FileSetWritable {
    public static void main(String[]args){
        //try-catch block to handle exceptions
        try {
            //Create a file object
            File f = new File("C://Users//victo//Java//tutorial.pdf");
            //Check if the writable permission can be set to a new value
            if(f.setWritable(true)){
                //Display that the writable permission is to be set a new Value
                System.out.println("Writable permission is set");
            }
            else{
                //Display that the writable permission cannot be set to a new value
                System.out.println("Writable permission cannot be set");
            }
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
