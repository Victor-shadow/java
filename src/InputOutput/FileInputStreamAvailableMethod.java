//The available() method of FileInputStream class is used to return the estimated
//number of remaining bytes that can be read from the input stream without blocking
//This method returns the number of bytes remaining to read from the file
//When a file is completely read, this function returns zero

//Syntax
//FileInputStream available()
//Return Value: The method returns and estimates the number of remaining bytes read from this input stream without blocking
//Exception: This method can generate exceptions like IOException, FileNotFoundException
//IOException - If the file input stream  has been closed by calling close  or any I/O error occurs
//FileNotFoundException - If that directory is not available, then we get FileNotFoudException

//Invoke the available() method
//Step 1: Attach a file to FileInputStream as this will enable us to read the data from the file
//FileInputStream fileInputStream = new FileInputStream("file.txt");

//Step 2: Now to read data from the file that how much data is available for reading, we should call an available method
//using FileInputStream Object
//int ch = fileInputStream.available();

//Step 3: When there is no more data available to read further, the available() method returns zero
//Step 3(b): Then, we should attach the monitor to the output stream
//System.out.print(ch)


package InputOutput;
import java.io.*;
public class FileInputStreamAvailableMethod {
    public static void main(String[]args){
        //Create file object and specify the path
        File file = new File("file.txt");

        try {
            FileInputStream input = new FileInputStream(file);
            int character;
            //read character by default
            //read function return int between 0 and 255
            while ((character = input.read()) != -1){
                int ch = input.available();
                System.out.println("Currently Reading:" + (char)character);
                System.out.print(" Remaining character: " + ch);
                System.out.println();
            }
            input.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
