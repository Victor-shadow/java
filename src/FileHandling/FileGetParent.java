package FileHandling;
import java.io.*;
public class FileGetParent {
    public static void main(String[]args){
        //try-catch block to handle exceptions
        try{
            //Create File Object
            File f = new File("C:\\Users\\victo\\Java\\kotlin-reference");
            //Get the parent of the given file
            String parent = f.getParent();
            //Display the file parent of the file object
            System.out.println("File Parent: " + parent);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }

    }
}
