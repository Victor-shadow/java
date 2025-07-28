package FileHandling;
import java.io.*;
import java.util.Scanner;
import java.nio.file.*;
public class DeleteUsingFileClass {
    public static void main(String[]args) {
        //Scanning the file path
        Scanner scn = new Scanner(System.in);
        //checking the path
        try{
            String str;
            str = scn.nextLine();
            Files.deleteIfExists(Paths.get(str));
        }
        //Exceptions
        catch (NoSuchFileException e){
            System.out.println("No such file/directory exists");
        }
        catch (DirectoryNotEmptyException e){
            System.out.println("Directory is not empty.");
        }
        catch (IOException e){
            System.out.println("Invalid permissions");
        }
        //successful execution
        System.out.println("Deletion successful.");
        scn.close();
    }
}
