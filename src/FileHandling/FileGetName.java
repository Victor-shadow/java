//The getName() method is part of the File class in Java
//This function returns the name of the given File Object
//The function returns a String object which contains the name of the given File object
//If the abstract path does not contain any name then a null string is returned

//Function Signature
//public String getName()

//Function Syntax:
//file.getName()

//Parameters: The function does not accept any parameters
//Return Value: This function returns a String value which is the name of the given File Object

package FileHandling;
import java.io.*;
public class FileGetName {
  public static void main(String[]args){
      //try-catch block to handle exceptions
      try {
          //Create a File Object
          File f = new File("C:\\Users\\victo\\Java\\kotlin-reference");
          //Get the name of the given file
          String Name = f.getName();
          //Display the file names of the file object
          System.out.println("File Name: " + Name);
      }
      catch (Exception e){
          System.err.println(e.getMessage());
      }
  }
}
