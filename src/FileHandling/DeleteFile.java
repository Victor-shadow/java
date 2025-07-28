package FileHandling;

import java.io.File;

public class DeleteFile {
    public static void main(String[]args) {
        //Using Path for a Specified file
        File file = new File("C:\\Users\\victo\\Java\\DeleteFile.txt");
        //Delete the file
        if (file.delete()){
            System.out.println("File deleted successfully");
        }
        else{
            System.out.println("Failed to delete file");
        }

    }
}
