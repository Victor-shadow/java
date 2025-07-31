package InputOutput;
import java.io.*;
public class FileDataInputStream {
    public static void main(String[]args) throws IOException{
        DataInputStream r = new DataInputStream(System.in);
        //read integers
        System.out.print("Enter an integer: ");
        int i = Integer.parseInt(r.readLine());
                //read string
       System.out.print("Enter a String");
       String s = r.readLine();
       System.out.println("You entered integer: " + i);
       System.out.println("You entered String: " + s);
    }
}
