package JavaNetworking;
import java.net.*;
class NetworkURLGetFileMethod {
    public static void main(String[]args){
        //url object
        URL url = null;
        try {
            //create a URL
            url = new URL("https://www.geeksforgeeks.org/android/android-tutorial?title=protocol");
            //get the File
            String _File = url.getFile();
            //Display the URL
            System.out.println("URL = " + url);
            //Display the File
           System.out.println(" File = " + _File);
        }
        //if any error occurs
        catch (Exception e){
            System.out.println(e);
        }

    }
}
