package FileHandling;
import java.io.*;
public class FileFindCanonicalPath {
    public static void main(String[]args){
        //try-catch block to handle exception
        try {
            File f = new File("C:\\Users\\victo\\..Java\\kotlin-reference.pdf");
            String canonical = f.getCanonicalPath();

            System.out.println("Original File path: " + f.getPath());
            System.out.println("Canonical File Path: " + canonical);
        }
        catch (Exception e){
            System.err.println(e);
        }

    }
}
