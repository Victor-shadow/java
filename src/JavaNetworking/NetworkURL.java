package JavaNetworking;
import java.net.*;

public class NetworkURL {
    public static void main(String[]args) throws MalformedURLException{
        //create a URL with String representation
        URL u1 = new URL("https://www.google.co.in/?gfe_rd=cr&ei=ptYq"
                + "WK26I4fT8gfth6CACg#q=geeks+for+geeks+java");
        //Create a URL with a Protocol, hostname and path
        URL u2 = new URL("https://www.geeksforgeeks.org/java/java/");
        URL u3 = new URL("https://www.google.co.in/search"
                + "q=gnu&rlz=1C1CHZL_enIN714IN715&oq=gnu&aqs=chrome..69i57j69i60l5.653j0j7&sourceid=chrome&ie=UTF-8#q=geeks+for+geeks+java");

        //print String representation of a URL
        System.out.println(u1.toString());
        System.out.println(u2.toString());
        System.out.println();
        System.out.println("Different components of URL3");

        //Retrieve the Protocol of the URL
        System.out.println("Protocol: " + u3.getProtocol());
        //Retrieve the hostname of the URL
        System.out.println("Hostname: " + u3.getHost());
        //Retrieve the default port
        System.out.println("Default Port: " + u3.getDefaultPort());
        //Retrieve the query part of the URL
        System.out.println("Query: " + u3.getQuery());
        //Retrieve the path of the URL
        System.out.println("Path: " + u3.getPath());
        //Retrieve the file name
        System.out.println("File: " + u3.getFile());
        //Retrieve the Reference
        System.out.println("Reference: " + u3.getRef());


    }

}
