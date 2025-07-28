package FileHandling;
import java.io.File;

//In this Java program, we accept a file or directory name from command line arguments
//Then the program will check if, that file or directory physically  exists or not
//it displays the property of that file or directory
 class CheckFile {
     public static void main(String[]args){
         //Accept file name or directory name through command line arguments
         String fname = args[0];
         //pass the filename or directory name to File object
         File f = new File(fname);
         //apply file class methods on File Object
         System.out.println("File name: " + f.getName());
         System.out.println("Path: " + f.getPath());
         System.out.println("Absolute path: " + f.getAbsolutePath());
         System.out.println("Parent: " + f.getParent());
         System.out.println("Exists: " + f.exists());

         if (f.exists()){
             System.out.println("Is writable: " + f.canWrite());
             System.out.println("Is Readable:" + f.canRead());
             System.out.println("Is a directory: " + f.isDirectory());
             System.out.println("File size in bytes: " + f.length());
         }
     }


}
