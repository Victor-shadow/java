package JavaNetworking;
import java.net.*;
public class NetworkURLClassDefaultPort {
    public static void main(String[]args) throws MalformedURLException{
        URL url = new URL("https://www.geeksforgeeks.org/computer-networks/tcp-ip-model/");
        //to get and print the default port of the  URL
        int defaultPort = url.getDefaultPort();
        System.out.println("Default Port: " + defaultPort);
        //to get and print the path of the URL
        String path = url.getPath();
        System.out.println("path: " + path);

    }
}
