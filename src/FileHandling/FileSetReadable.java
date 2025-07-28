//The setReadable() method is part of the File class
//The function sets owner's or everybody's permission to read the abstract pathname
//The function is overloaded
//One function requires two parameters while the other one only requires one
//Function Signature
//public boolean setReadable(boolean a, boolean b);
//public boolean setReadable(boolean a);

//Syntax:
//file.setReadable(boolean a, boolean b);
//file.setReadable(boolean a);

//Parameters: The function is an overloaded function
//For thr first overload;
//if a true value is passed as a first parameter, then it is allowed to read the abstract pathname
//else it is not allowed to read the file
//if a true value is passed as a second parameter then the execution permission applies to the owner
//else it applies to everyone

//For the second overload
//If a true value is passed as a parameter, then it is allowed to read the abstract pathname, else it is not allowed
//to read the file

//Return value: This function returns a boolean value, whether the operation succeeded or not
//Exception: This method throws SecurityException if the function is not allowed write access to the file





package FileHandling;
import java.io.*;
public class FileSetReadable {
    public static void main(String[]args){
        //try-catch block to handle exceptions
        try {
            //Create a file Object
            File f = new File("C:\\Users\\victo\\Java\\tutorial.pdf");
            //Check if the Readable permission can be set to a new value
            if (f.setReadable(true)){
                //Display that readable permission is to be set to a new value
                System.out.println("Readable permission" + " is set");
            }
            else{
                //Display that readable permission cannot be set to a new value
                System.out.println("Readable permission" + " cannot be set");
            }
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
