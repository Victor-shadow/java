package FileHandling;
import java.io.*;
public class FileGetFreeSpaceMethod {
    public static void main(String[]args){
        //Create an abstract pathname
        File f = new File("F:\\file.txt");
        //Display the free size of the partition
        //use getFreeSpace() function
        System.out.println("Free Space: " + f.getFreeSpace());

    }
}
