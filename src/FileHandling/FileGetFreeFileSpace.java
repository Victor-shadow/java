//The getFreeSpace() function is part of FileClass in Java
//This function returns an unallocated size of the partition denoted by the abstract pathname
//if the pathname does not exist, then it returns 0L
//This function gives hint of the unallocated space of the partition but does not give any guarantee the exact number of bytes are free
//An error may be caused if an external application writes to the specified file
//then the write operation might not succeed

//Function Signature
//public long getFreeSpace()

//Syntax:
//long var = file.getFreeSpace();

//parameters: The method does not accept any parameter vales
//Return value: The function returns long data type represents the unallocated size of the partition in bytes
//Exception: This method throws SecurityException if the method does not allow the file to be created
package FileHandling;
import java.io.*;

public class FileGetFreeFileSpace {
  public static void main(String[]args){
      //Create an abstract pathname(File Object)
      File f = new File("C:\\Users\\victo");
      //Display the free size of the partition
      //using getFreeSpace() function
      System.out.println("Free Space: " + f.getFreeSpace());
  }
}
