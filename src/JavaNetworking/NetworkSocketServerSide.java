package JavaNetworking;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;
public class NetworkSocketServerSide {
    //Initialize socket and input streams
    private Socket s = null;
    private ServerSocket ss = null;
    private DataInputStream in = null;
    //constructor with port
    public  NetworkSocketServerSide(int port){
        //starts server and waits for connection
        try {
            ss = new ServerSocket(port);
            System.out.println("Server started...");

            System.out.println("Waiting for client...");
            s = ss.accept();
            System.out.println("Client accepted");
            //takes input from the client socket
            in = new DataInputStream(new BufferedInputStream(s.getInputStream()));
            String m = "";
            //reads message from client until Over is sent
            while (!m.equals("Over")) {
                try {
                    m = in.readUTF();
                    System.out.println(m);
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
            System.out.println("Closing the connection");
            //close the connection
            s.close();
            in.close();
        }
        catch (Exception e){
            System.out.println(e);

        }
    }
    public static void main(String[]args){
        NetworkSocketServerSide s = new NetworkSocketServerSide(5000);
    }
}
