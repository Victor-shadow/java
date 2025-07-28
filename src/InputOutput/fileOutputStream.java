package InputOutput;
import java.io.*;
class fileOutputStream {
    public static void main(String[]args){
        String data = "File Output Stream";
        try(FileOutputStream fos = new FileOutputStream("output.txt")) {
            //convert the string into bytes
            byte [] dataBytes = data.getBytes();
            //write the bytes to the file
            fos.write(dataBytes);
            System.out.println("Data Successfully written to the file.");

        }
        catch (IOException e){
            System.out.println("An Error Occurred: " + e.getMessage());
        }
    }
}
//a file named output.txt will be created or overwritten in the current working directory
//It will contain the text "File Output Stream"
//the console displays "Data Successfully written to the file"
