/// The getPort() function is part of the URL class
/// The function getPort() returns the port of the specified URL
/// or -1 if the port is not set
/// Function Signature: public int getPort()
/// Syntax: url.getPort()
/// The function returns integer type
/// This function does not require any parameter

package JavaNetworking;
import java.net.*;
public class NetworkURLGetPort {
    public static void main(String[]args){
        //url object
        URL url = null;

        try{
            //create a url
            url= new URL("http://www.geeksforgeeks.org:80");
            //get the port
            int _port = url.getPort();
            //display the URL
            System.out.println("URL = "+ url);
            //display the port
            System.out.println("Port = "+ _port);

        }
        //catch errors if they occur
        catch (Exception e){
            System.out.println(e);
        }
    }

}
