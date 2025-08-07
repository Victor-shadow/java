package JavaNetworking;
import java.net.*;
public class NetworkURLGetPortMethod {
    public static void mai(String[]args){
        //url object
         URL url = null;
         try {
             //create a url
             url = new URL("https://www.geeksforgeeks.org/android/android-tutorial/");
             //get the port
             int _port = url.getPort();
             //display the URL
             System.out.println("URL = " + url);
             //display the port
             System.out.println("Port = " + _port);

         }
         catch (Exception e){
             System.out.println(e);
         }

    }

}
