package FileHandling;
import java.io.*;
public class FileSyncMethod {
    public static void main(String[]args) throws IOException{
        //Initialize a File Descriptor
        FileDescriptor fileDescriptor = null;
        FileOutputStream file_out = null;
        //write characters into the file
        byte[] buffer = {71, 69, 69, 75, 83};
        try {
            file_out = new FileOutputStream("C:\\Users\\victo\\Java\\java.txt");
            //this getFD() method is called before closing the output stream
            fileDescriptor = file_out.getFD();
            //writes byte to file output stream
            file_out.write(buffer);
            //use of sync() method to sync data to the source file
            fileDescriptor.sync();
            System.out.println("\n Use of Sync is successful");

        }
        catch (Exception except){
            //in case IO exception error occurs
            except.printStackTrace();
        }
        finally {
            //release system resources
            if (file_out != null){
                file_out.close();
            }
        }

    }

}
