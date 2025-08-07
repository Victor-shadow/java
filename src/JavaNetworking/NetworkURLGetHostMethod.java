package JavaNetworking;
import java.net.*;
class NetworkURLGetHostMethod {
    public static void main(String[]args){
        //null object
        URL url = null;
        try {
            //Create a URL
            url = new URL("https://www.geeksforgeeks.org:80/url-samefile-method-in-java-with-examples");
            //get the Authority
            String authority = url.getAuthority();
            //get the Host
            String Host = url.getHost();
            //display the url
            System.out.println("URL = " + url);
            //display the Host
            System.out.println("Host = " + Host);
            //display the Authority
            System.out.println("Authority = " + authority);
        }
        //if an error occurs
        catch (Exception e){
            System.out.println(e);
        }
    }
}
