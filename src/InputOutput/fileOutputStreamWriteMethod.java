package InputOutput;
import java.io.*;
import java.util.*;
public class fileOutputStreamWriteMethod {
    public static void main(String[]args){
        String data = "FileOutputStream is a subclass of OutputStream";
        try {
            FileOutputStream output = new FileOutputStream("write.txt");
            //The getBytes() method is used to convert the string to byte array
            byte[] array = data.getBytes();
            //writing string to the file by writing each character one by one
            //Writes bytes to the file
            output.write(array);
            output.close();
        }
        catch (Exception e){
            e.getStackTrace();
        }

    }

}
