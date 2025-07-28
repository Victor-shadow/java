//The java.io.FileInputStream.getFD() method is part of Java.io.FileInputStream class.
//This method will return FileDescriptor object associated with the FileInputStream
//getFD() method is declared as final that means that getFD() method cannot be overridden in the subclasses
//FileDescriptorObject  that we get using getFD() method will represent the connection
//to the actual file in the file system
//getFD() method might throw an I/O Exception
//syntax: public final FileDescriptor getFD() throws IOException
//Return Type: The getFD() method will return the instance of FileDescriptor associated with the FileInputStream
//Exception: getFD() method might throw IOException if any i/o exception raises

//Invoke getFD()method
//step 1: First, create an instance of java.io.FileInputStream class
//FileInputStream fileInputStream = new FileInputStream("file.txt");

//step 2: To get the instance of FileDescriptor associated with this FileInputStream we invoke getFD()method
//FileDescriptor fileDescriptor = fileInputStream.getFD();

package InputOutput;
import java.io.*;
class FileInputStreamGetFDMethod {
    public static void main(String[]args){
        try {
            //create an instance of FileInputStream class
            //user should change name of the file
            FileInputStream fileInputStream = new FileInputStream("C://Users//victo//Java//java.txt");
            //if the specified file does not exist
            if (fileInputStream == null){
                System.out.println("Cannot find the specified file");
                return;
            }
            //get the object of FileDescriptor for this specified FileInputStream
            FileDescriptor fileDescriptor = fileInputStream.getFD();
            //check if the fileDescriptor is valid or not
            //using its valid method
            //valid() will return true if valid else false
            System.out.println("Is FileDescriptor valid: " + fileDescriptor.valid());
            //will close the file input stream and release system resources associated
            //with this stream
            fileInputStream.close();
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
