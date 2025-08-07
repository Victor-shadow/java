///The getFile() function is part of the URL class
/// The function getFile() is used to return the file name of the specified URL
/// The getFile() returns the path and the query of the URL
/// Function Signature: public String getFile()
/// Syntax: url.getFile()
/// Parameter: This FUNCTION DOES NOT REQUIRE ANY PARAMETER
/// This Function Returns String type

package JavaNetworking;
import java.net.*;
class NetworkURLGetFile {
    public static void main(String[]args){
        //URL object
        URL url= null;
        try{
            //create a URL
            url = new URL("https://www.geeksforgeeks.org/java/java/");
            //get the file
            String _File = url.getFile();
            //display the URL
            System.out.println("URL = " + url);
            //display the file
            System.out.println("File: " + _File);
        }
        //catch if any exceptions occur
        catch (Exception e){
            System.out.println(e);
        }
    }

}
