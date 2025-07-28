package FileHandling;
import java.io.*;
public class FileValidMethod {
    public static void main(String[]args) throws IOException{
        //Initialize file descriptor
        FileDescriptor file_descriptor =null;
        FileInputStream file_in = null;
        try {
            file_in = new FileInputStream("C:\\Users\\victo\\Java\\java.txt");
            //get file descriptor
            file_descriptor =file_in.getFD();

            boolean check = false;
            //use of valid() check the validity of file descriptor
            check = file_descriptor.valid();
            System.out.println("FileDescriptor is valid: " + check);
        }
        catch (Exception except){
            //in case IO error occurs
            except.printStackTrace();
        }
        finally {
            //release system resources
            if (file_in != null){
                file_in.close();
            }
        }
    }
}
