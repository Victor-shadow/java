package FileHandling;
import java.io.FileOutputStream;
import java.io.IOException;
public class OutputStreamClass {
    public static void main(String[]args){
        //Assign the file content
        String fileContent = "Java is a high level object oriented programming language";
        FileOutputStream outputStream = null;
        //Try block to check if exceptions occurs
        try{
            //Step 1: Create an Object of FileOutput Stream
            outputStream = new FileOutputStream("java.txt");
            //Step 2: Store byte content from string
            byte[] strToBytes = fileContent.getBytes();
            //Step 3: Write into file
            outputStream.write(strToBytes);
            //Print the success message
            System.out.print("File is created successfully with the content");
        }
        //Catch block to handle the exception
        catch (IOException e){
            System.out.print(e.getMessage());
        }
        //finally keyword is used within try-catch block
        //this code gets executed whether the exception occurred or not
        finally {
            //close the object
            if(outputStream != null){
                //NOTE: Second try-catch block ensures that the file is closed even if an error occurs
                try {
                    //close the file connections if no exception occurred
                    outputStream.close();
                }
                catch (IOException e){
                    System.out.print(e.getMessage());
                }
            }
        }
    }
}
