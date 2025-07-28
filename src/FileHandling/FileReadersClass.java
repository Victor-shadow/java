package FileHandling;
import java.io.*;
public class FileReadersClass {
    //main function
    public static void main(String[]args){
        try {
            //File reader class used
            FileReader fileReader = new FileReader("C:\\Users\\victo\\Java\\java.txt");
            System.out.print("Reading char by char : \n");
            int i;
            //using read method
            while ((i = fileReader.read()) != -1){
                System.out.print((char) i);
            }
            System.out.println("Reading using array : \n");
            char[] charArray = new char[10];
            //use read method only to get character array
            fileReader.read(charArray);
            System.out.print(charArray);
            //close method called
            fileReader.close();
            System.out.print("File reader closed!");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
