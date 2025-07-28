package FileHandling;
import java.io.*;
public class FileHashCode {
    public static void main(String[]args) throws IOException{
        //Create new File Permissions
        FilePermission FP_obj1 = new FilePermission("C:\\Users\\victo\\Java\\java.pdf", "read, delete, write");
        //Use of hashCode() method
        int i = FP_obj1.hashCode();
        System.out.println("hashcode value of FP_obj1 : " + i);

    }

}
