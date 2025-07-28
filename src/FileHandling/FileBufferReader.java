package FileHandling;
import java.io.*;

public class FileBufferReader {
    public static void main(String[] args) throws Exception {
        // Create BufferedReader for input
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the path: ");

        // Reading file name
        String path = bfr.readLine().replace("\"", "").trim();  // Cleans up accidental quotes

        // Validate file existence before reading
        File file = new File(path);
        if (!file.exists() || !file.isFile()) {
            System.out.println("Error: The specified file doesn't exist or isn't a regular file.");
            return;
        }

        // Create BufferedReader to read file content
        BufferedReader bfro = new BufferedReader(new FileReader(path));
        String st;

        // Read and display file contents
        while ((st = bfro.readLine()) != null) {
            System.out.println(st);
        }

        bfro.close();  // Always good to close resources
    }
}