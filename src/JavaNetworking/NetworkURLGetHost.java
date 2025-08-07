/// getHost() function is part of the URL class
/// The function getHost() returns the Host of a specified URL
/// The Host part of the URL is the host name of the URL
/// The format of host conforms to RFC 2732
/// function signature: public String getHost()
/// Syntax: url.getHost()
/// This function does not require any parameter
/// This function returns String Type

package JavaNetworking;
import java.net.*;
class NetworkURLGetHost {
    public static void main(String []args){
        //url object
        URL url = null;
        try {
            //Create a URL
            url = new URL("https://www.geeksforgeeks.org/");
            //get the Host
            String Host = url.getHost();
            //display the URL
            System.out.println("URL = " + url);
            //display the Host
            System.out.println("Host = " + Host);

        }
        catch (Exception e){
            System.out.println(e);
        }

    }

}
