/// The getRef() function in java is part of the URL class
/// The function getRef() returns the Reference or anchor part of a specified URL
/// Function Signature: public String getRef()
/// Syntax: url.getRef()
/// This function does not require any parameter
/// The function return String Type

package JavaNetworking;
import java.net.*;
class NetworkURLGetRef {
    public static void main(String[]args){
        //url object
        URL url = null;
        try {
            //create a url
            url = new URL("https://www.geeksforgeeks.org/android/android-tutorial#Geeks_For_Geeks");
            //get the Reference or Anchor
            String _Ref= url.getRef();
            //display the URL
            System.out.println("URL = " + url);
            //display the Reference or Anchor
            System.out.println("Reference or anchor = " + _Ref);

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
