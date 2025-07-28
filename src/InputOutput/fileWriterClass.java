package InputOutput;
import java.io.*;
public class fileWriterClass {
    public static void main(String[]args){
        try {
            //Create a FileWriter to write to a file named writer.txt
            FileWriter w = new FileWriter("writer.txt");
            //write a simple message to the file
            w.write("It is designed for writing character streams");
            //close the writer
            w.close();
            System.out.println("The FileWriter class");

        }
        catch (IOException e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}
