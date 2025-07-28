package InputOutput;
import java.io.*;
public class fileOutputStreamFlushMethod {
    public static void main(String[]args) throws IOException{
        FileOutputStream out = null;
        String data = "FileOutputStream";
        try {
            out = new FileOutputStream("flush.txt");
            //using write() method
            out.write(data.getBytes());
            //use flush() method
            out.flush();
            out.close();
        }
        catch (Exception e){
            e.getStackTrace();
        }



    }
}
