/// The getProtocol() method is part of URL class
/// The function getProtocol() returns the Protocol of the specified URL
/// function Signature: public String getProtocol()
/// Syntax: url.getProtocol()
/// Parameter: The function does not require any parameter
/// The function returns String type

package JavaNetworking;

import java.net.*;

public class NetworkURLGetProtocol {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.geeksforgeeks.org");
            String protocol = url.getProtocol();
            System.out.println("URL = " + url);
            System.out.println("Protocol = " + protocol);

            url = new URL("http://www.geeksforgeeks.org");
            protocol = url.getProtocol();
            System.out.println("URL = " + url);
            System.out.println("Protocol = " + protocol);

            url = new URL("ftp://www.geeksforgeeks.org");
            protocol = url.getProtocol();
            System.out.println("URL = " + url);
            System.out.println("Protocol = " + protocol);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}