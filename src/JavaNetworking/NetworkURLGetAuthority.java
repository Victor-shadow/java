/// The getAuthority() function is part of the URL class. THE function returns the authority of
/// the specified URL
/// The authority part of the URL is the host name and the port of the URL
/// Function Signature: public String getAuthority()
/// Syntax
/// url.getAuthority()
/// Parameter: This function does not require any parameter
/// Return Type: This function returns a String

package JavaNetworking;
import java.net.*;
 class NetworkURLGetAuthority {
     public static void main(String[]args){
         //url object
         URL url = null;
         try {
             //Create A URL
             url = new URL("https://www.geeksforgeeks.org/android/android-tutorial/");
             //get the Authority
             String authority = url.getAuthority();
             //display the URL
             System.out.println("URL = " + url);
             //display the Authority
             System.out.println("Authority = " + authority);
         }
         catch (Exception e){
             System.out.println(e);
         }
     }
}
