/// The getQuery() function is part of URL class
/// The function getQuery() returns the specified query of a specified URL
/// Function Signature: public String getQuery()
/// Syntax: url.getQuery()
/// Parameter: This function does not require any parameter
/// This function returns String Type Query of a specified URL


package JavaNetworking;
import java.net.*;
class NetworkURLGetQuery {
    public static void main(String[]args){
        //url object
        URL url = null;

        try{
            //create a url
            url = new URL("https://www.geeksforgeeks.org/android/android-tutorial?title=protocol");
            //get the Query
            String _Query = url.getQuery();
            //display the URL
            System.out.println("Url = " + url);
            //display the Query
            System.out.println("Query = " + _Query);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
