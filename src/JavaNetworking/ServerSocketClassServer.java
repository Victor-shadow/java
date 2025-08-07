package JavaNetworking;
import java.io.DataInputStream;
import java.net.*;
public class ServerSocketClassServer {
    public static void main(String[]args)
    {
        try {
            System.out.println("Starting server...");
            //create a ServerSocket listening on port 5000
            ServerSocket ss = new ServerSocket(6666);
            System.out.println("Server started Listening on port 6666...");
            //accept a connection from the client
            Socket s = ss.accept();
            System.out.println("Client Connected!");
            //read the message from the client
            DataInputStream d = new DataInputStream(s.getInputStream());
            String str = d.readUTF();
            System.out.println("Message: " + str);
            //close the socket
            ss.close();
        }
        catch (Exception e){
            System.out.println("Server Error: " + e);
        }
    }
}
