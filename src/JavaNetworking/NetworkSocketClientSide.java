package JavaNetworking;
import java.net.*;
import java.io.*;
public class NetworkSocketClientSide {
    //initialize socket and input/output streams
    private Socket s = null;
    private DataInputStream in = null;
    private  DataOutputStream out = null;
    //constructor to put IP address and port
    public NetworkSocketClientSide(int port, String address){
        //establish a connection
        try {
            s = new Socket(address, port);
            System.out.println("Connected!");
            //takes input from terminal
            in = new DataInputStream(System.in);
            //sends output to the socket
            out = new DataOutputStream(s.getOutputStream());

        }
        catch (UnknownHostException e){
            System.out.println(e);
            return;
        }
        catch (IOException e){
            System.out.println(e);
            return;
        }
        //String to read message from input
        String m = "";
        //keep reading until "Over" is input
        while (!m.equals("Over")){
            try{
                m = in.readLine();
                out.writeUTF(m);
            }
            catch (IOException i){
                System.out.println(i);
            }
        }

        //close the connection
        try {
            in.close();
            out.close();
            s.close();
        }
        catch (IOException i){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        NetworkSocketClientSide c = new NetworkSocketClientSide(5000, "127.0.0.1");
    }
}

