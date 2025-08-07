/// The getDefaultPort() function in Java is part of the URL class
/// It returns the default port of the specified URl
/// If the URL scheme or the URLStreamHandler for the URL do not define a default port number
/// then the function returns -1
/// Function Signature: public int getDefaultPort()
///Syntax: url.getDefaultPort();
/// Parameter: This function does not require any parameter
/// Return value: This function returns an Integer value which is the default port of the specified URL


package JavaNetworking;
import java.net.*;
class NetworkURLDefaultPort {
    public static void main(String[]args){
        //url object
        URL url = null;
        try{
            url = new URL("https://www.geeksforgeeks.org/android/android-tutorial/");
            //get the default port
            int default_port = url.getDefaultPort();
            //display the URL
            System.out.println("URL: " + url);
            //display the default port
            System.out.println("Default port: " + default_port);
        }
        catch (Exception e){
            //display the error
            System.out.println(e);
        }
    }
}
