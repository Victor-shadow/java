package FileHandling;
import java.io.*;
public class FileSetExecutablePermission {
    public static void main(String[]args){
    //try-catch block to handle exception
        try {
            //Create a file object
            File f = new File("C:\\Users\\victo\\Java\\tutorial.pdf");
            //Check if executable permission can be set to new value
            if (f.setExecutable(true, false)){
                //Display the Executable permission is to be set to a new value
                System.out.println("Executable permission: " + " is set");
            }
            else{
                //Display that executable permission
                System.out.println("Executable permission " + " cannot be set");
            }
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
