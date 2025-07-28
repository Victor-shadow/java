package InputOutput;
import java.io.*;
public class FileInputStreamRead {
    public static void main(String[]args){
        //Create file object and specify the path
        File file = new File("file.txt");
        try {
            FileInputStream input = new FileInputStream(file);
            int character;
            //read character by default
            //read() function returns int between 0  and 255
            while (input.available()!=0){
                character = input.read();
                System.out.print((char) character);
            }
            input.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
