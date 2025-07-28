package FileHandling;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.*;
public class ReadFileAsString {
    public static String readFileAsString(String fileName) throws Exception{
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;

    }
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter path: ");
        //reading file name
        String path = br.readLine();

        String data = readFileAsString(path);
        System.out.println(data);

    }

}
