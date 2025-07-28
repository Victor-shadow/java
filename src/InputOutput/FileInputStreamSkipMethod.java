//FileInputStream class is quite helpful to read data from a file in the form of a sequence of bytes
//FileInputStream is meant for reading streams of raw bytes such as image, video, audio
//For reading streams of characters FileReader is recommended

//FileInputStream skip() method
//The skip(n) method in FileInputStream is quite helpful as it discards the n bytes of data from the beginning of the input stream
//This method is defined in FileInputStream class of the java.io package
//Java I/O package helps the user to perform all the input-output operations
//These streams support all objects, data types, characters, files

//Syntax
//Input_File_Stream.skip(n);
//Input_File_Stream: The file Input Stream
//Parameters:
//n - A non-negative integer
//Bytes to be skipped from a stream of characters
//Return value; It returns the actual number of bytes to be skipped
//Exception: I/OException - if n is a negative integer or I/O error occurs
package InputOutput;
import java.io.*;

import static Methods.Test.i;

public class FileInputStreamSkipMethod {
    //Main Method
    public static void main(String[]args) throws IOException{
        FileInputStream inputFileStream = null;
        //variables to store the characters
        int integerValue = 0;
        char characterValue;
        try {
            //Create new file input stream
            inputFileStream = new FileInputStream("flush.txt");
            //skip four bytes from the beginning
            inputFileStream.skip(4);
            //Read bytes from this stream
            //(first-character only)
            integerValue = inputFileStream.read();
            //convert integer to character type
            characterValue = (char)i;
            //print character
            System.out.println("Character read: " + characterValue);
        }
        catch (Exception exception){
            //if any error occurs
            exception.printStackTrace();
        }
        finally {
            //Release all system resources
            if (inputFileStream != null){
                inputFileStream.close();
            }
        }

    }
}
