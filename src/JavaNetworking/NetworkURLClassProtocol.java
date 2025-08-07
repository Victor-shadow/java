package JavaNetworking;
import java.net.*;
public class NetworkURLClassProtocol {
    public static void main(String[]args) throws MalformedURLException{
        URL url = new URL("https://www.geeksforgeeks.org/java/java-programming-examples/");
        //to get and print the protocol of the URL
        String protocol = url.getProtocol();

        System.out.println("Protocol: " + protocol);
        //to get and print the hostname of the URL
        String host = url.getHost();

        System.out.println("Hostname: " + host);
        //to get and print the file name of the URL
        String filename = url.getFile();
        System.out.println("File Name: " +filename);
    }

}
