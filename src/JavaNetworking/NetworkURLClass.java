package JavaNetworking;

import java.net.*;

public class NetworkURLClass {
    public static void main(String[]args) throws MalformedURLException{
        //creates a URl with String representation
        URL url = new URL("https://www.geeksforgeeks.org/computer-networks/user-datagram-protocol-udp/");
        //Print String representation of the URL
        String s = url.toString();
        System.out.println("URL: " + s);
    }
}
