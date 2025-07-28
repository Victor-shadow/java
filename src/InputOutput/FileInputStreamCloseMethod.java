//FileInputStream class is helpful to read data from a file in the form of sequence of  bytes
//FileInputStream class is meant for reading streams of raw bytes such as ImageData
//For reading streams of characters, consider using FileReader

//FileInputStream.close() method
//-After any operation to the file, we have to close the file
//For that purpose we have a close method,
//The FileInputStream.close() method closes this file input stream and releases any system resources associated with this stream
//Syntax: FileInputStream.close();

//Return value: This method does not return any value
//Exception: IOException - if any I/O error occurs

//Invoke the close() method
//-Attach a file to the FileInputStream as this enables one to close the file
//FileInputStream  fileInputStream = new FileInputStream("file.txt");
//-To close the file, call the close() method
//fileInputStream.close()
package InputOutput;
import java.io.*;
public class FileInputStreamCloseMethod {
    public static void main(String[]args){
        //create file obj and specify the path
        File file = new File("C://Users//victo//Java//java.txt");
        try {
            FileInputStream input = new FileInputStream(file);
            int character;
            //read character by character by default
            //read() function returns int between 0 and 255
            while ((character = input.read()) != -1){
                System.out.println((char) character);
            }
            input.close();
            System.out.println("File is closed");
            System.out.println("Now will try to read the file");
            while ((character = input.read()) != -1){
                System.out.println((char) character);
            }
        }
        catch (Exception e){
            System.out.println("File is closed cannot be read");
            e.printStackTrace();
        }

    }

}
