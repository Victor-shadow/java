package JavaNetworking;
import java.net.*;
class NetworkURLGetQueryMethod {
    public static void main(String[]args){
        //url object
        URL url = null;
        try {
            //Create a URL
            url = new URL("https://www.geeksforgeeks.org/android/android-tutorial/");
            //get the query
            String _Query = url.getQuery();
            //display the URL
            System.out.println("URL = " + url);
            //display the Query
            System.out.println("Query = " + _Query);

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
