package JavaNetworking;
import java.net.*;
class NetworkURLDefaultHTTPPort {
    public static void main(String[]args){
        //url object
        URL url = null;
        try {
            //Create a URL
            url = new URL("http://www.geeksforgeeks.org");
            //get the default port
            int default_port = url.getDefaultPort();
            //display the URL
            System.out.println("URL: " + url);
            //display the default port
            System.out.println("Default Port:" + default_port);
        }
        //if any exception occurs
        catch (Exception e){
            System.out.println(e);
        }
    }

}
