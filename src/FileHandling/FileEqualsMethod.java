package FileHandling;
import java.io.*;
public class FileEqualsMethod {
    public static void main(String[]args) throws IOException{
        boolean bool = false;
        //Create new File Permissions(Path, action)
        FilePermission FP_obj1 = new FilePermission("C:\\Users\\victo\\Java\\java.txt", "read");
        FilePermission FP_obj2 = new FilePermission("C:\\Users\\victo\\Java\\kotlin-reference.pdf", "write");
        FilePermission FP_obj3 = new FilePermission("C:\\Users\\victo\\Java\\java.pdf", "read");
        //use of equals method
        bool = FP_obj2.equals(FP_obj1);
        System.out.println("Whether FP_obj1 equals FP_obj2: " + bool);
        bool = FP_obj2.equals(FP_obj3);
        System.out.println("Whether FP_obj2 equals FP_obj3: " + bool);
        bool = FP_obj1.equals(FP_obj3);
        System.out.println("Whether FP_obj1 equals FP_obj3: " + bool);
    }
}
