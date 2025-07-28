package InputOutput;
import java.io.*;
public class fileOutputStreamCloseMethod {
    public static void main(String[]args){
    FileOutputStream out = null;
    String data = "close method";
    try {
        out = new FileOutputStream("close.txt");
        //write data to the file
        out.write(data.getBytes());
        //close the output stream
        out.close();
        //Try to write after closing the stream
        //this will throw IOException
        out.write("This will cause an error".getBytes());
    } catch (IOException e){
        //Exception is thrown after attempting to write
        //after closing the stream
        System.out.println("Error: " + e.getMessage());
    }

    }
}
