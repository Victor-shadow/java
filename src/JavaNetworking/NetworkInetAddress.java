package JavaNetworking;
import java.net.*;
public class NetworkInetAddress {
    public static void main(String[]args) throws UnknownHostException{
        //to get and print InetAddress of the local host
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("InetAddress of the Local Host: " + address);
        //to get and print the host name of the Local Host
        String hostName = address.getHostName();
        System.out.println("\nHost name of the local host:" +hostName);

    }

}
