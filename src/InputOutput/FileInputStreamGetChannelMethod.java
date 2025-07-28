//-The getChannel() method is part of java.io.FileInputStream class
//This method will return the unique FileChannelObject associated with the FileInputStream
//A channel obtained from the getChannel() method of the java.io.FileInputStream instance will be "open for reading"
//getChannel() will return the FileChannelObject that is associated with "this" FileInputStream instance
//The channel position will change whenever we read bytes from this stream
//Whenever the channel's position is changed, the stream file position will also get changed
//The number of bytes read from the file will determine the initial position of the returned channel

//Syntax
//public FileChannel getChannel()

//Parameter: getChannel() method has no parameters
//Return Type: getChannel() method will return a unique FileChannel Object

//Invoke getChannel() method
//Step 1: Create an Instance of java.io.FileInputStreamClass
//FileInputStream fileInputStream = new FileInputStream("file.txt");
//Step 2: get the unique FileChannel object associated with this FileInputStream, which will call the
//getChannel() method
//FileChannel fileChannel = fileInputStream.getChannel()
package InputOutput;
import java.io.*;
import java.nio.channels.FileChannel;

class FileInputStreamGetChannelMethod {
    public static void main(String[]args){
        try {
            //create instance of FileInputStream class
            //user should change name of the file
            FileInputStream fileInputStream = new FileInputStream(
                    "C://Users//victo//Java//java.txt"
            );
            //if the specified file does not exist
            if (fileInputStream == null){
                System.out.println("Cannot find the specified file");
                return;
            }
            //to get the unique object of FileChannel
            //for this specified FileInputStream
            FileChannel fileChannel = fileInputStream.getChannel();

            //print the current size of the channel's file
            System.out.println("Current size of the file is: " + fileChannel.size());
        }
        catch (Exception exception){
            System.out.print(exception.getMessage());
        }
    }
}
