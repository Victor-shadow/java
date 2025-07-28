package FileHandling;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterClass {
    public static void main(String[]args){
        //Data to be written in the file
       String text = "Java is a high-level object oriented programming language";
       //try-catch block to check for exceptions
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the path: ");
            //Read file name
            String path = br.readLine();
            //Create a FileWriter object
            FileWriter fWriter = new FileWriter(path);
            //writing into file
            fWriter.write(text);
            //print the contents of the file
            System.out.println(text);
            //close the file writer connection
            fWriter.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
