package JavaNetworking;
import java.net.*;
public class NetworkInetAddressClass {
    public static void main(String[]args) throws UnknownHostException{
        //To get and print The InetAddress of Named Hosts
        InetAddress address = InetAddress.getByName("write.geeksforgeeks.org");
        System.out.println("Inet Address of named hosts: " + address);
        //to get and print all InetAddresses of Named Hosts
        InetAddress[]addresses = InetAddress.getAllByName("www.geeksforgeeks.org");
        System.out.println("\nInet Address of all named hosts");
        for (int i = 0; i < addresses.length; i++) {
            System.out.println(addresses[i]);
        }
    }
}
