package InputOutput;
import java.io.*;
public class fileOutputStreamObject {
    public static void main(String[]args){
        String s = System.getProperty("user.dir");
        //Print the current directory
        System.out.println("Current working directory: " + s);

        //use try-with-resources to ensure
        //the stream is closed automatically
        try(FileOutputStream fout = new FileOutputStream("file.txt", false)) {
            //String to the written to the file
            String st = "File Output Stream";
            //convert string to byte array and write it directly
            fout.write(st.getBytes());
        } catch (IOException e){
            //Handle Exception if file operation fails
            System.out.println("An Error Occurred: " + e.getMessage());
        }
    }
}

//This code writes the String "File Output Stream"  to a file named file.txt
//The file will be overwritten or created in the current working directory
//The file, file.txt will be located in the directory from which the program is executed
//The FileOutputStream is opened in Overwrite mode(with false) meaning any existing content in file.txt
//will be deleted and "File Output Stream" will be written to the file
//The try-with-resources block ensures that the file stream is properly closed after writing the operation
//The string "File Output Stream" is converted to a byte array  using st.getBytes() and written to the file directly

//if file.txt does not exist, it will be created in the current working directory
//if file.txt already exists, its contents will be replaced with "File Output Stream"
