package FileHandling;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
public class FileReadFileIntoList {
    public static List<String> readFileIntoList(String fileName){
        //Create List of String
        List<String> lines = Collections.emptyList();
        try{
            lines = Files.readAllLines(
                    Paths.get(fileName),
                    StandardCharsets.UTF_8);
        }catch (IOException e){
            e.printStackTrace();
        }
        return lines;
    }

    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the path: ");
        //Reading file name
        String path = br.readLine();

        List l = readFileIntoList(path);
        //Iterate over the list
        Iterator<String > iterator = l.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.hasNext());
        }

    }
}
