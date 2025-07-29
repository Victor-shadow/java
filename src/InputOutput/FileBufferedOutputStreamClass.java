package InputOutput;
import java.io.*;
public class FileBufferedOutputStreamClass {
    public static void main(String[]args){
        String s = "This is an example of BufferedOutputStream";
        try(FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream))
        {
            //Convert Strings to bytes and write to the buffered output stream class
            bufferedOutputStream.write(s.getBytes());
            System.out.println("Data Written to the file successfully");

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
