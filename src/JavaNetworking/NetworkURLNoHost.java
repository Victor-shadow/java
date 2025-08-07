package JavaNetworking;
import java.net.*;
class NetworkURLNoHost {
    public static void main(String[]args){
        //URL object
        URL url = null;

        try {
            //Create a URL
            url = new URL("https://");
            //get the Host
            String Host = url.getHost();
            //display the URL
            System.out.println("Url = " + url);
            //display the Host
            System.out.println("Host = " + Host);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }


}
