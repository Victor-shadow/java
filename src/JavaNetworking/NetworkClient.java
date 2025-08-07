package JavaNetworking;
import java.io.*;
import java.net.*;
public class NetworkClient {
    //Initialize socket and input output Streams
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;

    //constructor to put ip address and port
    public NetworkClient(String address, int port){
        //establish a connection
        try {
            socket = new Socket(address, port);
            System.out.println("connected");

            //takes input from terminal
            input = new DataInputStream(System.in);
            //send output to the Stream
            output = new DataOutputStream(socket.getOutputStream());
        }
        catch (UnknownHostException e){
            System.out.println(e);
        }
        catch (IOException e){
            System.out.println(e);
        }
        //string to read message from Input
        String line = "";
        //Keep reading until end is attained
        while (!line.equals("End")){
            try {
                line = input.readLine();
                output.writeUTF(line);
            }
            catch (IOException i){
                System.out.println(i);
            }
        }
        //close the connection
        try {
            input.close();
            output.close();
            socket.close();
        }
        catch (IOException i){
            System.out.println(i);
        }
    }

    public static void main(String[]args){
        NetworkClient client = new NetworkClient("127.0.0.1", 5000);
    }

}
