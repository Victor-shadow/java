package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class WriteFile {
    public static void main(String[]args){
        //Scanner class instance
        Scanner scn = new Scanner(System.in);
        //User input for file path
        String path  =scn.nextLine();
        //writing in file
        try(FileWriter writer = new FileWriter(path)) {
            String str = "Kotlin is interoperable with Java";
            writer.write(str);

            System.out.print("Data written to the file successfully");
        }
        //Exception thrown
        catch (IOException e){
            System.out.println("An error occurred when writing" + " to the file: " + e.getMessage());
        }

    }
}
