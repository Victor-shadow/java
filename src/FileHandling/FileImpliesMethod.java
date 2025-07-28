package FileHandling;
import java.io.*;
public class FileImpliesMethod {
    public static void main(String[]args) throws IOException{
        FilePermission FP_obj1 = new FilePermission("C:\\Users\\victo\\Java\\java.txt","read");
        FilePermission FP_obj2 = new FilePermission("C:\\Users\\victo\\Java\\kotlin-reference.pdf","write");
        FilePermission FP_obj3 = new FilePermission("C:\\Users\\victo\\Java\\java.pdf", "delete");
        //Use of implies() method
        boolean check = FP_obj1.implies(FP_obj2);
        System.out.println("Using implies() for FP_obj1: " + check);

        //checked here with the same FilePermissionObject
        check = FP_obj2.implies(FP_obj2);
        System.out.println("Using implies() for FP_obj2: " + check);
    }
}
