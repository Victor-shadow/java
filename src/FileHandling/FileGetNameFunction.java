package FileHandling;
import java.io.*;
public class FileGetNameFunction {
    public static void main(String[]args){
        //try-catch block to handle exceptions
        try {
            //Create a File object
            File f =new File("C:\\Users\\victo\\Java\\tutorial");
            //Get the name of the given file f
            String Name = f.getName();
            //Display the file name of the file object
            System.out.println("File Name: " + Name);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }

    }
}
