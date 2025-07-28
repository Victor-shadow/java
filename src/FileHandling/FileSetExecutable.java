//The setExecutable() method is part of java File Class
//The function sets the owner's or everybody's permission to execute the abstract pathname
//The function is an overloaded function
//One function requires two parameters, and the other only one
//Function Signature
//public boolean setExecutable(boolean a, boolean b);
//public boolean setExecutable(boolean a );
//Syntax
//file.setExecutable(boolean a, boolean b);
//file.setExecutable(boolean a);

//parameters: The function is an overloaded function
//For the first overload:
//if a true value is passed as the first parameter, then it is allowed to extract the abstract pathname, else
//it is not allowed to execute the file
//If a true value is passed as a second parameter, then the execution permission applies to the owner only, else it
//applies to everyone
//For the Second Overload:
//If a true value is passed as a parameter, then it is allowed to execute the abstract pathname, else it is not allowed
//to execute the file

//Return value: This function returns boolean value, whether the operation succeeded or not
//This method throws only SecurityException if the function is not allowed write access to the file

package FileHandling;
import java.io.*;
public class FileSetExecutable {
    public static void main(String[]args){
        //try-catch block to handle exceptions
        try {
            //Create a File Object
            File f = new File("C:\\Users\\victo\\OneDrive\\Documents\\JavaScript");
            //Check if the Executable permission
            //can be set to a new value
            if (f.setExecutable(true)){
                //Display the Executable permission
                //is set to a new value
                System.out.println("Executable permission" + " is set");
            }
            else{
                //Display the executable permission
                System.out.println("Executable permission: " + " cannot be set");
            }
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
