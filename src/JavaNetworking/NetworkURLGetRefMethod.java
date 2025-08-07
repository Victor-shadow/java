package JavaNetworking;
import java.net.*;
public class NetworkURLGetRefMethod {
    public static void main(String[]args){
        //url object
        URL url = null;
        try{
            //create a URL
            url = new URL("https://www.geeksforgeeks.org/android/android-tutorial/");
            //get the reference
            String _Ref = url.getRef();
            //display the URL
            System.out.println("URL = " + url);
            //display the reference or the anchor
            System.out.println("Reference or anchor = " + _Ref);
        }
        //if any errors occur
        catch (Exception e){
            System.out.println(e);
        }
    }
}
