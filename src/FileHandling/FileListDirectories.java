package FileHandling;
import java.io.*;
public class FileListDirectories {
    public static void main(String []args){
        //try-catch block to handle exceptions
        try {
            //Create a file Object
            File f = new File("C:\\Users");
            //Create a Filename filter
            FilenameFilter filter = new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.startsWith("D");
                }
            };
            //GIVE THE NAMES OF ALL THE FILES PRESENT
            //IN THE GIVEN DIRECTORY
            //AND WHOSE NAMES START WITH "D"
            String[] files = f.list(filter);
            System.out.println("Files are: ");
            //Display all names of the files
            for (int i = 0; i < files.length; i++){
                System.out.println(files[i]);
            }
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }

    }
}
