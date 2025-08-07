/// The getPath() function is part of the URL class
/// The function returns the path name of the specified URL
/// Function Signature: public String getPath()
/// Syntax: url.getPath()
/// This function does not require any parameter
/// The function returns String Type

package JavaNetworking;
import java.net.*;
class NetworkURLGetPath {
    public static void main(String[]args){
        //url
        URL url = null;
        try {
            //Create a URL
            url = new URL("https://www.geeksforgeeks.org/java/java/");
            //get the path
            String _Path = url.getPath();
            //display the URL
            System.out.println("URL = "+ url);
            //display the path
            System.out.println("Path: " + _Path);
        }
        //if any error occurs
        catch (Exception e){
            System.out.println(e);
        }

    }

}
