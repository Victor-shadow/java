//The getParent() method is a part of the File class
//This function returns the parent of the given File object
//The function returns a String object which contains the Parent of the given file object
//if the abstract path does not contain any parent then a null string is returned
//Function Signature:
//public String getParent()

//Function syntax
//file.getParent()

//Parameters: This function does not accept any parameters
//Return value: The method returns a String value which is the parent of the given File Object


package FileHandling;

import java.io.File;

public class FileGetParentMethod {
    public static void main(String[]args){
        //try-catch block to handle exceptions
        try {
            File f = new File("C:\\Users\\victo\\Java\\tutorial");
            //Get the parent of the given file
            String parent = f.getParent();
            //Display the file parent
            //of the file object
            System.out.println("File Parent: " + parent);
        }
        catch (Exception e){
                System.err.println(e.getMessage());}
    }
}
