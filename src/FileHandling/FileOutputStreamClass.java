//it is an Output stream that can be written to FileOutputStream
//It is used for those objects that are already existing
//Syntax
//new FileOutputStream(String filePath)
package FileHandling;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileOutputStream;
public class FileOutputStreamClass {
    //function to create a file
    public void newFile(){
        String strFilePath, strFileName;
        //try-catch block
        try {
            //Create BufferClass Object
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //Asking user for File name
            System.out.print("Enter the file name: ");
            strFileName = br.readLine();
            //Asking user for File path
            System.out.print("Enter the file path: ");
            strFilePath = br.readLine();
            //Create Object of FileOutputStream Class
            FileOutputStream fos = new FileOutputStream(
                    strFilePath + " " + strFileName + ".txt"
            );
            String content = "File created by FileOutputStreamClass.";
            fos.write(content.getBytes());
            //close the stream
            fos.close();
            System.out.println("File created successfully.");
        }catch (Exception ex1){
            System.out.println("Exception occurred: " + ex1.getMessage());
        }
    }
    public static void main(String[]args){
        FileOutputStreamClass fileCreator = new FileOutputStreamClass();
        fileCreator.newFile();

    }
}
//The BufferedReader and InputStreamReader are used for UserInput
//A FileOutputStream Object is created for a specified file
//The Constructor initializes an empty file in the specified location
//Exception is managed using a try-catch block for scenarios such as invalid paths or permission issues