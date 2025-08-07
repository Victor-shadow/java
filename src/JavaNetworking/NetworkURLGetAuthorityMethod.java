package JavaNetworking;
import java.net.*;
class NetworkURLGetAuthorityMethod {
   public static void main(String[]args){
       //url object
       URL url = null;
       try {
           //Create a URL
           url = new URL("https://www.geeksforgeeks.org/android/android-tutorial/");
           //get the Authority
           String authority = url.getAuthority();
           //get the Host
           String host = url.getHost();
           //display the URL
           System.out.println("URL = " + url);
           //display the authority
           System.out.println("Authority = " + authority);
           //display the host
           System.out.println("Host = " + host);
       }
       //if any error occurs
       catch (Exception e){
           //display the error
           System.out.println(e);
       }
   }

}
