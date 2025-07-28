package FileHandling;
import java.io.*;
public class FileGetAbsolutePathWithDirectory {
    public static void main(String[]args){
        //try-catch block to handle exception
        try {
            //Create a File Object
            File f = new File("C:\\Users\\victo\\Java\\kotlin-reference.pdf");
            //GET THE ABSOLUTE PATH OF FILE f
            String absolute = f.getAbsolutePath();
            //display the file path of the file object
            //and also the file path of the absolute file
            System.out.println("Original Path: " + f.getPath());
            System.out.println("Absolute path: " + absolute);
        }
       catch (Exception e){
            System.err.println(e.getMessage());
       }
    }
}
