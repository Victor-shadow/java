package FileHandling;
import java.io.*;
public class DeleteFileMethod {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the path: ");
        //Reading File Name
        String path = br.readLine();

        File file = new File(path);
        if (file.delete()){
            System.out.println("File deleted successfully.");
        }
        else{
            System.out.println("Failed to delete file");
        }

    }
}
