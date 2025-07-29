package InputOutput;
import java.io.*;
public class fileReaderClass {
  public static void main(String[]args){
      //try-catch block for exception handling
      try{
          //Create a FileReader Object
          //which is a subclass of Reader
          Reader r = new FileReader("C://Users//victo//Java//java.txt");
          //Read one character at a time from the file
          int data = r.read();
          while (data != -1){
              //convert the int to char and print
              System.out.print((char)data);
              data = r.read();
          }
          //close the reader
          r.close();
      }
      catch (Exception ex){
          //Handle any IOException
          System.out.println("An error occurred: " + ex.getMessage());
      }
  }
}
