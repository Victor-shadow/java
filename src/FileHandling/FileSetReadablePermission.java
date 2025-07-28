package FileHandling;
import java.io.*;
public class FileSetReadablePermission {
    public static void main(String[]args){
        //try-catch block to handle exceptions
        try {
            File f = new File("C:\\Users\\victo\\Java\\tutorial.pdf");
            if (f.setReadable(true, false)){
                System.out.println("Readable permission" + " is set");
            }
            else{
                System.out.println("Readable permission" + " cannot be set");
            }
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
