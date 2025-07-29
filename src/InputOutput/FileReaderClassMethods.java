package InputOutput;
import java.io.*;
import java.util.*;
import java.nio.CharBuffer;
public class FileReaderClassMethods {
    public static void main(String[]args) throws IOException{
        //Open a file reader
        Reader r = new FileReader("C://Users//victo//Java//Java.txt");
        PrintStream out = System.out;
        //Create a character array and charBuffer
        char[] buffer = new char[10];
        CharBuffer charBuffer = CharBuffer.wrap(buffer);
        //check if the reader supports marking
        if (r.markSupported()){
            r.mark(100);//Mark the current Position
            System.out.println("mark method is supported");
        }
        //skip 5 characters in the stream
        r.skip(5);
        //check if the stream is ready to read
        if (r.ready()){
            //Read 10 characters into the buffer
            r.read(buffer, 0, 10);
            System.out.println("Buffer after reading 10 characters: " + Arrays.toString(buffer));
            //Read characters into the charBuffer
            r.read(charBuffer);
            System.out.println("CharBuffer contents: " + Arrays.toString(charBuffer.array()));
            //Read a single character
            System.out.println("Next character: " +(char)r.read());
        }
        //close the reader
        r.close();
    }
}
