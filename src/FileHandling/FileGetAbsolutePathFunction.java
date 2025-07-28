package FileHandling;
import java.io.*;
public class FileGetAbsolutePathFunction {
    public static void main(String[]args){
        //try-catch block to handle exceptions
        try{
            //Create a File Object
            File f = new File("tutorial");
            //Get the absolute path of file f
            String absolute = f.getAbsolutePath();
            //Display the file path of the file object
            //and also the file path of the absolute file
            System.out.println("Original path: " + f.getPath());
            System.out.println("Absolute path: " + absolute);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }

    }
}
