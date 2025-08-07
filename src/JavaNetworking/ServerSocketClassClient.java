package JavaNetworking;
import java.io.*;
import java.net.*;
public class ServerSocketClassClient {
    //main driver method
    public static void main(String[]args){
        //try block to check if exceptions occur
        try {
            //Create socket class object
            //initialize socket
            Socket s = new Socket("localhost", 6666);
            DataOutputStream d =new DataOutputStream(s.getOutputStream());
            //Message to be displayed
            d.writeUTF("Client request");
            //flushing out internal buffers
            //optimizing for better performance
            d.flush();
            //close the connections
            d.close();
            s.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
