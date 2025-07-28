package FileHandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedWriterClass {
    public static void main(String[]args){
        //Assign file content
        String text = "Java is known for its capability, write once run anywhere";
        //try-catch block to check for exceptions
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter path: ");
            //Reading File name
            String path = br.readLine();
            //Create an Object of buffered Writer
            BufferedWriter b_writer = new BufferedWriter(new FileWriter(path));
            //write text(content) to file
            b_writer.write(text);
            //print the content inside the file
            System.out.print(text);
            //close the BufferedWriter object
            b_writer.close();
        }
        //Catch block to handle exceptions
        catch (IOException e){
            System.out.print(e.getMessage());
        }
    }

}
