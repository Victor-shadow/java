package JavaNetworking;
import java.net.*;
class NetworkURLGetPathMethod {
    public static void main(String[]args){
        //url object
        URL url = null;
        try {
            //Create an URL
            url = new URL("https://www.geeksforgeeks.org/android/android-tutorial/?title=protocol");
            //get the path
            String _Path = url.getPath();
            //display the URL
            System.out.println("URL = " + url);
            //display the Path
            System.out.println("Path = " + _Path);

        }
        //if any error occurs
        catch (Exception e){
            System.out.println(e);
        }
    }

}
