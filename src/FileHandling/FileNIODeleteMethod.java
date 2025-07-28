package FileHandling;
import java.io.IOException;
import java.nio.file.*;
public class FileNIODeleteMethod {
    public static void main(String[]args){
        //Create Object of Path
        Path pathOfFile1 = Paths.get("C:\\Users\\victo\\Java\\tutorial.pdf");
        Path pathOfFile2 = Paths.get("C:\\Users\\victo\\Java\\jls8.pdf");
        //delete both files
        try{
            Files.delete(pathOfFile1);
            Files.delete(pathOfFile2);
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

}
