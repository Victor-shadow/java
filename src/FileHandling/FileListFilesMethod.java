package FileHandling;
import java.io.*;
public class FileListFilesMethod {
    public static void main(String[]args){
        //try-catch block to handle exceptions
        try {
            //Create a file object
            File f = new File("C:\\Users\\victo\\OneDrive\\Documents\\JavaScript");
            //Create a filename filter
            FilenameFilter filter = new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.startsWith("A");
                    //check for files which end with txt
                    //return f.getName().endsWith("pdf");
                }
            };
            //Get the names of all the files present
            //in the given directory
            File[] files = f.listFiles(filter);
            System.out.println("Files are: ");
            //Display the names of the files
            for (int i = 0; i < files.length; i++){
                System.out.println(files[i].getName());
            }
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}

