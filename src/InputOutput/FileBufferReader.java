package InputOutput;
import java.io.*;
public class FileBufferReader {
    public static void main(String[]args) throws IOException{
        //Enter data using BufferedReader
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        //read data using readline
        String s = r.readLine();
        System.out.println(s);
    }
}
