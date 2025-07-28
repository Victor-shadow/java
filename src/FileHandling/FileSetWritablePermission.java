package FileHandling;

import java.io.File;

public class FileSetWritablePermission {
    public static void main(String[]args){
        try{
            File f = new File("f:\\program.txt");

            if (f.setWritable(true, false)){
                System.out.println("Writable permission" + " is set");
            }
            else{
                System.out.println("Writable permission" + " cannot be set");
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
