//The length() function is part of the File class in java
//This function returns the length of a file denoted by this abstract pathname
//The function returns long value which represents the number of bytes else returns OL If the file does not exist or
//an exception occurs

//Function Signature
//public long length()

//syntax
//long var = file.length();

//Parameter: This method does not take in any parameter
//Return Type: This function returns long data type that represents the length of the file in bits
//Exception: This method throws SecurityException if the write access to the file is denied
package FileHandling;
import java.io.*;
public class FileLengthMethod {
    public static void main(String[]args){
      //Get the file
        File f = new File("C:\\Users\\victo\\Java\\tutorial.pdf");
        //file is empty
       // File f = new File("C\\users\\victo\\Java\\java");
        //(Output: length = 0)
        //Get the length of the file
        System.out.println("length: " + f.length());
    }
}
