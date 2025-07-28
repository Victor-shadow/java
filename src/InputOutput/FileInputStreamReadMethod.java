//FileInputStream class in Java is useful to read data from a file in the form of sequence of bytes
//FileInputStream is meant for reading streams of raw bytes such as Imagedata
//For reading a stream of characters, consider using FileReader

//The read() method of InputStream class reads a byte of data from the input stream
//The next byte of data returned or is -1 if the end of the file is reached and throws an exception if an I/O error occurs
//syntax: public abstract int read()

//Return value: This method returns the next byte of data or -1 if the end of the stream is reached
//Exception: IOException - if an I/O error occurs

//Invoke read() method
//Step 1: Attach a file to a FileInputStream Class as this will enable one to read data  from the file as shown
//FileInputStream fileInputStream = new FileInputStream("file.txt");
//Step 2: Now read data from the file, read data from the FileInputStream
//ch=FileInputStream.read();
//Step 3(a): When there is no more data available to read further, the read() method returns -1
//Step 3(b): Then we should attach the monitor to the output stream
//System.out.println(ch);
package InputOutput;
import java.io.*;
public class FileInputStreamReadMethod {
    public static void main(String[]args){
        //Create file object and specify path
        File file = new File("C://Users//victo//Java//java.txt");
        try {
            FileInputStream input = new FileInputStream(file);
            int character;
            //read characters by default
            //read() function returns int
            while ((character = input.read()) != -1){
                System.out.print((char) character);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
