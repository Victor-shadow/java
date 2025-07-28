package FileHandling;
import java.io.*;
import java.security.PermissionCollection;

public class FileNewPermissionCollection {
    public static void main(String[]args) throws IOException{
        //Create new File Permissions
        FilePermission FP_Obj1 = new FilePermission("C:\\Users\\victo\\Java\\java.txt", "read");
        //Create new Permission collection
        //use of newPermissionCollection()
        PermissionCollection FP = FP_Obj1.newPermissionCollection();
        //Collecting the permissions of FP_Obj1 for FP
        FP.add(FP_Obj1);

        boolean check = FP.implies(new FilePermission("C:\\Users\\victo\\Java\\java.txt", "read"));
        System.out.println("Is newPermissionCollection working: " + check);

    }

}
