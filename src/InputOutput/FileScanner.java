package InputOutput;
import java.util.*;
public class FileScanner {
    public static void main(String[]args){
        //Use scanner to get input of user
        Scanner s =new Scanner(System.in);
        String s1 = s.nextLine();
        System.out.println("You entered String " + s1);

        int a = s.nextInt();
        System.out.println("You entered Integer: "+ a);
        float b = s.nextFloat();
        System.out.println("You entered Float: "+ b);
    }
}
