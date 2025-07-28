package FileHandling;
import java.io.*;
import java.util.*;
public class FileReadingFile {
    public static void main(String[]args) throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         System.out.print("Enter the path: ");
         //Reading File name
        String path = br.readLine();

        File file = new File(path);
        Scanner sc = new Scanner(file);
        //Use \\Z as delimiter
        sc.useDelimiter("\\Z");
        System.out.print(sc.next());
    }
}
