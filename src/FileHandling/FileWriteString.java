package FileHandling;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
public class FileWriteString {
    public static void main(String[]args) throws IOException{
        //Data to be written in file
        String text = "Java is used by frameworks such as Spring, Hibernate, JavaFX, Java Swing";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the path: ");
        String path = br.readLine();
        //Define the file name of the file
        Path fileName = Path.of(path);
        try{
            Files.writeString(fileName, text);
            //Reading the contents of the file
            String fileContent = Files.readString(fileName);
            //print the contents inside the file
            System.out.println(fileContent);
        } catch (IOException e){
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

}
