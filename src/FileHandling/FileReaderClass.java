package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileReaderClass {
    //Main driver method
    public static void main(String[]args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the path: ");
        //Read the file name
        String path = bf.readLine();
        FileReader fr =new FileReader(path);
        //Declaring loop variable
        int i;
        //Holds true till there is nothing to read
        while ((i = fr.read()) != -1){
            //print all contents of the file
            System.out.print((char) i);
        }

    }
}
