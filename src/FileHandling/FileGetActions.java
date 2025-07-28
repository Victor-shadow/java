package FileHandling;

import java.io.FilePermission;
import java.io.IOException;

public class FileGetActions {
    public static void main(String[]args) throws IOException{
        //Create new File Permissions
        FilePermission FP_obj1 = new FilePermission("C:\\Users\\victo\\Java\\java.txt","read, delete,write");
        FilePermission FP_obj2 = new FilePermission("C:\\Users\\victo\\Java\\kotlin-reference.pdf","write, read, execute");
        FilePermission FP_obj3 = new FilePermission("C:\\Users\\victo\\Java\\java.pdf", "delete, readlink, read");
        //Use of getActions() method
        String str = FP_obj1.getActions();
        System.out.println("Actions with FP_obj1: " + str);
        str = FP_obj2.getActions();
        System.out.println("Actions with FP_obj2: " + str);
        str = FP_obj3.getActions();
        System.out.println("Actions with FP_obj3: " + str);
    }
}
